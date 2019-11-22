package com.shop.mapper;

import com.shop.pojo.Brands;
import com.shop.pojo.BrandsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandsMapper {
    int countByExample(BrandsExample example);

    int deleteByExample(BrandsExample example);

    int deleteByPrimaryKey(BigDecimal bid);

    int insert(Brands record);

    int insertSelective(Brands record);

    List<Brands> selectByExample(BrandsExample example);

    Brands selectByPrimaryKey(BigDecimal bid);

    int updateByExampleSelective(@Param("record") Brands record, @Param("example") BrandsExample example);

    int updateByExample(@Param("record") Brands record, @Param("example") BrandsExample example);

    int updateByPrimaryKeySelective(Brands record);

    int updateByPrimaryKey(Brands record);
    
    //根据BID排序升序 - 查询前3项记录 2019-8-3
    List<Brands> queryTop3BrandsOrderByBidASC();
}