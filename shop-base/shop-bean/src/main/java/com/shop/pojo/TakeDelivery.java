package com.shop.pojo;

public class TakeDelivery {
    private String tdId;

    private String userid;

    private String tdName;

    private String tdAddress;

    private String tdTelephone;

    private String tdstate;

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

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName == null ? null : tdName.trim();
    }

    public String getTdAddress() {
        return tdAddress;
    }

    public void setTdAddress(String tdAddress) {
        this.tdAddress = tdAddress == null ? null : tdAddress.trim();
    }

    public String getTdTelephone() {
        return tdTelephone;
    }

    public void setTdTelephone(String tdTelephone) {
        this.tdTelephone = tdTelephone == null ? null : tdTelephone.trim();
    }

    public String getTdstate() {
        return tdstate;
    }

    public void setTdstate(String tdstate) {
        this.tdstate = tdstate == null ? null : tdstate.trim();
    }

	@Override
	public String toString() {
		return "TakeDelivery [tdId=" + tdId + ", userid=" + userid + ", tdName=" + tdName + ", tdAddress=" + tdAddress
				+ ", tdTelephone=" + tdTelephone + ", tdstate=" + tdstate + "]";
	}
}