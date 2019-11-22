package com.shop.mapper;

import com.shop.pojo.Messages;
import com.shop.pojo.MessagesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessagesMapper {
    int countByExample(MessagesExample example);

    int deleteByExample(MessagesExample example);

    int deleteByPrimaryKey(BigDecimal mid);

    int insert(Messages record);

    int insertSelective(Messages record);

    List<Messages> selectByExample(MessagesExample example);

    Messages selectByPrimaryKey(BigDecimal mid);

    int updateByExampleSelective(@Param("record") Messages record, @Param("example") MessagesExample example);

    int updateByExample(@Param("record") Messages record, @Param("example") MessagesExample example);

    int updateByPrimaryKeySelective(Messages record);

    int updateByPrimaryKey(Messages record);
}