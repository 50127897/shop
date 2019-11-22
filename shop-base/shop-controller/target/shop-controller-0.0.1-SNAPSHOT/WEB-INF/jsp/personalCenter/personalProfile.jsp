<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>个人中心</title>
		 <!-- Bootstrap core CSS -->
		<link href="${basePath }/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

		<!-- Custom fonts for this template -->
		<link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:100,200,300,400,500,600,700,800,900" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
		<link href="${basePath }/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet">
		<link href="${basePath }/vendor/devicons/css/devicons.min.css" rel="stylesheet">
		<link href="${basePath }/vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="${basePath }/staticIndex/css/resume.min.css" rel="stylesheet">
	</head>
	<body>
		<body id="page-top">

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top" id="sideNav">			
			  <h4 style="color: #FFFFFF;">个人中心</h4>
			  <span style="color: #FFFFFF;">PersonalCenter</span>
			
      <a class="navbar-brand js-scroll-trigger" href="#page-top">       
        <span class="d-none d-lg-block">
          <img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="${basePath }/staticIndex/images/user/1.jpg" alt="">
        </span>
      </a>
			<div class="author-content">
			  <h4 style="color: #FFFFFF;">${user.username}</h4>
			  <!-- <span style="color: #FFFFFF;">普通用户</span> -->
			  <div class="line-dec"></div>
			</div>
			
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath }/toPersonalProfile">个人资料</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath }/findCollection">收藏夹</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath }/toAdress">收货地址</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath }/Cart/showCart">购物车</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath}/Order/showOrder">我的订单</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="${basePath }">回到首页</a>
          </li>
        </ul>
      </div>
    </nav>

    <div class="container-fluid p-0">

      <section class="resume-section p-3 p-lg-5 d-flex d-column" id="about">
        <div class="container">
             <div class="section-heading">
                  <h3>个人资料</h3>
                    <div class="line-dec"></div>            
             </div>                
        		<div class="jumbotron">
        			<form class="form-horizontal" action="${pageContext.request.contextPath}/updateUserProfile" method="post">
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" name="username" placeholder="用户名" value="${user.username}">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
						    <div class="col-sm-10">
						      <input type="email" class="form-control" id="inputEmail3" name="email" placeholder="邮箱" value="${user.email}">
						    </div>
						  </div>
						  <!-- <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">生日</label>
						    <div class="col-sm-10">
						       <input type="date" class="form-control" id="inputEmail3" name="birthday" placeholder="生日" />
						    </div> -->
						 
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
						    <div class="col-sm-10">
						      <select name="sex" class="form-control">
								    <option value="男" ${user.sex == '男'?"selected='selected'":"" }>男</option>
									<option value="女" ${user.sex == '女'?"selected='selected'":"" }>女</option>																								
							  </select>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">电话</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" name="telephone" placeholder="电话" value="${user.telephone}">
						    </div>
						  </div>
						  
						  
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						    	<input type="hidden" name="eid" value="${user.userid}">
						      <input type="submit" class="btn btn-default" value="提交修改">
						    </div>
						  </div>
					</form>	
                      ${msg11}                                                                 
                                       
                </div>
        </div>       	              
      </section>
     </div>

     

     



    <!-- Bootstrap core JavaScript -->
    <script src="${pageContext.request.contextPath }/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="${pageContext.request.contextPath }/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="${pageContext.request.contextPath }/staticIndex/js/resume.min.js"></script>
	</body>
</html>
