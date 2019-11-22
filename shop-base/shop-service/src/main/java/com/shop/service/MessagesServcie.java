package com.shop.service;

import java.util.List;

import com.shop.pojo.Messages;

/**
 * @ClassName: MessagesServcie
 * @author: snypxk
 * @Description: 聊天记录表（messages）的服务接口类
 * @date: 2019年7月30日下午11:39:54
 * @Other:
 */
public interface MessagesServcie {

	/**
	 * @Description: 查询所有聊天信息
	 * @return
	 * @return List<Messages>
	 */
	public List<Messages> queryAllMessages();

	/**
	 * @Description: 新增聊天记录
	 * @param message
	 * @return
	 * @return int
	 */
	public int saveMessages(Messages message);

	/**
	 * @Description: 查询聊天信息
	 * @param fromUID 发送者ID
	 * @param toUID   接收者ID
	 * @return
	 * @return List<Messages>
	 */
	public List<Messages> queryMessagesEidToCustomerId(String fromUID, String toUID);

	/**
	 * @Description: 删除聊天记录
	 * @param fromUID 发送者ID
	 * @param toUID   接收者ID
	 * @return
	 * @return int
	 */
	public int deleteMessages(String fromUID, String toUID);
}
