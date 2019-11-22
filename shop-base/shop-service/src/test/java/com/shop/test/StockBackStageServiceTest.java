//package com.shop.test;
//
//import static org.junit.Assert.*;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Random;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.ProductSpec;
//import com.shop.service.ProductService;
//import com.shop.service.StockBackStageService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: StockBackStageServiceTest
// * @author: snypxk
// * @Description: TODO
// * @date: 2019年8月9日
// * @Other:
// */
//public class StockBackStageServiceTest {
//
//	Random rand = new Random();
//
//	@Autowired
//	private StockBackStageService stockBackStageService;
//
//	@Test
//	public void testSelectAllProductSpec() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelelctStockByPsId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateProductSpecByPsId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteProductSpecByPsId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelelctStockByPidListOfProduct() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertStock() {
//
//		ProductSpec productSpec = new ProductSpec();
//		String pid = "0d51c30a3c524840";
//		productSpec.setPid(pid);
//		for (int i = 27; i < 45; i++) {
//			//设置商品的规码数从 27--->44
//			productSpec.setPsSpec(String.valueOf(i));
//			//产生一个随机数:[50,1500] 作为库存
//			productSpec.setPsStore(new BigDecimal(rand.nextInt(1500) + 50));
//			stockBackStageService.insertStock(productSpec);
//		}
//		System.out.println("success.........");
//	}
//
//	@Test
//	public void testSelelctStockByPidString() {
//		String pid = "0000574ac9244fc7";
//		List<ProductSpec> list = stockBackStageService.getStockByPid(pid);
//		for (ProductSpec productSpec : list) {
//			System.out.println(productSpec);
//		}
//	}
//
//}
