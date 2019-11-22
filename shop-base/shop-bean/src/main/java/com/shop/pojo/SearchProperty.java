package com.shop.pojo;

import java.math.BigDecimal;

/**
 * @ClassName: SearchProperty
 * @author: snypxk
 * @Description: 搜索传入的参数[是一个对象]
 * @date: 2019年8月7日
 * @Other:
 */
public class SearchProperty {

	//对应 p.SEARCHINFORMATION
	private String searchKeysProperty;
	
	//对应 p.BID
	private BigDecimal bidProperty;
	
	//对应 p.CID
	private String cidProperty;

	public SearchProperty(String searchKeysProperty, BigDecimal bidProperty, String cidProperty) {
		super();
		this.searchKeysProperty = searchKeysProperty;
		this.bidProperty = bidProperty;
		this.cidProperty = cidProperty;
	}

	@Override
	public String toString() {
		return "SearchProperty [searchKeysProperty=" + searchKeysProperty + ", bidProperty=" + bidProperty
				+ ", cidProperty=" + cidProperty + "]";
	}

	public String getSearchKeysProperty() {
		return searchKeysProperty;
	}

	public void setSearchKeysProperty(String searchKeysProperty) {
		this.searchKeysProperty = searchKeysProperty;
	}

	public BigDecimal getBidProperty() {
		return bidProperty;
	}

	public void setBidProperty(BigDecimal bidProperty) {
		this.bidProperty = bidProperty;
	}

	public String getCidProperty() {
		return cidProperty;
	}

	public void setCidProperty(String cidProperty) {
		this.cidProperty = cidProperty;
	}
	
}
