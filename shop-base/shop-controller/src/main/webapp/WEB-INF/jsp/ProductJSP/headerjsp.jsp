<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品详情</title>
<!-- Fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Archivo+Narrow:300,400,700%7CMontserrat:300,400,500,600,700,800,900"
	rel="stylesheet">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/font-awesome.min.css">
<link rel="stylesheet" href="${basePath}/staticIndex/css/style.css">
<!-- CSS Library-->
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/owl.carousel.css">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/fontawesome-stars.css">
<link rel="stylesheet" href="${basePath}/staticIndex/css/slick.css">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/bootstrap-select.min.css">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/magnific-popup.css">
<link rel="stylesheet"
	href="${basePath}/staticIndex/css/jquery-ui.min.css">
<link rel="stylesheet" href="${basePath}/staticIndex/css/settings.css">
<link rel="stylesheet" href="${basePath}/staticIndex/css/layers.css">
<link rel="stylesheet" href="${basePath}/staticIndex/css/navigation.css">
<!-- Custom-->
<link rel="stylesheet" href="${basePath}/staticIndex/css/style.css">

<!-- JS Library-->
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.barrating.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/owl.carousel.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/gmap3.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/imagesloaded.pkgd.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/isotope.pkgd.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/bootstrap-select.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.matchHeight-min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/slick.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.elevatezoom.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.magnific-popup.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery-ui.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/google.map.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.themepunch.tools.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/jquery.themepunch.revolution.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.video.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.slideanims.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.layeranimation.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.navigation.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.parallax.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.actions.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.kenburn.min.js"></script>
<script type="text/javascript"
	src="${basePath}/staticIndex/js/extensions/revolution.extension.migration.min.js"></script>
<!-- Custom scripts-->
<script type="text/javascript" src="${basePath}/staticIndex/js/main.js"></script>
</head>
<body>
	<div class="header--sidebar"></div>
	<header class="header">
		<div class="header__top">
			<div class="container-fluid">
				<div class="navbarfirst">
					<div class="row">
						<div class="col-lg-6 col-md-8 col-sm-6 col-xs-12 ">
							<p>全新正品潮流单品交易平台</p>
						</div>
						<div class="col-lg-6 col-md-4 col-sm-6 col-xs-12 ">
							<div class="header__actions">
								<a href="login.jsp">登录</a>
								<div class="header__actions">
									<a href="register.jsp">注册</a>
									<div class="header__actions">
										<a href="personalcenter.jsp">个人中心</a>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<nav class="navigation">
				<div class="container-fluid">
					<div class="navigation__column left">
						<div>
							<a href="index.jsp">
								<h3>有鞋商城</h3>
							</a>
						</div>
					</div>
					<div class="navigation__column center">
						<ul class="main-menu menu">
							<li class="menu-item "><a href="index.jsp">首页</a></li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">热门</a> <!-- <ul class="sub-menu">
						  <li class="menu-item"><a href="index.jsp">Homepage #1</a></li>
						  <li class="menu-item"><a href="#">Homepage #2</a></li>
						  <li class="menu-item"><a href="#">Homepage #3</a></li>
						</ul> --></li>
							<li class="menu-item menu-item-has-children has-mega-menu"><a
								href="#">男子</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<li><a href="product-listing.jsp">热门球鞋</a></li>
												<li><a href="product-listing.jsp">新品</a></li>
												<li><a href="product-listing.jsp">优惠活动</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">限量尖货</a></li>
												<li><a href="product-listing.jsp">联名球鞋</a></li>
												<li><a href="product-listing.jsp">经典鞋款</a></li>
												<li><a href="product-listing.jsp">篮球鞋</a></li>
												<li><a href="product-listing.jsp">跑步鞋</a></li>
												<li><a href="product-listing.jsp">滑板鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">Air Jordan 1</a></li>
												<li><a href="product-listing.jsp">Air Max</a></li>
												<li><a href="product-listing.jsp">Air Force</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 350</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 700</a></li>
												<li><a href="product-listing.jsp">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">NIKE</a></li>
												<li><a href="product-listing.jsp">Adidas</a></li>
												<li><a href="product-listing.jsp">Converse</a></li>
												<li><a href="product-listing.jsp">Puma</a></li>
											</ul>
										</div>
									</div>
								</div></li>
							<li class="menu-item"><a href="#">女子</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<li><a href="product-listing.jsp">热门球鞋</a></li>
												<li><a href="product-listing.jsp">新品</a></li>
												<li><a href="product-listing.jsp">优惠活动</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">限量尖货</a></li>
												<li><a href="product-listing.jsp">联名球鞋</a></li>
												<li><a href="product-listing.jsp">经典鞋款</a></li>
												<li><a href="product-listing.jsp">篮球鞋</a></li>
												<li><a href="product-listing.jsp">跑步鞋</a></li>
												<li><a href="product-listing.jsp">滑板鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">Air Jordan 1</a></li>
												<li><a href="product-listing.jsp">Air Max</a></li>
												<li><a href="product-listing.jsp">Air Force</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 350</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 700</a></li>
												<li><a href="product-listing.jsp">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">NIKE</a></li>
												<li><a href="product-listing.jsp">Adidas</a></li>
												<li><a href="product-listing.jsp">Converse</a></li>
												<li><a href="product-listing.jsp">Puma</a></li>
											</ul>
										</div>
									</div>
								</div></li>
							<li class="menu-item"><a href="#">儿童</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<li><a href="product-listing.jsp">热门球鞋</a></li>
												<li><a href="product-listing.jsp">新品</a></li>
												<li><a href="product-listing.jsp">优惠活动</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">限量尖货</a></li>
												<li><a href="product-listing.jsp">联名球鞋</a></li>
												<li><a href="product-listing.jsp">经典鞋款</a></li>
												<li><a href="product-listing.jsp">篮球鞋</a></li>
												<li><a href="product-listing.jsp">跑步鞋</a></li>
												<li><a href="product-listing.jsp">滑板鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">Air Jordan 1</a></li>
												<li><a href="product-listing.jsp">Air Max</a></li>
												<li><a href="product-listing.jsp">Air Force</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 350</a></li>
												<li><a href="product-listing.jsp">Yeezy boost 700</a></li>
												<li><a href="product-listing.jsp">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="product-listing.jsp">NIKE</a></li>
												<li><a href="product-listing.jsp">Adidas</a></li>
												<li><a href="product-listing.jsp">Converse</a></li>
												<li><a href="product-listing.jsp">Puma</a></li>
											</ul>
										</div>
									</div>
								</div></li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">消息</a>
								<ul class="sub-menu">
									<li class="menu-item menu-item-has-children dropdown"><a
										href="#">我的消息</a> <!-- <ul class="sub-menu">
									  <li class="menu-item"><a href="#">Blog Grid 1</a></li>
									  <li class="menu-item"><a href="#">Blog Grid 2</a></li>
									</ul> --></li>
									<li class="menu-item"><a href="#">物流信息</a></li>
								</ul></li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">优惠活动</a>
								<ul class="sub-menu">
									<li class="menu-item"><a href="#">限时9.3折</a></li>
									<li class="menu-item"><a href="#">最高减300元</a></li>
								</ul></li>
						</ul>
					</div>

					<!-- 查询商品-->
					<div class="navigation__column right">
						<form class="ps-search--header" action="do_action" method="post">
							<input class="form-control" type="text"
								placeholder="Search Product…">
							<button>
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</form>
					</div>
				</div>
			</nav>
	</header>
</body>
</html>