package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.BrandsMapper;
import com.shop.pojo.Brands;
import com.shop.pojo.BrandsExample;
import com.shop.pojo.BrandsExample.Criteria;
import com.shop.service.BrandsService;

/**
 * @ClassName: BrandServiceImpl
 * @author: snypxk
 * @Description: Brand[商品品牌表]的服务接口实现类
 * @date: 2019年7月29日下午11:04:01
 * @Other:六份数据  - LINING		ANTA	NIKE	ADIDAS	ERKE	XTEP
 */
@Service
public class BrandsServiceImpl implements BrandsService {

	@Autowired
	private BrandsMapper brandsMapper;

	@Override
	public void insertBrand(Brands brand) {
		brandsMapper.insertSelective(brand);
	}

	@Override
	public void deleteBrandByBname(Brands brand) {
		BrandsExample brandsExample = new BrandsExample();
		Criteria criteria = brandsExample.createCriteria();
		criteria.andBnameEqualTo(brand.getBname());
		brandsMapper.deleteByExample(brandsExample);
	}

	@Override
	public void deleteBrandByBid(Brands brand) {
		brandsMapper.deleteByPrimaryKey(brand.getBid());
	}

	@Override
	public List<Brands> queryAllBrands() {
		return brandsMapper.selectByExample(null);
	}

	@Override
	public Brands queryBrandsByBid(Brands brands) {
		return brandsMapper.selectByPrimaryKey(brands.getBid());
	}

	@Override
	public int updateBrandsByBid(Brands brands) {
		return brandsMapper.updateByPrimaryKeySelective(brands);
	}

	@Override
	public BigDecimal getBidByBrandName(Brands brands) {
		BrandsExample brandsExample = new BrandsExample();
		Criteria criteria = brandsExample.createCriteria();
		criteria.andBnameEqualTo(brands.getBname());
		List<Brands> selectByExample = brandsMapper.selectByExample(brandsExample);
		return selectByExample.size() > 0 ? selectByExample.get(0).getBid() : null;
	}

	@Override
	public BigDecimal getBidByBrandName(String bname) {
		BrandsExample brandsExample = new BrandsExample();
		Criteria criteria = brandsExample.createCriteria();
		criteria.andBnameEqualTo(bname);
		List<Brands> selectByExample = brandsMapper.selectByExample(brandsExample);
		return selectByExample.size() > 0 ? selectByExample.get(0).getBid() : null;
	}

	@Override
	public List<Brands> queryTop3BrandsOrderByBidASC() {
		return brandsMapper.queryTop3BrandsOrderByBidASC();
	}

}
