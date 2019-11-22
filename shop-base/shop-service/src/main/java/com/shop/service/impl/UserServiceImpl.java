package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.OrderssMapper;
import com.shop.mapper.UsersMapper;
import com.shop.pojo.OrderProperty;
import com.shop.pojo.Orderss;
import com.shop.pojo.Users;
import com.shop.pojo.UsersExample;
import com.shop.pojo.UsersExample.Criteria;
import com.shop.service.UserService;
import com.shop.utils.MailUtils;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: UserServiceImpl
 * @author: snypxk
 * @Description: User的服务接口实现类
 * @date: 2019年7月29日下午11:03:09
 * @Other:
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private OrderssMapper orderssMapper;

	@Override
	public List<Users> queryAllUser() {
		return usersMapper.selectByExample(null);
	}

	@Override
	public int insertUser(Users user) {
		return usersMapper.insertSelective(user);
	}

	@Override
	public Users queryUserByUsername(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		List<Users> usersList = usersMapper.selectByExample(example);
		if (usersList != null && usersList.size() > 0) {
			return usersList.get(0);
		}
		return null;
	}

	@Override
	public int updateUserByUserid(Users user) {
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public Users queryUserByUserid(Users user) {
		return usersMapper.selectByPrimaryKey(user.getUserid());
	}

	@Override
	public int updateUserByUsername(Users user) {
		return usersMapper.updateUserByUsernameSelective(user);
	}

	@Override
	public int deleteUserByUserid(Users user) {
		return usersMapper.deleteByPrimaryKey(user.getUserid());
	}

	@Override
	public int updateUserByEmail(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getEmail());
		List<Users> list = usersMapper.selectByExample(example);
		Users user2 = new Users();
		user2 = list.get(0);
		user.setUserid(user2.getUserid());
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<Users> loginByUsername(String username, String passwd) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswdEqualTo(passwd);
		List<Users> list1 = usersMapper.selectByExample(example);
		return list1;
	}

	@Override
	public List<Users> loginByEmail(String email, String passwd) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		criteria.andPasswdEqualTo(passwd);
		List<Users> list2 = usersMapper.selectByExample(example);
		return list2;
	}

	@Override
	public List<Users> queryUserByUuid(String uuid) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andCodeEqualTo(uuid);
		return usersMapper.selectByExample(example);
	}

	@Override
	public int lockUserByExample(String username, String email) throws AddressException, MessagingException {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		if (username != null && username != "") {
			criteria.andUsernameEqualTo(username);
		}
		if (email != null && email != "") {
			criteria.andEmailEqualTo(email);
		}
		List<Users> list = usersMapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			Users users = list.get(0);
			users.setState(new BigDecimal("0"));
			String uuid = UUIDUtil.get16UUID();
			users.setCode(uuid);
			int count = usersMapper.updateByPrimaryKey(users);
			if (count != 0) {
				MailUtils.sendMail(users.getEmail(), uuid);
			}
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public List<Users> findUserByUserid(String userid) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		return usersMapper.selectByExample(example);
	}

	@Override
	public List<Users> findUserByEmail(String email) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		return usersMapper.selectByExample(example);
	}

	@Override
	public int updateUsersByUserid(Users user) {
		return usersMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<Orderss> getOrdersByUserid(String userid) {
		List<Orderss> list = orderssMapper.getOrderOrderitemProduct(userid);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Orderss> getOrderitemProductByUseridAndOrderid(OrderProperty orderProperty) {
		List<Orderss> list = orderssMapper.getOrderitemProductByUseridAndOrderid(orderProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public Users queryUserByEmail(Users user) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(user.getEmail());
		List<Users> selectByExample = usersMapper.selectByExample(example);
		return selectByExample.get(0);
	}

	
}
