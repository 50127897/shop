//package com.shop.test;
//
//import static org.junit.Assert.*;
//
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
//import com.shop.pojo.Messages;
//import com.shop.pojo.Users;
//import com.shop.service.EmployeeService;
//import com.shop.service.MessagesServcie;
//import com.shop.service.UserService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: MessagesServcieTest
// * @author: snypxk
// * @Description: 聊天记录表（messages）的服务测试类
// * @date: 2019年7月30日上午11:27:24
// * @Other:
// */
//public class MessagesServcieTest {
//
//	@Autowired
//	private MessagesServcie messagesServcie;
//
//	@Autowired
//	private UserService userService;
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
//	public void testQueryAllMessages() {
//		List<Messages> queryAllMessages = messagesServcie.queryAllMessages();
//		for (Messages messages : queryAllMessages) {
//			System.out.println(messages);
//		}
//	}
//
//	@Test
//	public void testSaveMessages() {
//		Users users = new Users();
//		users.setUsername("李四");
//		users=userService.queryUserByUsername(users);
//		Employee employee = new Employee();
//		employee.setEname("赵客服");
//		employee=employeeService.queryEmployeeByEname(employee);
//		Messages messages = new Messages();
//		messages.setCustomerId(users.getUserid());
//		messages.setEid(employee.getEid());
//		messages.setPid(new Date(2019, 7, 31, 15, 2, 32));
//		messages.setMcontent("我是客服: 赵客服,我发消息给用户: 李四");
//		messagesServcie.saveMessages(messages);
//	}
//
//	@Test
//	public void testQueryMessagesEidToCustomerId() {
//		Users users = new Users();
//		users.setUsername("李四");
//		users=userService.queryUserByUsername(users);
//		Employee employee = new Employee();
//		employee.setEname("赵客服");
//		employee=employeeService.queryEmployeeByEname(employee);
//		List<Messages> queryMessagesEidToCustomerId = messagesServcie.queryMessagesEidToCustomerId(employee.getEid(), users.getUserid());
//		for (Messages messages : queryMessagesEidToCustomerId) {
//			System.out.println(messages);
//		}
//	}
//
//	@Test
//	public void testDeleteMessages() {
//		fail("Not yet implemented");
//	}
//
//}
