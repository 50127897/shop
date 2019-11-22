package com.shop.controller;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Brands;
import com.shop.service.BrandBackstageService;
import com.shop.utils.UUIDUtil;

/**
 * @ClassName:BrandsController
 * @author: 炸鸡
 * @Description:后台品牌管理的controller
 * @date :2019年8月5日
 * @other:
 */
@Controller
@RequestMapping("/backstage")
public class BrandsBackStageController {

	@Autowired
	private BrandBackstageService brandBackstageService;
	
	/**
	 * @param pn
	 * @param request
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:查询所有的品牌信息，跳转品牌管理界面
	 */
	@RequestMapping("/brandBackStage")
	public String brandBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request){
		
		PageHelper.startPage(pn, 10);
		List<Brands> list = brandBackstageService.queryAllBrands();
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		request.setAttribute("pageInfo", pageInfo);

		return "backStage/brand";
	}
	
	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:跳转添加品牌界面
	 */
	@RequestMapping("/addbrandPageBackStage")
	public String addbrandPageBackStage(){
		return "backStage/addBrand";
		
	}
	
	
	/**
	 * @param request
	 * @param brands
	 * @param pictureFile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:执行添加品牌操作，保存品牌图片
	 */
	@RequestMapping(value = "/addbrandBackStage",method = { RequestMethod.POST, RequestMethod.GET })
	public String addbrandBackStage(HttpServletRequest request,Brands brands,MultipartFile pictureFile) throws IllegalStateException, IOException{
		String newname = UUIDUtil.get16UUID();
		String oldName = pictureFile.getOriginalFilename();
		String sux = oldName.substring(oldName.lastIndexOf("."));
		File file = new File("/root/shopIMG/" + newname + sux);
		pictureFile.transferTo(file);
		brands.setBrRoute(newname + sux);
		Brands Bigestbrands = brandBackstageService.selectBigestBidOfBrand();
		brands.setBid(Bigestbrands.getBid().add(new BigDecimal(1)));
		int count = brandBackstageService.insertBrands(brands);
		if(count!=0){
			return "redirect:brandBackStage";
		}else{
			request.setAttribute("tip6", "添加失败");
			return "backStage/addBrand";
		}
	}
	
	
	
	/**
	 * @param request
	 * @param bid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:跳转品牌更新界面
	 */
	@RequestMapping(value = "/updateBrandPageBackStage")
	public String updateBrandPageBackStage(HttpServletRequest request,String bid){
		Brands brands = brandBackstageService.selectByBid(bid);
		request.setAttribute("brands", brands);
		return "backStage/updateBrand";
		
	}
	
	/**
	 * @param brands
	 * @param pictureFile
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:执行品牌更新操作，保存跟新的品牌图片
	 */
	@RequestMapping(value = "/updateBrandBackStage",method = { RequestMethod.POST, RequestMethod.GET })
	public String updateBrandBackStage(Brands brands,MultipartFile pictureFile,HttpServletRequest request) throws IllegalStateException, IOException{
		String newname = UUIDUtil.get16UUID();
		String oldName = pictureFile.getOriginalFilename();
		String sux = oldName.substring(oldName.lastIndexOf("."));
		File file = new File("/root/shopIMG/" + newname + sux);
		pictureFile.transferTo(file);
		brands.setBrRoute(newname + sux);
//		System.out.println(brands);
		int count = brandBackstageService.updateBrands(brands);
		if(count!=0){
			return "redirect:brandBackStage";
		}else{
			request.setAttribute("tip8", "更新失败");
			request.setAttribute("brands", brands);
			return "backStage/addBrand";
		}
		
	}
	
	
	/**
	 * @param request
	 * @param bid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:删除品牌信息
	 */
	@RequestMapping(value = "/deleteBrandBackStage")
	public String deleteBrandBackStage(HttpServletRequest request,String bid){
		Brands brands = brandBackstageService.selectByBid(bid);
		File file = new File("/root/shopIMG/" + brands.getBrRoute());
		boolean delete = file.delete();
		int count  = brandBackstageService.deleteBrandByBid(bid);
		
		if(count!=0&&delete==true){
			return "redirect:brandBackStage";
		}else{
			request.setAttribute("tips9", "删除失败");
			return "forward:brandBackStage";
		}
	}
	
	
	/**
	 * @param pn
	 * @param request
	 * @param bname
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月5日
	 * @description:根据品牌名称进行品牌信息的迷糊查询，使用分页
	 */
	@RequestMapping(value = "/searchBrandsByBname")
	public String searchBrandsByBname(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpServletRequest request,String bname){
		PageHelper.startPage(pn, 10);
		// startPage后面紧跟着的这个查询就是一个分页查询
		List<Brands> list  = brandBackstageService.selectBrandLikeBname(bname);
		// 使用pageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
		//封装了详细的分页信息,包括查出来的数据,传入连续显示的页数,以下是 5 页
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		request.setAttribute("bname", bname);
		request.setAttribute("pageInfo", pageInfo);
		return "backStage/searchBrand";
		
	}
	
}
