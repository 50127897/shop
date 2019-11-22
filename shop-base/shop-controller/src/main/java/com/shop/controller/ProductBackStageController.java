package com.shop.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Brands;
import com.shop.pojo.Categorys;
import com.shop.pojo.ImageProduct;
import com.shop.pojo.Product;
import com.shop.service.BrandBackstageService;
import com.shop.service.CategoryBackstageService;
import com.shop.service.ImageProductService;
import com.shop.service.ProductService;
import com.shop.utils.UUIDUtil;
/**
 * 商品后台管理
 * @author Garmi
 *
 */
@Controller
@RequestMapping("/backstage")
public class ProductBackStageController {

	@Autowired
	private ProductService productService;
	@Autowired
	private ImageProductService imageProductService;
	@Autowired
	private BrandBackstageService brandBackstageService;
	@Autowired
	public CategoryBackstageService categoryBackstageService;
	
	
	/**
	 * 查询商品信息
	 * @param pn
	 * @param request
	 * @return
	 */
	@RequestMapping("/productBackStage")
	public String productBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model){
		PageHelper.startPage(pn, 40);
		List<Product> list = productService.queryAllProductWithIMG();
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		
		List<Brands> brandslist = brandBackstageService.selectBrandLikeBname("");
		model.addAttribute("brandslist", brandslist);
		List<Categorys> categrylist = categoryBackstageService.selectAllCategry();
		model.addAttribute("categrylist", categrylist);
		return "backStage/product";
		
	}
	/*@RequestMapping("/productmanage")
	private String managerBackStage(@RequestParam(value = "pn",defaultValue = "1") Integer pn,HttpServletRequest request){
		PageHelper.startPage(pn,10);
		List<Product> list = productService.queryAllProductWithIMG();
		@SuppressWarnings({ "rawtypes", "unchecked" })
 		PageInfo pageInfo=new PageInfo(list,10);
		
		request.setAttribute("pageInfo", pageInfo);
		return "backStage/product";
	}*/

	/**
	 * 商品的上下架功能
	 * @param product
	 * @param request
	 * @return
	 */
	@RequestMapping("/updatepflag")
	public String   offTheShelf(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String pid,HttpServletRequest request) {
		Product product = new Product();
		product = productService.selectProductByPrimaryKeySelective(pid);
		BigDecimal flag = product.getPflag();
		if (flag.intValue()!=0) {
			product.setPflag(new BigDecimal(0));
			productService.updateProductByPid(product);
			return "forward:productBackStage?pn="+pn;
		}else {
			product.setPflag(new BigDecimal(1));
			productService.updateProductByPid(product);
			return "forward:productBackStage?pn="+pn;
		}		
	}
	/**
	 * 根据商品名进行模糊查询
	 * @param pn
	 * @param name
	 * @param request
	 * @return
	 */
	@RequestMapping("/searchproductbackstage")
	public String searchProductBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String productName,HttpServletRequest request) {
		PageHelper.startPage(pn, 40);
		List<Product> list = productService.queryProductByVague(productName);
		
		PageInfo<Product> pageInfo=new PageInfo<Product>(list,10);
		request.setAttribute("pageInfo", pageInfo);
		request.setAttribute("productName", productName);
		return "backStage/SearchProduct";
	}

	
	
	/**
	 * @Description:跳转到修改页面，查询到某一个商品的全部信息
	 * @param pid
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateProductPageBackStage")
	private String updateProductPageBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String pid,Model model) {
		List<Brands> brandlist = brandBackstageService.selectBrandLikeBname("");
		List<Categorys> categorylist = categoryBackstageService.selectAllCategry();
		model.addAttribute("brandlist", brandlist);
		model.addAttribute("categorylist", categorylist);
		Product product = productService.queryPoductWithImageByPid(pid);
		model.addAttribute("product", product);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String pdate = sdf.format(product.getPdate());
		model.addAttribute("pdate", pdate);
		model.addAttribute("pn", pn);
		return "backStage/updateProduct";
	}
	
	
	/**@Description: 更新商品信息
	 * @param product
	 * @param request
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/updateProduct")
	private String updateProduct(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Product product,HttpServletRequest request,String date) throws ParseException {
		//日期转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date pdate = sdf.parse(date);
		//查询类别
		Categorys categorys = categoryBackstageService.selectCategorysByCid(product.getCid());
		//查询品牌
		Brands brands = brandBackstageService.selectByBid(product.getBid().toString());
		//创建查询索引
		String searchinformation = brands.getBname()+"-"+categorys.getCname()+"-"+product.getPname();
		product.setPdate(pdate);
		product.setSearchinformation(searchinformation);
		int count = productService.updateProductByPid(product);
		if(count !=0) {
			return "forward:productBackStage?pn="+pn;
			
		}else {
			request.setAttribute("msg5", "修改失败，请重试！");
			return "forward:updateProductPageBackStage";
		}
		
	}
	
	/**@Description: 更新商品图片
	 * @param pid
	 * @param model
	 * @param pictureFile
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateImage")
	@ResponseBody
	public String updateImage(@RequestParam(value = "fileName", required = false) MultipartFile pictureFile,String ipId,Model model)
			throws Exception {
		if(pictureFile.isEmpty()){
			return "不可上传空文件";
		}
		String newname = UUIDUtil.get16UUID();
		String oldName = pictureFile.getOriginalFilename();
		String sux = oldName.substring(oldName.lastIndexOf("."));
		//File file = new File("D:\\shopIMG\\" + newname + sux);/root/shopIMG/
		File file = new File("/root/shopIMG/" + newname + sux);
		pictureFile.transferTo(file);
		ImageProduct imageProduct = imageProductService.getProductImageByIpId(ipId);
		File file2 = new File("/root/shopIMG/" + imageProduct.getIpRoute());
		boolean delete = file2.delete();
		imageProduct.setIpRoute(newname + sux);
		int count = imageProductService.updateProductImageByIpId(imageProduct);
		if(count!=0&&delete==true){
			return "1";
		}else{
			return "0";
			
		}
		
		
	}
	
	
	
	
	/**
	 * @param model
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:跳转添加商品界面
	 */
	@RequestMapping("/addProductPagebackstage")
	public String addProductPagebackstage(Model model){
		List<Brands> brandlist = brandBackstageService.selectBrandLikeBname("");
		List<Categorys> categorylist = categoryBackstageService.selectAllCategry();
		model.addAttribute("brandlist", brandlist);
		model.addAttribute("categorylist", categorylist);
		return "backStage/addProduct";
	}
	
	
	/**
	 * @param model
	 * @param product
	 * @param date
	 * @param pictureFile
	 * @return
	 * @throws ParseException
	 * @throws IllegalStateException
	 * @throws IOException
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:添加商品，批量保存图片
	 */
	@RequestMapping(value = "/addProductbackstage",method = { RequestMethod.POST, RequestMethod.GET })
	public String addProductbackstage(Model model,Product product,String date,MultipartFile[] pictureFile) throws ParseException, IllegalStateException, IOException{
		//日期转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date pdate = sdf.parse(date);
		//查询类别
		Categorys categorys = categoryBackstageService.selectCategorysByCid(product.getCid());
		//查询品牌
		Brands brands = brandBackstageService.selectByBid(product.getBid().toString());
		//创建查询索引
		String searchinformation = brands.getBname()+"-"+categorys.getCname()+"-"+product.getPname();
		//创建pid
		String pid = UUIDUtil.get16UUID();
		//添加商品信息
		product.setPdate(pdate);
		product.setPid(pid);
		product.setSearchinformation(searchinformation);
		productService.insertProduct(product);
		for (MultipartFile multipartFile : pictureFile) {
			//添加pid
			ImageProduct imageProduct = new ImageProduct();
			imageProduct.setPid(pid);
			//添加ipid
			ImageProduct biggist = imageProductService.selectBigestIpIdOfImageProduct();
			imageProduct.setIpId(biggist.getIpId().add(new BigDecimal(1)));
			//保存图片，添加图片路径
			String newname = UUIDUtil.get16UUID();
			String oldName = multipartFile.getOriginalFilename();
			String sux = oldName.substring(oldName.lastIndexOf("."));
			File file = new File("D:\\shopIMG\\" + newname + sux);
			multipartFile.transferTo(file);
			imageProduct.setIpRoute(newname + sux);
			imageProductService.insertProductImage(imageProduct);
		}
		return "redirect:productBackStage";
	}
	
	
	
}
