package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CategorysMapper;
import com.shop.pojo.Categorys;
import com.shop.pojo.CategorysExample;
import com.shop.pojo.CategorysExample.Criteria;
import com.shop.service.CategoryBackstageService;

/**
 * @ClassName:CategoryBackstageServiceImpl
 * @author: 炸鸡
 * @Description:后台类别service层实现类
 * @date :2019年8月5日
 * @
 * @other:
 */
@Service
public class CategoryBackstageServiceImpl implements CategoryBackstageService {

	@Autowired
	private CategorysMapper categorysMapper;
	
	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:查询所有的类别信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public List<Categorys> selectAllCategry() {
		return categorysMapper.selectByExample(null);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:插入类别信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int insertCategorys(Categorys categorys) {
		return categorysMapper.insertSelective(categorys);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过cid获取类别信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public Categorys selectCategorysByCid(String cid) {
		return categorysMapper.selectByPrimaryKey(cid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过cid更新类别信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int updateCategorys(Categorys categorys) {
		return categorysMapper.updateByPrimaryKeySelective(categorys);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过cid删除类别信息
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public int deleteCategorysByCid(String cid) {
		return categorysMapper.deleteByPrimaryKey(cid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过cname进行模糊查询
	 * @date :2019年8月5日
	 * @other:
	 */
	@Override
	public List<Categorys> selectCategryLikeCame(String cname) {
		CategorysExample example = new CategorysExample();
		Criteria criteria = example.createCriteria();
		criteria.andCnameLike("%"+cname+"%");
		return categorysMapper.selectByExample(example);
	}

	
}
