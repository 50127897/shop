package com.shop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.mapper.ProductMapper;
import com.shop.pojo.Product;
import com.shop.service.ProductBackstageService;

@Service
public class ProductBackstageServiceImpl implements ProductBackstageService {

	private ProductMapper productMapper;

	@Override
	public List<Product> selectAllProduct() {
		return productMapper.selectAllPoductWithImage();
	}
	
	
}
