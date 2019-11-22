//package com.shop.test;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.Employee;
//import com.shop.service.EmployeeService;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: EmployeeServiceTest
// * @author: snypxk
// * @Description: Employee[职员表]的服务测试类
// * @date: 2019年7月30日上午10:23:51
// * @Other:
// */
//public class EmployeeServiceTest {
//
//	@Autowired
//	private EmployeeService employeeService;
//	
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//
//	@Test
//	public void testInsertEmployee() {
//		Employee employee = new Employee();
//		employee.setEid(UUIDUtil.get32UUID());
//		employee.setEhiretime(new Date());
//		employee.setEmail("ed42de3@163.com");
//		employee.setEname("赵客服");
//		employee.setEpassword("653999");
//		employee.setEtelephone("14555485333");
//		employee.setEstate(new BigDecimal(3));
//		employeeService.insertEmployee(employee);
//	}
//
//	@Test
//	public void testQueryAllEmployee() {
//		List<Employee> queryAllEmployee = employeeService.queryAllEmployee();
//		for (Employee employee : queryAllEmployee) {
//			System.out.println(employee);
//		}
//	}
//
//	@Test
//	public void testQueryEmployeeByEname() {
//		Employee employee = new Employee();
//		employee.setEname("王客服");
//		Employee employee2 = employeeService.queryEmployeeByEname(employee);
//		System.out.println(employee2);
//	}
//
//}
