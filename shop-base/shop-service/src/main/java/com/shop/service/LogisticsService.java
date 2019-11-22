package com.shop.service;

import java.util.List;

import com.shop.pojo.Logistics;

/**
 * @ClassName: LogisticsService
 * @author: snypxk
 * @Description: 物流信息项表（logistics）的服务接口类
 * @date: 2019年8月8日
 * @Other:
 */
public interface LogisticsService {

	/**
	 * @Description: 查询订单的物流信息  - 根据 订单编号 orderid 按时间降序  
	 * @param orderid
	 * @return
	 * @return List<Logistics>
	 */
	public List<Logistics> queryLogisticsByOrderidASC(String orderid);
}
