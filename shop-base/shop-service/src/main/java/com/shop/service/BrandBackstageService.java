package com.shop.service;

import java.util.List;

import com.shop.pojo.Brands;

public interface BrandBackstageService {

	List<Brands> queryAllBrands();

	Brands selectBigestBidOfBrand();

	int insertBrands(Brands brands);

	Brands selectByBid(String bid);

	int updateBrands(Brands brands);

	int deleteBrandByBid(String bid);

	List<Brands> selectBrandLikeBname(String bname);


}
