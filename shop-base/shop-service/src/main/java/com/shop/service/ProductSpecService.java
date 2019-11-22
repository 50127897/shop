package com.shop.service;

import java.math.BigDecimal;

/**
 * @ClassName: ProductSpecService
 * @author: snypxk
 * @Description: TODO
 * @date: 2019年8月9日
 * @Other:
 */
public interface ProductSpecService {

	/**
	 * @Description: 根据 pid 和 psSpec 去获取 规格ID[PsID]
	 * @param pid	  --  商品ID
	 * @param psSpec  -- 商品的某个规格
	 * @return
	 * @return BigDecimal
	 */
	public BigDecimal getPsIdByPidAndPsSpec(String pid,String psSpec);
}
