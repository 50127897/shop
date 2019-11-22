package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.pojo.Logistics;
import com.shop.service.LogisticsService;

/**
 * @ClassName: TakeDeliveryController
 * @author: snypxk
 * @Description: 物流的控制类
 * @date: 2019年8月11日
 * @Other:
 */
@Controller
@RequestMapping(value = "/Logistics")
public class LogisticsController {
	
	@Autowired
	private LogisticsService logisticsService;
	
	@RequestMapping(value = "/showLogistics")
	public String showLogistics(Model model,String orderid) {
		List<Logistics> logisticsList = logisticsService.queryLogisticsByOrderidASC(orderid);
		model.addAttribute("logisticsList", logisticsList);
		model.addAttribute("orderid", orderid);
		return "LogisticsJSP/showLogistics";
	}
}
