package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Categorys;
import com.shop.service.CategoryBackstageService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName:CategoryController
 * @author: 炸鸡
 * @Description:商品分类的controller
 * @date :2019年8月5日
 * @
 * @other:
 */
@Controller
@RequestMapping("/backstage")
public class CategoryBackStageController {
	
	@Autowired
	public CategoryBackstageService categoryBackstageService;
	
	/**
	 * @param pn
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:查询所有商品分类信息，使用分页，跳转商品分类管理界面
	 */
	@RequestMapping("/categoryBackStage")
	public String categoryBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model){
		PageHelper.startPage(pn, 10);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Categorys> list = categoryBackstageService.selectAllCategry();
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		
		model.addAttribute("list", list);
		return "backStage/category";
	}

	
	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:跳转添加分类界面
	 */
	@RequestMapping("/addCategoryPageBackStage")
	public String addCategoryPageBackStage(){
		return "backStage/addCategory";
	}
	
	/**
	 * @param categorys
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:h执行商品分类信息添加操作，返回商品分类管理界面
	 */
	@RequestMapping("/addCategoryBackStage")
	public String addCategoryBackStage(Categorys categorys,Model model){
		String uuid = UUIDUtil.get16UUID();
		categorys.setCid(uuid);
		int count =categoryBackstageService.insertCategorys(categorys);
		if(count!=0){
			return "redirect:categoryBackStage";
		}else{
			model.addAttribute("msg3", "添加错误");
			return "backStage/addCategory";
		}
	}
	
	
	/**
	 * @param cid
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:跳转商品分类修改界面
	 */
	@RequestMapping("/updateCategoryPageBackStage")
	public String updateCategoryPageBackStage(String cid,Model model){
		Categorys categorys = categoryBackstageService.selectCategorysByCid(cid);
		model.addAttribute("categorys", categorys);
		return "backStage/updateCategory";
	}
	
	
	/**
	 * @param categorys
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:执行商品修改操作，返回商品分类管理界面
	 */
	@RequestMapping("/updateCategoryBackStage")
	public String updateCategoryBackStage(Categorys categorys,Model model){
		int count = categoryBackstageService.updateCategorys(categorys);
		if(count!=0){
			return "redirect:categoryBackStage";
		}else{
			model.addAttribute("msg4", "修改失败");
			return "backStage/updateCategory";
		}
		
	}
	
	
	/**
	 * @param cid
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:删除商品操作
	 */
	@RequestMapping("/deleteCategoryBackStage")
	public String deleteCategoryBackStage(String cid,Model model){
		int count = categoryBackstageService.deleteCategorysByCid(cid);
		if(count!=0){
			return "redirect:categoryBackStage";
		}else{
			model.addAttribute("msg5", "删除失败");
			return "forward:categoryBackStage";
		}
	}
	
	
	
	/**
	 * @param pn
	 * @param model
	 * @param cname
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:模糊查询操作，使用分页
	 */
	@RequestMapping("/searchCategoryBackStage")
	public String searchCategoryBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model,String cname){
		PageHelper.startPage(pn, 10);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Categorys> list = categoryBackstageService.selectCategryLikeCame(cname);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("cname", cname);
		model.addAttribute("list", list);
		return "backStage/searchCategory";
	}
}
