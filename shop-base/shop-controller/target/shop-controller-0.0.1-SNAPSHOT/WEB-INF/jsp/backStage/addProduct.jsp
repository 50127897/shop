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
		                    <h1 class="page-header" >添加商品</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				
				<div class="panel-body">
				       ${msg9}
					<table class="table table-striped " align="center" width="100px" >
						<thead >
							<th width="200px">商品名称</th>
							<th width="200px">商场价</th>
							<th width="200px">市场价</th>
							<th width="200px">上架时间</th>
							<th width="200px">商品标记</th>
							<th width="200px">已售数量</th>
							<th width="200px">商品类别</th>
							<th width="200px">商品品牌</th>
						</thead>
								
		<form  action="${pageContext.request.contextPath}/backstage/addProductbackstage" method="post" enctype="multipart/form-data">
			<tr >
				<td><input class="btn btn-default" type="text" name="pname" placeholder="商品名称" /></td>
				<td><input class="btn btn-default" type="text" name="shopPrice" placeholder="商场价" /></td>
				<td><input class="btn btn-default" type="text" name="marketPrice" placeholder="市场价" /></td>
				<!--<td><input class="btn btn-default" type="text" name="name" placeholder="上架时间" /></td>-->
				<td><input class="btn btn-default" name="date" placeholder="上架时间" type="date" /></td>
				<td>
					<select name="pflag" class="form-control">
						<option value="1">上架</option>
						<option value="0">下架</option>
					</select>
				</td>
				<td><input class="btn btn-default" type="text" name="psale" placeholder="已售数量" /></td>
				<td>
					<select name="cid" class="form-control">
						<c:forEach items="${categorylist}" var="category">
							<option value="${category.cid}">${category.cname}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="bid" class="form-control">
						<c:forEach items="${brandlist}" var="brand">
							<option value="${brand.bid}">${brand.bname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
						<thead >
							<th colspan="8">商品图片</th>
						</thead>
						<tr>
							<td colspan="8">
								<div >
							        <input type="file" name="pictureFile" />
							    </div>
							</td>
						</tr>
						<tr>
							<td colspan="8">
								<div>
							        <input type="file" name="pictureFile" />
							    </div>
							</td>
						</tr>
						<tr>
							<td colspan="8">
								<div>
							        <input type="file" name="pictureFile" />
							    </div>
							</td>
						</tr>
						<tr>
							<td colspan="8">
								<div>
							        <input type="file" name="pictureFile" />
							    </div>
							</td>
						</tr>
						<tr>
							<td colspan="8">
								<div>
							        <input type="file" name="pictureFile" />
							    </div>
							</td>
						</tr>
						<thead >
							<th colspan="8">商品描述</th>
						</thead>
						<tr>
							<td colspan="8">
								<textarea rows="4" cols="100" name="pdesc"></textarea>
							</td>
						</tr>
							<tr>
								<td>
								<input type="submit" class="btn btn-default" value="添加">
									<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a>
								</td>
							</tr>
		
		</form>
		</table>
				</div>
			</div>
			</div>
			</div>
			</div>
		</div>
	</body>
</html>
