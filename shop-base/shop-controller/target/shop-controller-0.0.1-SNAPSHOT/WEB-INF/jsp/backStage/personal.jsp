<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>个人中心</title>
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
		<div id="wrapper">
		    <%@ include file="header.jsp" %>
	        <!--/. NAV TOP  -->
	        <%@ include file="left.jsp" %>
		    
		    <div id="page-wrapper">
		        <div id="page-inner">
		
		
		            <div class="row">
		                <div class="col-md-12">
		                    <h1 class="page-header"> 个人中心 </h1>
		                </div>
		            </div>
		    
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
					
					<table class="table table-striped ">
					<thead >
						
						<th>用户名</th>
						<th>密码</th>
						<th>邮箱</th>
						<th>入职时间</th>
						<th>身份状态</th>
						<th>电话</th>
					</thead>
					<tbody >
					 		
						<tr class="hehe">
							
							<td>${employee.ename}</td>
							<td>${employee.epassword}</td>
							<td>${employee.email}</td>
							<td><fmt:formatDate value="${employee.ehiretime}" pattern="yyyy-MM-dd "/></td>
							<td>
							<c:if test="${employee.estate eq '1'}">
								高级管理员
							</c:if>
							<c:if test="${employee.estate eq '2'}">
								普通管理员
							</c:if>
							<c:if test="${employee.estate eq '3'}">
								客服人员
							</c:if>
							</td>
							<td>${employee.etelephone}</td>
							<td>
								<div class="btn-group">
								<a href="${pageContext.request.contextPath}/backstage/updatePersonalPage" class="btn btn-default">修改</a>
								
								</div>
								</td>
						</tr>	
					</tbody>
					</table>
					
					
				</div>
			</div>
		
		    </div>
		</div>
	</body>
</html>
