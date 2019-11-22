package com.shop.mapper;

import com.shop.pojo.ProductSpec;
import com.shop.pojo.ProductSpecExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpecMapper {
    int countByExample(ProductSpecExample example);

    int deleteByExample(ProductSpecExample example);

    int deleteByPrimaryKey(BigDecimal psId);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);

    List<ProductSpec> selectByExample(ProductSpecExample example);

    ProductSpec selectByPrimaryKey(BigDecimal psId);

    int updateByExampleSelective(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByExample(@Param("record") ProductSpec record, @Param("example") ProductSpecExample example);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
    
    /**
     * @Description: 根据pid查找规格列表 - 按规格号升序排序
     * @param pid
     * @return
     * @return List<ProductSpec>
     */
    List<ProductSpec> getStockByPid(String pid);
}