<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<title>更改个人信息</title>
		
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
		                    <h1 class="page-header">更改个人信息</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				<div class="panel-body">
					<table class="table table-striped ">
						<thead >
							<th>用户名</th>
							<th>密码</th>
							<th>邮箱</th>
							<th>电话</th>
						</thead>
		    	<tbody >
		    		
		    	<form id="loginform" action="${pageContext.request.contextPath}/backstage/updatePersonal" method="post">
		    		<tr class="selete">
		    			<td><input class="btn btn-default" type="text" name="ename" placeholder="用户名" value="${employee.ename}"/></td>
						<td><input class="btn btn-default" type="text" name="epassword" placeholder="密码" value="${employee.epassword}"/></td>
						<td><input class="btn btn-default" type="text" name="email" placeholder="邮箱" value="${employee.email}"/></td>
						<!--<td><input class="btn btn-default" type="text" name="borntime" placeholder="生日"value="1999-11-11" /></td>-->
		    			<td><input class="btn btn-default" type="text" name="etelephone" placeholder="电话" value="${employee.etelephone}"/></td>
		    			<td>
		    				<input class="btn btn-default" type="submit"  value="修改">
		    				<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a>
		    			</td>
		    			
		    		</tr>
		    	</form>
		    		<tr>${tips}</tr>
		    	</tbody>
		    	</table>
						</div>
					</div>
		     
				    </div>
				    <!-- /. PAGE WRAPPER  -->
				</div>
	</body>
</html>
