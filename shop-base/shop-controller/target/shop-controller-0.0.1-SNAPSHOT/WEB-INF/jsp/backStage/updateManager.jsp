<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link href="css/bootstrap.css" rel="stylesheet" />
		<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
		<link href="css/custom-styles.css" rel="stylesheet" />
		<link href="css/font-awesome.css" rel="stylesheet" />
		<link href="js/morris/morris-0.4.3.min.css" rel="stylesheet" />
		<script src="js/bootstrap.js"></script>
		<title>添加用户</title>
		
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
		                    <h1 class="page-header">更改管理员</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				<div class="panel-body">
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
    	<form id="employeeForm" action="${pageContext.request.contextPath}/backstage/updateManagerBackStage" method="post">
    		<tr class="selete">
    		
    			<td><input class="btn btn-default" type="text" name="ename" placeholder="用户名" value="${employee1.ename}"/></td>
				<td><input class="btn btn-default" type="text" name="epassword" placeholder="密码" value="${employee1.epassword}"/></td>
				<td><input class="btn btn-default" type="text" name="email" placeholder="邮箱" value="${employee1.email}"/></td>
				<td><input class="btn btn-default" placeholder="入职时间" name="hiretime" type="date" value="${hiretime}"/></td>
    			<td><select name="estate" class="form-control">
    					<option value="1" ${employee1.estate== "1"?"selected='selected'":"" }>高级管理员</option>
						<option value="2" ${employee1.estate== "2"?"selected='selected'":"" }>普通管理员</option>
						<option value="3" ${employee1.estate== "3"?"selected='selected'":"" }>客服人员</option>
					</select></td>
    			<td><input class="btn btn-default" type="text" name="etelephone" placeholder="电话" value="${employee1.etelephone}"/></td>
    			<td><input class="btn btn-default" type="submit"  value="修改">
    				<input type="hidden" value="${employee1.eid}" name="eid">
    			</td>
    			
    		</tr>
    		<tr>
    			<td>${tip1}</td>
    			<td></td>
    			<td></td>
    			<td></td>
    			<td></td>
    			<td></td>
    			<td><a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a></td>
    		</tr>
    	</form>
    	</tbody>
    	</table>
				</div>
			</div>
     
		    </div>
		</div>
	</body>
</html>
