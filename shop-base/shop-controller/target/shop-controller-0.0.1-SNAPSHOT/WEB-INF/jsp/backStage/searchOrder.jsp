<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>订单管理</title>
		<link href="css/bootstrap.css" rel="stylesheet" />
			<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
			<link href="css/custom-styles.css" rel="stylesheet" />
			<link href="css/font-awesome.css" rel="stylesheet" />
			<link href="js/morris/morris-0.4.3.min.css" rel="stylesheet" />
			
			
			<!-- JS Scripts-->
		<!-- jQuery Js -->
		<script src="js/jquery-3.4.1.min.js"></script>
		<!-- Bootstrap Js -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Metis Menu Js -->
		<script src="js/jquery.metisMenu.js"></script>
		<!-- Morris Chart Js -->
		<script src="js/morris/raphael-2.1.0.min.js"></script>
		<script src="js/morris/morris.js"></script>
		<!-- Custom Js -->
		<script src="js/custom-scripts.js"></script>
		<script type="text/javascript">
		
		
		
		$(function(){
		
		$(".btn.btn-primary").click(function(){
		 	var orderid = $(this).attr('id');
			var btn = $(this).attr('value');
			var th = "<tr><th>商品</th><th>名称</th><th>单价</th><th>数量</th><th>&nbsp&nbsp&nbsp规格</th><th>&nbsp&nbsp&nbsp小计</th></tr>";
			var url="orderDetails?orderid="+orderid;
	        $.ajax({
				url:url,
				type:"post",
				dataType:"json",    //此处注明返回类型为json格式
				success:function(data){
// 					$("#div"+orderid).children().remove();//清除原有的元素
					
					 $.each(data, function(index, item){//遍历json中每一个单元，随即为“tbody”添加元素
					 	
						if(btn == "订单详情"){
		//					$("#div"+orderid).append("<img width='60' height='65' src='${pageContext.request.contextPath}/products/1/c_0028.jpg'>&nbsp;xxxx&nbsp;998<br/>");
							$("#div"+orderid).append(th);
							$("#div"+orderid).append("<tr><td><img width='40' height='30' src='/pic/"+item.product.imageProducts[0].ipRoute+"'>&nbsp;&nbsp&nbsp&nbsp</td><td>"+item.product.pname+"&nbsp;&nbsp&nbsp&nbsp</td><td>"+item.product.shopPrice+"&nbsp&nbsp&nbsp&nbsp</td><td>"+item.quantity+"&nbsp&nbsp&nbsp&nbsp</td><td>"+item.productspec+"&nbsp&nbsp&nbsp&nbsp</td><td>"+item.oiTotal+"</td></tr>");
							$("#"+orderid).val("关闭");
						}else{
							$("#div"+orderid).children().remove();
							$("#"+orderid).val("订单详情");
						}
				});
				}
			})
		});
	})
		
			function showDetail(oid){
				var $val = $("#but"+oid).val();
				var th = "<tr><th>商品</th><th>名称</th><th>单价</th><th>数量</th></tr>";
				
				if($val == "订单详情"){
					// ajax 显示图片,名称,单价,数量
//					$("#div"+orderid).append("<img width='60' height='65' src='${pageContext.request.contextPath}/products/1/c_0028.jpg'>&nbsp;xxxx&nbsp;998<br/>");
					$("#div"+orderid).append(th);
					$("#div"+orderid).append("<tr><td><img width='40' height='30' src='img/1.png'>&nbsp;&nbsp&nbsp&nbsp</td><td>篮球鞋&nbsp;&nbsp&nbsp&nbsp</td><td>998&nbsp&nbsp&nbsp&nbsp</td><td>1</td></tr>");
					$("#but"+orderid).val("关闭");
				}else{
					$("#div"+orderid).html("");
					$("#but"+orderid).val("订单详情");
				}
			}
			
			function del(param)
		
			{
		
		         if(window.confirm("您确定要删除"+"订单"+"吗？")){
		
		   		 document.location="DeleteNew?id="+param
		
			}
		
		 }  
		</script>
	</head>
	<body>
		
		<div id="wrapper">
		    <%@ include file="header.jsp" %>
	        <!--/. NAV TOP  -->
	        <%@ include file="left.jsp" %>
		    
		    <div id="page-wrapper">
		        <div id="page-inner">
		
		
		            <div class="row">
		                <div class="col-md-12">
		                    <h1 class="page-header">订单管理</h1>
		                </div>
		            </div>
		   
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
						<form  action="${pageContext.request.contextPath}/backstage/searchOrderBackStage" method="post" >
							<div class="form-group">
								<ul class="list-inline">
								<li><input type="text" name="orderid" class="form-control" placeholder="订单编号" value="${orderid}"></li>
								<li><input type="submit" placeholder="" class="btn btn-default" value="查询"></li>				
								</ul>
							</div>				
						</form>
							<table class="table table-striped ">
								<thead >
									
									<th width="100px">订单编号</th>
									<th width="100px">下单时间</th>
									<th width="80px">订单总价</th>
									<th width="80px">订单状态</th>
									<th width="80px">收货人</th>
									<th width="400px">收货地址</th>
									<th>收货人电话</th>
									<th style="text-align: center;">订单详情</th>
								</thead>
									<tbody >
										<c:forEach var="order" items="${pageInfo.list}"  >  		
										<tr class="hehe">
											
											<td>${order.orderid}</td>
											<td><fmt:formatDate value="${order.ordertime}" pattern="yyyy-MM-dd "/></td>
											<td>${order.total}</td>  
											<td>
												<c:if test="${order.orderstate eq '1'}">
													未付款
												</c:if>
												<c:if test="${order.orderstate eq '2'}">
													已付款
												</c:if>
												<c:if test="${order.orderstate eq '3'}">
													已发货
												</c:if>
												<c:if test="${order.orderstate eq '4'}">
													订单已完成
												</c:if>
											</td>			
											<td>${order.takeDelivery.tdName}</td>
											<td>${order.takeDelivery.tdAddress}</td>
											<td>${order.takeDelivery.tdTelephone}</td>
											<td align="center" style="HEIGHT: 22px">
											
											
											
												<input class="btn btn-primary" type="button" value="订单详情" id="${order.orderid}" />
												
												
												
												
												
												
												<c:if test="${order.orderstate eq '1'}">
														<input class="btn btn-default" type="button" value="更改订单" id="but${o.oid}" onclick="window.location='${pageContext.request.contextPath}/backstage/updateOrderPageBackStage?tdId=${order.takeDelivery.tdId}&orderid=${order.orderid}&pn=${pageInfo.pageNum}'"/>
														<input onclick="window.location='${pageContext.request.contextPath}/backstage/deleteOrderBackStage?tdId=${order.takeDelivery.tdId}&orderid=${order.orderid}&orderstate=${order.orderstate}&pn=${pageInfo.pageNum}'" class="btn btn-danger" type="button" value="取消订单" id="but${o.oid}" />
												
												</c:if>
												<c:if test="${order.orderstate eq '2'}">
														<input class="btn btn-default" type="button" value="更改订单" id="but${o.oid}" onclick="window.location='${pageContext.request.contextPath}/backstage/updateOrderPageBackStage?tdId=${order.takeDelivery.tdId}&orderid=${order.orderid}&pn=${pageInfo.pageNum}'"/>
														<input class="btn btn-default" type="button" value="发货" id="but${o.oid}" onclick="window.location='${pageContext.request.contextPath}/backstage/deliverOrderBackStage?orderid=${order.orderid}&pn=${pageInfo.pageNum}'"/>
												</c:if>
												<c:if test="${order.orderstate eq '3'}">
													<input class="btn btn-default" type="button" value="查看物流" id="but${o.oid}" onclick="window.location='logistics.jsp'"/>
												</c:if>
												<c:if test="${order.orderstate eq '4'}">
													<input class="btn btn-default" type="button" value="查看物流" id="but${o.oid}" onclick="window.location='logistics.jsp'"/>
												</c:if>
												
												
												
												
												
												
												<div id="div${order.orderid}"></div>
											</td>	
												
								    		
										</tr>
										</c:forEach>   		
										
										
								    		
										
									</tbody>
							</table>
					
								<ul class="pagination">
									<li><a href="${pageContext.request.contextPath}/backstage/searchOrderBackStage?orderid=${orderid}&orderState=${orderState}&pn=1">首页</a></li>
									<c:if test="${pageInfo.hasPreviousPage}">
										<li><a href="${pageContext.request.contextPath}/backstage/searchOrderBackStage?orderid=${orderid}&orderState=${orderState}&pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
												aria-hidden="true">&laquo;</span>
											</a>
										</li>
									</c:if>
									<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
										<c:if test="${page_Num == pageInfo.pageNum }">
											<li class="active"><a href="#">${page_Num}</a></li>
										</c:if>
										<c:if test="${page_Num != pageInfo.pageNum }">
											<li><a href="${pageContext.request.contextPath}/backstage/searchOrderBackStage?orderid=${orderid}&orderState=${orderState}&pn=${page_Num }">${page_Num}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${pageInfo.hasNextPage}">
										<li><a href="${pageContext.request.contextPath}/backstage/searchOrderBackStage?orderid=${orderid}&orderState=${orderState}&pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
												aria-hidden="true">&raquo;</span>
											</a>
										</li>
									</c:if>
									<li><a href="${pageContext.request.contextPath}/backstage/searchOrderBackStage?orderid=${orderid}&orderState=${orderState}&pn=${pageInfo.pages }">末页</a></li>
								</ul>
		            
			   		 </div>
			    	 </div>
			    
			</div>
			</div>
			</div>
			</div>
	</body>
</html>
