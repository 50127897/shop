<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册</title>
		 <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="${basePath}/staticIndex/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="${basePath}/staticIndex/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${basePath}/staticIndex/assets/css/form-elements.css">
        <link rel="stylesheet" href="${basePath}/staticIndex/assets/css/style.css">
        
		<!-- Javascript -->
		<script src="${basePath}/staticIndex/assets/js/jquery-1.11.1.min.js"></script>
		<script src="${basePath}/staticIndex/assets/bootstrap/js/bootstrap.min.js"></script>
		<script src="${basePath}/staticIndex/assets/js/jquery.backstretch.min.js"></script>
		<script src="${basePath}/staticIndex/assets/js/scripts.js"></script>
		
<!-- 		<script type="text/javascript">
			/*校验邮件地址是否合法 */
			function IsEmail() {
				var email =$("#form-email");
				var regEmail=new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$"); 
				if(!regEmail.test(email)){
					alert("邮箱格式不正确");
				}
			}
		</script> -->
	</head>
	<body>
		<!-- Top content -->
		<div class="top-content">
			
		    <div class="inner-bg">
		        <div class="container">
		            <div class="row">
		                <div class="col-sm-8 col-sm-offset-2 text">
		                    <h1><strong>有鞋商城</strong></h1>
		                    <div class="description">
		                    	<p>全新正品潮流单品交易平台</p>
		                    </div>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-sm-6 col-sm-offset-3 form-box">
		                	
		                    <div class="form-bottom">
								<h2>注册</h2>
			                    <form role="form" action="register" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">用户名</label>
			                        	<input type="text" name="username" placeholder="用户名" class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">密码</label>
			                        	<input type="password" name="passwd" placeholder="密码" class="form-password form-control" id="form-password">
			                        </div>
									<div class="form-group">
										<label class="sr-only" for="form-email">邮箱</label>
										<input type="text" name="email" placeholder="邮箱" class="form-email form-control" id="form-email"onblur="IsEmail()">
									</div>						
									<div class="form-group">
										<label class="sr-only" for="form-sex">性别</label>
										<input type="text" name="sex" placeholder="性别(选填)" class="form-sex form-control" id="form-sex">
									</div>
									<div class="form-group">
										<label class="sr-only" for="form-telephone">电话</label>
										<input type="text" name="telephone" placeholder="电话(选填)" class="form-telephone form-control" id="form-group">
									</div>
			                        <button type="submit" class="btn">注册</button>
			                        ${msg2}
			                    </form>
		                    </div>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-sm-6 col-sm-offset-3 social-login">
		                	<form action="tologin" method="post">
		                	<div class="social-login-buttons">
		                    	<button class="btn-link-2" type="submit" >登录</button>		                    	
		                	</div>
		                	</form>
		                </div>
		            </div>
		        </div>
		    </div>
		    
		</div>
		
		
		
	</body>
</html>
