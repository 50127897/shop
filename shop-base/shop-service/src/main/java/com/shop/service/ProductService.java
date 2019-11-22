package com.shop.service;

import java.math.BigDecimal;
import java.util.List;

import com.shop.pojo.Product;
import com.shop.pojo.SearchProperty;

/**
 * @ClassName: ProductService
 * @author: snypxk
 * @Description: 商品表（product）的服务接口类
 * @date: 2019年8月1日
 * @Other:
 */
public interface ProductService {
	
	/**
	 * @Description: 插入商品
	 * @param product
	 * @return
	 * @return int
	 */
	public int insertProduct(Product product);
	
	
	/**
	 * @Description: 查询所有商品 - 带图片信息
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryAllProductWithIMG();
	
	
	/**
	 * @Description: 查询商品 - 分类查询[man]
	 * @return
	 * @return Product
	 */
	public List<Product> queryProductByMan();
	
	
	/**
	 * @Description: 查询商品 - 分类查询[woman]
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByWomen();
	
	
	/**
	 * @Description: 查询商品 - 分类查询[kid]
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByChildren();
	
	
	/**
	 * @Description: 查询商品 - 模糊查询[或 品牌查询]
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByVague(String vagueKey);
	
	
	/**
	 * @Description: 查询商品 - 组合关键字模糊查询
	 * @param key
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByVague(String[] vagueKeys);
	
	
	/**
	 * @Description: 查询所有商品 - 不带图片
	 * @return
	 * @return List<Product>
	 */
	public List<Product> selectAllProductsWithoutIMG();
	
	
	/**
	 * @Description: 查询 商品的商城价 大于 price的商品
	 * @param price
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByGTRange(BigDecimal price);
	
	
	/**
	 * @Description: 查询 商品的商城价 小于 price的商品
	 * @param price
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByLTRange(BigDecimal price);
	
	
	/**
	 * @Description: 查询  lowprice < 商品的商城价 < highprice 的商品
	 * @param lowprice
	 * @param highprice
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByRange(BigDecimal lowprice, BigDecimal highprice);
	
	
	/**
	 * @Description: 按商品的商城价 - 按升序排列查询
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByShopPriceASC();
	
	
	/**
	 * @Description: 按商品的商城价 - 按降序排列查询
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByShopPriceDESC();
	
	
	/**
	 * @Description: 按商品的上架时间 - 按降序排列查询
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByPdateASC();
	
	
	/**
	 * @Description: 按商品的上架时间 - 按降序排列查询
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByPdateDESC();
	
	
	/**
	 * @Description: 查询商品 - 根据已销售数量 - 升序
	 * @return
	 * @return List<Product>
	 */
	List<Product> queryProductByPsaleASC();

	
	/**
	 * @Description: 查询商品 - 根据已销售数量 - 降序
	 * @return
	 * @return List<Product>
	 */
	List<Product> queryProductByPsaleDESC();
	
	
	/**
	 * @Description: 更新商品信息 - 根据商品ID
	 * @param product
	 * @return
	 * @return int
	 */
	public int updateProductByPid(Product product);


	/**
	 * @Description: 查询一个商品 - 带图片信息 - 根据商品ID
	 * @param pid - 商品ID
	 * @return
	 * @return Product
	 */
	public Product queryPoductWithImageByPid(String pid);
	
	
	/**
     * @Description: 获取首页5项男子精选商品
     * @return
     * @return List<Product>
     */
	public List<Product> selectManConcentrationTop5ByPdateDESC();
 
    
    /**
     * @Description: 获取首页5项女子精选商品
     * @return
     * @return List<Product>
     */
	public List<Product> selectWomanConcentrationTop5ByPdateDESC();
    
    
    /**
     * @Description: 获取首页5项儿童精选商品
     * @return
     * @return List<Product>
     */
	public List<Product> selectChildConcentrationTop5ByPdateDESC();
	
	
	/**
	 * @Description: 查询8件热门商品  2019-8-5
	 * @return
	 * @return List<Product>
	 */
	public List<Product> queryProductByHot();
	
	
	/**
	 * @Description: 根据品牌ID 查询商品
	 * @param bid
	 * @return
	 * @return List<Product>
	 */
    public List<Product> queryProductByBrandBid(BigDecimal bid);
    
    
    /**
     * @Description: 猜你喜欢 - 选择7件商品
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByLike();
    
    
    /**
     * @Description: 根据搜索关键字  -  按名称升序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByNameASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按名称降序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByNameDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按上架日期升序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByPDATEASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按上架日期降序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByPDATEDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按价格升序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByShopPriceASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按价格降序查询  2019-8-7
     * @param searchProperty
     * @return
     * @return List<Product>
     */
    public List<Product> queryProductByVagueByShopPriceDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按销量升序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueBySaleASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按销量降序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueBySaleDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据 pid集合获得商品集合
     * @param pidList
     * @return
     * @return List<Product>
     */
    List<Product> getProductListByPidList(List<String> pidList);
    
	/**
	 * 根据主键查询商品（下架）
	 * @param pid
	 * @return
	 */
	public Product selectProductByPrimaryKeySelective(String pid);
    
    
	/**
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:查询所有商品 - 带库存信息
	 */
	public List<Product> queryAllProductWithStock();


	/**
	 * @param pid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:根据pid查询带库存信息的商品
	 */
	public Product queryPoductWithStockByPid(String pid);




	/**
	 * @param pname
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:模糊查询带库存信息的商品
	 */
	public List<Product> queryProductLikePnameWithStock(String pname);


	/**
	 * @param pid
	 * @return
	 * @author:炸鸡
	 * @date:2019年8月7日
	 * @description:根据pid查询商品信息
	 */
	public Product selectProductByPid(String pid);


	public int delete(String pid);
    
}
