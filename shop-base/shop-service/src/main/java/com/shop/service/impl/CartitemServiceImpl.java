
package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CartitemMapper;
import com.shop.pojo.Cartitem;
import com.shop.service.CartitemService;

/**
 * @ClassName: CartitemServiceImpl
 * @author: snypxk
 * @Description: CartItem[购物车项表]的服务接口实现类
 * @date: 2019年8月9日
 * @Other:
 */
@Service
public class CartitemServiceImpl implements CartitemService {

	@Autowired
	private CartitemMapper cartitemMapper;
	
	@Override
	public int insertCartItem(Cartitem cartitem) {
		return cartitemMapper.insert(cartitem);
	}

	@Override
	public int deleteCartItemByCartItemid(String cartItemid) {
		return cartitemMapper.deleteByPrimaryKey(cartItemid);
	}
}
