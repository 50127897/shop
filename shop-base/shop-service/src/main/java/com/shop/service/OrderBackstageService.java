package com.shop.service;

import java.util.List;

import com.shop.pojo.Orderss;

public interface OrderBackstageService {

	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:查询所有带收货信息的订单
	 */
	List<Orderss> selectAllOrdersWithTakeDelivery();

	/**
	 * @param orderState
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单状态查询带收货信息的订单
	 */
	List<Orderss> selectAllOrdersWithTakeDeliveryByOrderState(String orderState);

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id查询订单
	 */
	Orderss selectOrdersByOrderid(String orderid);

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id删除订单
	 */
	int deleteOrdersByOrderId(String orderid);

	/**
	 * @param orders
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id更新订单
	 */
	int updateOrderByOrderid(Orderss orders);

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据订单id进行模糊查询，查询带收货信息的订单
	 */
	List<Orderss> selectAllOrdersWithTakeDeliveryLike(String orderid);
	
}
