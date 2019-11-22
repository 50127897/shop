package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ProductSpecMapper;
import com.shop.pojo.ProductSpec;
import com.shop.pojo.ProductSpecExample;
import com.shop.pojo.ProductSpecExample.Criteria;
import com.shop.service.ProductSpecService;

/**
 * @ClassName: ProductSpecServiceImpl
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年8月9日
 * @Other:
 */
@Service
public class ProductSpecServiceImpl implements ProductSpecService {

	@Autowired
	private ProductSpecMapper productSpecMapper;

	@Override
	public BigDecimal getPsIdByPidAndPsSpec(String pid, String psSpec) {
		ProductSpecExample example = new ProductSpecExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		criteria.andPsSpecEqualTo(psSpec);
		List<ProductSpec> list = productSpecMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0).getPsId() : null;
	}

}
