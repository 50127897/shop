package com.shop.pojo;

import java.util.List;

public class Cart {
    private String cartid;

    private String userid;
    
    //购物车对应的购物车项列表
    private List<Cartitem> cartitemList;

    public List<Cartitem> getCartitemList() {
		return cartitemList;
	}

	public void setCartitemList(List<Cartitem> cartitemList) {
		this.cartitemList = cartitemList;
	}

	public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid == null ? null : cartid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", userid=" + userid + ", cartitemList=" + cartitemList + "]";
	}
    
}