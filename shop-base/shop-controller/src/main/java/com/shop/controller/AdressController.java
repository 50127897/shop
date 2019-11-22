package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.TakeDelivery;
import com.shop.pojo.Users;

import com.shop.service.TakeDeliveryService;

import com.shop.utils.Msg;
import com.shop.utils.UUIDUtil;

@Controller
public class AdressController {

	
	@Autowired
	private TakeDeliveryService takeDeliveryService;
	
	/**@Description: 跳转收货地址页面
	 * @return
	 */
	@RequestMapping("/toAdress")
	public String toAdress(HttpServletRequest request) {
		Users user=(Users) request.getSession().getAttribute("user");
		List<TakeDelivery> takeDeliveryList = takeDeliveryService.queryAllTakeDeliveryByUserid(user.getUserid());
		request.setAttribute("takeDeliveryList", takeDeliveryList);
		return "personalCenter/adress";
	}
	
	/**@Description: 删除收货地址
	 * @param takeDelivery
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteAdress")
	public String deleteAdress(TakeDelivery takeDelivery,HttpServletRequest request) {
		int count = takeDeliveryService.deleteTakeDeliveryByTdId(takeDelivery.getTdId());
		if (count !=0) {
			return "redirect:toAdress";
		}else {
			request.setAttribute("msg12", "删除失败，请重试！");
			return "personalCenter/adress";
		}
		
	}
	/**@Description: 修改收货地址信息
	 * @param takeDelivery
	 * @param tdName
	 * @param tdTelephone
	 * @param tdAddress
	 * @param request
	 * @return
	 */
	@RequestMapping("/updateAdress")
	public String updateAdress(TakeDelivery takeDelivery,String tdName,String tdTelephone,String tdAddress,HttpServletRequest request) {
		TakeDelivery oldTakeDelivery = takeDeliveryService.selectTakeDeliveryByTdId(takeDelivery.getTdId());
		System.out.println(tdName);
		oldTakeDelivery.setTdName(tdName);
		oldTakeDelivery.setTdTelephone(tdTelephone);
		oldTakeDelivery.setTdAddress(tdAddress);
		int count = takeDeliveryService.updateDeliveryByTdId(oldTakeDelivery);		
		if (count !=0) {
			return "redirect:toAdress";
			
		}else {
			request.setAttribute("msg12", "修改失败，请重试！");
			return "personalCenter/adress";
		}		
	}
	
	/**@Description: 添加收货地址
	 * @param takeDelivery
	 * @param request
	 * @return
	 */
	
	  @RequestMapping("/addAdress") 
	  public String addAdress(TakeDelivery takeDelivery,HttpServletRequest request) { Users user=(Users)
	  request.getSession().getAttribute("user");
	  takeDelivery.setTdId(UUIDUtil.get16UUID());
	  takeDelivery.setUserid(user.getUserid()); 
	  int count =takeDeliveryService.insertTakeDelivery(takeDelivery); 
	  if (count !=0) { 
		  return "redirect:toAdress"; }
	  else { return "personalCenter/adress"; }
	  
	  }
	 
	  @RequestMapping("/toAddAdress")
	  public String toAddAdress() {
		return "personalCenter/addadress";
	}
	
}
