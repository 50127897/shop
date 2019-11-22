package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CategorysMapper;
import com.shop.pojo.Categorys;
import com.shop.pojo.CategorysExample;
import com.shop.pojo.CategorysExample.Criteria;
import com.shop.service.CategoryService;

/**
 * @ClassName: CategoryServiceImpl
 * @author: snypxk
 * @Description: 商品分类表（category）的服务接口实现类
 * @date: 2019年8月2日
 * @Other: 三种:  man   woman  kid
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategorysMapper categorysMapper;

	@Override
	public int insertCategory(Categorys categorys) {
		return categorysMapper.insertSelective(categorys);
	}

	@Override
	public String getCidByCname(Categorys category) {
		CategorysExample example = new CategorysExample();
		Criteria criteria = example.createCriteria();
		criteria.andCnameEqualTo(category.getCname());
		List<Categorys> list = categorysMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0).getCid() : null;
	}

	@Override
	public String getCidByCname(String cname) {
		CategorysExample example = new CategorysExample();
		Criteria criteria = example.createCriteria();
		criteria.andCnameEqualTo(cname);
		List<Categorys> list = categorysMapper.selectByExample(example);
		return list.size() > 0 ? list.get(0).getCid() : null;
	}

	@Override
	public String getCnameByCid(Categorys category) {
		Categorys categorys = categorysMapper.selectByPrimaryKey(category.getCid());
		return categorys == null ? null : categorys.getCid();
	}

	@Override
	public String getCnameByCid(String cid) {
		Categorys categorys = categorysMapper.selectByPrimaryKey(cid);
		return categorys == null ? null : categorys.getCid();
	}

	@Override
	public List<Categorys> queryAllCategorys() {
		return categorysMapper.selectByExample(null);
	}

	@Override
	public int deleteCategorysByCname(String cname) {
		CategorysExample example = new CategorysExample();
		Criteria criteria = example.createCriteria();
		criteria.andCnameEqualTo(cname);
		List<Categorys> list = categorysMapper.selectByExample(example);
		if (list.size() > 0) {
			return categorysMapper.deleteByPrimaryKey(list.get(0).getCid());
		}
		return 0;
	}

	@Override
	public int deleteCategorysByCid(String cid) {
		return categorysMapper.deleteByPrimaryKey(cid);
	}

}
