<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>库存管理</title>
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
		<script type="text/javascript">  
		
			function del(param)
			
			{
			
			         if(window.confirm("您确定要删除"+"球鞋"+"吗？")){
			
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
		                    <h1 class="page-header">库存列表 </h1>
		                </div>
		            </div>
					
		    <div class="panel panel-default">
		    	<div class="panel-body">
		    		<div class="selete">
		    			<form id="loginform" action="${pageContext.request.contextPath}/backstage/searchStockBackStage" method="post" >
		    				<div class="form-group">
		    					<ul class="list-inline">
		    					<li><input type="text" name="pname" class="form-control" placeholder="商品名"></li>
		    					<li><input type="submit"  class="btn btn-default" value="查询"></li>			
		    					</ul>
		    				</div>				
		    			</form>
		    	
			
		<table class="table table-striped ">
		${msg7}
		<thead >
			
			<th>商品名称</th>
			<th>商品规格</th>
			<th>商品库存</th>
		</thead>
		<tbody >
		
			<c:forEach var="product" items="${pageInfo.list}"  > 
				<c:forEach var="ProductSpec" items="${product.productSpecs}"  > 
					<tr class="hehe">
						
						<td>${product.pname}</td>
						<td>${ProductSpec.psSpec}</td>
						<td>${ProductSpec.psStore}</td>				
						<td>
							<div class="btn-group">
							<a href="${pageContext.request.contextPath}/backstage/updateStockPageBackStage?pid=${product.pid}&psId=${ProductSpec.psId}&pname=${product.pname}" class="btn btn-default">修改</a>
							<a href="${pageContext.request.contextPath}/backstage/deleteStockBackStage?psId=${ProductSpec.psId}" class="btn btn-danger">删除</a>
				    			
							</div>
							</td>
					</tr>
				</c:forEach> 
			</c:forEach>   		
		</tbody>
		</table>
		
						<ul class="pagination">
							<li><a href="${pageContext.request.contextPath}/backstage/stockBackStage?pn=1">首页</a></li>
							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/stockBackStage?pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == pageInfo.pageNum }">
									<li class="active"><a href="#">${page_Num}</a></li>
								</c:if>
								<c:if test="${page_Num != pageInfo.pageNum }">
									<li><a href="${pageContext.request.contextPath}/backstage/stockBackStage?pn=${page_Num }">${page_Num}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/stockBackStage?pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<li><a href="${pageContext.request.contextPath}/backstage/stockBackStage?pn=${pageInfo.pages }">末页</a></li>
						</ul>
		
			
			
			
		            
		
		            
		            </div>
		   
		</div>
		</div>
		   
		</div>    
		           
		    </div>
		   
		</div>
		
	</body>
</html>
