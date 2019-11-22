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
import com.shop.pojo.Employee;
import com.shop.service.EmployeeBackstageService;
import com.shop.utils.UUIDUtil;


/**
 * @ClassName:EmployeeController
 * @author: 炸鸡
 * @Description:后台管理员控制器
 * @date :2019年7月30日
 * @
 * @other:
 */
@Controller
@RequestMapping("/backstage")
public class EmployeeBackStageController {
	
	@Autowired
	private EmployeeBackstageService employeeService;
	
	
	/**
	 * @param username
	 * @param passwd
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月30日
	 * @description:登陆功能，获取登陆界面的账户名和密码，往数据库查找账户信息，找到数据则跳转主页，找不到则返回错误信息
	 */
	@RequestMapping("/login")
	public String login(String ename,String epassword,HttpServletRequest request){
		
		if(ename==null||epassword==null||epassword==""||epassword==""){
			request.setAttribute("msg", "请不要留空");
			return "forward:toLogin";
		}
		List<Employee> list = employeeService.findEmplyeeByExample(ename, epassword);
		//System.out.println(ename+ epassword);
		//System.out.println(list);
		if(list!=null&&list.size()==1){
			Employee employee3 = list.get(0);
			//System.out.println(employee3);
			request.getSession().setAttribute("employee", employee3);
			return "redirect:toIndex";
		}
		else {
			request.setAttribute("msg", "用户名或密码错误");
			return "forward:toLogin";
		}
	}
	
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月12日
	 * @description:进入登陆界面
	 */
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest request){
		return "backStage/filter";
	}
	
	
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月12日
	 * @description:进入登陆界面
	 */
	@RequestMapping("/interceptor")
	public String interceptor(HttpServletRequest request){
		return "backStage/interceptor";
	}
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月12日
	 * @description:跳转后台首页
	 */
	@RequestMapping("/toIndex")
	public String toIndex(HttpServletRequest request){
		return "backStage/index";
	}
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:退出功能，清除session中的信息，给出退出信息，跳转登陆界面
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().invalidate();
		request.getSession().setAttribute("msg", "您已退出，请重新登陆");
		return "forward:toLogin";
	}
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:跳转个人中心
	 */
	@RequestMapping("/personalBackSatge")
	private String personalBackSatge(HttpServletRequest request){
		return "backStage/personal";
	}
	
	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:跳转修改个人信息
	 */
	@RequestMapping("/updatePersonalPage")
	private String updatePersonalPage(){
		return "backStage/updatePersonal";
	}
	
	/**
	 * @param newEmployee
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:更新个人信息
	 */
	@RequestMapping("/updatePersonal")
	private String updatePersonal(Employee newEmployee,HttpServletRequest request){
		Employee oldEmployee = (Employee) request.getSession().getAttribute("employee");
		oldEmployee.setEname(newEmployee.getEname());
		oldEmployee.setEpassword(newEmployee.getEpassword());
		oldEmployee.setEmail(newEmployee.getEmail());
		oldEmployee.setEtelephone(newEmployee.getEtelephone());
		int count = employeeService.updateEmployee(oldEmployee);
		if(count!=0){
			return "redirect:personalBackSatge";
		}else {
			request.setAttribute("tips", "操作失败");
			return "backStage/updatePersonal";
		}
		
	}
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:查询所有管理员信息，使用分页插件，返回管理员管理界面
	 */
	@RequestMapping("/managerBackStage")
	private String managerBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request){
		String test = "";
		PageHelper.startPage(pn, 10);
		List<Employee> list = employeeService.findEmplyeeByExample(test, test);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		request.setAttribute("pageInfo", pageInfo);
		return "backStage/manager";
	}
	
	
	/**
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:返回添加管理员界面
	 */
	@RequestMapping("/addManagerPageBackStage")
	private String addManagerPageBackStage(HttpServletRequest request){
		return "backStage/addManager";
	}
	
	
	/**
	 * @param employee
	 * @param hiretime
	 * @param request
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:将日期转化为date类型，添加用户信息，若用户已存在，返回错误信息
	 */
	@RequestMapping("/addManagerBackStage")
	private String addManagerBackStage(Employee employee,String hiretime ,HttpServletRequest request) throws ParseException{
		List<Employee> list = employeeService.findEmplyeeByExample(employee.getEname(), "");
//		if(list!=null){
//			request.setAttribute("tip", "用户名已存在");
//			return "forward:addManagerPageBackStage";
//		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date eHireTime = sdf.parse(hiretime);
		employee.setEhiretime(eHireTime);
		
		employee.setEid(UUIDUtil.get32UUID());
		int insert = employeeService.insertSelective(employee);
		if(insert!=0){
			return "redirect:managerBackStage";
		}else{
			request.setAttribute("tip", "操作错误");
			return "forward:addManagerPageBackStage";
		}
	}
	
	
	/**
	 * @param eid
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年7月31日
	 * @description:根据eid查询管理员，转换date为String,跳转更改管理员信息界面
	 */
	@RequestMapping("/updateManagerPageBackStage")
	private String updateManagerPageBackStage(String eid,HttpServletRequest request){
		Employee employee = employeeService.findEmplyeeByEid(eid);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String hiretime = sdf.format(employee.getEhiretime());
		request.setAttribute("hiretime", hiretime);
		request.setAttribute("employee1", employee);
		return "backStage/updateManager";
	}
	
	/**
	 * @param employee
	 * @param hiretime
	 * @param request
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年8月1日
	 * @description:将日期改为date格式，获取新的用户信息，根据eid修改用户信息
	 */
	@RequestMapping("/updateManagerBackStage")
	private String updateManagerBackStage(Employee employee,String hiretime,HttpServletRequest request) throws ParseException{
		System.out.println(employee);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date eHireTime = sdf.parse(hiretime);
		employee.setEhiretime(eHireTime);
		
		int count = employeeService.updateEmployee(employee);
		if(count!=0){
			return "redirect:managerBackStage";
		}else{
			request.setAttribute("tip1", "修改信息错误");
			return "forward:updateManagerPageBackStage";
		}
	
	}
	
	
	/**
	 * @param eid
	 * @param request
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年8月1日
	 * @description:根据eid删除用户信息
	 */
	@RequestMapping("/deleteManagerBackStage")
	private String deleteManagerBackStage(String eid,HttpServletRequest request){
		int count = employeeService.deleteManagerByPrimaryKey(eid);
		if(count!=0){
			return "redirect:managerBackStage";
		}else{
			request.setAttribute("tips2", "删除失败");
			return "forward:managerBackStage";
		}
	
	}
	
	
	/**
	 * @param name
	 * @param request
	 * @return
	 * @throws ParseException
	 * @author:炸鸡
	 * @date:2019年8月1日
	 * @description:获取输入框的数据，根据用户名进行模糊查询，使用分页插件，返回查询界面
	 */
	@RequestMapping("/searchManagerBackStage")
	private String searchManagerBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String name,HttpServletRequest request){
		if(name==null){
			String test = "";
			PageHelper.startPage(pn, 10);
			List<Employee> list = employeeService.findEmplyeeByExample(test, test);
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			request.setAttribute("pageInfo", pageInfo);
			request.setAttribute("name", name);
			return "backStage/SearchManager";
		}else{
			PageHelper.startPage(pn, 10);
			List<Employee> list = employeeService.findLikeManagerByExample(name);
			@SuppressWarnings({ "rawtypes", "unchecked" })
			PageInfo pageInfo = new PageInfo(list, 10);
			request.setAttribute("pageInfo", pageInfo);
			request.setAttribute("name", name);
			return "backStage/SearchManager";
		}
	}
	
	
}
