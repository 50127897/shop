package com.shop.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.pojo.Product;
import com.shop.pojo.ProductSpec;
import com.shop.service.ProductService;
import com.shop.service.StockBackStageService;


@Controller
@RequestMapping("/backstage")
public class StockBackStageController {

	@Autowired
	private StockBackStageService stockBackStageService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/stockBackStage")
	public String stockBackStage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,Model model){
		PageHelper.startPage(pn, 10);
		List<Product> list = productService.queryAllProductWithStock();
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return "backStage/stock";
		
	}
	
	
	@RequestMapping("/updateStockPageBackStage")
	public String updateStockPageBackStage(Model model,ProductSpec productSpec,String pname){
		ProductSpec productSpec2 = stockBackStageService.selelctStockByPsId(productSpec.getPsId());
		model.addAttribute("productSpec", productSpec2);
		model.addAttribute("pname", pname);
		return "backStage/updateStock";
	}
	
	@RequestMapping("/updateStockBackStage")
	public String updateStockBackStage(Model model,ProductSpec productSpec){
		int count = stockBackStageService.updateProductSpecByPsId(productSpec);
		if(count!=0){
			return "redirect:stockBackStage";
		}
		model.addAttribute("productSpec", productSpec);
		model.addAttribute("msg6", "更新失败");
		return "backStage/updateStock";
	}
	
	
	@RequestMapping("/deleteStockBackStage")
	public String deleteStockBackStage(Model model,ProductSpec productSpec){
		int count = stockBackStageService.deleteProductSpecByPsId(productSpec.getPsId());
		if(count!=0){
			return "redirect:stockBackStage";
		}
		model.addAttribute("productSpec", productSpec);
		model.addAttribute("msg7", "删除失败");
		return "backStage/stockBackStage";
	}
	
	
	
	@RequestMapping("/searchStockBackStage")
	public String searchStockBackStage(Product product,Model model){
		List<Product> list = productService.queryProductLikePnameWithStock(product.getPname());
		model.addAttribute("list", list);
		return "backStage/searchStock";
		
	}
	
	
	
	@RequestMapping("/searchStockBackStageByPid")
	public String searchStockBackStageByPid(Product product,Model model){
		Product product2 = productService.queryPoductWithStockByPid(product.getPid());
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(product2);
		model.addAttribute("list", list);
		return "backStage/searchStock";
		
	}
	
	
	@RequestMapping("/addStockPageBackStage")
	public String addStockPageBackStage(Product product,Model model){
		Product product2 = productService.selectProductByPid(product.getPid());
		model.addAttribute("product", product2);
		return "backStage/addStock";
	}
	
	@RequestMapping("/addStockBackStage")
	public String addStockBackStage(ProductSpec productSpec,Model model,String store,Product product){
		BigDecimal bigDecimal = new BigDecimal(store);
		productSpec.setPsStore(bigDecimal);
		int count = stockBackStageService.insertStock(productSpec);
		if(count!=0){
			model.addAttribute("product", product);
			model.addAttribute("msg8", "添加成功，请继续添加或返回");
			
		}else{
			model.addAttribute("product", product);
			model.addAttribute("msg8", "添加失败，请重新填写");
		}
		return "backStage/addStock";
		
	}
	
}
