package com.shop.pojo;

import java.math.BigDecimal;

public class Collections {
    private BigDecimal collectId;

    private String userid;

    private String pid;

    public BigDecimal getCollectId() {
        return collectId;
    }

    public void setCollectId(BigDecimal collectId) {
        this.collectId = collectId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}