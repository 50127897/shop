package com.shop.service;

import java.math.BigDecimal;
import java.util.List;

import com.shop.pojo.Brands;


/**
 * @ClassName: BrandsService
 * @author: snypxk
 * @Description: Brand[商品品牌表]的服务接口类
 * @date: 2019年7月29日下午10:54:39
 * @Other:	六份数据  - LINING		ANTA	NIKE	ADIDAS	ERKE	XTEP
 */

public interface BrandsService {

	/**
	 * @Description: 添加商品品牌
	 * @param brand
	 * @return void
	 */
	public void insertBrand(Brands brand);
	
	
	/**
	 * @Description: 删除商品品牌 - 根据商品名
	 * @param brand
	 * @return void
	 */
	public void deleteBrandByBname(Brands brand);
	
	
	/**
	 * @Description: 删除商品品牌 - 根据商品品牌id
	 * @param brand
	 * @return void
	 */
	public void deleteBrandByBid(Brands brand);
	
	
	/**
	 * @Description: 查询所有商品品牌
	 * @return
	 * @return List<Brand>
	 */
	public List<Brands> queryAllBrands();
	
	
	/**
	 * @Description: 查询商品品牌 - 根据品牌ID
	 * @param brands
	 * @return
	 * @return Brands
	 */
	public Brands queryBrandsByBid(Brands brands);
	
	
	/**
	 * @Description: 更新商品品牌 - 根据品牌ID
	 * @param brands
	 * @return
	 * @return int
	 */
	public int updateBrandsByBid(Brands brands);
	
	
	/**
	 * @Description: 获取品牌ID - 根据品牌名
	 * @param brands
	 * @return
	 * @return String
	 */
	public BigDecimal getBidByBrandName(Brands brands);
	
	
	/**
	 * @Description: 获取品牌ID - 根据品牌名
	 * @param brands
	 * @return
	 * @return String
	 */
	public BigDecimal getBidByBrandName(String bname);
	
	
	/**
	 * @Description: 根据BID排序升序 - 查询前3项记录 2019-8-3
	 * @return
	 * @return List<Brands>
	 */
	public List<Brands> queryTop3BrandsOrderByBidASC();
	
}
