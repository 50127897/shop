package com.shop.service;

import java.util.List;

import com.shop.pojo.Employee;

/**
 * @ClassName: EmployeeService
 * @author: snypxk
 * @Description: Employee[职员表]的服务接口类
 * @date: 2019年7月30日下午11:46:14
 * @Other:
 */
public interface EmployeeService {

	/**
	 * @Description: 添加职员
	 * @param employee
	 * @return void
	 */
	public void insertEmployee(Employee employee);
	
	/**
	 * @Description: 查询所有职员
	 * @return
	 * @return List<Employee>
	 */
	public List<Employee> queryAllEmployee();
	
	/**
	 * @Description: 查询职员 - 根据职员用户名
	 * @param employee
	 * @return
	 * @return Employee
	 */
	public Employee queryEmployeeByEname(Employee employee);
}
