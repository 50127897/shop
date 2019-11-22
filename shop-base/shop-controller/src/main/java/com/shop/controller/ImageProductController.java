package com.shop.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.shop.pojo.ImageProduct;
import com.shop.service.ImageProductService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName: ImageProductController
 * @author: snypxk
 * @Description: 商品图片路径表（image_product）的业务逻辑控制类
 * @date: 2019年8月2日
 * @Other:
 */
@Controller
@RequestMapping(value = "/ImageProduct")
public class ImageProductController {

	@Autowired
	private ImageProductService imageProductService;

	@RequestMapping(value = "/uploadPicture")
	public String uploadPicture() {
		return "imageProductJSP/uploadPictureByPid";
	}
	
	@RequestMapping(value = "/uploadPictureByPid", method = { RequestMethod.POST })
	public String uploadPictureByPid(ImageProduct imageProduct, Model model, MultipartFile pictureFile)
			throws Exception {

		String newname = UUIDUtil.get16UUID();
		String oldName = pictureFile.getOriginalFilename();
		String sux = oldName.substring(oldName.lastIndexOf("."));
		File file = new File("/root/shopIMG/" + newname + sux);
		pictureFile.transferTo(file);
		imageProduct.setIpRoute(newname + sux);
		imageProductService.insertProductImage(imageProduct);
		model.addAttribute("msg","successfuly");
		return "imageProductJSP/uploadPictureByPid";
	}
}
