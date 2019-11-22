package com.shop.service;

import java.math.BigDecimal;
import java.util.List;

import com.shop.pojo.Collections;

/**
 * @ClassName: CollectionService
 * @author: snypxk
 * @Description: 个人商品收藏表（collections）的服务接口类
 * @date: 2019年8月8日
 * @Other:
 */
public interface CollectionService {

	/**
	 * @Description: 根据用户userid 获取用户 收藏的商品 pid 集合
	 * @param userid
	 * @return
	 * @return List<String>
	 */
	public List<String> getProductPidListByUserid(String userid);
	
	
	/**
	 * @Description: 插入 -  收藏的商品 
	 * @param collection
	 * @return
	 * @return int
	 */
	public int insertCollection(Collections collection);
	
	/**
	 * @Description: 删除收藏的商品   - 根据收藏ID
	 * @param collectid
	 * @return
	 * @return int
	 */
	public int deleteCollectionByCollectid(BigDecimal collectid);
	
	
	/**
	 * @Description: 删除收藏的商品 -  根据pid和userid
	 * @param pid
	 * @param userid
	 * @return
	 * @return int
	 */
	public int deleteCollectionByPidAndUserid(String pid,String userid);
	
	
	//家
	/**@Description: 根据用户userid 获取用户 收藏的商品Collectid  集合
	 * @param userid
	 * @return
	 */
	public List<String> getCollectidByUserid(String userid);
	
}
