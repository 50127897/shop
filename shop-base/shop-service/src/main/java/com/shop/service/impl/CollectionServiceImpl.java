package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CollectionsMapper;
import com.shop.pojo.Collections;
import com.shop.pojo.CollectionsExample;
import com.shop.pojo.CollectionsExample.Criteria;
import com.shop.service.CollectionService;

/**
 * @ClassName: CollectionServiceImpl
 * @author: snypxk
 * @Description: 个人商品收藏表（collections）的服务接口实现类
 * @date: 2019年8月8日
 * @Other:
 */

@Service
public class CollectionServiceImpl implements CollectionService {

	@Autowired
	private CollectionsMapper collectionsMapper;

	@Override
	public List<String> getProductPidListByUserid(String userid) {
		List<String> list = collectionsMapper.getProductPidListByUserid(userid);
		return list.size() > 0 ? list : null;
	}

	@Override
	public int insertCollection(Collections collection) {
		return collectionsMapper.insertSelective(collection);
	}

	@Override
	public int deleteCollectionByCollectid(BigDecimal collectid) {
		return collectionsMapper.deleteByPrimaryKey(collectid);
	}
	
	//家
	@Override
	public List<String> getCollectidByUserid(String userid) {
		List<String> list = collectionsMapper.getCollectidListByUserid(userid);
		return list.size() > 0 ? list : null;
		
	}

	@Override
	public int deleteCollectionByPidAndUserid(String pid, String userid) {
		CollectionsExample example=new CollectionsExample();
		Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(pid);
		criteria.andUseridEqualTo(userid);
		List<Collections> list = collectionsMapper.selectByExample(example);
		if (list.size()==0) {
			return 0;
		}
		BigDecimal collectId = list.get(0).getCollectId();
		return collectionsMapper.deleteByPrimaryKey(collectId);
	}

}
