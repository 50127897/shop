package com.shop.mapper;

import com.shop.pojo.Logistics;
import com.shop.pojo.LogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsMapper {
    int countByExample(LogisticsExample example);

    int deleteByExample(LogisticsExample example);

    int deleteByPrimaryKey(String loid);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsExample example);

    Logistics selectByPrimaryKey(String loid);

    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
    
    /**
     * @Description: 根据订单编号 orderid 查询其物流信息 按时间升序
     * @param orderid
     * @return
     * @return List<Logistics>
     */
    List<Logistics> queryLogisticsByOrderidASC(String orderid);
}