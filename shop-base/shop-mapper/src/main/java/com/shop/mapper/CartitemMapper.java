package com.shop.mapper;

import com.shop.pojo.Cartitem;
import com.shop.pojo.CartitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartitemMapper {
    int countByExample(CartitemExample example);

    int deleteByExample(CartitemExample example);

    int deleteByPrimaryKey(String cartitemid);

    int insert(Cartitem record);

    int insertSelective(Cartitem record);

    List<Cartitem> selectByExample(CartitemExample example);

    Cartitem selectByPrimaryKey(String cartitemid);

    int updateByExampleSelective(@Param("record") Cartitem record, @Param("example") CartitemExample example);

    int updateByExample(@Param("record") Cartitem record, @Param("example") CartitemExample example);

    int updateByPrimaryKeySelective(Cartitem record);

    int updateByPrimaryKey(Cartitem record);
}