
package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.service.EmployeeService;
import com.shop.service.MessagesServcie;
import com.shop.service.UserService;

/**
 * @ClassName: MessagesController
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年7月30日下午11:54:33
 * @Other:
 */
@Controller
@RequestMapping(value = "/Messages")
public class MessagesController {

	@Autowired
	private MessagesServcie messagesServcie;

	@Autowired
	private UserService userService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/messagesError")
	public String TransferToMessagesError() {
		return "messagesJSP/messagesError";
	}
	
	@RequestMapping(value = "/chat")
	public String TransferToChat() {
		return "messagesJSP/chat";
	}
	
	@RequestMapping(value = "/notFound")
	public String test() {
		return "messagesJSP/notFound";
	}
	
	@RequestMapping(value = "/employeeLogin")
	public String TransferToEmployeeLogin() {
		return "messagesJSP/employeeLogin";
	}
	
	@RequestMapping("login")
	public String employeeLogin() {
		return "messagesJSP/employeeLogin";
	}
}