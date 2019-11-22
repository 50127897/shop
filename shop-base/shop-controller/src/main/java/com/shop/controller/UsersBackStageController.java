package com.shop.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Users;
import com.shop.service.UsersBackStageService;

/**
 * @ClassName:UsersController
 * @author: 炸鸡
 * @Description:后台用户控制器
 * @date :2019年8月1日
 * @
 * @other:
 */
@Controller
@RequestMapping("/backstage")
public class UsersBackStageController {

	@Autowired
	private UsersBackStageService usersService;
	
	/**
	 * @param pn
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月2日
	 * @description:查询所有用户信息，使用分页插件，返回用户管理界面
	 */
	@RequestMapping("/userBackStage")
	private String userBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request){
		// 引入分页PageHelper插件
		// 在查询之前只需要调入:传入页码pn,以及每页纪录数[这里是 5]
		PageHelper.startPage(pn, 10);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Users> queryAllUser = usersService.findUsesByExample("");
		// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
		//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(queryAllUser, 10);
		request.setAttribute("pageInfo", pageInfo);
		return "backStage/user";
	}
	
	
	/**
	 * @param users
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月4日
	 * @description:进入更新用户界面，根据userid去数据库查询用户信息，存放到request中
	 */
	@RequestMapping("/updateUserPageBackStage")
	private String updateUserPageBackStage(Users users,HttpServletRequest request){
			Users user1 = usersService.getUsersByUserid(users.getUserid());
			System.out.println(user1);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String birthday = sdf.format(user1.getBirthday());
			request.setAttribute("birthday", birthday);
			request.setAttribute("user", user1);
			return "/backStage/updateUser";
	}
	
	
	/**
	 * @param users
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月4日
	 * @description:通过userid删除用户
	 */
	@RequestMapping("/deleteUserBackStage")
	private String deleteUserBackStage(Users users,HttpServletRequest request){
			int count = usersService.deleteUserByUserid(users.getUserid());
			if(count!=0){
				return "redirect:userBackStage";
			}else{
				request.setAttribute("tips4", "删除失败");
				return "/backStage/user";
			}
	}
	
	
	/**
	 * @param pn
	 * @param name
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月4日
	 * @description:用户模糊查询，使用分页
	 */
	@RequestMapping("/searchUserBackStage")
	private String searchUserBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String name,HttpServletRequest request){
		// 引入分页PageHelper插件
		// 在查询之前只需要调入:传入页码pn,以及每页纪录数[这里是 5]
		if(name==null){
			PageHelper.startPage(pn, 10);
			// startPage后面紧跟着的这个查询就是一个分页查询
			List<Users> queryAllUser = usersService.findUsesByExample("");
			for (Users users : queryAllUser) {
				System.out.println(users);
			}
			// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
			//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(queryAllUser, 10);
//			System.out.println("进入控制层");
			request.setAttribute("pageInfo", pageInfo);
	
			return "backStage/searchUser";
		}else{
			System.out.println(name);
			PageHelper.startPage(pn, 10);
			// startPage后面紧跟着的这个查询就是一个分页查询
			List<Users> list = usersService.searchUserLike(name);
			for (Users users : list) {
				System.out.println(users);
			}
			// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
			//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			request.setAttribute("pageInfo", pageInfo);
			request.setAttribute("name", name);
			return "backStage/searchUser";
		}
	}
	
	
	/**
	 * @param users
	 * @param birthdate
	 * @param request
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年8月4日
	 * @description:后台更新用户数据（根据userid）
	 */
	@RequestMapping("/updateUserBackStage")
	private String updateUserBackStage(Users users,String birthdate,HttpServletRequest request) throws ParseException{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(birthdate);
			users.setBirthday(date);
			int count = usersService.updateUsersByUserid(users);
//			System.out.println("修改成功");
			if(count!=0){
				return "redirect:userBackStage";
			}else{
				request.setAttribute("tips5", "插入失败");
				request.setAttribute("user", users);
				return "/backStage/updateUser";
			}
	}
}
