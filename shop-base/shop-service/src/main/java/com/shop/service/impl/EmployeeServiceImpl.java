package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.EmployeeMapper;
import com.shop.pojo.Employee;
import com.shop.pojo.EmployeeExample;
import com.shop.pojo.EmployeeExample.Criteria;
import com.shop.service.EmployeeService;

/**
 * @ClassName: EmployeeServiceImpl
 * @author: snypxk
 * @Description: Employee[职员表]的服务接口实现类
 * @date: 2019年7月30日下午11:47:37
 * @Other:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public void insertEmployee(Employee employee) {
		employeeMapper.insertSelective(employee);
	}

	@Override
	public List<Employee> queryAllEmployee() {
		return employeeMapper.selectByExample(null);
	}

	@Override
	public Employee queryEmployeeByEname(Employee employee) {
		EmployeeExample example= new EmployeeExample();
		Criteria criteria =example.createCriteria();
		criteria.andEnameEqualTo(employee.getEname());
		List<Employee> employeesList = employeeMapper.selectByExample(example);
		if (employeesList!=null && employeesList.size()>0) {
			return employeesList.get(0);
		}
		return null;
	}


}
