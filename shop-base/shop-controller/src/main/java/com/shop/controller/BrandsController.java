package com.shop.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.shop.pojo.Brands;
import com.shop.service.BrandsService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: BrandsController
 * @author: snypxk
 * @Description: 品牌的业务逻辑控制类
 * @date: 2019年8月2日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Brands")
public class BrandsController {

	@Autowired
	private BrandsService brandsService;

	@RequestMapping(value = "/showAllBrands")
	public String showAllBrands(Model model) {
		List<Brands> queryAllBrands = brandsService.queryAllBrands();
		model.addAttribute("queryAllBrands", queryAllBrands);
		return "BrandsJSP/showAllBrands";
	}

	@RequestMapping(value = "/insertBrands")
	public void insertBrands() {

	}

	@RequestMapping(value = "/updateBrandsByBid", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateUserByUserid(Model model, Brands brands) {
		brands = brandsService.queryBrandsByBid(brands);
		model.addAttribute("brands", brands);
		return "BrandsJSP/updateBrands";
	}

	@RequestMapping(value = "/updateBrands", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateUser(HttpServletRequest request, Model model, Brands brands, MultipartFile pictureFile) throws Exception {
		String newname = UUIDUtil.get16UUID();
		String oldName = pictureFile.getOriginalFilename();
		String sux = oldName.substring(oldName.lastIndexOf("."));
		File file = new File("/root/shopIMG/" + newname + sux);
		pictureFile.transferTo(file);
		brands.setBrRoute(newname + sux);

		brandsService.updateBrandsByBid(brands);

		List<Brands> queryAllBrands = brandsService.queryAllBrands();
		model.addAttribute("queryAllBrands", queryAllBrands);
		model.addAttribute("msg", "修改成功!!!");
		return "BrandsJSP/showAllBrands";
	}

}
