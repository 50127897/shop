package com.shop.service;

import com.shop.pojo.Cartitem;

/**
 * @ClassName: CartitemService
 * @author: snypxk
 * @Description: Cartitem[购物车项表]的服务接口类
 * @date: 2019年8月9日
 * @Other:
 */
public interface CartitemService {

	/**
	 * @Description: 添加购物车项 -setCartid[ 通过CartService.getCartidByUserid(userid) ]
	 *               -setCartItemid[ UUIDUtil ] -setPsId[商品规格ID]
	 * @param cartitem
	 * @return
	 * @return int
	 */
	public int insertCartItem(Cartitem cartitem);

	/**
	 * @Description: 删除购物车项 - 根据cartItemid
	 * @param cartItemid
	 * @return
	 * @return int
	 */
	public int deleteCartItemByCartItemid(String cartItemid);
}
