package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.LogisticsMapper;
import com.shop.pojo.Logistics;
import com.shop.pojo.LogisticsExample;
import com.shop.pojo.LogisticsExample.Criteria;
import com.shop.service.LogisticsService;

/**
 * @ClassName: LogisticsServiceImpl
 * @author: snypxk
 * @Description: 物流信息项表（logistics）的服务接口实现类
 * @date: 2019年8月8日
 * @Other:
 */
@Service
public class LogisticsServiceImpl implements LogisticsService {

	@Autowired
	private LogisticsMapper logisticsMapper;

	@Override
	public List<Logistics> queryLogisticsByOrderidASC(String orderid) {
		List<Logistics> list = logisticsMapper.queryLogisticsByOrderidASC(orderid);
		return list.size() > 0 ? list : null;
	}
}
