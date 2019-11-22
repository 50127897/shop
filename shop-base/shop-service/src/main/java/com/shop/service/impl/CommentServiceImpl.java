package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.CommentsMapper;
import com.shop.pojo.Comments;
import com.shop.pojo.CommentsExample;
import com.shop.pojo.CommentsExample.Criteria;
import com.shop.service.CommentService;

/**
 * @ClassName: CommentServiceImpl
 * @author: snypxk
 * @Description: 商品评价表（comments）的服务接口实现类
 * @date: 2019年8月3日
 * @Other:
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentsMapper commentMapper;

	@Override
	public int insertComment(Comments comment) {
		return commentMapper.insertSelective(comment);
	}

	@Override
	public List<Comments> queryCommentByPid(String pid) {
		CommentsExample example =new CommentsExample();
		Criteria criteria =example.createCriteria();
		criteria.andPidEqualTo(pid);
		List<Comments> list = commentMapper.selectByExample(example);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Comments> queryCommentWithIMGByPid(String pid) {
		List<Comments> list = commentMapper.selectCommentWithImageByPid(pid);
		return list.size() > 0 ? list : null;
	}

}
