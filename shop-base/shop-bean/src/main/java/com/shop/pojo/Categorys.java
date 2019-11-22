package com.shop.pojo;

public class Categorys {
    private String cid;

    private String cname;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCname() {
        return cname;
    }

    @Override
	public String toString() {
		return "Categorys [cid=" + cid + ", cname=" + cname + "]";
	}

	public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}