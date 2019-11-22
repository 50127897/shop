package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Users;
import com.shop.service.UserService;
import com.shop.utils.MailUtils;
import com.shop.utils.UUIDUtil;

/**
 * 用户登录注册功能
 * 
 * @author Garmi
 *
 */
@Controller
public class UserLoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(Users user, HttpServletRequest request) throws AddressException, MessagingException {

		if (user.getUsername() != null) {
			List<Users> list1 = userService.loginByUsername(user.getUsername(), user.getPasswd());
			if (list1 != null && list1.size() == 1) {
				//System.out.println(list1.get(0));
				request.getSession().setAttribute("user", list1.get(0));
				return "indexJSP/index";
			} else {
				request.setAttribute("msg", "登录失败");
				return "forward:tologin";
			}
		} else if (user.getEmail() != null) {
			List<Users> list2 = userService.loginByEmail(user.getEmail(), user.getPasswd());
			if (list2 != null && list2.size() == 1) {

				request.getSession().setAttribute("user", list2.get(0));
				return "indexJSP/index";
			} else {
				request.setAttribute("msg", "登录失败");
				return "forward:tologin";
			}
		}
		return null;
	}

	/**
	 * @Description: 跳转注册页面
	 * @return
	 */
	@RequestMapping("/toregister")
	public String toregister() {
		return "personalCenter/register";
	}

	/**
	 * @Description: 跳转登录页面
	 * @return
	 */
	@RequestMapping("/tologin")
	public String tologin() {
		return "personalCenter/login";
	}

	@RequestMapping("/register")
	public String register(Users users, HttpServletRequest request) throws AddressException, MessagingException {
		//System.out.println(users);
		Users users2 = new Users();
		String uuid = UUIDUtil.get16UUID();
		users2.setUserid(UUIDUtil.get16UUID());
		users2.setCode(uuid);
		users2.setUsername(users.getUsername());
		users2.setPasswd(users.getPasswd());
		users2.setEmail(users.getEmail());
		users2.setSex(users.getSex());
		users2.setState(new BigDecimal("0"));
		users2.setTelephone(users.getTelephone());
		//System.out.println(users2);
		int count = userService.insertUser(users2);
		if (count != 0) {
			MailUtils.sendMail(users.getEmail(), uuid);
			request.setAttribute("msg", "注册成功,请登录邮箱激活！");
			return "forward:tologin";
		} else {
			request.setAttribute("msg2", "注册失败");
			return "forward:toregister";
		}

	}

	/**
	 * @Description: 注销登录
	 * @param request
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "indexJSP/index";
	}

	/**
	 * @Description: 邮箱激活账户
	 * @param uuid
	 * @param request
	 * @return
	 */
	@RequestMapping("/active")
	public String active(String uuid, HttpServletRequest request) {
		List<Users> list = userService.queryUserByUuid(uuid);
//		System.out.println("激活中");
		if (list != null && list.size() == 1) {
			Users users = list.get(0);
			int value = users.getState().intValue();
			System.out.println(users.getState());
			System.out.println(new BigDecimal(0));
			if (value==0) {
				//激活
				System.out.println("去激活");
				users.setCode("");
				users.setState(new BigDecimal("1"));
				userService.updateUsersByUserid(users);
				request.setAttribute("msg", "激活成功，请登录");
				return "forward:tologin";
			}else {
				System.out.println("去改密码");
				//找回密码
				return "forward:toNewPassword";
			}
			
			
		} else {
			request.setAttribute("msg", "激活失败，请重新注册或联系管理员");
			return "forward:tologin";
		}
	}
	
	@RequestMapping("/toNewPassword")
	public String toNewPassword(String uuid,HttpServletRequest request) {
		List<Users> list = userService.queryUserByUuid(uuid);
//		System.out.println(uuid+list);
		request.setAttribute("user", list.get(0));
//		System.out.println("跳转更改密码界面");
		return "UserJSP/toNewPassword";
	}
	
	@RequestMapping("/newPassword")
	public String newPassword(String uuid,HttpServletRequest request,String passwd) {
		List<Users> list = userService.queryUserByUuid(uuid);
		System.out.println("更改密码");
		if(list!=null&&list.size()==1) {
			Users users = list.get(0);
			users.setCode("");
			users.setPasswd(passwd);
			int count = userService.updateUserByUserid(users);
			if(count!=0){
				request.setAttribute("msg", "密码已重置，请登录");
				return "UserJSP/login";
			}
		}
		
		request.setAttribute("msg2", "找回密码失败，请重试");
		return "UserJSP/toNewPassword";
	}

}
