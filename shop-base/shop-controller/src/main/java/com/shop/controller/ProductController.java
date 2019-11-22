package com.shop.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Comments;
import com.shop.pojo.Product;
import com.shop.pojo.ProductSpec;
import com.shop.pojo.SearchProperty;
import com.shop.service.BrandsService;
import com.shop.service.CategoryService;
import com.shop.service.CommentService;
import com.shop.service.ProductService;
import com.shop.service.StockBackStageService;

/**
 * @ClassName: ProductController
 * @author: snypxk
 * @Description: 商品表（product）的业务逻辑控制类
 * @date: 2019年8月2日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Product")
public class ProductController {

	private String keyJSP;

	private String brandJSP;

	private String colorJSP;

	private String categoryJSP;

	private String sortedByJSP;

	private String genderJSP;

	private String searchKeys;

	private BigDecimal bid;

	private String cid;

	@Autowired
	private ProductService productService;

	@Autowired
	private CommentService commentService;

	@Autowired
	private BrandsService brandsService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private StockBackStageService stockBackStageService;

	/**
	 * @Description: 显示所有商品
	 * @param model
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/showAllProduct")
	public String showAllProduct(Model model) {
		List<Product> queryAllProductWithIMG = productService.queryAllProductWithIMG();
		model.addAttribute("queryAllProductWithIMG", queryAllProductWithIMG);
		return "ProductJSP/showAllProduct";
	}

	/**
	 * @Description: 进入 商品详情页面
	 * @param model
	 * @param pid
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/product_detail")
	public String product_detail(Model model, String pid) {
		List<ProductSpec> specAndStoreList = stockBackStageService.getStockByPid(pid);
		Product productDetial = productService.queryPoductWithImageByPid(pid);
		productDetial.setSpecList(specAndStoreList);
		model.addAttribute("productDetial", productDetial);
		List<Product> productLike = productService.queryProductByLike();
		model.addAttribute("productLike", productLike);
		List<Comments> commentsList = commentService.queryCommentWithIMGByPid(pid);
		model.addAttribute("commentsList", commentsList);
		return "ProductJSP/product_detail";
	}

	
	/**
	 * @Description: 糊糊搜索查询控制
	 * @param pn
	 * @param sortedBy  - 排序 PDATEDESC(默认new) PNAME(DESC) PPRICEDESC PPRICEASC
	 *                  PSALEDESC PSALEASC
	 * @param category  - 分类 ALL(默认) 休闲[ar -arder] 跑步[ru] 篮球[ba] 足球[fo]
	 * @param brand     - 品牌 ALL(默认) NIKE ADIDAS ANTA LINING XTEP ERKE
	 * @param color     - 颜色 ALL(默认) 绿[en] 红[re] 黄[ye] 棕[br brown] 紫[pu] 蓝[ue] 灰[gr]
	 *                  黑[ack] 青[cyan] 橙[or]
	 * @param gender    - 性别 ALL(默认) man woman kid
	 * @param searchKey - 搜索关键字
	 * @param model
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/searchProductByKey")
	public String searchProductByKey(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "sortedBy", defaultValue = "PDATEDESC", required = false) String sortedBy,
			@RequestParam(value = "category", defaultValue = "ALL", required = false) String category,
			@RequestParam(value = "brand", defaultValue = "ALL", required = false) String brand,
			@RequestParam(value = "color", defaultValue = "ALL", required = false) String color,
			@RequestParam(value = "gender", defaultValue = "ALL", required = false) String gender, String searchKey,
			Model model) {
		// ========== 搜索关键字的构成 =============
		// 如果 关键字不为空,则更新keyJSP
		if (searchKey.length() > 0) {
			keyJSP = searchKey;
		}
		// 赋予搜索关键字
		if (keyJSP.length() > 0) {
			searchKeys = "%";
			searchKeys += keyJSP + "%";
		}

		// 如果 颜色不为空,则更新颜色
		if (color.length() > 0) {
			colorJSP = color;
		}
		// 赋予颜色搜索关键字
		if (colorJSP.length() > 0 && !colorJSP.equals("ALL")) {
			searchKeys += colorJSP + "%";
		}

		// 如果 类别不为空,则更新类别
		if (category.length() > 0) {
			categoryJSP = category;
		}
		// 赋予 类别 搜索关键字
		if (categoryJSP.length() > 0 && !categoryJSP.equals("ALL")) {
			searchKeys += categoryJSP + "%";
		}
		// ========== 搜索关键字的构成 END ===========

		// 如果 品牌不为空,则更新brandJSP
		if (brand.length() > 0) {
			brandJSP = brand;
		}
		// 根据 品牌名 获得 品牌ID 作为入参对象的属性之一
		if (brandJSP.length() > 0 && !brandJSP.equals("ALL")) {
			bid = brandsService.getBidByBrandName(brandJSP);
		} else {
			bid = null;
		}

		// 如果性别不为空,则更新性别
		if (gender.length() > 0) {
			genderJSP = gender;
		}
		// 根据 分类名 获得 分类ID 作为入参对象的属性之一 :男 女 儿童
		if (genderJSP.length() > 0 && !genderJSP.equals("ALL")) {
			cid = categoryService.getCidByCname(genderJSP);
		} else {
			cid = null;
		}

		// 如果 排序不为空,则更新排序
		if (sortedBy.length() > 0) {
			sortedByJSP = sortedBy;
		}

		SearchProperty searchProperty = new SearchProperty(searchKeys, bid, cid);

		// 一页显示75/5=15条记录
		PageHelper.startPage(pn, 75);
		List<Product> searchProductByVague = null;
		if (sortedByJSP.equals("PDATEDESC")) {
			searchProductByVague = productService.queryProductByVagueByPDATEDESC(searchProperty);
		} else if (sortedByJSP.equals("PNAMEDESC")) {
			searchProductByVague = productService.queryProductByVagueByNameDESC(searchProperty);
		} else if (sortedByJSP.equals("PPRICEDESC")) {
			searchProductByVague = productService.queryProductByVagueByShopPriceDESC(searchProperty);
		} else if (sortedByJSP.equals("PPRICEASC")) {
			searchProductByVague = productService.queryProductByVagueByShopPriceASC(searchProperty);
		} else if (sortedByJSP.equals("PSALEDESC")) {
			searchProductByVague = productService.queryProductByVagueBySaleDESC(searchProperty);
		} else {// PSALEASC
			searchProductByVague = productService.queryProductByVagueBySaleASC(searchProperty);
		}
		PageInfo searchPageInfo = new PageInfo(searchProductByVague, 5);

		model.addAttribute("searchPageInfo", searchPageInfo);
		model.addAttribute("sortedBy", sortedByJSP);
		model.addAttribute("category", categoryJSP);
		model.addAttribute("brand", brandJSP);
		model.addAttribute("color", colorJSP);
		model.addAttribute("gender", genderJSP);
		model.addAttribute("key", keyJSP);

		/*
		 * for (Product product : searchProductByVague) { System.out.println(product);
		 * System.out.println("======================================="); for
		 * (ImageProduct im : product.getImageProducts()) { System.out.println(im); } }
		 */

		return "ProductJSP/searchProductByKey";
	}

	
	/**
	 * @Description: 糊糊搜索查询控制  -  有具有搜索关键字
	 * @param pn
	 * @param sortedBy  - 排序 PDATEDESC(默认new) PNAME(DESC) PPRICEDESC PPRICEASC
	 *                  PSALEDESC PSALEASC
	 * @param category  - 分类 ALL(默认) 休闲[ar -arder] 跑步[ru] 篮球[ba] 足球[fo]
	 * @param brand     - 品牌 ALL(默认) NIKE ADIDAS ANTA LINING XTEP ERKE
	 * @param color     - 颜色 ALL(默认) 绿[en] 红[re] 黄[ye] 棕[br brown] 紫[pu] 蓝[ue] 灰[gr]
	 *                  黑[ack] 青[cyan] 橙[or]
	 * @param gender    - 性别 ALL(默认) man woman kid
	 * @param model
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/searchProductByKeyIsNull")
	public String searchProductByKeyIsNull(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "sortedBy", defaultValue = "PDATEDESC", required = false) String sortedBy,
			@RequestParam(value = "category", defaultValue = "ALL", required = false) String category,
			@RequestParam(value = "brand", defaultValue = "ALL", required = false) String brand,
			@RequestParam(value = "color", defaultValue = "ALL", required = false) String color,
			@RequestParam(value = "gender", defaultValue = "", required = false) String gender, Model model) {
		keyJSP="";
		searchKeys = "%";
		searchKeys += keyJSP + "%";

		// 如果 颜色不为空,则更新颜色
		if (color.length() > 0) {
			colorJSP = color;
		}
		// 赋予颜色搜索关键字
		if (colorJSP.length() > 0 && !colorJSP.equals("ALL")) {
			searchKeys += colorJSP + "%";
		}

		// 如果 类别不为空,则更新类别
		if (category.length() > 0) {
			categoryJSP = category;
		}
		// 赋予 类别 搜索关键字
		if (categoryJSP.length() > 0 && !categoryJSP.equals("ALL")) {
			searchKeys += categoryJSP + "%";
		}
		// ========== 搜索关键字的构成 END ===========

		// 如果 品牌不为空,则更新brandJSP
		if (brand.length() > 0) {
			brandJSP = brand;
		}
		// 根据 品牌名 获得 品牌ID 作为入参对象的属性之一
		if (brandJSP.length() > 0 && !brandJSP.equals("ALL")) {
			bid = brandsService.getBidByBrandName(brandJSP);
		} else {
			bid = null;
		}

		// 如果性别不为空,则更新性别
		if (gender.length() > 0) {
			genderJSP = gender;
		}
		// 根据 分类名 获得 分类ID 作为入参对象的属性之一 :男 女 儿童
		if (genderJSP.length() > 0 && !genderJSP.equals("ALL")) {
			cid = categoryService.getCidByCname(genderJSP);
		} else {
			cid = null;
		}

		// 如果 排序不为空,则更新排序
		if (sortedBy.length() > 0) {
			sortedByJSP = sortedBy;
		}

		SearchProperty searchProperty = new SearchProperty(searchKeys, bid, cid);

		// 一页显示75/5=15条记录
		PageHelper.startPage(pn, 75);
		List<Product> searchProductByVague = null;
		if (sortedByJSP.equals("PDATEDESC")) {
			searchProductByVague = productService.queryProductByVagueByPDATEDESC(searchProperty);
		} else if (sortedByJSP.equals("PNAMEDESC")) {
			searchProductByVague = productService.queryProductByVagueByNameDESC(searchProperty);
		} else if (sortedByJSP.equals("PPRICEDESC")) {
			searchProductByVague = productService.queryProductByVagueByShopPriceDESC(searchProperty);
		} else if (sortedByJSP.equals("PPRICEASC")) {
			searchProductByVague = productService.queryProductByVagueByShopPriceASC(searchProperty);
		} else if (sortedByJSP.equals("PSALEDESC")) {
			searchProductByVague = productService.queryProductByVagueBySaleDESC(searchProperty);
		} else {// PSALEASC
			searchProductByVague = productService.queryProductByVagueBySaleASC(searchProperty);
		}
		PageInfo searchPageInfo = new PageInfo(searchProductByVague, 5);

		model.addAttribute("searchPageInfo", searchPageInfo);
		model.addAttribute("sortedBy", sortedByJSP);
		model.addAttribute("category", categoryJSP);
		model.addAttribute("brand", brandJSP);
		model.addAttribute("color", colorJSP);
		model.addAttribute("gender", genderJSP);
		model.addAttribute("key", keyJSP);
		return "ProductJSP/searchProductByKey";
	}

}
