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
		<script src="js/jquery-3.4.1.min.js"></script>
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
			    $(function () {
			        $(".uploadbtn").click(function () {
			        	var status= this.value;
				          var formData = new FormData($('#uploadForm'+status)[0]);//序列化表单，将上传类型设置为文件对象
				            $.ajax({
				                type: 'post',
				                url: "updateImage",
				                data: formData,
				                cache: false,//文件不设置缓存
				                processData: false,//数据不被转换为字符串
				                contentType: false,//上传文件时使用，避免 JQuery 对其操作
				            }).success(function (data) {
				                if(data=='1'){
				                	alert("更改成功");
				                	window.location.reload();
				                }else{
				                	alert("更改失败");
				                };
				            }).error(function () {
				                alert(data);
				            });
				        });
				    });
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
		                    <h1 class="page-header" >修改商品</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				
				<div class="panel-body">
					
					<table class="table table-striped " align="center" width="100px" >
						<thead >
							<th width="200px">商品名称</th>
							<th width="200px">商场价</th>
							<th width="200px">市场价</th>
							<th width="200px">上架时间</th>
							<th width="200px">商品类别</th>
							<th width="200px">商品品牌</th>
							<th width="200px">商品标记</th>
							<th width="200px">已售数量</th>
						</thead>
								
		<form id="loginform" action="${pageContext.request.contextPath}/backstage/updateProduct" method="post">
			<tr >
			${msg5}
				<td><input class="btn btn-default" type="text" name="pname" placeholder="商品名称" value="${product.pname}"/></td>
				<td><input class="btn btn-default" type="text" name="shopPrice" placeholder="商场价" value="${product.shopPrice}"/></td>
				<td><input class="btn btn-default" type="text" name="marketPrice" placeholder="市场价" value="${product.marketPrice}"/></td>
				<td><input class="btn btn-default" name="date" placeholder="生日" type="date" value="${pdate}"/></td>
				<td>
					<select name="cid" class="form-control">
						<c:forEach items="${categorylist}" var="category">
							<option value="${category.cid}" ${category.cid== product.cid?"selected='selected'":"" }>${category.cname}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="bid" class="form-control">
						<c:forEach items="${brandlist}" var="brand">
							<option value="${brand.bid}" ${brand.bid== product.bid?"selected='selected'":"" }>${brand.bname}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="pflag" class="form-control">
						<option value="1" ${product.pflag == 1?"selected='selected'":"" }>上架</option>
						<option value="0" ${product.pflag == 0?"selected='selected'":"" }>下架</option>
					</select>
				</td>
				<td>
					<input class="btn btn-default" type="text" name="psale" value="${product.psale}" placeholder="已售数量" />
				</td>
			</tr>
			
					<thead >
						<th colspan="3">商品描述</th>
					</thead>
					<tr>
						<td colspan="3">
							<input type="hidden" name="pid" value="${product.pid}">
							<input type="hidden" name="pn" value="${pn}">
							<textarea rows="4" cols="100" name="pdesc">${product.pdesc}</textarea>
						</td>
					</tr>
					
					<tr>
						<td>
							<input type="submit" value="修改">
							<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a>
						</td>
					</tr>
					</form>
						<thead >
							<th colspan="8">商品图片</th>
						</thead>
						<c:forEach items="${product.imageProducts}" var="imageProducts" varStatus="status">
						<tr>
							<td colspan="8">
								<form id="uploadForm${status.index}"  enctype="mutipart/form-data">
									${status.index+1}
									<img src="/pic/${imageProducts.ipRoute}" />
									<input type="file" name="fileName" />
									<input type="hidden" name="ipId" value="${imageProducts.ipId}">
								</form>
								<button class="uploadbtn" value="${status.index}">更改</button>
							</td>
						</tr>
						
						</c:forEach>
						
						
						
							
		
		</form>
		</table>
				</div>
			</div>
      
		    </div>
		    <!-- /. PAGE WRAPPER  -->
		</div>
	</body>
</html>
