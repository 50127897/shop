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
//import com.shop.pojo.ImageProduct;
//import com.shop.pojo.Orderitem;
//import com.shop.pojo.Orderss;
//import com.shop.pojo.Product;
//import com.shop.pojo.TakeDelivery;
//import com.shop.pojo.Users;
//import com.shop.service.CollectionService;
//import com.shop.service.ProductService;
//import com.shop.service.UserService;
//import com.shop.utils.GetRandomUser;
//import com.shop.utils.StringToDate;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: UserServiceTest
// * @author: snypxk
// * @Description: 用户服务的测试类
// * @date: 2019年7月29日下午11:02:10
// * @Other:
// */
//public class UserServiceTest {
//
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private CollectionService collectionService;
//	
//	@Autowired
//	private ProductService productService;
//
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//
//	@Test
//	public void testInsertUser() {
//		Users user = new Users();
//		/*
//		 * user.setUserid(UUIDUtil.get16UUID()); user.setUsername("陈三");
//		 * user.setPasswd("789def"); user.setEmail("485258052@qq.com");
//		 * user.setBirthday(StringToDate.convertYMD("1898-7-18")); user.setSex("男");
//		 * user.setState(new BigDecimal(1)); user.setCode("");
//		 * user.setTelephone("18842490"); userService.insertUser(user);
//		 */
//		
//		for (int i = 0; i < 20; i++) {
//			user = GetRandomUser.getUser();
//			System.out.println(user);
//			userService.insertUser(user);
//		}
//		
//	}
//
//	@Test
//	public void testSelectAll() {
//		List<Users> allUser = userService.queryAllUser();
//		for (Users usr : allUser) {
//			System.out.println(usr);
//		}
//	}
//
//	@Test
//	public void testUpdateUserByUserid() {
//		Users user = new Users();
//		user.setUserid("a3676fc4385343e596a0aa8b97166873");
//		user.setEmail("11111@qq.com");
//		userService.updateUserByUserid(user);
//	}
//
//	@Test
//	public void testUpdateUserByUsername() {
//		Users user = new Users();
//		//更改其useridd
//		user.setUserid(UUIDUtil.get16UUID());
//		user.setUsername("李四");
//		userService.updateUserByUsername(user);
//	}
//
//	@Test
//	public void testDeleteUserByUserid() {
//		Users user=new Users();
//		user.setUserid("521a8284f58648f291588dfa8352e0df");
//		userService.deleteUserByUserid(user);
//	}
//	
//	
//	@Test
//	public void testGetOrdersByUserid() {
//		String userid ="6381e6e3c8304272";
//		List<Orderss> orderlist = userService.getOrdersByUserid(userid);
//		for (Orderss orderss : orderlist) {
//			System.out.println(orderss);
//			System.out.println("=====收货人信息====");
//			System.out.println(orderss.getTakeDelivery());
//			System.out.println("===========子订单==========");
//			for (Orderitem orderitem : orderss.getOrderItemList()) {
//				System.out.println(orderitem);
//				System.out.println("=============子订单对应的商品============");
//				System.out.println(orderitem.getProducItem());
//				System.out.println("===============子订单对应的商品所对应的图片===============");
//				System.out.println(orderitem.getProducItem().getImageProducts());
//			}
//		}
//	}
//	
//	@Test
//	public void testGetCollectionProduct() {
//		String userid="6381e6e3c8304272";
//		List<String> pidList = collectionService.getProductPidListByUserid(userid);
//		List<Product> productsCollection = productService.getProductListByPidList(pidList);
//		for (Product product : productsCollection) {
//			System.out.println(product);
//		}
//	}
//	
//	@Test
//	public void deleteCollectionByCollectid() {
//		collectionService.deleteCollectionByCollectid(new BigDecimal(602));
//		System.out.println("success.........");
//	}
//}
