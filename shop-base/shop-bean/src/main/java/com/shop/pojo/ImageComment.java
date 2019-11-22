package com.shop.pojo;

import java.math.BigDecimal;

public class ImageComment {
    private BigDecimal ipId;

    private String cid;

    private String icRoute;

    public BigDecimal getIpId() {
        return ipId;
    }

    public void setIpId(BigDecimal ipId) {
        this.ipId = ipId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    @Override
	public String toString() {
		return "ImageComment [ipId=" + ipId + ", cid=" + cid + ", icRoute=" + icRoute + "]";
	}

	public String getIcRoute() {
        return icRoute;
    }

    public void setIcRoute(String icRoute) {
        this.icRoute = icRoute == null ? null : icRoute.trim();
    }
}