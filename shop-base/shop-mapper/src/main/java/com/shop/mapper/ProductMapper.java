package com.shop.mapper;

import com.shop.pojo.Product;
import com.shop.pojo.ProductExample;
import com.shop.pojo.SearchProperty;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    
    /**
     * @Description: 获取 所有商品的 信息及其对应的 一张或多张图片路径
     * @return
     * @return List<Product>
     */
    List<Product> selectAllPoductWithImage();
    
    
    /**
     * @Description: 获取 一个商品[其PID为pid]的 信息及其对应的 一张或多张图片路径
     * @param pid
     * @return
     * @return Product
     */
    Product selectPoductWithImageByPid(String pid);
    
    
    /**
     * @Description: 获取首页5项男子精选商品
     * @return
     * @return List<Product>
     */
    List<Product> selectManConcentrationTop5ByPdateDESC();
    
    
    /**
     * @Description: 获取首页5项女子精选商品
     * @return
     * @return List<Product>
     */
    List<Product> selectWomanConcentrationTop5ByPdateDESC();
    
    
    /**
     * @Description: 获取首页5项儿童精选商品
     * @return
     * @return List<Product>
     */
    List<Product> selectChildConcentrationTop5ByPdateDESC();
    
    
    /**
     * @Description: 获取男士分类商品
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByMan();
    
    
    /**
     * @Description: 获取女士分类商品
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByWomen();
    
    
    /**
     * @Description: 获取儿童分类商品
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByChildren();
    
    
    /**
     * @Description: 查询8件热门商品  2019-8-5
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByHot();
   
    
    /**
     * @Description: 根据品牌查询商品
     * @param bid - 品牌ID
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByBrandBid(BigDecimal bid);

    
    /**
     * @Description: 模糊查询 - 传入关键字 不需要 加模式匹配符号 % % 
     * @param vagueKey  -  查询关键字
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVague(String vagueKey);
    
    
    /**
     * @Description: 猜你喜欢
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByLike();
    
    
    
    /**
     * @Description: 根据搜索关键字  -  按名称升序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByNameASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按名称降序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByNameDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按上架日期升序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByPDATEASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按上架日期降序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByPDATEDESC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按价格升序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByShopPriceASC(SearchProperty searchProperty);
    
    
    /**
     * @Description: 根据搜索关键字  -  按价格降序查询  2019-8-7
     * @return
     * @return List<Product>
     */
    List<Product> queryProductByVagueByShopPriceDESC(SearchProperty searchProperty);
    
    
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
    
    
    //======================== 安 ============================
	List<Product> selectAllPoductWithStock();

	Product selectPoductWithStockByPid(String pid);

	List<Product> selectProductLikePnameWithStock(String pname);
    //======================== 安END============================
    
}