package com.shop.service;

import java.util.List;

import com.shop.pojo.Employee;

public interface EmployeeBackstageService {

	List<Employee> findEmplyeeByExample(String username,String passwd);

	int  updateEmployee(Employee Employee);

	int insertSelective(Employee employee);

	Employee findEmplyeeByEid(String eid);

	int deleteManagerByPrimaryKey(String eid);

	List<Employee> findLikeManagerByExample(String name);
}
