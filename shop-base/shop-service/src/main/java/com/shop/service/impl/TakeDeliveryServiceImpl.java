package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.TakeDeliveryMapper;
import com.shop.pojo.TakeDelivery;
import com.shop.pojo.TakeDeliveryExample;
import com.shop.pojo.TakeDeliveryExample.Criteria;
import com.shop.pojo.Users;
import com.shop.service.TakeDeliveryService;

/**
 * @ClassName: TakeDeliveryService
 * @author: snypxk
 * @Description: TakeDelivery[收货信息表]的服务接口实现类
 * @date: 2019年7月30日上午12:01:20
 * @Other:
 */
@Service
public class TakeDeliveryServiceImpl implements TakeDeliveryService {

	@Autowired
	private TakeDeliveryMapper takeDeliveryMapper;

	@Override
	public int insertTakeDelivery(TakeDelivery takeDelivery) {
		return takeDeliveryMapper.insertSelective(takeDelivery);
	}

	@Override
	public int deleteTakeDeliveryByUserid(Users users, TakeDelivery takeDelivery) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(users.getUserid());
		criteria.andTdIdEqualTo(takeDelivery.getTdId());
		return takeDeliveryMapper.deleteByExample(example);
	}

	@Override
	public List<TakeDelivery> queryAllTakeDeliveryByUserid(Users users) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(users.getUserid());
		criteria.andTdstateEqualTo("0");
		List<TakeDelivery> list = takeDeliveryMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<TakeDelivery> queryAllTakeDeliveryByUserid(String userid) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		criteria.andTdstateEqualTo("0");
		List<TakeDelivery> list = takeDeliveryMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	@Override
	public int deleteTakeDeliveryByUserid(String userid, String tdid) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		criteria.andTdIdEqualTo(tdid);
		return takeDeliveryMapper.deleteByExample(example);
	}
	
	
	//================== 安 ========================
	@Override
	public List<TakeDelivery> queryAllTakeDeliveryByUserName(Users users) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(users.getUserid());
		return takeDeliveryMapper.selectByExample(null);
	}

	@Override
	public TakeDelivery selectTakeDeliveryByTdId(String tdId) {
		return takeDeliveryMapper.selectByPrimaryKey(tdId);
	}

	@Override
	public int deleteTakeDeliveryByTdId(String tdId) {
		TakeDeliveryExample example = new TakeDeliveryExample();
		Criteria criteria = example.createCriteria();
		criteria.andTdIdEqualTo(tdId);
		return takeDeliveryMapper.deleteByExample(example);
	}

	@Override
	public int updateDeliveryByTdId(TakeDelivery delivery) {
		return takeDeliveryMapper.updateByPrimaryKeySelective(delivery);
	}
	
	
	//================== 安 END =====================

}
