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
//import com.shop.pojo.ImageProduct;
//import com.shop.service.ImageProductService;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: ImageProductServiceTest
// * @author: snypxk
// * @Description: 商品图片路径表（image_product）的服务测试类
// * @date: 2019年8月4日
// * @Other:
// */
//public class ImageProductServiceTest {
//
//	@Autowired
//	private ImageProductService imageProductService;
//
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(UUIDUtil.get16UUID());
//		}
//	}
//
//	@Test
//	public void testGetProductImageByPid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertProductImage() {
//		// 假设对商品ID为1a5f5d3238534629的进行图片插入
//		String pid = "1a5f5d3238534629";
//		// 假设商品的图片路径集合如下
//		String ipRouteList[] = { "a04767bef6c344f1.jpg", "9b62525275e743c5.jpg", "9d8be758b4044ef3.jpg",
//				"bdd2f88ee0634e84.jpg", "53b5ede07b0f421e.jpg" };
//		ImageProduct imageProduct = new ImageProduct();
//		imageProduct.setPid(pid);
//		for (String ipRoute : ipRouteList) {
//			imageProduct.setIpRoute(ipRoute);
//			imageProductService.insertProductImage(imageProduct);
//		}
//		System.out.println("插入成功.....");
//	}
//
//	@Test
//	public void testDeleteProductImageByPid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateProductImageByPid() {
//		fail("Not yet implemented");
//	}
//
//}
