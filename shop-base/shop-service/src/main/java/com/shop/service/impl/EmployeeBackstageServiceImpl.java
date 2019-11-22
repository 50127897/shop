package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.EmployeeMapper;
import com.shop.pojo.Employee;
import com.shop.pojo.EmployeeExample;
import com.shop.pojo.EmployeeExample.Criteria;
import com.shop.service.EmployeeBackstageService;

/**
 * @ClassName:EmployeeBackstageServiceImpl
 * @author: 炸鸡
 * @Description:
 * @date :2019年7月31日
 * @
 * @other:后台管理员服务层实现类
 */
@Service
public class EmployeeBackstageServiceImpl implements EmployeeBackstageService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	
	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过用户名密码查询管理员信息
	 * @date :2019年7月31日
	 * @other:
	 */
	@Override
	public List<Employee> findEmplyeeByExample(String username, String passwd) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		if(username!=null&&!username.equals("")){
			criteria.andEnameEqualTo(username);
			if(passwd!=null&&!passwd.equals("")){
				criteria.andEpasswordEqualTo(passwd);
				return employeeMapper.selectByExample(example);
			}
		}
			return employeeMapper.selectByExample(null);
		
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过主键修改管理员信息
	 * @date :2019年7月31日
	 * @other:
	 */
	@Override
	public int updateEmployee(Employee Employee) {
		
		return employeeMapper.updateByPrimaryKey(Employee);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:插入管理员数据
	 * @date :2019年7月31日
	 * @other:
	 */
	@Override
	public int insertSelective(Employee employee) {
		return employeeMapper.insertSelective(employee);
		
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过主键查询管理员信息
	 * @date :2019年8月1日
	 * @other:
	 */
	@Override
	public Employee findEmplyeeByEid(String eid) {
		return employeeMapper.selectByPrimaryKey(eid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:通过eid删除管理员信息
	 * @date :2019年8月1日
	 * @other:
	 */
	@Override
	public int deleteManagerByPrimaryKey(String eid) {
		return employeeMapper.deleteByPrimaryKey(eid);
	}

	/**
	 * @ClassName:
	 * @author: 炸鸡
	 * @Description:根据用户名进行模糊查询
	 * @date :2019年8月1日
	 * @other:
	 */
	@Override
	public List<Employee> findLikeManagerByExample(String name) {
		if(name!=null&&name!=""){
			EmployeeExample example = new EmployeeExample();
			Criteria criteria = example.createCriteria();
			criteria.andEnameLike("%"+name+"%");
			return employeeMapper.selectByExample(example);
		}else {
			return employeeMapper.selectByExample(null);
		}
		
	}
	
	
	

}
