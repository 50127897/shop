package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.OrderitemMapper;
import com.shop.pojo.Orderitem;
import com.shop.pojo.OrderitemExample;
import com.shop.pojo.OrderitemExample.Criteria;
import com.shop.service.OrderitemService;

/**
 * @ClassName: OrderitemServiceImpl
 * @author: snypxk
 * @Description: Orderitem的服务接口实现类
 * @date: 2019年8月8日
 * @Other:
 */
@Service
public class OrderitemServiceImpl implements OrderitemService {

	@Autowired
	private OrderitemMapper orderitemMapper;

	@Override
	public int insertOrderItem(Orderitem orderitem) {
		return orderitemMapper.insertSelective(orderitem);
	}

	@Override
	public int deleteOrderItem(Orderitem orderitem) {
		OrderitemExample example =new OrderitemExample();
		Criteria criteria =example.createCriteria();
		criteria.andOiIdEqualTo(orderitem.getOiId());
		return orderitemMapper.deleteByExample(example);
	}

	@Override
	public int deleteOrderItem(String oiid) {
		return orderitemMapper.deleteByPrimaryKey(oiid);
	}

	@Override
	public int deleteOrderItemByOrderid(String orderid) {
		OrderitemExample example =new OrderitemExample();
		Criteria criteria =example.createCriteria();
		criteria.andOrderidEqualTo(orderid);
		return orderitemMapper.deleteByExample(example);
	}

	@Override
	public int updateOrderItemCFByOiID(String oiId) {
		Orderitem orderitem=new Orderitem();
		orderitem.setOiId(oiId);
		orderitem.setCommentflag("1");
		return orderitemMapper.updateByPrimaryKeySelective(orderitem);
	}

}
