package com.shop.mapper;

import com.shop.pojo.TakeDelivery;
import com.shop.pojo.TakeDeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeDeliveryMapper {
    int countByExample(TakeDeliveryExample example);

    int deleteByExample(TakeDeliveryExample example);

    int deleteByPrimaryKey(String tdId);

    int insert(TakeDelivery record);

    int insertSelective(TakeDelivery record);

    List<TakeDelivery> selectByExample(TakeDeliveryExample example);

    TakeDelivery selectByPrimaryKey(String tdId);

    int updateByExampleSelective(@Param("record") TakeDelivery record, @Param("example") TakeDeliveryExample example);

    int updateByExample(@Param("record") TakeDelivery record, @Param("example") TakeDeliveryExample example);

    int updateByPrimaryKeySelective(TakeDelivery record);

    int updateByPrimaryKey(TakeDelivery record);
}