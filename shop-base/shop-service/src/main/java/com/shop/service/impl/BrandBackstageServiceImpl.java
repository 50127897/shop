package com.shop.service.impl;




import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.BrandsMapper;
import com.shop.pojo.Brands;
import com.shop.pojo.BrandsExample;
import com.shop.pojo.BrandsExample.Criteria;
import com.shop.service.BrandBackstageService;

/**
 * @ClassName:BrandBackstageServiceImpl
 * @author: 炸鸡
 * @Description:后台品牌service层实现类
 * @date :2019年8月5日
 * @
 * @other:
 */
@Service
public class BrandBackstageServiceImpl implements BrandBackstageService {

	@Autowired
	private BrandsMapper brandsMapper;
	
	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:查询所有品牌信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public List<Brands> queryAllBrands() {
		return brandsMapper.selectByExample(null);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:查询bid最大的品牌
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public Brands selectBigestBidOfBrand() {
		BrandsExample example = new BrandsExample();
		example.setOrderByClause("BID desc");
		List<Brands> list = brandsMapper.selectByExample(example);
		return list.get(0);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:插入品牌信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int insertBrands(Brands brands) {
		return brandsMapper.insertSelective(brands);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过bid查询品牌
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public Brands selectByBid(String bid) {
		int id = Integer.parseInt(bid);
		return brandsMapper.selectByPrimaryKey(new BigDecimal(id));
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过bid更新品牌信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int updateBrands(Brands brands) {
		return brandsMapper.updateByPrimaryKeySelective(brands);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过bid删除品牌信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int deleteBrandByBid(String bid) {
		int id = Integer.parseInt(bid);
		return brandsMapper.deleteByPrimaryKey(new BigDecimal(id));
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过bname进行模糊查询
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public List<Brands> selectBrandLikeBname(String bname) {
		BrandsExample example = new BrandsExample();
		Criteria criteria = example.createCriteria();
		criteria.andBnameLike("%"+bname+"%");
		return brandsMapper.selectByExample(example);
	}
	
	

}
