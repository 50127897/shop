package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Cart;
import com.shop.pojo.Cartitem;
import com.shop.pojo.TakeDelivery;
import com.shop.pojo.Users;
import com.shop.service.CartService;
import com.shop.service.CartitemService;
import com.shop.service.TakeDeliveryService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: CartController
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年8月9日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartitemService cartitemService;
	
	@Autowired 
	private TakeDeliveryService takeDeliveryService;

	/**
	 * @Description: 显示购物车
	 * @param model
	 * @param request
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/showCart")
	public String showCart(Model model, HttpServletRequest request) {
		Users user = (Users) request.getSession().getAttribute("user");
		String userid=user.getUserid();
		Cart cart = cartService.getAllCartProductByUserid(user.getUserid());
		List<TakeDelivery> takeDeliveryList = takeDeliveryService.queryAllTakeDeliveryByUserid(userid);
		model.addAttribute("takeDeliveryList", takeDeliveryList);
		model.addAttribute("cart", cart);
		return "CartJSP/cart";
	}

	
	/**
	 * @Description: 增加商品到购物车
	 * @param model
	 * @param psId
	 * @param request
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/addItmeToCart")
	public String addToCart(Model model, BigDecimal psId, Integer producNum,HttpServletRequest request) {
		System.out.println(psId+"    "+producNum);
		// 获取用户ID
		Users user = (Users) request.getSession().getAttribute("user");
		String userid = user.getUserid();

		
		// 判断用户是否已经有购物车
		String cartid = cartService.getCartidByUserid(userid);
		System.out.println(userid);
		System.out.println(cartid);
		if (cartid == "" || cartid==null) {
			cartService.createCartByUserid(userid);
			cartid = cartService.getCartidByUserid(userid);
		}
		Cartitem cartitem=new Cartitem();
		cartitem.setCartitemid(UUIDUtil.get16UUID());
		cartitem.setCartid(cartid);
		cartitem.setPsId(psId);
		System.out.println(cartitem);
		cartitemService.insertCartItem(cartitem);
		
		Cart cart = cartService.getAllCartProductByUserid(user.getUserid());
		model.addAttribute("cart", cart);
		
		
		List<TakeDelivery> takeDeliveryList = takeDeliveryService.queryAllTakeDeliveryByUserid(userid);
		model.addAttribute("takeDeliveryList", takeDeliveryList);
		return "CartJSP/cart";
	}
	
	@RequestMapping("/deleteCartItem")
	public String deleteCartItem(String cartitemid) {
		int count = cartitemService.deleteCartItemByCartItemid(cartitemid);
		if (count !=0) {
			return "forward:showCart";
		}else {
			return "CartJSP/cart";
		}
		
	}
}
