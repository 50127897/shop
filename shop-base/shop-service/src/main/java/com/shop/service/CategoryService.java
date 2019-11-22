package com.shop.service;

import java.util.List;

import com.shop.pojo.Categorys;

/**
 * @ClassName: CatagoryService
 * @author: snypxk
 * @Description: 商品分类表（category）的服务接口类
 * @date: 2019年8月2日
 * @Other:	 三种:  man   woman  kid
 */
public interface CategoryService {

	/**
	 * @Description: 添加商品分类
	 * @return
	 * @return int
	 */
	public int insertCategory(Categorys categorys);
	
	
	/**
	 * @Description: 获取商品分类ID - 根据商品分类名
	 * @param category
	 * @return
	 * @return String
	 */
	public String getCidByCname(Categorys category);
	
	
	/**
	 * @Description: 获取商品分类ID - 根据商品分类名
	 * @param category
	 * @return
	 * @return String
	 */
	public String getCidByCname(String cname);
	
	
	/**
	 * @Description: 获取商品分类名 - 根据商品分类ID
	 * @param category
	 * @return
	 * @return String
	 */
	public String getCnameByCid(Categorys category);
	
	
	/**
	 * @Description: 获取商品分类名 - 根据商品分类名ID
	 * @param category
	 * @return
	 * @return String
	 */
	public String getCnameByCid(String cid);
	
	
	/**
	 * @Description: 获取所有商品分类
	 * @return
	 * @return List<Categorys>
	 */
	public List<Categorys> queryAllCategorys();
	
	
	/**
	 * @Description: 删除商品分类 - 根据商品分类名
	 * @return
	 * @return int
	 */
	public int deleteCategorysByCname(String cname);
	
	
	/**
	 * @Description: 删除商品分类 - 根据商品分类ID
	 * @return
	 * @return int
	 */
	public int deleteCategorysByCid(String cid);
}
