package com.shop.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Repository;

import com.shop.pojo.OrderProperty;
import com.shop.pojo.Orderss;
import com.shop.pojo.Users;

/**
 * @ClassName: UserService
 * @author: snypxk
 * @Description: User的服务接口类
 * @date: 2019年7月29日下午7:28:00
 * @Other:
 */
@Repository
public interface UserService {

	/**
	 * @Description: 添加一个用户
	 * @param user
	 * @return void
	 */
	public int insertUser(Users user);

	
	/**
	 * @Description: 查询所有用户
	 * @return
	 * @return List<Users>
	 */
	public List<Users> queryAllUser();

	/**
	 * @Description: 查询用户 - 根据用户名
	 * @param users
	 * @return
	 * @return Users
	 */
	public Users queryUserByUsername(Users user);
	
	/**
	 * @Description: 查询用户 - 根据用户ID
	 * @param user
	 * @return
	 * @return Users
	 */
	public Users queryUserByUserid(Users user);
	
	/**
	 * @Description: 更新用户 - 根据用户ID
	 * @param user
	 * @return
	 * @return int
	 */
	public int updateUserByUserid(Users user);
	
	/**
	 * @Description: 更新用户 - 根据用户名
	 * @param users
	 * @return
	 * @return Users
	 */
	public int updateUserByUsername(Users user);
	
	/**
	 * @Description: 删除用户 - 根据用户ID
	 * @param user
	 * @return
	 * @return int
	 */
	public int deleteUserByUserid(Users user);
	
	
    /**
     * @Description: 更新用户信息 - 根据邮箱
     * @param user
     * @return
     * @return INT
     */
    public int updateUserByEmail(Users user);
    
    
	/**
	 * @Description:使用用户名登录
	 * @param username
	 * @param passwd
	 * @return
	 */
    public List<Users> loginByUsername(String username,String passwd);

	
	/**
	 * @Description:使用邮箱登录
	 * @param email
	 * @param passwd
	 * @return
	 */
    public List<Users> loginByEmail(String email,String passwd);

	
    public List<Users> queryUserByUuid(String uuid);

	public int  updateUsersByUserid(Users user);
    
    public int lockUserByExample(String username, String email) throws AddressException, MessagingException;
	
	
	/**
	 * @Description: 根据userid查找用户
	 * @return
	 */
    public List<Users> findUserByUserid(String userid);
	
	
	/**
	 * @Description: 根据邮箱查找用户
	 * @param email
	 * @return
	 */
    public List<Users> findUserByEmail(String email);
    
    
    /**
	 * @Description: 根据用户ID 获得一个用户的所有订单信息 - 返回一个订单列表
	 * @param userid
	 * @return
	 * @return List<Orderss>
	 */
    public List<Orderss> getOrdersByUserid(String userid);
    
    /**
     * @Description: 根据用户ID 与 订单ID 返回对应订单项的商品详细信息
     * @param orderProperty
     * @return
     * @return List<Orderss>
     */
    public List<Orderss> getOrderitemProductByUseridAndOrderid(OrderProperty orderProperty);


	public Users queryUserByEmail(Users user);
	

}
