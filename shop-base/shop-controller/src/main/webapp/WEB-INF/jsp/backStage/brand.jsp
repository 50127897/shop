<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>添加商品</title>
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
		
		function del(param)
		
		{
		
		         if(window.confirm("您确定要删除"+"耐克"+"吗？")){
		
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
		                    <h1 class="page-header">品牌管理</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				<div class="panel-body">
						<form id="loginform" action="${pageContext.request.contextPath}/backstage/searchBrandsByBname?pn=1" method="post" >
							<div class="form-group">
								<ul class="list-inline">
								<li><input type="text" name="bname" class="form-control" placeholder="品牌名"></li>
								<li><input type="submit"  class="btn btn-default" value="查询"></li>
								<li><a class="btn btn-default" href="${pageContext.request.contextPath}/backstage/addbrandPageBackStage" role="button">添加品牌</a></li>				
								</ul>
							</div>				
						</form>
					<table class="table table-striped ">
						<thead >
							<th>品牌图片</th>
							<th>品牌名</th>
							<th>管理</th>
						</thead>
		<tbody >
		${tips9} 
			<c:forEach items="${pageInfo.list }" var="brands">
				<tr class="hehe">
					
						<td><img width="40" height="30"  src="/pic/${brands.brRoute}"></td>
						<td>${brands.bname}</td>
					<td>
						<div class="btn-group">
		    			<a href="${pageContext.request.contextPath}/backstage/updateBrandPageBackStage?bid=${brands.bid}" class="btn btn-default">修改</a>
		    			<a href="${pageContext.request.contextPath}/backstage/deleteBrandBackStage?bid=${brands.bid}" class="btn btn-danger">删除</a>
		    			
		    			</div>
		    		</td>
					
					
				</tr>
			</c:forEach>
		</tbody>
		</table>
						<ul class="pagination">
							<li><a href="${pageContext.request.contextPath}/backstage/brandBackStage?pn=1">首页</a></li>
							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/brandBackStage?pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == pageInfo.pageNum }">
									<li class="active"><a href="#">${page_Num}</a></li>
								</c:if>
								<c:if test="${page_Num != pageInfo.pageNum }">
									<li><a href="${pageContext.request.contextPath}/backstage/brandBackStage?pn=${page_Num }">${page_Num}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/brandBackStage?pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<li><a href="${pageContext.request.contextPath}/backstage/brandBackStage?pn=${pageInfo.pages }">末页</a></li>
						</ul>
				</div>
			</div>
      
		    </div>
		    <!-- /. PAGE WRAPPER  -->
		</div>
	</body>
</html>
