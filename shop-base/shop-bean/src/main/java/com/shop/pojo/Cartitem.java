package com.shop.pojo;

import java.math.BigDecimal;

public class Cartitem {
    private String cartitemid;

    private String cartid;

    private BigDecimal psId;

    //一个购物车项对应一个商品规格对象
    private ProductSpec productSpec;
    
    public String getCartitemid() {
        return cartitemid;
    }

    public void setCartitemid(String cartitemid) {
        this.cartitemid = cartitemid == null ? null : cartitemid.trim();
    }

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid == null ? null : cartid.trim();
    }

    public BigDecimal getPsId() {
        return psId;
    }

    public void setPsId(BigDecimal psId) {
        this.psId = psId;
    }

	public ProductSpec getProductSpec() {
		return productSpec;
	}

	public void setProductSpec(ProductSpec productSpec) {
		this.productSpec = productSpec;
	}

	@Override
	public String toString() {
		return "Cartitem [cartitemid=" + cartitemid + ", cartid=" + cartid + ", psId=" + psId + ", productSpec="
				+ productSpec + "]";
	}
	
}