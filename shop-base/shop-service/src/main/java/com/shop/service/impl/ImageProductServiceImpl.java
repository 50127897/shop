package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ImageProductMapper;
import com.shop.pojo.ImageProduct;
import com.shop.pojo.ImageProductExample;
import com.shop.pojo.ImageProductExample.Criteria;
import com.shop.service.ImageProductService;

/**
 * @ClassName: ImageProductServiceImpl
 * @author: snypxk
 * @Description: 商品图片路径表（image_product）的服务接口实现类
 * @date: 2019年8月2日
 * @Other:
 */
@Service
public class ImageProductServiceImpl implements ImageProductService {

	@Autowired
	private ImageProductMapper imageProductMapper;

	@Override
	public List<ImageProduct> getProductImageByPid(String pid) {
		ImageProductExample example = new ImageProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		List<ImageProduct> list = imageProductMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	@Override
	public int insertProductImage(ImageProduct imageProduct) {
		return imageProductMapper.insertSelective(imageProduct);
	}

	@Override
	public int deleteProductImageByPid(String pid) {
		ImageProductExample example = new ImageProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		return imageProductMapper.deleteByExample(example);
	}

	@Override
	public int updateProductImageByPid(String pid, ImageProduct imageProduct) {
		ImageProductExample example = new ImageProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		return imageProductMapper.updateByExampleSelective(imageProduct, example);
	}

	
	//============================ 安  ============================
	@Override
	public ImageProduct selectBigestIpIdOfImageProduct() {
		ImageProductExample example = new ImageProductExample();
		example.setOrderByClause("IP_ID desc");
		List<ImageProduct> list = imageProductMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public ImageProduct getProductImageByIpId(String ipId) {
		return imageProductMapper.selectByPrimaryKey(new BigDecimal(ipId));
	}

	@Override
	public int updateProductImageByIpId(ImageProduct imageProduct) {
		return imageProductMapper.updateByPrimaryKeySelective(imageProduct);
	}
	
	//============================ 安END  ============================
}
