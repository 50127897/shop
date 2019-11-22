package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.LogisticsMapper;
import com.shop.pojo.Logistics;
import com.shop.pojo.LogisticsExample;
import com.shop.pojo.LogisticsExample.Criteria;
import com.shop.service.LogisticsBackStageService;

@Service
public class LogisticsBackStageServiceImpl implements LogisticsBackStageService {

	@Autowired
	private LogisticsMapper logisticsMapper;
	
	@Override
	public List<Logistics> selectLogisticsByOrderid(String orderid) {
		LogisticsExample example = new LogisticsExample();
		example.setOrderByClause("LODATE asc");
		Criteria criteria = example.createCriteria();
		criteria.andOrderidEqualTo(orderid);
		return logisticsMapper.selectByExample(example);
	}

	@Override
	public int insertLogistics(Logistics logistics) {
		return logisticsMapper.insertSelective(logistics);
	}

	@Override
	public int deleteLogisticsByLoid(String loid) {
		return logisticsMapper.deleteByPrimaryKey(loid);
	}

	@Override
	public Logistics selectLogisticsByLoid(String loid) {
		return logisticsMapper.selectByPrimaryKey(loid);
	}

	@Override
	public int updateLogisticsByLoid(Logistics logistics) {
		return logisticsMapper.updateByPrimaryKeySelective(logistics);
	}

	

	
}
