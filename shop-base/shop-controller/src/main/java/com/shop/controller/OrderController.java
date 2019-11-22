package com.shop.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Orderitem;
import com.shop.pojo.Orderss;
import com.shop.pojo.Users;
import com.shop.service.CartitemService;
import com.shop.service.OrderService;
import com.shop.service.OrderitemService;
import com.shop.service.UserService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: OrderController
 * @author: snypxk
 * @Description: 订单的控制类
 * @date: 2019年8月8日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Order")
public class OrderController {

	@Autowired
	private UserService userService;

	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderitemService orderitemService;
	
	@Autowired
	private CartitemService cartitemService;
	
	@RequestMapping(value = "/showOrder")
	public String showUserOrder(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();
		List<Orderss> orderList = userService.getOrdersByUserid(userid);
		model.addAttribute("orderList", orderList);
		for (Orderss orderss : orderList) {
			System.out.println(orderss);
		}
		return "OrderJSP/order";
	}

	@RequestMapping(value = "/fortest")
	public String fortest() {
		return "testJSP/fortest";
	}

	/**
	 * @Description: 更新订单的状态变为2,即已付款待发货
	 * @param model
	 * @param request
	 * @param orderid
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/updateOrder")
	public String updateOrder(Model model, HttpServletRequest request, String orderid) {
		Orderss orderss = new Orderss();
		orderss.setOrderid(orderid);
		orderss.setOrderstate(new BigDecimal(2));
		orderService.updateOrderByOid(orderss);
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();
		List<Orderss> orderList = userService.getOrdersByUserid(userid);
		model.addAttribute("orderList", orderList);
		return "OrderJSP/order";
	}

	
	/**
	 * @Description: 删除订单
	 * @param model
	 * @param request
	 * @param orderid
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/deleteOrder")
	public String deleteOrderByOrderid(Model model, HttpServletRequest request, String orderid) {
		orderitemService.deleteOrderItemByOrderid(orderid);
		orderService.deleteOrderByOid(orderid);
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();
		List<Orderss> orderList = userService.getOrdersByUserid(userid);
		model.addAttribute("orderList", orderList);
		return "OrderJSP/order";
	}

	@RequestMapping(value = "/toDeliver")
	public String toDeliver(Model model, HttpServletRequest request) {
		return "OrderJSP/order";
	}

	
	/**
	 * @Description: 生成订单
	 * @param model
	 * @param request
	 * @param cartitemid
	 * @param profuct_num
	 * @param tdId
	 * @param pid
	 * @param shopPrice
	 * @param index
	 * @param psSpec
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/createOrder")
	public String creatOrder(Model model, HttpServletRequest request, String[] cartitemid, String[] profuct_num,
			String tdId, String[] pid, String[] shopPrice, String[] index,String[] psSpec) {
		
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();
		
		double total = 0;
		for (String iS : index) {
			int i = Integer.parseInt(iS);
			total += Integer.parseInt(profuct_num[i]) * Integer.parseInt(shopPrice[i]);
		}
		
		Orderss orders = new Orderss();
		orders.setOrderid(UUIDUtil.get16UUID());
		orders.setOrdertime(new Date());
		orders.setOrderstate(new BigDecimal(1));
		orders.setTdId(tdId);
		orders.setTotal(new BigDecimal(total));
		orders.setUserid(userid);
		orderService.insertOrder(orders);
		
		for (String iS : index) {
			int i = Integer.parseInt(iS);
			Orderitem orderitem=new Orderitem();
			orderitem.setOiId(UUIDUtil.get16UUID());
			orderitem.setCommentflag("0");
			orderitem.setOiTotal(new BigDecimal(Integer.parseInt(profuct_num[i]) * Integer.parseInt(shopPrice[i])));
			orderitem.setPid(pid[i]);
			orderitem.setProductspec(psSpec[i]);
			orderitem.setQuantity(new BigDecimal(Integer.parseInt(profuct_num[i])));
			orderitem.setOrderid(orders.getOrderid());
			orderitemService.insertOrderItem(orderitem);
			cartitemService.deleteCartItemByCartItemid(cartitemid[i]);
		}
		
		model.addAttribute("orderid", orders.getOrderid());
		return "payJSP/payindex";
	}

}
