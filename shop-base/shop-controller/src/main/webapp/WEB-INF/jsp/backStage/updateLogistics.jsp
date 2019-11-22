<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		                    <h1 class="page-header">订单物流</h1>
		                </div>
		            </div>
		   
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
						<form action="/myDemo/login" method="post">
							<div class="form-group">
								
							</div>				
						</form>
				
		
		
							<table class="table table-striped ">
								<thead >
									
									
									<th width="80px">收货人</th>
									<th>收货人电话</th>
									<th colspan="4">收货地址</th>
									
								</thead>
									<tbody >
										<tr class="hehe">
											<td>${takeDelivery.tdName}</td>
											<td>${takeDelivery.tdTelephone}</td>
											<td colspan="4">${takeDelivery.tdAddress}</td>
										</tr>	
									</tbody>
								<thead >
									
									<th width="100px">物流信息</th>
									<th width="100px">时间</th>
									<th width="80px">状态</th>
									<th width="500px">实时地址</th>
								</thead>
									<tbody >
										<c:forEach items="${list}" var="Logistics">
										<tr>
											<td></td>
											<td>${Logistics.date}</td>
											<td>
												<c:if test="${Logistics.lostate eq '1'}">
													待出库
												</c:if>
												<c:if test="${Logistics.lostate eq '2'}">
													已出库待揽收
												</c:if>
												<c:if test="${Logistics.lostate eq '3'}">
													正在发往下一站
												</c:if>
												<c:if test="${Logistics.lostate eq '4'}">
													已到达
												</c:if>
												<c:if test="${Logistics.lostate eq '5'}">
													正在由快递员派送
												</c:if>
												<c:if test="${Logistics.lostate eq '6'}">
													已收货
												</c:if>
											</td>	 
											<td>
												${Logistics.loaddress}
											</td>
											<td>
													<input onclick="window.location='${pageContext.request.contextPath}/backstage/updateLogisticsPageBackStage?orderid=${Logistics.orderid}&tdId=${takeDelivery.tdId}&pn=${pn}&loid=${Logistics.loid}&orderstate=${orderstate}'" class="btn btn-default" type="button" value="修改" id="but${o.oid}" />
													<input onclick="window.location='${pageContext.request.contextPath}/backstage/deleteLogisticsPageBackStage?orderid=${Logistics.orderid}&tdId=${takeDelivery.tdId}&pn=${pn}&loid=${Logistics.loid}&orderstate=${orderstate}'" class="btn btn-danger" type="button" value="删除" id="but${o.oid}" />
												
											</td>
											<td>
													
												
											</td>
										</tr>
										</c:forEach>
										
										
										
									</tbody>
									
									
								<thead >
									
									<th> 添加物流信息</th>
									<th> 状态</th>
									<th> 其他信息</th>
									<th> 操作</th>
								</thead>
									<tbody >
									<form id="loginform" action="${pageContext.request.contextPath}/backstage/updateLogisticsBackStage" method="post">
										<tr>
											<td>
												<input type="hidden" name="tdId" value="${tdId}">
												<input type="hidden" name="orderstate" value="${orderstate}">
												<input type="hidden" name="orderid" value="${orderid}">
												<input type="hidden" name="pn" value="${pn}">
												<input type="hidden" name="loid" value="${logisticsdemo.loid}">
												${msg10}
												<input type="text" name="date" value="${date}">
											</td>
											<td>
												<select name="lostate" >
													<option>---状态---</option>
													<option value="1" ${logisticsdemo.lostate == '1'?"selected='selected'":"" }>待发货</option>
													<option value="2" ${logisticsdemo.lostate == '2'?"selected='selected'":"" }>已出库待揽收</option>
													<option value="3" ${logisticsdemo.lostate == '3'?"selected='selected'":"" }>正在发往下一站</option>
													<option value="4" ${logisticsdemo.lostate == '4'?"selected='selected'":"" }>已到达</option>
													<option value="5" ${logisticsdemo.lostate == '5'?"selected='selected'":"" }>正在由快递员派送</option>
													<option value="6" ${logisticsdemo.lostate == '6'?"selected='selected'":"" }>已收货</option>
												</select>
												
											</td>
											
											<td><input type="text" name="loaddress" value="${logisticsdemo.loaddress}" /></td>
											<td>
												<input  class="btn btn-default" type="submit" value="修改"  />
												<a href="${pageContext.request.contextPath}/backstage/orderBackStage?pn=${pn}&orderstate=${orderstate}"  class="btn btn-danger">返回</a>
											</td>	
												
								    		
										</tr>
									</form>
									</tbody>
							</table>
			
								
		            
			   		 </div>
			    
			</div>
			</div>
	</body>
</html>
