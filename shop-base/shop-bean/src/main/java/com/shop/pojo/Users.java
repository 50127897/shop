package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Users {
    private String userid;

    private String username;

    private String passwd;

    private String email;

    private Date birthday;

    private String sex;

    private BigDecimal state;

    private String code;

    private String telephone;
    
    //用户已订单列表 
    private List<Orderss> orderList;

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

	public List<Orderss> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orderss> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", passwd=" + passwd + ", email=" + email
				+ ", birthday=" + birthday + ", sex=" + sex + ", state=" + state + ", code=" + code + ", telephone="
				+ telephone + ", orderList=" + orderList + "]";
	}
	
}