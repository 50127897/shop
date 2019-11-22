<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商品管理</title>
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
		
		         if(window.confirm("您确定要下架"+"球鞋"+"吗？")){
		
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
		                    <h1 class="page-header">
		                        商品列表 
								<!-- <small>Summary of your App</small> -->
		                    </h1>
		                </div>
		            </div>
					
		    <div class="panel panel-default">
		    	<div class="panel-body">
		    		<div class="selete">
		    		<form action="${pageContext.request.contextPath}/backstage/searchproductbackstage" method="post">
		    				<div class="form-group">
		    					<ul class="list-inline">
		    					<li><input type="text" name="name" class="form-control" placeholder="商品名" value="${productName}"></li>
		    					<li><input type="submit" placeholder="" class="btn btn-default" value="查询"></li>
		    					<li><a class="btn btn-default" href="${pageContext.request.contextPath}/backstage/addProductPagebackstage" role="button">添加商品</a></li>				
		    						
		    					</ul>
		    				</div>	
		    		</form>
			
		<table class="table table-striped ">
		<thead >
			<th>商品图片</th>
			<th>商品名称</th>
			<th>商城价格</th>
			<th>市场价格</th>
			<th>上架时间</th>
			<th width="200px">商品描述</th>
			<th>商品标记</th>
			<th>商品品牌</th>
			<th>商品类别</th>
			<th>已售数量</th>
		</thead>
		<tbody >
		
			<c:forEach var="product" items="${pageInfo.list}"  >  		
			<tr class="hehe">
				<td><img width="100" height="80" src="/pic/${product.imageProducts[0].ipRoute}" ></td>
				<td>${product.pname}</td>
				<td>${product.shopPrice}</td>
				<td>${product.marketPrice}</td>
				<td><fmt:formatDate value="${product.pdate}" pattern="yyyy-MM-dd "/></td>    			
				<td>${product.pdesc}</td>
				<td>${product.pflag}</td>
				<td>
					<c:forEach items="${brandslist}" var="brands">
						<c:if test="${brands.bid == product.bid}">${brands.bname}</c:if>
					</c:forEach>
				</td>
				<td>
					<c:forEach items="${categrylist}" var="categry">
						<c:if test="${categry.cid == product.cid}">${categry.cname}</c:if>
					</c:forEach>
				</td>
				<td>${product.psale}</td>			
				<td>
					<div class="btn-group">
					<a href="${pageContext.request.contextPath}/backstage/updateProductPageBackStage?pid=${product.pid}&pn=${pageInfo.pageNum}" class="btn btn-default">修改</a>
					<a href="${pageContext.request.contextPath}/backstage/addStockPageBackStage?pid=${product.pid}" class="btn btn-default">添加库存</a>
					<a href="${pageContext.request.contextPath}/backstage/searchStockBackStageByPid?pid=${product.pid}"  class="btn btn-primary">查看库存</a>
					<c:if test="${product.pflag =='1'}">
						<a href="${pageContext.request.contextPath}/backstage/updatepflag?pid=${product.pid}&pn=${pageInfo.pageNum }" class="btn btn-danger">下架</a>
					</c:if>
					<c:if test="${product.pflag =='0'}">
						<a href="${pageContext.request.contextPath}/backstage/updatepflag?pid=${product.pid}&pn=${pageInfo.pageNum }" class="btn btn-primary">上架</a>
					</c:if>
					</div>
					</td>
			</tr>
			</c:forEach>   		
		</tbody>
		</table>
		
						<ul class="pagination">
							<li><a href="${pageContext.request.contextPath}/backstage/searchproductbackstage?productName=${productName}&pn=1">首页</a></li>
							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchproductbackstage?productName=${productName}&pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == pageInfo.pageNum }">
									<li class="active"><a href="#">${page_Num}</a></li>
								</c:if>
								<c:if test="${page_Num != pageInfo.pageNum }">
									<li><a href="${pageContext.request.contextPath}/backstage/searchproductbackstage?productName=${productName}&pn=${page_Num }">${page_Num}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchproductbackstage?productName=${productName}&pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<li><a href="${pageContext.request.contextPath}/backstage/searchproductbackstage?productName=${productName}&pn=${pageInfo.pages }">末页</a></li>
						</ul>
		
			
			
			
		            
		
		            
		                
		         
		    </div>
		</div>
		</div>
		</div>
		</div>
		</div>
		
		
		
		
		
		
	</body>
</html>
