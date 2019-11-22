package com.shop.service.impl;

import java.util.Date;
import java.util.List;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.UsersMapper;
import com.shop.pojo.Users;
import com.shop.pojo.UsersExample;
import com.shop.pojo.UsersExample.Criteria;
import com.shop.service.UsersBackStageService;

/**
 * @ClassName:UsersBackStageServiceImpl
 * @author: 炸鸡
 * @Description:后台用户管理服务层实现类
 * @date :2019年8月4日
 * @
 * @other:
 */
@Service
public class UsersBackStageServiceImpl implements UsersBackStageService {

	@Autowired
	UsersMapper usersmapper;
	
	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过用户名查找用户信息，用户名为空返回所有用户信息
	 * @date :2019年8月4日
	 * @other:
	 */
	@Override
	public List<Users> findUsesByExample(String name) {
		if(name!=null&&name!=""){
			UsersExample example = new UsersExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsernameEqualTo(name);
			return usersmapper.selectByExample(example);
			
		}else{
			return usersmapper.selectByExample(null);
		}
		
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过userid查询用户信息
	 * @date :2019年8月4日
	 * @other:
	 */
	@Override
	public Users getUsersByUserid(String userid) {
		return usersmapper.selectByPrimaryKey(userid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过userid删除用户信息
	 * @date :2019年8月4日
	 * @other:
	 */
	@Override
	public int deleteUserByUserid(String userid) {
		return usersmapper.deleteByPrimaryKey(userid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:根据用户名进行模糊查询
	 * @date :2019年8月4日
	 * @other:
	 */
	@Override
	public List<Users> searchUserLike(String name) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameLike("%"+name+"%");
		return usersmapper.selectByExample(example);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过userid更新用户数据
	 * @date :2019年8月4日
	 * @other:
	 */
	@Override
	public int updateUsersByUserid(Users users) {
		return usersmapper.updateByPrimaryKey(users);
	}

	
	
	
	
	

}
