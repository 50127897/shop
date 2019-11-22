<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		<title>更改用户</title>
		
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
							<th>生日</th>
							<th>性别</th>
							<th>身份状态
							<th>电话</th>
						</thead>
    	<tbody >
    		
    	<form id="loginform" action="${pageContext.request.contextPath}/backstage/updateUserBackStage" method="post">
    			<input type="hidden" name="userid" value="${user.userid}">
    			${tips5}
    		<tr class="selete">
    			<td><input class="btn btn-default" type="text" name="username" placeholder="用户名" value="${user.username}"/></td>
				<td><input class="btn btn-default" type="text" name="passwd" placeholder="密码" value="${user.passwd}"/></td>
				<td><input class="btn btn-default" type="text" name="email" placeholder="邮箱" value="${user.email}"/></td>
				<td><input class="btn btn-default" type="date" name="birthdate" placeholder="生日" value="${birthday}" /></td>
				
				
				
    			<td><select name="sex" class="form-control">
						<option value="男" ${user.sex== "男"?"selected='selected'":"" } >男</option>
						<option value="女" ${user.sex== "女"?"selected='selected'":"" } >女</option>
					</select></td>
				<td>
					<select name="state" class="form-control">
    					<option value="0" ${user.state== "0"?"selected='selected'":"" }>未激活</option>
						<option value="1" ${user.state== "1"?"selected='selected'":"" }>已激活普通用户</option>
						<option value="2" ${user.state== "2"?"selected='selected'":"" }>已激活会员用户</option>
						
					</select>
				</td>
    			<td><input class="btn btn-default" type="text" name="telephone" placeholder="电话" value="${user.telephone}"/></td>
    			<td><input class="btn btn-default" type="submit"  value="修改"></td>
    			
    		</tr>
    		<tr>
    			<td></td>
    			<td></td>
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
		    <!-- /. PAGE WRAPPER  -->
		</div>
		</div>
	</body>
</html>
