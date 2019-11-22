package com.shop.mapper;

import com.shop.pojo.OrderProperty;
import com.shop.pojo.Orderss;
import com.shop.pojo.OrderssExample;
import com.shop.pojo.Users;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderssMapper {
    int countByExample(OrderssExample example);

    int deleteByExample(OrderssExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(Orderss record);

    int insertSelective(Orderss record);

    List<Orderss> selectByExample(OrderssExample example);

    Orderss selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") Orderss record, @Param("example") OrderssExample example);

    int updateByExample(@Param("record") Orderss record, @Param("example") OrderssExample example);

    int updateByPrimaryKeySelective(Orderss record);

    int updateByPrimaryKey(Orderss record);
    
    
    /**
     * @Description: 根据用户ID 获得一个用户的所有订单信息 - 返回一个用户
     * @param userid
     * @return
     * @return Users
     */
    Users getUserOrderOrderitemProduct(String userid);
    
    
    
    /**
     * @Description: 根据用户ID 获得一个用户的所有订单信息 - 返回一个订单列表
     * @param userid
     * @return
     * @return List<Orderss>
     */
    List<Orderss> getOrderOrderitemProduct(String userid);
    
    
    /**
     * @Description: 根据用户ID 与 订单ID 返回对应订单项的商品详细信息  - 返回一个订单列表
     * @param userid
     * @return
     * @return List<Orderss>
     */
    List<Orderss> getOrderitemProductByUseridAndOrderid(OrderProperty orderProperty);
    
    
    //安
    List<Orderss> selectAllOrdersWithTakeDelivery();
	
	List<Orderss> selectAllOrdersWithTakeDeliveryByOrderState(BigDecimal OrderState);

	List<Orderss> selectAllOrdersWithTakeDeliveryLike(String orderid);
}