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
//import com.shop.pojo.Logistics;
//import com.shop.service.LogisticsService;
//
///**
// * @ClassName: LogisticsServiceTest
// * @author: snypxk
// * @Description: TODO
// * @date: 2019年8月11日
// * @Other:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
//public class LogisticsServiceTest {
//
//	@Autowired
//	private LogisticsService logisticsService;
//	
//	@Test
//	public void testQueryLogisticsByOrderidDESC() {
//		String orderid="b2593b7829a14c12";
//		List<Logistics> list = logisticsService.queryLogisticsByOrderidASC(orderid);
//		for (Logistics logistics : list) {
//			System.out.println(logistics);
//		}
//		
//	}
//
//}
