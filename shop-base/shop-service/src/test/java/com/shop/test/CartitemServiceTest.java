//package com.shop.test;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.Cartitem;
//import com.shop.service.CartService;
//import com.shop.service.CartitemService;
//import com.shop.service.ProductService;
//import com.shop.service.ProductSpecService;
//import com.shop.utils.UUIDUtil;
//
///**
// * @ClassName: CartitemServiceTest
// * @author: snypxk
// * @Description: TODO
// * @date: 2019年8月9日
// * @Other:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
//public class CartitemServiceTest {
//
//	@Autowired
//	private CartitemService cartitemService;
//	
//	@Autowired
//	private ProductSpecService productSpecService;
//
//	@Autowired
//	private CartService cartService;
//
//	@Test
//	/**
//	 * @Description: 添加购物车项 -setCartid[ 通过CartService.getCartidByUserid(userid) ]
//	 *               -setCartItemid[ UUIDUtil ] -setPsId[商品规格ID]
//	 * @param cartitem
//	 * @return
//	 * @return int
//	 */
//	public void testInsertCartItem() {
//		Cartitem cartitem = new Cartitem();
//		
//		String userid = "6381e6e3c8304272"; // 张三
//		cartitem.setCartid(cartService.getCartidByUserid(userid));
//		cartitem.setCartitemid(UUIDUtil.get16UUID());
//		
//		String psSpec="39";
//		String pid="0000574ac9244fc7";
//		cartitem.setPsId(productSpecService.getPsIdByPidAndPsSpec(pid, psSpec));
//		
//		cartitemService.insertCartItem(cartitem);
//		System.out.println("success..........");
//	}
//
//	@Test
//	public void testDeleteCartItemByCartItemid() {
//		fail("Not yet implemented");
//	}
//
//}
