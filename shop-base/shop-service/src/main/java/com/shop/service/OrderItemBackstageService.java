package com.shop.service;

import java.util.List;

import com.shop.pojo.Orderitem;

public interface OrderItemBackstageService {

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id查询订单子项
	 */
	List<Orderitem> selectOrderitemByOrderid(String orderid);

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id删除收货信息
	 */
	int deleteTakeDeliveryByOrderId(String orderid);

}
