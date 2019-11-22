package com.shop.pojo;

import java.math.BigDecimal;

public class ProductSpec {
    private BigDecimal psId;

    private String pid;

    private String psSpec;

    private BigDecimal psStore;
    
    //一个规格 对应 一份商品
    private Product descProduct;
    
    public BigDecimal getPsId() {
        return psId;
    }

    public void setPsId(BigDecimal psId) {
        this.psId = psId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPsSpec() {
        return psSpec;
    }

    public void setPsSpec(String psSpec) {
        this.psSpec = psSpec == null ? null : psSpec.trim();
    }

    public BigDecimal getPsStore() {
        return psStore;
    }

    public void setPsStore(BigDecimal psStore) {
        this.psStore = psStore;
    }

	@Override
	public String toString() {
		return "ProductSpec [psId=" + psId + ", pid=" + pid + ", psSpec=" + psSpec + ", psStore=" + psStore
				+ ", descProduct=" + descProduct + "]";
	}

	public Product getDescProduct() {
		return descProduct;
	}

	public void setDescProduct(Product descProduct) {
		this.descProduct = descProduct;
	}
    
}