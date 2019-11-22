package com.shop.service;

import java.util.List;

import com.shop.pojo.Comments;

/**
 * @ClassName: CommentService
 * @author: snypxk
 * @Description: 商品评价表（comments）的服务接口类
 * @date: 2019年8月3日
 * @Other:
 */
public interface CommentService {
	
	/**
	 * @Description: 添加评价
	 * @param comment
	 * @return
	 * @return int
	 */
	public int insertComment(Comments comment);
	

	/**
	 * @Description: 查询一个商品的评价集合[不带图片] - 根据商品的ID
	 * @param pid
	 * @return
	 * @return List<Comments>
	 */
	public List<Comments> queryCommentByPid(String pid);
	
	
	/**
	 * @Description: 查询一个商品的所评价集合[带图片或不带图片] - 根据商品的ID
	 * @param pid - 商品ID
	 * @return
	 * @return List<Comments>
	 */
	public List<Comments> queryCommentWithIMGByPid(String pid);
	
	
	
	
}
