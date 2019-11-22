package com.shop.mapper;

import com.shop.pojo.Categorys;
import com.shop.pojo.CategorysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategorysMapper {
    int countByExample(CategorysExample example);

    int deleteByExample(CategorysExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Categorys record);

    int insertSelective(Categorys record);

    List<Categorys> selectByExample(CategorysExample example);

    Categorys selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Categorys record, @Param("example") CategorysExample example);

    int updateByExample(@Param("record") Categorys record, @Param("example") CategorysExample example);

    int updateByPrimaryKeySelective(Categorys record);

    int updateByPrimaryKey(Categorys record);
}