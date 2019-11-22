package com.shop.service;

import java.util.List;

import com.shop.pojo.TakeDelivery;
import com.shop.pojo.Users;

/**
 * @ClassName: TakeDeliveryService
 * @author: snypxk
 * @Description: TakeDelivery[收货信息表]的服务接口类
 * @date: 2019年7月29日下午11:56:08
 * @Other:
 */
public interface TakeDeliveryService {

	/**
	 * @Description: 添加收货信息
	 * @param takeDelivery
	 * @return void
	 */
	public int insertTakeDelivery(TakeDelivery takeDelivery);

	
	/**
	 * @Description: 删除收货信息 - 根据用户ID 和收货信息ID
	 * @param users        - userid
	 * @param takeDelivery - tdid
	 * @return void
	 */
	public int deleteTakeDeliveryByUserid(Users users, TakeDelivery takeDelivery);

	
	/**
	 * @Description: 删除收货信息 - 根据用户ID 和收货信息ID
	 * @param userid
	 * @param tdid
	 * @return void
	 */
	public int deleteTakeDeliveryByUserid(String userid, String tdid);
	
	
	/**
	 * @Description: 查询用户的所有收货信息 - 根据用户ID
	 * @param users
	 * @return
	 * @return List<TakeDelivery>
	 */
	public List<TakeDelivery> queryAllTakeDeliveryByUserid(Users users);

	
	/**
	 * @Description: 查询用户的所有收货信息 - 根据用户ID
	 * @param userid
	 * @return
	 * @return List<TakeDelivery>
	 */
	public List<TakeDelivery> queryAllTakeDeliveryByUserid(String userid);
	
	
	
	//================== 安 ======================
	public List<TakeDelivery> queryAllTakeDeliveryByUserName(Users users);

	public TakeDelivery selectTakeDeliveryByTdId(String tdId);

	public int deleteTakeDeliveryByTdId(String tdId);

	public int updateDeliveryByTdId(TakeDelivery delivery);
	//================== 安 END =====================
	
	
}
