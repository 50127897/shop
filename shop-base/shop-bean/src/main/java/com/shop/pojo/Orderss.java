package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Orderss {
    private String orderid;

    private Date ordertime;

    private String date;
    
    private BigDecimal total;

    private BigDecimal orderstate;

  
	@Override
	public String toString() {
		return "Orderss [orderid=" + orderid + ", ordertime=" + ordertime + ", date=" + date + ", total=" + total
				+ ", orderstate=" + orderstate + ", tdId=" + tdId + ", userid=" + userid + ", takeDelivery="
				+ takeDelivery + ", orderItemList=" + orderItemList + "]";
	}

	private String tdId;

    private String userid;
    
    //订单的收获信息 - 根据 userid 和 tdId 共同查询
    private TakeDelivery takeDelivery;   
    
    //订单的子项订单列表 - 根据 oid 查询
    private List<Orderitem> orderItemList;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(BigDecimal orderstate) {
        this.orderstate = orderstate;
    }

    public String getTdId() {
        return tdId;
    }

    public void setTdId(String tdId) {
        this.tdId = tdId == null ? null : tdId.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

	public TakeDelivery getTakeDelivery() {
		return takeDelivery;
	}

	public void setTakeDelivery(TakeDelivery takeDelivery) {
		this.takeDelivery = takeDelivery;
	}

	public List<Orderitem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<Orderitem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}