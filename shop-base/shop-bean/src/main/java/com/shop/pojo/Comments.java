package com.shop.pojo;

import java.util.Date;
import java.util.List;

public class Comments {
    private String cid;

    private String pid;

    private String userid;

    private Date ctime;

    private String cdetail;
    
    //一个评价对应的评价图片路径集合 2019-8-2
    private List<ImageComment> imageComments;

   

	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", pid=" + pid + ", userid=" + userid + ", ctime=" + ctime + ", cdetail="
				+ cdetail + ", imageComments=" + imageComments + "]";
	}

	public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCdetail() {
        return cdetail;
    }

    public void setCdetail(String cdetail) {
        this.cdetail = cdetail == null ? null : cdetail.trim();
    }

	public List<ImageComment> getImageComments() {
		return imageComments;
	}

	public void setImageComments(List<ImageComment> imageComments) {
		this.imageComments = imageComments;
	}

	
}