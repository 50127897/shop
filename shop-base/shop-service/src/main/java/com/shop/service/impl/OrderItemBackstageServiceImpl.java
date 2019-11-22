package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.OrderitemMapper;
import com.shop.pojo.Orderitem;
import com.shop.pojo.OrderitemExample;
import com.shop.pojo.OrderitemExample.Criteria;
import com.shop.service.OrderItemBackstageService;

@Service
public class OrderItemBackstageServiceImpl implements OrderItemBackstageService {

	@Autowired
	private OrderitemMapper orderitemMapper;
	@Override
	public List<Orderitem> selectOrderitemByOrderid(String orderid) {
		OrderitemExample example = new OrderitemExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderidEqualTo(orderid);
		return orderitemMapper.selectByExample(example);
	}
	@Override
	public int deleteTakeDeliveryByOrderId(String orderid) {
		OrderitemExample example = new OrderitemExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderidEqualTo(orderid);
		return orderitemMapper.deleteByExample(example);
	}

}
