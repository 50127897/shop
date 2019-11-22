package com.shop.service;

import java.util.List;

import com.shop.pojo.Categorys;

public interface CategoryBackstageService {

	List<Categorys> selectAllCategry();

	int insertCategorys(Categorys categorys);

	Categorys selectCategorysByCid(String cid);

	int updateCategorys(Categorys categorys);

	int deleteCategorysByCid(String cid);

	List<Categorys> selectCategryLikeCame(String cname);

}
