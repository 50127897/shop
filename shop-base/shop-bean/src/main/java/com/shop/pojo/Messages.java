package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Messages {
    private BigDecimal mid;

    private String customerId;

    private Date pid;

    private String mcontent;

    private String eid;

    @Override
	public String toString() {
		return "Messages [mid=" + mid + ", customerId=" + customerId + ", pid=" + pid + ", mcontent=" + mcontent
				+ ", eid=" + eid + "]";
	}

	public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Date getPid() {
        return pid;
    }

    public void setPid(Date pid) {
        this.pid = pid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent == null ? null : mcontent.trim();
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }
}