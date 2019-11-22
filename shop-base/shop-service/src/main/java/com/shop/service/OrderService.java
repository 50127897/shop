package com.shop.service;

import java.util.List;

import com.shop.pojo.Orderitem;
import com.shop.pojo.Orderss;

/**
 * @ClassName: OrderService
 * @author: snypxk
 * @Description: Orders[s订单表]的服务接口类
 * @date: 2019年8月7日
 * @Other:
 */
public interface OrderService {

	/**
	 * @Description: 插入订单 - 插入订单后,
	 * 
	 * 		=======先插入订单:
	 * 				orderid	   - UUID
	 * 				ordertime  - new Date()
	 * 				total	   - BigDecimal		
	 * 				orderstate - BigDecimal  1-未付款	2-已付款未发货
	 * 				tdId	   - String		  收货信息编号(提交订单时要传递过来,在选择好订单后,要有显示用户对应的收货信息表供用户选择)
	 * 				uid		   - uid  在session里获得
	 * 				
	 * 				调用服务:	OrderService	的方法	public int insertOrder(Orderss order);
	 *      =======再插入子订单项:  
	 *      							oiId 		-  订单项ID  UUID
	 * 									orderid 	-  订单项所在订单的ID	  order.getOrderid
	 * 								    quantity 	-  一份商品的数量
	 * 								    oiTotal 	-  小计  quantity *  Product.shopPrice     由pid 得到 Product 再得到 Product.shopPrice
	 * 									pid    		-  商品ID							   	
	 * 									commentflag -  评价状态 - 0  未评价 String
	 * 									productspec -  商品规格 (String类型)
	 * 					
	 * 									调用服务:  OrderitemService   的方法 	public int insertOrderItem(Orderitem orderitem);
	 * 
	 * 		=======插入子订单项后要返回一个新页面,供用户付款,用户选择付款方式进行付款后,付款成功并更新 orderstate - BigDecimal(2)
	 * 				然后返回跳转首页
	 * @param order
	 * @return
	 * @return int
	 */
	public int insertOrder(Orderss order);

	/**
	 * @Description: 查找一个用户已结束的订单 - 订单状态为4 如果未评价,则可评价
	 * @param pid
	 * @return
	 * @return List<Orderss>
	 */
	public List<Orderss> queryOrderByUseridIsDone(String userid);

	/**
	 * @Description: 查找一个用户未结束的订单 - 订单状态为1,2,3 1 - 提示待付款 2 - 提示待发货 3 - 可查看物流
	 * @param pid
	 * @return
	 * @return List<Orderss>
	 */
	public List<Orderss> queryOrderByUseridIsNotDone(String userid);

	/**
	 * @Description: 根据用户ID 获得一个用户的所有订单信息 - 返回一个订单列表
	 * @param userid
	 * @return
	 * @return List<Orderss>
	 */
	public List<Orderss> getOrderOrderitemProductByUserid(String userid);

	/**
	 * @Description: 更新订单 - 根据订单ID 只可以更新: 下单时间（ordertime） 总价（total） 订单状态（orderstate）
	 *               收货信息编号（td_id）
	 * @param orderss
	 * @return
	 * @return int
	 */
	public int updateOrderByOid(Orderss orderss);

	/**
	 * @Description: 删除(取消)订单 - 根据订单ID [ 只可取消未付款orderstate=1, 已付款未发货的订单 orderstate=2
	 *               ] 注意:删除的前提是把该订单下的所有子订单删除
	 * @param oid
	 * @return
	 * @return int
	 */
	public int deleteOrderByOid(String oid);
}
