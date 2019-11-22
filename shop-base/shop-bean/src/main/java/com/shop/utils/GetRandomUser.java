package com.shop.utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import com.shop.pojo.Users;

public class GetRandomUser {
	/**
	 * @Description: 随机生成获取一个用户
	 * @return
	 * @return Users
	 */
	public static Users getUser() {
		int rd = Math.random() > 0.5 ? 1 : 0;
		//性别
		String sex = rd == 0 ? "女" : "男";
		//姓名
		String firstName = new BuildFirstName().insideFirstName();
		String lastName = new BuildLastName().insideLastName(rd);
		String name = firstName + lastName;		
		//电话
		String sources = "0123456789";
		Random rand = new Random();
		StringBuffer flag = new StringBuffer();
		for (int j = 0; j < 10; j++) {
			flag.append(sources.charAt(rand.nextInt(9)) + "");
		}
		String telephone="1"+flag.toString();
		//邮箱
		StringBuffer flag2 = new StringBuffer();
		for (int j = 0; j < 8; j++) {
			flag2.append(sources.charAt(rand.nextInt(9)) + "");
		}
		String email=flag.toString()+"@qq.com";
		//密码
		String passwd = UUIDUtil.get16UUID();
		//生日
		int year= rand.nextInt(99) + 40;
		int month= rand.nextInt(12) + 1;
		int day= rand.nextInt(31) + 1;
		Date birDate =StringToDate.convertYMD("19"+year+"-"+month+"-"+day);

		Users user = new Users();
		user.setUserid(UUIDUtil.get16UUID());
		user.setUsername(name);
		user.setCode("");
		user.setEmail(email);
		user.setPasswd(passwd);
		user.setBirthday(birDate);
		user.setSex(sex);
		user.setTelephone(telephone);
		user.setState(new BigDecimal(1));
		return user;
	}

}