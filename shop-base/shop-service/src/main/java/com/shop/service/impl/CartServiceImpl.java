package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CartMapper;
import com.shop.pojo.Cart;
import com.shop.pojo.CartExample;
import com.shop.pojo.CartExample.Criteria;
import com.shop.service.CartService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: CartServiceImpl
 * @author: snypxk
 * @Description: Cart[购物车表]的服务接口实现类
 * @date: 2019年8月9日
 * @Other:
 */
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartMapper cartMapper;

	@Override
	public String getCartidByUserid(String userid) {
		CartExample example = new CartExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<Cart> list = cartMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0).getCartid() : null;
	}

	@Override
	public int createCartByUserid(String userid) {
		Cart cart=new Cart();
		cart.setCartid(UUIDUtil.get16UUID());
		cart.setUserid(userid);
		return cartMapper.insert(cart);
	}

	@Override
	public Cart getAllCartProductByUserid(String userid) {
		Cart cart = cartMapper.getAllCartProductByUserid(userid);
		return cart;
	}

}
