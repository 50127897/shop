package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ProductSpecMapper;
import com.shop.pojo.Product;
import com.shop.pojo.ProductSpec;
import com.shop.pojo.ProductSpecExample;
import com.shop.pojo.ProductSpecExample.Criteria;
import com.shop.service.StockBackStageService;

@Service
public class StockBackStageServiceImpl implements StockBackStageService {

	@Autowired
	private ProductSpecMapper productSpecMapper;

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:查询所有商品库存
	 */
	@Override
	public List<ProductSpec> selectAllProductSpec() {
		return productSpecMapper.selectByExample(null);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:通过psid查询商品库存
	 */
	@Override
	public ProductSpec selelctStockByPsId(BigDecimal psId) {
		return productSpecMapper.selectByPrimaryKey(psId);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:通过psid更新商品库存
	 */
	@Override
	public int updateProductSpecByPsId(ProductSpec productSpec) {
		return productSpecMapper.updateByPrimaryKeySelective(productSpec);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:通过psid删除商品库存
	 */
	@Override
	public int deleteProductSpecByPsId(BigDecimal psId) {
		return productSpecMapper.deleteByPrimaryKey(psId);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:通过pid查询商品库存
	 */
	@Override
	public List<ProductSpec> selelctStockByPid(List<Product> list) {
		ProductSpecExample example = new ProductSpecExample();
		for (Product product2 : list) {
			Criteria criteria = example.createCriteria();
			criteria.andPidEqualTo(product2.getPid());
			example.or(criteria);
		}
		return productSpecMapper.selectByExample(example);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:
	 * @date :2019年8月8日
	 * @other:插入库存
	 */
	@Override
	public int insertStock(ProductSpec productSpec) {

		return productSpecMapper.insertSelective(productSpec);
	}

	@Override
	public List<ProductSpec> getStockByPid(String pid) {
		List<ProductSpec> list = productSpecMapper.getStockByPid(pid);
		return list.size() > 0 ? list : null;
	}

}
