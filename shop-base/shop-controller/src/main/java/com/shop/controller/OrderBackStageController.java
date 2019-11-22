package com.shop.controller;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Logistics;
import com.shop.pojo.Orderitem;
import com.shop.pojo.Orderss;
import com.shop.pojo.Product;
import com.shop.pojo.TakeDelivery;
import com.shop.service.LogisticsBackStageService;
import com.shop.service.OrderBackstageService;
import com.shop.service.OrderItemBackstageService;
import com.shop.service.ProductService;
import com.shop.service.TakeDeliveryService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName:OrderController
 * @author: 炸鸡
 * @Description:后台订单controller
 * @date :2019年8月9日
 * @
 * @other:
 */
@Controller
@RequestMapping("/backstage")
public class OrderBackStageController {

	@Autowired
	private OrderBackstageService orderBackstageService;
	@Autowired
	private OrderItemBackstageService orderItemBackstageService;
	@Autowired
	private ProductService productService;
	@Autowired
	private TakeDeliveryService takeDeliveryService;
	@Autowired
	private LogisticsBackStageService logisticsBackStageService;
	
	/**
	 * @param pn
	 * @param model
	 * @param orderState
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:查询订单列表，使用分页查询
	 */
	@RequestMapping("/orderBackStage")
	public String orderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderState){
		PageHelper.startPage(pn, 8);
		if(orderState==null||orderState==""){
			List<Orderss> list = orderBackstageService.selectAllOrdersWithTakeDelivery();
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			model.addAttribute("pageInfo", pageInfo);
			model.addAttribute("orderState", orderState);
			return "backStage/order";
		}else{
			List<Orderss> list = orderBackstageService.selectAllOrdersWithTakeDeliveryByOrderState(orderState);
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			model.addAttribute("pageInfo", pageInfo);
			model.addAttribute("orderState", orderState);
			return "backStage/order";
		}
	}
	
	
	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:查询商品子项并返回
	 */
	@RequestMapping(value = "/orderDetails")
	@ResponseBody
	public List<Orderitem> orderDetails(String orderid){
		List<Orderitem> list = orderItemBackstageService.selectOrderitemByOrderid(orderid);
		for (Orderitem orderitem : list) {
			Product product = productService.queryPoductWithImageByPid(orderitem.getPid());
			orderitem.setProduct(product);
			System.out.println(orderitem);
		}
		return list;
		
	}
	
	/**
	 * @param pn
	 * @param model
	 * @param orderid
	 * @param tdId
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:跳转更改订单页面
	 */
	@RequestMapping("/updateOrderPageBackStage")
	public String updateOrderPageBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderid,String tdId){
		Orderss orders = orderBackstageService.selectOrdersByOrderid(orderid);
		TakeDelivery takeDelivery = takeDeliveryService.selectTakeDeliveryByTdId(tdId);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String ordertime = sdf.format(orders.getOrdertime());
		model.addAttribute("orders", orders);
		model.addAttribute("takeDelivery", takeDelivery);
		model.addAttribute("ordertime", ordertime);
		model.addAttribute("pn", pn);
		return "backStage/updateUnPaidOrder";
	}
	
	
	/**
	 * @param pn
	 * @param model
	 * @param orderid
	 * @param tdId
	 * @param orderstate
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:取消订单
	 */
	@RequestMapping("/deleteOrderBackStage")
	public String deleteOrderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderid,String tdId,String orderstate){
		int count2 = orderItemBackstageService.deleteTakeDeliveryByOrderId(orderid);
		int count3 = orderBackstageService.deleteOrdersByOrderId(orderid);
		int count1 = takeDeliveryService.deleteTakeDeliveryByTdId(tdId);
		if(count1!=0&&count2!=0&&count3!=0){
			return "forward:orderBackStage?orderState="+orderstate+"&pn="+pn;
		}else{
			model.addAttribute("msg9", "删除失败");
			return "forward:orderBackStage?orderState="+orderstate+"&pn="+pn;
		}
	}
	
	
	
	/**
	 * @param pn
	 * @param model
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:发货
	 */
	@RequestMapping("/deliverOrderBackStage")
	public String deliverOrderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderid){
		Orderss orders = orderBackstageService.selectOrdersByOrderid(orderid);
		orders.setOrderstate(new BigDecimal(3));
		int count = orderBackstageService.updateOrderByOrderid(orders);
		if(count!=0){
			return "forward:orderBackStage?orderState="+orders.getOrderstate()+"&pn="+pn;
		}else{
			model.addAttribute("msg9", "发货失败");
			return "forward:orderBackStage?orderState="+orders.getOrderstate()+"&pn="+pn;
		}
		
		
	}
	
	
	/**
	 * @param pn
	 * @param orders
	 * @param takeDelivery
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:修改订单
	 */
	@RequestMapping("/updateOrderBackStage")
	public String updateOrderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Orderss orders,TakeDelivery takeDelivery){
		Orderss orderss = orderBackstageService.selectOrdersByOrderid(orders.getOrderid());
		orderss.setTotal(orders.getTotal());
		int count1 = orderBackstageService.updateOrderByOrderid(orderss);
		
		TakeDelivery delivery = takeDeliveryService.selectTakeDeliveryByTdId(takeDelivery.getTdId());
		delivery.setTdAddress(takeDelivery.getTdAddress());
		delivery.setTdName(takeDelivery.getTdName());
		delivery.setTdTelephone(takeDelivery.getTdTelephone());
		int count2 = takeDeliveryService.updateDeliveryByTdId(delivery);
		System.out.println(orders);
		System.out.println(takeDelivery);
		if (count1!=0&&count2!=0) {
			return "forward:orderBackStage?orderState="+orderss.getOrderstate()+"&pn="+pn;
		} else {
			return "forward:updateOrderPageBackStage?orderid="+orderss.getOrderid()+"&pn="+pn+"&tdId="+delivery.getTdId();
		}
		
	}
	
	
	
	/**
	 * @param pn
	 * @param model
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id模糊查询，分页
	 */
	@RequestMapping("/searchOrderBackStage")
	public String searchOrderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderid){
			PageHelper.startPage(pn, 8);
			List<Orderss> list = orderBackstageService.selectAllOrdersWithTakeDeliveryLike(orderid);
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			model.addAttribute("pageInfo", pageInfo);
			model.addAttribute("orderid", orderid);
			return "backStage/searchOrder";
		
	}
	
	
	/**
	 * @param pn
	 * @param model
	 * @param tdId
	 * @param orderid
	 * @param orderstate
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:查询物流
	 */
	@RequestMapping("/logisticsPageBackStage")
	public String logisticsPageBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String tdId,String orderid,String orderstate){
		TakeDelivery takeDelivery = takeDeliveryService.selectTakeDeliveryByTdId(tdId);
		List<Logistics> list = logisticsBackStageService.selectLogisticsByOrderid(orderid);
		for (Logistics logistics : list) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String pdate = sdf.format(logistics.getLodate());
			logistics.setDate(pdate);
		}
		//System.out.println(tdId+"===="+orderid+"==="+pn);
		model.addAttribute("takeDelivery", takeDelivery);
		model.addAttribute("list", list);
		model.addAttribute("pn", pn);
		model.addAttribute("orderstate", orderstate);
		model.addAttribute("orderid", orderid);
		model.addAttribute("tdId", tdId);
		return "backStage/logistics";
		
	}
	
	
	
	
	
	/**
	 * @param pn
	 * @param model
	 * @param logistics
	 * @param orderid
	 * @param tdId
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:添加物流
	 */
	@RequestMapping("/addLogisticsBackStage")
	public String addLogisticsBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,Logistics logistics,String orderid,String tdId){
		logistics.setLoid(UUIDUtil.get16UUID());
		logistics.setLodate(new Date());
		System.out.println(logistics);
		int count = logisticsBackStageService.insertLogistics(logistics);
		if(count!=0){
			return "forward:logisticsPageBackStage";
		}else{
			model.addAttribute("msg10", "添加失败");
			return "forward:logisticsPageBackStage";
		}
		
	}
	
	/**
	 * @param pn
	 * @param model
	 * @param tdId
	 * @param loid
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:删除物流
	 */
	@RequestMapping("/deleteLogisticsPageBackStage")
	public String deleteLogisticsPageBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String tdId,String loid,String orderid){
		int count = logisticsBackStageService.deleteLogisticsByLoid(loid);
		if(count!=0){
			return "forward:logisticsPageBackStage";
		}else{
			model.addAttribute("msg10", "添加失败");
			return "forward:logisticsPageBackStage";
		}
		
	}
	
	
	/**
	 * @param pn
	 * @param model
	 * @param tdId
	 * @param orderid
	 * @param orderstate
	 * @param loid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:修改物流页面
	 */
	@RequestMapping("/updateLogisticsPageBackStage")
	public String updateLogisticsPageBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String tdId,String orderid,String orderstate,String loid){
		TakeDelivery takeDelivery = takeDeliveryService.selectTakeDeliveryByTdId(tdId);
		System.out.println(tdId+"===="+orderid+"==="+pn+"====="+loid);
		List<Logistics> list = logisticsBackStageService.selectLogisticsByOrderid(orderid);
		Logistics logisticsdemo =logisticsBackStageService.selectLogisticsByLoid(loid);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(logisticsdemo);
		String date = sdf.format(logisticsdemo.getLodate());
		for (Logistics logistics : list) {
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String pdate = sdf2.format(logistics.getLodate());
			logistics.setDate(pdate);
		}
		System.out.println(tdId+"===="+orderid+"==="+pn);
		model.addAttribute("takeDelivery", takeDelivery);
		model.addAttribute("list", list);
		model.addAttribute("pn", pn);
		model.addAttribute("orderstate", orderstate);
		model.addAttribute("orderid", orderid);
		model.addAttribute("logisticsdemo", logisticsdemo);
		model.addAttribute("date", date);
		model.addAttribute("tdId", tdId);
		return "backStage/updateLogistics";
		
	}
	
	/**
	 * @param pn
	 * @param logistics
	 * @param model
	 * @param tdId
	 * @param loid
	 * @param orderid
	 * @param date
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:修改物流
	 */
	@RequestMapping("/updateLogisticsBackStage")
	public String updateLogisticsBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Logistics logistics,Model model,String tdId,String loid,String orderid,String date) throws ParseException{
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date pdate = sdf2.parse(date);
		logistics.setLodate(pdate);
		System.out.println(logistics);
		int count = logisticsBackStageService.updateLogisticsByLoid(logistics);
		if(count!=0){
			return "forward:logisticsPageBackStage";
		}else{
			model.addAttribute("msg10", "添加失败");
			return "forward:logisticsPageBackStage";
		}
	}
	
	@RequestMapping("/receiveOrderBackStage")
	public String receiveOrderBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String orderid){
		Orderss orders = orderBackstageService.selectOrdersByOrderid(orderid);
		orders.setOrderstate(new BigDecimal(4));
		int count = orderBackstageService.updateOrderByOrderid(orders);
		if(count!=0){
			return "forward:orderBackStage?orderState="+orders.getOrderstate()+"&pn="+pn;
		}else{
			model.addAttribute("msg9", "收货失败");
			return "forward:orderBackStage?orderState="+orders.getOrderstate()+"&pn="+pn;
		}
		
		
	}

	
	
}
