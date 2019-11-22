package com.shop.service;

import com.shop.pojo.Orderitem;

/**
 * @ClassName: OrderitemService
 * @author: snypxk
 * @Description: Orderitem的服务接口类
 * @date: 2019年8月8日
 * @Other:
 */
public interface OrderitemService {

	/**
	 * @Description: 插入子订单项   - 前提是 已经插入 其所处的订单
	 * @param orderitem
	 * @return
	 * @return int
	 */
	public int insertOrderItem(Orderitem orderitem);
	
	
	/**
	 * @Description: 删除子订单项 - 根据oiid
	 * @param orderitem
	 * @return
	 * @return int
	 */
	public int deleteOrderItem(Orderitem orderitem);
	
	
	/**
	 * @Description: 删除子订单项 - 根据oiid
	 * @param oiid - 子订单编号[主键]
	 * @return
	 * @return int
	 */
	public int deleteOrderItem(String oiid);
	
	
	/**
	 * @Description: 删除某订单号下的所有子订单项
	 * @param orderid
	 * @return
	 * @return int
	 */
	public int deleteOrderItemByOrderid(String orderid);
	
	/**
	 * @Description: 更新订单项的评价字段
	 * @param oiId
	 * @return
	 * @return int
	 */
	public int updateOrderItemCFByOiID(String oiId);
	
}
