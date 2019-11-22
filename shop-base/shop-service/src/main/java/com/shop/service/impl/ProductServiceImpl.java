package com.shop.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.ProductMapper;
import com.shop.pojo.Product;
import com.shop.pojo.SearchProperty;
import com.shop.service.ProductService;

/**
 * @ClassName: ProductServiceImpl
 * @author: snypxk
 * @Description: 商品表（product）的服务接口实现类
 * @date: 2019年8月2日
 * @Other:
 */

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public int insertProduct(Product product) {
		return productMapper.insertSelective(product);
	}

	@Override
	public int updateProductByPid(Product product) {
		return productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public List<Product> queryAllProductWithIMG() {
		return productMapper.selectAllPoductWithImage();
	}

	@Override
	public Product queryPoductWithImageByPid(String pid) {
		return productMapper.selectPoductWithImageByPid(pid);
	}

	// =============根据 男-女-儿童 分类查询==========//
	@Override
	public List<Product> queryProductByMan() {
		List<Product> list = productMapper.queryProductByMan();
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByWomen() {
		List<Product> list = productMapper.queryProductByWomen();
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByChildren() {
		List<Product> list = productMapper.queryProductByChildren();
		return list.size() > 0 ? list : null;
	}
	// =====================END=====================//

	// ====================模糊查询=================//
	@Override
	public List<Product> queryProductByVague(String vagueKey) {
		List<Product> list = productMapper.queryProductByVague(vagueKey);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVague(String[] vagueKeys) {
		String keys = "";
		for (String vagueKey : vagueKeys) {
			keys += vagueKey + "%";
		}
		List<Product> list = productMapper.queryProductByVague(keys);
		return list.size() > 0 ? list : null;
	}
	// =====================END=====================//

	// ============ 根据价格排序范围查询 ============//
	@Override
	public List<Product> selectAllProductsWithoutIMG() {
		return productMapper.selectByExample(null);
	}

	@Override
	public List<Product> queryProductByGTRange(BigDecimal price) {
		return null;
	}

	@Override
	public List<Product> queryProductByLTRange(BigDecimal price) {
		return null;
	}

	@Override
	public List<Product> queryProductByRange(BigDecimal lowprice, BigDecimal highprice) {
		return null;
	}

	@Override
	public List<Product> queryProductByShopPriceASC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryProductByShopPriceDESC() {
		// TODO Auto-generated method stub
		return null;
	}
	// =====================END=====================//

	// ============== 根据上架时间查询 =============//
	@Override
	public List<Product> queryProductByPdateASC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryProductByPdateDESC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryProductByPsaleASC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> queryProductByPsaleDESC() {
		// TODO Auto-generated method stub
		return null;
	}
	// =====================END=====================//

	// =================== 商品首页查询===============//
	@Override
	public List<Product> selectManConcentrationTop5ByPdateDESC() {
		List<Product> list = productMapper.selectManConcentrationTop5ByPdateDESC();
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> selectWomanConcentrationTop5ByPdateDESC() {
		List<Product> list = productMapper.selectWomanConcentrationTop5ByPdateDESC();
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> selectChildConcentrationTop5ByPdateDESC() {
		List<Product> list = productMapper.selectChildConcentrationTop5ByPdateDESC();
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByHot() {
		List<Product> list = productMapper.queryProductByHot();
		return list.size() > 0 ? list : null;
	}
	// =====================END=====================//

	// ============== 根据 品牌分类查询商品===========//
	@Override
	public List<Product> queryProductByBrandBid(BigDecimal bid) {
		List<Product> list = productMapper.queryProductByBrandBid(bid);
		return list.size() > 0 ? list : null;
	}
	// =====================END=====================//

	@Override
	public List<Product> queryProductByLike() {
		List<Product> list = productMapper.queryProductByLike();
		return list.size() > 0 ? list : null;
	}

	
	// ===================== 搜索页面查询 ===============//
	@Override
	public List<Product> queryProductByVagueByNameASC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByNameASC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueByNameDESC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByNameDESC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueByPDATEASC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByPDATEASC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueByPDATEDESC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByPDATEDESC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueByShopPriceASC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByShopPriceASC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueByShopPriceDESC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueByShopPriceDESC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueBySaleASC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueBySaleASC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	@Override
	public List<Product> queryProductByVagueBySaleDESC(SearchProperty searchProperty) {
		List<Product> list = productMapper.queryProductByVagueBySaleDESC(searchProperty);
		return list.size() > 0 ? list : null;
	}

	// ===================== 搜索页面查询 END  ================//
	
	@Override
	public List<Product> getProductListByPidList(List<String> pidList) {
		List<Product> list = productMapper.getProductListByPidList(pidList);
		return list.size() > 0 ? list : null;
	}
	
	@Override
	public Product selectProductByPrimaryKeySelective(String pid) {
		
		return productMapper.selectByPrimaryKey(pid);
	}
	
	// ====================== 安 ===================//
	
	@Override
	public List<Product> queryAllProductWithStock() {
		return productMapper.selectAllPoductWithStock();
	}

	@Override
	public Product queryPoductWithStockByPid(String pid) {
		return productMapper.selectPoductWithStockByPid(pid);
	}

	

	@Override
	public List<Product> queryProductLikePnameWithStock(String pname) {
		String pname2 = "%"+pname+"%";
		return productMapper.selectProductLikePnameWithStock(pname2);
	}

	@Override
	public Product selectProductByPid(String pid) {
		return productMapper.selectByPrimaryKey(pid);
	}
	// ==================== 安END ====================//

	@Override
	public int delete(String pid) {
		return productMapper.deleteByPrimaryKey(pid);
	}
}
