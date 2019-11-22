package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.OrderssMapper;
import com.shop.pojo.Orderss;
import com.shop.service.OrderService;

/**
 * @ClassName: OrderServiceImpl
 * @author: snypxk
 * @Description: Orders[s订单表]的服务接口实现类
 * @date: 2019年8月8日
 * @Other:
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderssMapper orderssMapper;

	@Override
	public int insertOrder(Orderss order) {
		return orderssMapper.insertSelective(order);
	}

	@Override
	public List<Orderss> queryOrderByUseridIsDone(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orderss> queryOrderByUseridIsNotDone(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orderss> getOrderOrderitemProductByUserid(String userid) {
		List<Orderss> list = orderssMapper.getOrderOrderitemProduct(userid);
		return list.size() > 0 ? list : null;
	}

	@Override
	public int updateOrderByOid(Orderss orderss) {
		return orderssMapper.updateByPrimaryKeySelective(orderss);
	}

	@Override
	public int deleteOrderByOid(String oid) {
		return orderssMapper.deleteByPrimaryKey(oid);
	}

}
