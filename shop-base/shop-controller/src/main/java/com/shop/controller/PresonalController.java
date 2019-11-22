package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Collections;
import com.shop.pojo.Product;
import com.shop.pojo.Users;
import com.shop.service.CollectionService;
import com.shop.service.ProductService;
import com.shop.service.UserService;

/**
 * @Description:首页个人中心
 * @author Garmi
 *
 */
@Controller
public class PresonalController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CollectionService collectionService;
	
	@Autowired
	private ProductService productService;

	/**
	 * @Description: 跳转个人中心的个人资料页面
	 * @return
	 */
	@RequestMapping("/toPersonalProfile")
	public String toPersonalCenter(Users user) {

		return "personalCenter/personalProfile";
	}

	/**
	 * @Description: 修改个人资料
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/updateUserProfile")
	public String updateUserProfile(Users user, HttpServletRequest request) {
		Users olduser = (Users) request.getSession().getAttribute("user");
		olduser.setUserid(user.getUserid());
		olduser.setUsername(user.getUsername());
		olduser.setEmail(user.getEmail());
		olduser.setTelephone(user.getTelephone());
		olduser.setBirthday(user.getBirthday());
		int count = userService.updateUsersByUserid(olduser);
		if (count != 0) {
			return "personalCenter/personalProfile";

		}
		request.setAttribute("msg11", "修改失败，请重试！");
		return "personalCenter/personalProfile";
	}

	/**
	 * @Description: 跳转到购物车页面
	 * @return
	 */
	@RequestMapping("/toCart")
	public String toCart() {
		return "personalCenter/cart";
	}

	@RequestMapping("/toIndex")
	public String toIndex() {
		return "/index";
	}

	/**
	 * @Description: 跳转到收藏夹页面，并展示用户收藏夹信息
	 * @param collection
	 * @param request
	 * @return
	 */
	@RequestMapping("/findCollection")
	public String findCollection(Collections collection, HttpServletRequest request) {
		Users user = (Users) request.getSession().getAttribute("user");
		List<String> pidList = collectionService.getProductPidListByUserid(user.getUserid());
		if(pidList==null){
			return "personalCenter/collection";
		}
		
		List<Product> productCollection = productService.getProductListByPidList(pidList);
		request.setAttribute("product", productCollection);
		return "personalCenter/collection";
	}

	/**
	 * @Description: 删除收藏夹的商品
	 * @param collection
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteColletion")
	public String deleteColletion(Collections collection, String pid, HttpServletRequest request) {
		Users user = (Users) request.getSession().getAttribute("user");
		int count = collectionService.deleteCollectionByPidAndUserid(pid, user.getUserid());
		if (count != 0) {
			return "redirect:findCollection";
		}
		return "personalCenter/collection";
	}

	/**
	 * @Description: 查看商品详情
	 * @param pid
	 * @param request
	 * @return
	 */
	@RequestMapping("/findProductDetail")
	public String findProductDetail(String pid, HttpServletRequest request) {
		Product productDetail = productService.queryPoductWithImageByPid(pid);
		request.setAttribute("productDetail", productDetail);
		return "Product/product_detail";
	}

	/**
	 * @Description: 增加商品到收藏
	 * @param pid
	 * @param request
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/addProductToCollection")
	public String addProductToCollection(String pid, HttpServletRequest request) {
		Users user = (Users) request.getSession().getAttribute("user");
		System.out.println(user.getUserid());
		String userid = user.getUserid();
		List<String> list = collectionService.getProductPidListByUserid(userid);
		if(list==null){
			Collections collection=new Collections();
			collection.setPid(pid);
			collection.setUserid(userid);
			collectionService.insertCollection(collection);
			return "redirect:findCollection";
		}
		for (String pid_ : list) {
			if (pid == pid_) {
				request.setAttribute("msg20", "您已经收藏该商品!");
				return "forward:Product/product_detail?pid="+pid;
			}
		}
		Collections collection=new Collections();
		collection.setPid(pid);
		collection.setUserid(userid);
		collectionService.insertCollection(collection);
		return "redirect:findCollection";
	}

}
