package com.shop.service;

import java.util.List;

import com.shop.pojo.Brands;


/**
 * @ClassName: BrandsService
 * @author: snypxk
 * @Description: Brand[商品品牌表]的服务接口类
 * @date: 2019年7月29日下午10:54:39
 * @Other:
 */

public interface BrandsServiceBackstage {

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
}
