<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    	<nav class="navbar navbar-default top-navbar" role="navigation">
	            <div class="navbar-header">
	                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
	                    <span class="sr-only">Toggle navigation</span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                </button>
	                <a class="navbar-brand" href="#">商城管理后台</a>
	            </div>
	
	            <ul class="nav navbar-top-links navbar-right">
	                <li role="presentation" >
	                <font color="#FFFFFF">
	                		欢迎您，${employee.ename}
	                		<c:if test="${employee.estate eq '1'}">
	                			超级管理员
	                		</c:if>
	                		
	                		<c:if test="${employee.estate eq '2'}">
	                			管理员
	                		</c:if>
	                		
	                		<c:if test="${employee.estate eq '3'}">
	                			客服
	                		</c:if>
	                </font>
	                
	                </li>
	                <li role="presentation"><a href="${pageContext.request.contextPath}/backstage/logout">退出</a></li>
	                <li role="presentation">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
	                    
	            </ul>
	        </nav>
 	</body>
</html>