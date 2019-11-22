<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
		<title>商城管理中心</title>
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
    </head>
    <body>
    	<nav class="navbar-default navbar-side" role="navigation">
	            <div class="sidebar-collapse">
	                <ul class="nav" id="main-menu">
						<c:if test="${employee.estate == '1'}">
						
	                    <li>
	                        <a  href="index.jsp"><i class="glyphicon glyphicon-user"></i> 用户管理<span class="fa arrow"></span></a>
								<ul class="nav nav-second-level">
									<li>
									    <a href="${pageContext.request.contextPath}/backstage/managerBackStage">管理员管理</a>
									</li>
								    <li>
								        <a href="${pageContext.request.contextPath}/backstage/userBackStage">普通用户管理</a>
								    </li>								
								</ul>
	                    </li>
	                    <li>
	                        <a  href="${pageContext.request.contextPath}/backstage/productBackStage"><i class="glyphicon glyphicon-shopping-cart"></i> 商品管理</a>    
	                    </li>
	                    <li>
						    <a href="${pageContext.request.contextPath}/backstage/brandBackStage"><i class="fa fa-bar-chart-o"></i> 品牌管理</a>
						</li>
						<li>
						    <a href="${pageContext.request.contextPath}/backstage/categoryBackStage"><i class="fa fa-bar-chart-o"></i> 分类管理</a>
						</li>
						<li>
	                        <a href="${pageContext.request.contextPath}/backstage/stockBackStage"><i class="fa fa-bar-chart-o"></i> 规格库存管理</a>
	                    </li>
	                    
	                    </c:if>
	                    
	                    
	                    <c:if test="${employee.estate eq '2'}">
	                    <li>
	                        <a  href="${pageContext.request.contextPath}/backstage/userBackStage"><i class="glyphicon glyphicon-user"></i> 普通用户管理</span></a>
								
	                    </li>
	                    <li>
	                        <a  href="${pageContext.request.contextPath}/backstage/productBackStage"><i class="glyphicon glyphicon-shopping-cart"></i> 商品管理</a>    
	                    </li>
	                    <li>
						    <a href="${pageContext.request.contextPath}/backstage/brandBackStage"><i class="fa fa-bar-chart-o"></i> 品牌管理</a>
						</li>
						<li>
						    <a href="${pageContext.request.contextPath}/backstage/categoryBackStage"><i class="fa fa-bar-chart-o"></i> 分类管理</a>
						</li>
						<li>
	                        <a href="${pageContext.request.contextPath}/backstage/stockBackStage"><i class="fa fa-bar-chart-o"></i> 规格库存管理</a>
	                    </li>
	                    
	                    </c:if>
	                    
	                    
	                   
	                    <li>
	                    	<li>
		                        <a  href="${pageContext.request.contextPath}/backstage/personalBackSatge"><i class="glyphicon glyphicon-user"></i> 个人中心</a>    
		                   		 </li>
		                   	 <li>
		                        <a href="order.jsp"><i class="glyphicon glyphicon-list-alt"></i> 订单管理<span class="fa arrow"></span></a>
		                        <ul class="nav nav-second-level">
	                        		<li>
									    <a href="${pageContext.request.contextPath}/backstage/orderBackStage">全部订单</a>
									</li>
									<li>
									    <a href="${pageContext.request.contextPath}/backstage/orderBackStage?orderState=1">未付款订单</a>
									</li>
								    <li>
								        <a href="${pageContext.request.contextPath}/backstage/orderBackStage?orderState=2">已付款订单</a>
								    </li>	
								    <li>
								        <a href="${pageContext.request.contextPath}/backstage/orderBackStage?orderState=3">已发货订单</a>
								    </li>	
								    <li>
								        <a href="${pageContext.request.contextPath}/backstage/orderBackStage?orderState=4">已完成订单</a>
								    </li>	
								</ul>
	                 	   </li>
	                    
						
						
	        </ul>
	            </div>
	        </nav>
 	</body>
</html>