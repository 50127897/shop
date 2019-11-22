package com.shop.pojo;

import java.math.BigDecimal;

public class Brands {
    private BigDecimal bid;

    private String bname;

    private String brRoute;

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    @Override
	public String toString() {
		return "Brands [bid=" + bid + ", bname=" + bname + ", brRoute=" + brRoute + "]";
	}

	public String getBrRoute() {
        return brRoute;
    }

    public void setBrRoute(String brRoute) {
        this.brRoute = brRoute == null ? null : brRoute.trim();
    }
}