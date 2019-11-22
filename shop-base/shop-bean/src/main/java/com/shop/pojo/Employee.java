package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private String eid;

    private Date ehiretime;

    private String epassword;

    private BigDecimal estate;

    private String ename;

    private String email;

    @Override
	public String toString() {
		return "Employee [eid=" + eid + ", ehiretime=" + ehiretime + ", epassword=" + epassword + ", estate=" + estate
				+ ", ename=" + ename + ", email=" + email + ", etelephone=" + etelephone + "]";
	}

	private String etelephone;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public Date getEhiretime() {
        return ehiretime;
    }

    public void setEhiretime(Date ehiretime) {
        this.ehiretime = ehiretime;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword == null ? null : epassword.trim();
    }

    public BigDecimal getEstate() {
        return estate;
    }

    public void setEstate(BigDecimal estate) {
        this.estate = estate;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEtelephone() {
        return etelephone;
    }

    public void setEtelephone(String etelephone) {
        this.etelephone = etelephone == null ? null : etelephone.trim();
    }
}