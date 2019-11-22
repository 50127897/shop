//package com.shop.test;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.TakeDelivery;
//import com.shop.pojo.Users;
//import com.shop.service.TakeDeliveryService;
//import com.shop.service.UserService;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: TakeDeliveryServiceTest
// * @author: snypxk
// * @Description: TakeDelivery[收货信息表]的测试类
// * @date: 2019年7月30日上午12:43:25
// * @Other:
// */
//public class TakeDeliveryServiceTest {
//
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private TakeDeliveryService takeDeliveryService;
//
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//	
//	
//	@Test
//	public void testInsertTakeDelivery() {
//		Users user = new Users();
//		user.setUsername("张三");
//		user = userService.queryUserByUsername(user);
//		TakeDelivery takeDelivery = new TakeDelivery();
//		takeDelivery.setTdId(UUIDUtil.get32UUID());
//		takeDelivery.setUserid(user.getUserid());
//		takeDelivery.setTdName("张三锋");
//		takeDelivery.setTdAddress("中国广东省佛山市佛山科学技术学院学生宿舍");
//		takeDelivery.setTdTelephone(user.getTelephone());
//		takeDeliveryService.insertTakeDelivery(takeDelivery);
//	}
//
//	@Test
//	public void testDeleteTakeDeliveryByUserName() {
//
//	}
//
//	@Test
//	public void testQueryAllTakeDeliveryByUserName() {
//		Users user = new Users();
//		user.setUsername("张三");
//		user = userService.queryUserByUsername(user);
//		List<TakeDelivery> takeDeliveryList = takeDeliveryService.queryAllTakeDeliveryByUserid(user);
//		for (TakeDelivery takeDelivery : takeDeliveryList) {
//			System.out.println(takeDelivery);
//		}
//	}
//
//}
