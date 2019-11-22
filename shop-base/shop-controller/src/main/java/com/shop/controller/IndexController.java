package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Brands;
import com.shop.pojo.Product;
import com.shop.service.BrandsService;
import com.shop.service.ProductService;

/**
 * @ClassName: IndexController
 * @author: snypxk
 * @Description: 首页商品展示控制
 * @date: 2019年8月5日
 * @Other:
 */
@Controller
public class IndexController {
	
	@Autowired
	private ProductService productService;
	
	
	@Autowired
	private BrandsService brandsService;
	
	/**
	 * @Description: 请求UL: http://localhost:8080/shop-controller/index ===>  <jsp:forward page="/to_index"></jsp:forward>
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "indexJSP/index";
	}
	
	
	/**
	 * @Description: 获得商品信息 并返回首页
	 * @param model
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "to_index")
	public String index_test(Model model) {
		
		//轮播图
		List<Brands> brandThreeImage = brandsService.queryTop3BrandsOrderByBidASC();
		model.addAttribute("brandThreeImage", brandThreeImage);
		//8份热门商品
		List<Product> hotProductList = productService.queryProductByHot();
		model.addAttribute("hotProductList", hotProductList);
		//三份精选类图商品
		List<Product> manList = productService.selectManConcentrationTop5ByPdateDESC();
		List<Product> womenList = productService.selectWomanConcentrationTop5ByPdateDESC();
		List<Product> childList = productService.selectChildConcentrationTop5ByPdateDESC();
		
		model.addAttribute("manList", manList);
		model.addAttribute("womenList", womenList);
		model.addAttribute("childList", childList);
		
//		for (Brands brands : brandThreeImage) {
//			System.out.println(brands);
//		}
//		
		return "indexJSP/to_index";
	}

}
