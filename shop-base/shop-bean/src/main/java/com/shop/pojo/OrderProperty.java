package com.shop.pojo;

/**
 * @ClassName: OrderProperty
 * @author: snypxk
 * @Description: 根据用户ID 与 订单ID 返回对应订单项的商品详细信息
 * 				 该对象用于查询语句: OrderssMapper.xml  -->  getOrderitemProductByUseridAndOrderid
 * 				 的入参对象
 * @date: 2019年8月11日
 * @Other:
 */
public class OrderProperty {

	private String userid;
	
	private String orderid;

	public OrderProperty(String userid, String orderid) {
		super();
		this.userid = userid;
		this.orderid = orderid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Override
	public String toString() {
		return "OrderProperty [userid=" + userid + ", orderid=" + orderid + "]";
	}
	
}
