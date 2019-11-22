//package com.shop.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.Cart;
//import com.shop.pojo.Cartitem;
//import com.shop.service.CartService;
//
///**
// * @ClassName: CartServiceTest
// * @author: snypxk
// * @Description: TODO
// * @date: 2019年8月9日
// * @Other:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
//public class CartServiceTest {
//
//	@Autowired
//	private CartService cartService;
//	
//	@Test
//	public void testGetCartidByUserid() {
//		String userid= "6381e6e3c8304272"; //张三
//		String cartid = cartService.getCartidByUserid(userid);
//		System.out.println(cartid);
//	}
//
//	@Test
//	public void testCreateCartByUserid() {
//		//张三,最终创建得到的cartid="ec0374b47da442a5"
//		String userid= "6381e6e3c8304272"; 
//		//不用设置cartid,服务自动生成,只需要传递一个userid即可
//		cartService.createCartByUserid(userid);
//	}
//
//	@Test
//	public void testGetAllCartProductByUserid() {
//		String userid= "6381e6e3c8304272"; 
//		Cart cart = cartService.getAllCartProductByUserid(userid);
//		for (Cartitem cartitem : cart.getCartitemList()) {
//			System.out.println(cartitem);
//		}
//	}
//}
