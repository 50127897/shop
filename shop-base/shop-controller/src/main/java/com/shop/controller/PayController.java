package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.OrderProperty;
import com.shop.pojo.Orderss;
import com.shop.pojo.Users;
import com.shop.service.UserService;

/**
 * @ClassName: PayController
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年8月11日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Pay")
public class PayController {

	@Autowired
	private UserService userService;

	// 从购物车页面(选择好商品以及收货地址) 或者 从我的订单的待支付订单跳转到该方法中
	@RequestMapping(value = "/payindex")
	public String payindex(Model model, String orderid) {
		model.addAttribute("orderid", orderid);
		return "payJSP/payindex";
	}

	/**
	 * @Description: 进入支付宝支付界面
	 * @param model
	 * @param orderid
	 * @param request
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/toPayAlipay")
	public String toPayAlipay(Model model, String orderid, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		String userid = user.getUserid();
		OrderProperty orderProperty = new OrderProperty(userid, orderid);
		Orderss orderPay = userService.getOrderitemProductByUseridAndOrderid(orderProperty).get(0);
		model.addAttribute("orderPay", orderPay);
		return "payJSP/payAlipay";
	}
	
	/**
	 * @Description: 使用支付宝进行支付
	 * @param model
	 * @param orderid
	 * @param request
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/payByAlipay")
	public String payByAlipay(Model model, String orderid, HttpServletRequest request) {
		return "payJSP/payByAlipay";
	}

}
