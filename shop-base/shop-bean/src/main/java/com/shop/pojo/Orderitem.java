package com.shop.pojo;

import java.math.BigDecimal;

public class Orderitem {
    private String oiId;

    private BigDecimal quantity;

    private BigDecimal oiTotal;

    private String pid;

    private String orderid;

    private String commentflag;

    private String productspec;
    
    //一个子项订单对应的一个商品 - 根据pid查询
    private Product producItem;
    
    //安
    private Product product;
    
    public String getOiId() {
        return oiId;
    }

    public void setOiId(String oiId) {
        this.oiId = oiId == null ? null : oiId.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getOiTotal() {
        return oiTotal;
    }

    public void setOiTotal(BigDecimal oiTotal) {
        this.oiTotal = oiTotal;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCommentflag() {
        return commentflag;
    }

    public void setCommentflag(String commentflag) {
        this.commentflag = commentflag == null ? null : commentflag.trim();
    }

    public String getProductspec() {
        return productspec;
    }

    public void setProductspec(String productspec) {
        this.productspec = productspec == null ? null : productspec.trim();
    }

	public Product getProducItem() {
		return producItem;
	}

	public void setProducItem(Product producItem) {
		this.producItem = producItem;
	}

	@Override
	public String toString() {
		return "Orderitem [oiId=" + oiId + ", quantity=" + quantity + ", oiTotal=" + oiTotal + ", pid=" + pid
				+ ", orderid=" + orderid + ", commentflag=" + commentflag + ", productspec=" + productspec
				+ ", producItem=" + producItem + ", product=" + product + "]";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}