package com.shop.service;

import java.util.List;

import com.shop.pojo.ImageProduct;

/**
 * @ClassName: ImageProductService
 * @author: snypxk
 * @Description: 商品图片路径表（image_product）的服务接口类
 * @date: 2019年8月2日
 * @Other:
 */
public interface ImageProductService {

	/**
	 * @Description: 获取商品图片 - 根据商品ID
	 * @return
	 * @return List<ImageProduct>
	 */
	public List<ImageProduct> getProductImageByPid(String pid);
	
	
	/**
	 * @Description: 插入商品图片
	 * @return
	 * @return int
	 */
	public int insertProductImage(ImageProduct imageProduct);
	
	
	/**
	 * @Description: 删除商品的图片 - 根据商品ID
	 * @return
	 * @return int
	 */
	public int deleteProductImageByPid(String pid);
	
	
	/**
	 * @Description: 更新商品的图片 - 根据商品ID
	 * @return
	 * @return int
	 */
	public int updateProductImageByPid(String pid, ImageProduct imageProduct);
	
	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:查询ipid最大的ImageProduct
	 */
	public ImageProduct selectBigestIpIdOfImageProduct();


	/**
	 * @param ipId
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:通过ipid获取ImageProduct
	 */
	public ImageProduct getProductImageByIpId(String ipId);


	/**
	 * @param imageProduct
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:通过ipid跟新ImageProduct信息
	 */
	public int updateProductImageByIpId(ImageProduct imageProduct);
	
}
