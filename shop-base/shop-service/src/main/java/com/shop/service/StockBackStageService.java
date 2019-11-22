package com.shop.service;

import java.math.BigDecimal;
import java.util.List;

import com.shop.pojo.Product;
import com.shop.pojo.ProductSpec;

public interface StockBackStageService {

	List<ProductSpec> selectAllProductSpec();

	ProductSpec selelctStockByPsId(BigDecimal psId);

	int updateProductSpecByPsId(ProductSpec productSpec);

	int deleteProductSpecByPsId(BigDecimal psId);

	List<ProductSpec> selelctStockByPid(List<Product> list);

	int insertStock(ProductSpec productSpec);
	
	List<ProductSpec> getStockByPid(String pid);
}
