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
		                    <h1 class="page-header">添加品牌</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				<div class="panel-body">
					<table class="table table-striped ">
						<thead >
							<th width="300px">品牌名</th>
							<th>品牌图片</th>
							<th>操作</th>
						</thead>
    	<tbody >
    		
    	<form id="loginform" action="${pageContext.request.contextPath}/backstage/addbrandBackStage" enctype="multipart/form-data" method="post" >
    		<tr class="selete">
    			<td><input class="btn btn-default" type="text" name="bname" placeholder="品牌名" /></td>
    			<td><input type="file"  name="pictureFile" /></td>
    			<td>
    				<input class="btn btn-default" type="submit"  value="添加">
    				<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a>
    			</td>
    			<td></td>
    		</tr>
    	</form>
    	</tbody>
    	</table>
				</div>
			</div>
     
		    </div>
		    <!-- /. PAGE WRAPPER  -->
		</div>
	</body>
</html>
