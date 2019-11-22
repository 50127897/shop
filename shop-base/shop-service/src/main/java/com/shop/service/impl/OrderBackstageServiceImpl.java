package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.OrderssMapper;
import com.shop.pojo.Orderss;
import com.shop.service.OrderBackstageService;

@Service
public class OrderBackstageServiceImpl implements OrderBackstageService {

	@Autowired
	private OrderssMapper orderssMapper;
	
	@Override
	public List<Orderss> selectAllOrdersWithTakeDelivery() {
		return orderssMapper.selectAllOrdersWithTakeDelivery();
	}

	@Override
	public List<Orderss> selectAllOrdersWithTakeDeliveryByOrderState(String orderState) {
		return orderssMapper.selectAllOrdersWithTakeDeliveryByOrderState(new BigDecimal(orderState));
	}

	@Override
	public Orderss selectOrdersByOrderid(String orderid) {
		return orderssMapper.selectByPrimaryKey(orderid);
	}

	@Override
	public int deleteOrdersByOrderId(String orderid) {
		return orderssMapper.deleteByPrimaryKey(orderid);
	}

	@Override
	public int updateOrderByOrderid(Orderss orders) {
		return orderssMapper.updateByPrimaryKeySelective(orders);
	}

	@Override
	public List<Orderss> selectAllOrdersWithTakeDeliveryLike(String orderid) {
		orderid = "%"+orderid+"%";
		return orderssMapper.selectAllOrdersWithTakeDeliveryLike(orderid);
	}

	
}
