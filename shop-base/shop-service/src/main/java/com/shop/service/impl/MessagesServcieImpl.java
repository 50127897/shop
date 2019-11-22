package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.MessagesMapper;
import com.shop.pojo.Messages;
import com.shop.pojo.MessagesExample;
import com.shop.pojo.MessagesExample.Criteria;
import com.shop.service.MessagesServcie;

/**
 * @ClassName: MessagesServcieImpl
 * @author: snypxk
 * @Description: 聊天记录表（messages）的服务接口实现类
 * @date: 2019年7月30日下午11:44:00
 * @Other:
 */
@Service
public class MessagesServcieImpl implements MessagesServcie {

	@Autowired
	private MessagesMapper messagesMapper;
	
	@Override
	public List<Messages> queryAllMessages() {
		return messagesMapper.selectByExample(null);
	}

	@Override
	public int saveMessages(Messages message) {
		return messagesMapper.insertSelective(message);
	}

	@Override
	public List<Messages> queryMessagesEidToCustomerId(String fromUID, String toUID) {
		MessagesExample example = new MessagesExample();
		Criteria criteria = example.createCriteria();
		criteria.andEidEqualTo(fromUID);
		criteria.andCustomerIdEqualTo(toUID);
		return messagesMapper.selectByExample(example);
	}

	@Override
	public int deleteMessages(String fromUID, String toUID) {
		MessagesExample example = new MessagesExample();
		Criteria criteria = example.createCriteria();
		criteria.andEidEqualTo(fromUID);
		criteria.andCustomerIdEqualTo(toUID);
		return messagesMapper.deleteByExample(example);
	}

}
