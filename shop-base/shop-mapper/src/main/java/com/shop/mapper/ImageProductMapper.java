package com.shop.mapper;

import com.shop.pojo.ImageProduct;
import com.shop.pojo.ImageProductExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageProductMapper {
    int countByExample(ImageProductExample example);

    int deleteByExample(ImageProductExample example);

    int deleteByPrimaryKey(BigDecimal ipId);

    int insert(ImageProduct record);

    int insertSelective(ImageProduct record);

    List<ImageProduct> selectByExample(ImageProductExample example);

    ImageProduct selectByPrimaryKey(BigDecimal ipId);

    int updateByExampleSelective(@Param("record") ImageProduct record, @Param("example") ImageProductExample example);

    int updateByExample(@Param("record") ImageProduct record, @Param("example") ImageProductExample example);

    int updateByPrimaryKeySelective(ImageProduct record);

    int updateByPrimaryKey(ImageProduct record);
}