<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
                  <h3>添加收货地址</h3>
                    <div class="line-dec"></div>            
             </div>                
        		<div class="jumbotron">
        			<form action="${pageContext.request.contextPath }/addAdress" method="post">
				  <div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">收货人</label>
					<div class="col-sm-10">
					  <input type="text" class="form-control" name="tdName" placeholder="收货人">
					</div>
				  </div>
				  <div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">收货电话</label>
					<div class="col-sm-10">
					  <input type="text" class="form-control" name="tdTelephone" placeholder="收货电话">
					</div>
				  </div>
				  <div class="form-group">
				  			<label for="inputPassword3" class="col-sm-2 control-label">收货地址</label>
				  			<div class="col-sm-10">
				  			<input type="text" class="form-control" name="tdAddress" placeholder="收货地址">
				  		</div>
				  </div>
				  <input class="btn btn-primary" type="submit" value="添加">				  
				  </form>                                                                              
        </div>
       </div>       	              
      </section>
      
    </div>
  
	</body>
	
	<script type="text/javascript">
	$(function(){
		$("#adress_save_btn").click(function(){
			
		 	$.ajax({
				url:"${pageContext.request.contextPath}/addAdress",
				type:"POST",
				data:$("#adressAddModal form").serialize(),
				success:function(result){
					if(result.code == 200){
					$("#adressAddModal").modal('hide');					
					alert(result.msg);
					window.location.reload(); 
					}
					window.location.reload(); 
					
				}
			});
		});
	});
	
	
	</script>
</html>
