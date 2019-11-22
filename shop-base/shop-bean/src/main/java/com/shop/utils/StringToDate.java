package com.shop.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName: StringToDate
 * @author: snypxk
 * @Description: 字符串转换为日期工具类
 * @date: 2019年8月1日
 * @Other:
 */
public class StringToDate{
	
	/**
	 * @Description: 转换具体年-月-日 型的字符串日期
	 * @param source
	 * @return
	 * @return Date
	 */
	public static Date convertYMD(String source) {
		Date result = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			result = sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @Description: 转换具体年-月-日-时-分-秒 型的字符串日期
	 * @param source
	 * @return
	 * @return Date
	 */
	public static Date convertYMDHMS(String source) {
		Date result = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			result = sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result; 
	}
}
