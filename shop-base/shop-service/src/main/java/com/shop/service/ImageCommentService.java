package com.shop.service;

import java.util.List;

import com.shop.pojo.ImageComment;

/**
 * @ClassName: ImageCommentService
 * @author: snypxk
 * @Description: 评价图片路径表（image_comment）的服务接口类
 * @date: 2019年8月3日
 * @Other:
 */
public interface ImageCommentService {

	
	/**
	 * @Description: 插入商品评价图片 - 在给商品添加评价的控制层一并添加商品评价图片路径
	 * @return
	 * @return int
	 */
	public int insertImageComment(ImageComment imageComment);
	
	
	/**
	 * @Description: 查询一个评价的所有图片 - 根据评价ID
	 * @param cid - 评价编号
	 * @return
	 * @return List<ImageComment>
	 */
	public List<ImageComment> queryAllImageCommentByCid(String cid);
	
	
	/**
	 * @Description: 删除一个评价的所有图片 - 根据评价ID
	 * @param cid
	 * @return
	 * @return int
	 */
	public int deleteAllImageCommentByCid(String cid);
}
