<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<script src="js/jquery-1.10.2.js"></script>
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
		                    <h1 class="page-header">修改订单</h1>
		                </div>
		            </div>
		   
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
						
							<div class="form-group">
								
							</div>				
						
				
		
		<form action="${pageContext.request.contextPath}/backstage/updateOrderBackStage" method="post" >
							<table class="table table-striped ">
								<thead >
									
									<th width="100px">订单编号</th>
									<th width="100px">下单时间</th>
									<th width="80px">订单总价</th>
									<th width="80px">订单状态</th>
									<th width="80px">收货人</th>
									<th>收货人电话</th>
								</thead>
									<tbody >
											
										<tr class="hehe">
											
											<td>
												<input type="hidden" name="orderid" value="${orders.orderid}">
												${orders.orderid}
											</td>
											
											<td>
												${ordertime}
<%-- 												<input  type="date" name="ordertime" value="${ordertime}" /> --%>
											</td>
											
											
											<td>
												
												<input type="hidden" name="pn" value="${pn}">
												<c:if test="${orders.orderstate eq '1'}">
													<input type="text" name="total" value="${orders.total}" />
												</c:if>
												<c:if test="${orders.orderstate eq '2'}">
													${orders.total}
													<input type="hidden" name="total" value="${orders.total}">
												</c:if>
												
											</td>
											<td>
												<c:if test="${orders.orderstate eq '1'}">
													未付款
												</c:if>
												<c:if test="${orders.orderstate eq '2'}">
													已付款
												</c:if>
												<c:if test="${orders.orderstate eq '3'}">
													已发货
												</c:if>
												<c:if test="${orders.orderstate eq '4'}">
													订单已完成
												</c:if>
											</td>	
							
											<td><input type="text" name="tdName" value="${takeDelivery.tdName}" /></td>
											<td>
												<input type="text" name="tdTelephone" value="${takeDelivery.tdTelephone}" />
												<input type="hidden" name="orderstate" value="${orders.orderstate}">
												<input type="hidden" name="tdId" value="${takeDelivery.tdId}">
											</td>
												
								    		
										</tr>	
									</tbody>
									<thead >
									<th >收货地址</th>
									</thead>
									<tr>
										<td colspan="7"><input type="text" name="tdAddress" value="${takeDelivery.tdAddress}" size="100"/></td>
									</tr>
							</table>
			
								<input type="submit" value="修改" class="btn btn-default" />
								<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a>
		            </form>
			   		 </div>
			    
			</div>
			</div>
			</div>
		</div>
		</div>
	</body>
</html>
