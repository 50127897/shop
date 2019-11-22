package com.shop.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Msg;
import com.shop.pojo.Product;
import com.shop.pojo.Users;
import com.shop.service.CollectionService;
import com.shop.service.ProductService;
import com.shop.service.UserService;
import com.shop.utils.MailUtils;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: UsersController
 * @author: snypxk
 * @Description: 用户的业务逻辑控制类
 * @date: 2019年7月30日下午11:59:29
 * @Other:
 */
@Controller
@RequestMapping(value = "/User")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CollectionService collectionService;
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping(value = "/Userlogin")
	public String TransferToUserlogin() {
		return "UserJSP/login";
	}

	@RequestMapping(value = "/login")
	public String Userlogin() {
		return "UserJSP/login";
	}

	@RequestMapping(value = "/othertest")
	public String othertest() {
		return "UserJSP/othertest";
	}

	@RequestMapping(value = "checkLogin")
	public String checkLogin(Model modle, HttpSession session, Users users) {
		Users users2 = userService.queryUserByUsername(users);
		if (users2 == null || !users2.getPasswd().equals(users.getPasswd())) {
			return "UserJSP/login";
		}
		session.setAttribute("user2", users2);
		return "UserJSP/othertest";
	}

	@RequestMapping(value = "showAllUser")
	public String showAllUser(Model model) {
		List<Users> queryAllUser = userService.queryAllUser();
		model.addAttribute("queryAllUser", queryAllUser);
		return "testJSP/showAllUser";
	}

	@RequestMapping(value = "updateUserByUserid", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateUserByUserid(Model model, Users user) {
		user = userService.queryUserByUserid(user);
		model.addAttribute("user", user);
		return "testJSP/updateUser";
	}

	@RequestMapping(value = "updateUser", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateUser(Model model, Users user) {
		userService.updateUserByUserid(user);
		List<Users> queryAllUser = userService.queryAllUser();
		model.addAttribute("queryAllUser", queryAllUser);
		model.addAttribute("msg", "修改成功!!!");
		return "testJSP/showAllUser";
	}

	
	/**
	 * @Description: index-pre[没有用AJAX的分页测试首页]
	 * 				请求url: http://localhost:8080/shop-controller/User/index_pre
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/index_pre")
	public String index_pre() {
		return "testJSP/index_pre";
	}
	
	/**
	 * @Description: 查询用户数据 - 分页查询 利用插件:pageHelper
	 * @param pn - 查询的页号[查询第几页的数据], 不输入则默认为第 1 页
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/user_test_pre")
	public String getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		// 引入分页PageHelper插件
		// 在查询之前只需要调入:传入页码pn,以及每页纪录数[这里是 5]
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Users> queryAllUser = userService.queryAllUser();
		// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
		//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
		PageInfo pageInfo = new PageInfo(queryAllUser, 5);
		model.addAttribute("pageInfo", pageInfo);
		return "testJSP/userList";
	}
	
	/**
	 * @Description: index.jsp页面直接发送AJAX请求进行用户分页数据的查询;
	 * 				  服务器查出的数据,以JSON字符串的形式返回给浏览器;
	 * 				  浏览器收到js字符串, 可以使用JS对JSON进行解析,使用JS通过DOM增删进行改变页面;
	 * 				  返回JSON, 实现客户端的无关性.
	 * @param pn
	 * @return
	 * @return PageInfo
	 */
	@RequestMapping(value = "/user_test")
	@ResponseBody
	public Msg getUserWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 引入分页PageHelper插件
		// 在查询之前只需要调入:传入页码pn,以及每页纪录数[这里是 5]
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Users> queryAllUser = userService.queryAllUser();
		// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
		//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
		PageInfo pageInfo = new PageInfo(queryAllUser, 5);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	/**
	 * @Description: 用户订单
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/userOrder")
	public String userOrder() {
		return "UserJSP/userOrder";
	}
	
	
	@RequestMapping(value = "/testGetCollectionProduct")
	public String testGetCollectionProduct() {
		String userid="";
		List<String> pidList = collectionService.getProductPidListByUserid(userid);
		List<Product> productsCollection = productService.getProductListByPidList(pidList);
		return "UserJSP/userOrder";
	}
	
	
	@RequestMapping(value = "/backlogin")
	public String testbacklogin() {
		return "testJSP/login";
	}
	
	
	
	@RequestMapping(value = "/forgotPassword")
	public String forgotPassword() {
		return "UserJSP/forgotPassword";
	}
	
	@RequestMapping(value = "/findPassword")
	public String findPassword(Model model,Users user) throws AddressException, MessagingException {
		Users users = userService.queryUserByUsername(user);
		if(users==null) {
			Users users2 = userService.queryUserByEmail(user);
		}
		
		if (users==null) {
			model.addAttribute("msg2", "用户名或密码错误");
			return "testJSP/forgotPassword";
		}
		String uuid = UUIDUtil.get16UUID();
		users.setCode(uuid);
		userService.updateUserByUserid(users);
		MailUtils.sendMail(users.getEmail(), uuid);
		model.addAttribute("msg2", "请前往邮箱更改密码");
		return "UserJSP/forgotPassword";
	}
	
}
