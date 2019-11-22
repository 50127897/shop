package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Logistics {
    private String loid;

    private Date lodate;

    private String loaddress;

    private BigDecimal lostate;

    private String orderid;
    
    //安
    private String date;

    public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Logistics [loid=" + loid + ", lodate=" + lodate + ", loaddress=" + loaddress + ", lostate=" + lostate
				+ ", orderid=" + orderid + ", date=" + date + "]";
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLoid() {
        return loid;
    }

    public void setLoid(String loid) {
        this.loid = loid == null ? null : loid.trim();
    }

    public Date getLodate() {
        return lodate;
    }

    public void setLodate(Date lodate) {
        this.lodate = lodate;
    }

    public String getLoaddress() {
        return loaddress;
    }

    public void setLoaddress(String loaddress) {
        this.loaddress = loaddress == null ? null : loaddress.trim();
    }

    public BigDecimal getLostate() {
        return lostate;
    }

    public void setLostate(BigDecimal lostate) {
        this.lostate = lostate;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }
}