//package com.shop.test;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.Brands;
//import com.shop.service.BrandsService;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: BrandServiceTest
// * @author: snypxk
// * @Description: Brand[商品品牌表]的服务测试类
// * @date: 2019年7月29日下午11:23:52
// * @Other:
// */
//public class BrandServiceTest {
//
//	@Autowired
//	private BrandsService brandsService;
//
//	
//	@Test
//	public void comTest() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(UUIDUtil.get16UUID());
//		}
//	}
//
//	
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//
//	@Test
//	public void testInsertBrand() {
//		Brands brands = new Brands();
//		brands.setBname("李宁");
//		brandsService.insertBrand(brands);
//	}
//
//	@Test
//	public void testDeleteBrandByBname() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteBrandByBid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryAllBrands() {
//		List<Brands> queryAllBrands = brandsService.queryAllBrands();
//		for (Brands brands : queryAllBrands) {
//			System.out.println(brands);
//		}
//	}
//
//	@Test
//	public void getBidByBrandName() {
//		System.out.println(brandsService.getBidByBrandName("ANTA"));
//	}
//	
//	@Test
//	public void queryTop3BrandsOrderByBidASC() {
//		List<Brands> list = brandsService.queryTop3BrandsOrderByBidASC();
//		for (Brands brands : list) {
//			System.out.println(brands);
//		}
//	}
//}
