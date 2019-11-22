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
//import com.shop.pojo.Categorys;
//import com.shop.service.CategoryService;
//import com.shop.utils.UUIDUtil;
//
///**
// * @ClassName: CategoryServiceTest
// * @author: snypxk
// * @Description: 商品分类表（category）的服务测试类
// * @date: 2019年8月2日
// * @Other:  三种:  man   woman  kid
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
//public class CategoryServiceTest {
//
//	@Autowired
//	private CategoryService categoryService;
//	
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//	
//	@Test
//	public void testInsertCategory() {
//		Categorys categorys =new Categorys();
//		categorys.setCid(UUIDUtil.get16UUID());
//		categorys.setCname("kid");
//		categoryService.insertCategory(categorys);
//	}
//
//	@Test
//	public void testGetCidByCnameCategorys() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetCidByCnameString() {
//		System.out.println(categoryService.getCidByCname("man"));
//	}
//
//	@Test
//	public void testGetCnameByCidCategorys() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetCnameByCidString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryAllCategorys() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteCategorysByCname() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteCategorysByCid() {
//		fail("Not yet implemented");
//	}
//
//}
