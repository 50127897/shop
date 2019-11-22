package com.shop.pojo;

import java.math.BigDecimal;

public class ImageProduct {
    private BigDecimal ipId;

    private String pid;

    private String ipRoute;

    @Override
	public String toString() {
		return "ImageProduct [ipId=" + ipId + ", pid=" + pid + ", ipRoute=" + ipRoute + "]";
	}

	public BigDecimal getIpId() {
        return ipId;
    }

    public void setIpId(BigDecimal ipId) {
        this.ipId = ipId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getIpRoute() {
        return ipRoute;
    }

    public void setIpRoute(String ipRoute) {
        this.ipRoute = ipRoute == null ? null : ipRoute.trim();
    }
}