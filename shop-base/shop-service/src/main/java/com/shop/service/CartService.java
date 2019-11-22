package com.shop.service;

import com.shop.pojo.Cart;

/**
 * @ClassName: CartService
 * @author: snypxk
 * @Description: Cart[购物车表]的服务接口类
 * @date: 2019年8月9日
 * @Other:
 */
public interface CartService {

	/**
	 * @Description: 根据 用户ID - 获取对应的购物车编号 
	 * @param userid
	 * @return
	 * @return String
	 */
	public String getCartidByUserid(String userid);
	
	/**
	 * @Description: 根据用户ID - 创建购物车     前提:该用户还没有购物车
	 * @param userid
	 * @return
	 * @return int
	 */
	public int createCartByUserid(String userid);
	
	
	/**
	 * @Description: 根据用户ID - 获得用户的购物车所有商品详情  [ cart.cartitemList  ]
	 * @param userid
	 * @return
	 * @return Cart
	 */
	public Cart getAllCartProductByUserid(String userid);
}
