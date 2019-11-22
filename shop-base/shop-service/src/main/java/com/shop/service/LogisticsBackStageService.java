package com.shop.service;

import java.util.List;

import com.shop.pojo.Logistics;

public interface LogisticsBackStageService {

	/**
	 * @param orderid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:回家订单id查询物流
	 */
	List<Logistics> selectLogisticsByOrderid(String orderid);

	/**
	 * @param logistics
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:插入物流信息
	 */
	int insertLogistics(Logistics logistics);

	/**
	 * @param loid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:根据物流id删除物流信息
	 */
	int deleteLogisticsByLoid(String loid);

	/**
	 * @param loid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:通过物流id获取物流信息
	 */
	Logistics selectLogisticsByLoid(String loid);

	/**
	 * @param logistics
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月9日
	 * @description:通过物流id更新物流信息
	 */
	int updateLogisticsByLoid(Logistics logistics);

}
