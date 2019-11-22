package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ImageCommentMapper;
import com.shop.pojo.ImageComment;
import com.shop.pojo.ImageCommentExample;
import com.shop.pojo.ImageCommentExample.Criteria;
import com.shop.service.ImageCommentService;

/**
 * @ClassName: ImageCommentServiceImpl
 * @author: snypxk
 * @Description: 评价图片路径表（image_comment）的服务接口实现类
 * @date: 2019年8月3日
 * @Other:
 */
@Service
public class ImageCommentServiceImpl implements ImageCommentService {

	@Autowired
	private ImageCommentMapper imageCommentMapper;

	@Override
	public int insertImageComment(ImageComment imageComment) {
		return imageCommentMapper.insertSelective(imageComment);
	}

	@Override
	public List<ImageComment> queryAllImageCommentByCid(String cid) {
		ImageCommentExample example = new ImageCommentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		List<ImageComment> list = imageCommentMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	@Override
	public int deleteAllImageCommentByCid(String cid) {
		ImageCommentExample example = new ImageCommentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		return imageCommentMapper.deleteByExample(example);
	}

}
