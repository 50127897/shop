package com.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product {
    private String pid;

	private String pname;

    private BigDecimal shopPrice;

    private BigDecimal marketPrice;

    private Date pdate;

    private String pdesc;

    private BigDecimal pflag;

    private String cid;

    private BigDecimal psale;

    private BigDecimal bid;

    private String searchinformation;
    
    //商品对应的图片列表
    private List<ImageProduct> imageProducts;

	//一个商品对应的评价列表
    private List<Comments> commentsList;
    
    //一个商品对应的规格库存列表
    private List<ProductSpec> specList;
    
    //安
    private List<ProductSpec> productSpecs;
    
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public BigDecimal getPflag() {
        return pflag;
    }

    public void setPflag(BigDecimal pflag) {
        this.pflag = pflag;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public BigDecimal getPsale() {
        return psale;
    }

    public void setPsale(BigDecimal psale) {
        this.psale = psale;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public String getSearchinformation() {
        return searchinformation;
    }

    public void setSearchinformation(String searchinformation) {
        this.searchinformation = searchinformation == null ? null : searchinformation.trim();
    }

	public List<ImageProduct> getImageProducts() {
		return imageProducts;
	}

	public void setImageProducts(List<ImageProduct> imageProducts) {
		this.imageProducts = imageProducts;
	}

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}

	public List<ProductSpec> getSpecList() {
		return specList;
	}

	public void setSpecList(List<ProductSpec> specList) {
		this.specList = specList;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", shopPrice=" + shopPrice + ", marketPrice=" + marketPrice
				+ ", pdate=" + pdate + ", pdesc=" + pdesc + ", pflag=" + pflag + ", cid=" + cid + ", psale=" + psale
				+ ", bid=" + bid + ", searchinformation=" + searchinformation + ", imageProducts=" + imageProducts
				+ ", commentsList=" + commentsList + ", specList=" + specList + ", productSpecs=" + productSpecs + "]";
	}

	public List<ProductSpec> getProductSpecs() {
		return productSpecs;
	}

	public void setProductSpecs(List<ProductSpec> productSpecs) {
		this.productSpecs = productSpecs;
	}
}