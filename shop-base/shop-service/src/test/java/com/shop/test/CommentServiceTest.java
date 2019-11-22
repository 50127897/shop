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
//import com.shop.pojo.Comments;
//import com.shop.pojo.ImageComment;
//import com.shop.service.CommentService;
//import com.shop.service.ImageCommentService;
//import com.shop.utils.StringToDate;
//import com.shop.utils.UUIDUtil;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
///**
// * @ClassName: CommentServiceTest
// * @author: snypxk
// * @Description: 商品评价表（comments）的服务测试类
// * @date: 2019年8月4日
// * @Other:
// */
//public class CommentServiceTest {
//
//	@Autowired
//	private CommentService commentService;
//
//	@Autowired
//	private ImageCommentService imageCommentService;
//
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//	}
//	
//	@Test
//	public void testInsertComment() {
//		// 假设对商品ID为1a5f5d3238534629的商品进行评价
//		String pid = "1a5f5d3238534629";
//		// 假设是由用户"张三"评价的,数据库中"张三"的 UID 如下
//		String uid = "6381e6e3c8304272";
//		// 假设评价商品的路径集合如下
//		String icRouteList[] = { "40ed615e9477434a.jpg", "c2ca745a7146452d.jpg", "f962fb0a93ca404d.jpg" };
//
//		Comments comment = new Comments();
//		comment.setCid(UUIDUtil.get16UUID());
//		comment.setPid(pid);
//		comment.setUserid(uid);
//		comment.setCtime(StringToDate.convertYMDHMS("2019-5-6 15:33:54"));
//		comment.setCdetail("商品很实惠,很好~ 下次我还要买,实在是太喜欢了!");
//		commentService.insertComment(comment);
//		ImageComment imageComment = new ImageComment();
//		for (String icr : icRouteList) {
//			imageComment.setCid(comment.getCid());
//			imageComment.setIcRoute(icr);
//			imageCommentService.insertImageComment(imageComment);
//		}
//		System.out.println("插入成功.....");
//	}
//
//	@Test
//	public void testQueryCommentByPid() {
//		String pid = "1a5f5d3238534629";
//		List<Comments> list = commentService.queryCommentWithIMGByPid(pid);
//		for (Comments comments : list) {
//			System.out.println(comments);
//			System.out.println("=========以下是商品 对应此个评价的 评价图片路径========");
//			for (ImageComment icRoute : comments.getImageComments()) {
//				System.out.println(icRoute);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryCommentWithIMGByPid() {
//		fail("Not yet implemented");
//	}
//
//}
