package com.shop.mapper;

import com.shop.pojo.Collections;
import com.shop.pojo.CollectionsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionsMapper {
    int countByExample(CollectionsExample example);

    int deleteByExample(CollectionsExample example);

    int deleteByPrimaryKey(BigDecimal collectId);

    int insert(Collections record);

    int insertSelective(Collections record);

    List<Collections> selectByExample(CollectionsExample example);

    Collections selectByPrimaryKey(BigDecimal collectId);

    int updateByExampleSelective(@Param("record") Collections record, @Param("example") CollectionsExample example);

    int updateByExample(@Param("record") Collections record, @Param("example") CollectionsExample example);

    int updateByPrimaryKeySelective(Collections record);

    int updateByPrimaryKey(Collections record);
    
    
    /**
     * @Description: 根据用户userid 获取用户 收藏的商品 pid 集合
     * @param userid
     * @return
     * @return List<String>
     */
    List<String> getProductPidListByUserid(String userid);
    
    
    
    /**
     * @Description: 根据用户userid 获取用户 收藏的商品Collectid集合
     * @param userid
     * @return  by家
     */
    List<String> getCollectidListByUserid(String userid);
}