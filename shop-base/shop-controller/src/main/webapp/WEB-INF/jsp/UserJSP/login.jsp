<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>登录</title>
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
								<h2>登录</h2>
			                    <form role="form" action="${basePath}/User/checkLogin" method="post" class="login-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">用户名/邮箱</label>
			                        	<input type="text" name="username" placeholder="用户名/邮箱" class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">密码</label>
			                        	<input type="password" name="passwd" placeholder="密码" class="form-password form-control" id="form-password">
			                        </div>
			                        <span style="color:#fff"> ${msg }</span>
			                       
			                        <button type="submit" class="btn" >登录</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    
						<div style="float: left;margin-left: 450px;"><a class="btn btn-link-2"  href="register.jsp">注册</a></div>
                        <div style="float: left;margin-top: 25px;margin-left: 20px;"><a href="${basePath}/User/forgotPassword" style="text-align: right;"><h3>忘记密码</h3></a></div>                        	
	                       	                                               	
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
        
	</body>
</html>
