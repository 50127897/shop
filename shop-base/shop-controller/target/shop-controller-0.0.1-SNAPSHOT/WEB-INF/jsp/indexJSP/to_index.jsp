<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>有鞋商城 - 首页</title>
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
			  				<c:if test="${empty user }">
				  				<div class="header__actions"><a href="${basePath}/toregister">注册</a></div>
				 	 			<div class="header__actions"><a href="${basePath}/tologin">登录</a></div>
				 	 			<div class="header__actions"><a href="${basePath}/tologin">个人中心</a></div>
			  				</c:if>
			 				<c:if test="${not empty user }">
			 	 				<div class="header__actions"><a href="#">欢迎您,&emsp;${user.username}</a> &emsp;&emsp;&emsp;</div>
			 	 				<div class="header__actions"><a href="${basePath}/logout">退出登录</a></div>
			 	 				<div class="header__actions"><a href="${basePath}/toPersonalProfile">个人中心</a></div>
			  				</c:if>
			 			</div>

						</div>
					</div>
				</div>
			</div>
			<nav class="navigation">
				<div class="container-fluid">
					<div class="navigation__column left">
						<div>
							<a href="${basePath }"><h3>有鞋商城</h3></a>
						</div>
					</div>
					<div class="navigation__column center">
						<ul class="main-menu menu">
							<li class="menu-item "><a href="${basePath }">首页</a></li>
							<li class="menu-item menu-item-has-children dropdown">
								<a href="#">热门</a>
							</li>
							<li class="menu-item">
								<a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&gender=man">男子</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<!-- 查出所有热门商品 在psearchinfomation 添加 "热门"-->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=热门&gender=man">热门球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 new -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=new&gender=man">新品</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 限量 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=限量&gender=man">限量尖货</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 联名 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=联名&gender=man">联名球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 经典 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=经典&gender=man">经典鞋款</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ba&gender=man">篮球鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ru&gender=man">跑步鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=fo&gender=man">足球鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="#">Air Jordan 1</a></li>
												<li><a href="#">Air Max</a></li>
												<li><a href="#">Air Force</a></li>
												<li><a href="#">Yeezy boost 350</a></li>
												<li><a href="#">Yeezy boost 700</a></li>
												<li><a href="#">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=NIKE&gender=man">NIKE</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ADIDAS&gender=man">ADIDAS</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=LINING&gender=man">LINING</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ANTA&gender=man">ANTA</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=XTEP&gender=man">XTEP</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ERKE&gender=man">ERKE</a></li>
											</ul>
										</div>
									</div>
								</div>
							</li>
							<li class="menu-item">
								<a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&gender=man">女子</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<!-- 查出所有热门商品 在psearchinfomation 添加 "热门"-->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=热门&gender=woman">热门球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 new -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=new&gender=woman">新品</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 限量 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=限量&gender=woman">限量尖货</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 联名 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=联名&gender=woman">联名球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 经典 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=经典&gender=woman">经典鞋款</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ba&gender=woman">篮球鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ru&gender=woman">跑步鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=fo&gender=woman">足球鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="#">Air Jordan 1</a></li>
												<li><a href="#">Air Max</a></li>
												<li><a href="#">Air Force</a></li>
												<li><a href="#">Yeezy boost 350</a></li>
												<li><a href="#">Yeezy boost 700</a></li>
												<li><a href="#">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=NIKE&gender=woman">NIKE</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ADIDAS&gender=woman">ADIDAS</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=LINING&gender=woman">LINING</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ANTA&gender=woman">ANTA</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=XTEP&gender=woman">XTEP</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ERKE&gender=woman">ERKE</a></li>
											</ul>
										</div>
									</div>
								</div>
							</li>
							<li class="menu-item">
								<a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&gender=kid">儿童</a>
								<div class="mega-menu">
									<div class="mega-wrap">
										<div class="mega-column">
											<ul class="mega-item mega-features">
												<!-- 查出所有热门商品 在psearchinfomation 添加 "热门"-->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=热门&gender=kid">热门球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 new -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=new&gender=kid">新品</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">全部鞋款</h4>
											<ul class="mega-item">
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 限量 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=限量&gender=kid">限量尖货</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 联名 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=联名&gender=kid">联名球鞋</a></li>
												<!-- 查出所有新品  - 关键字,在psearchinfomation 添加 经典 -->
												<li><a href="${basePath }/Product/searchProductByKey?pn=1&searchKey=经典&gender=kid">经典鞋款</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ba&gender=kid">篮球鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=ru&gender=kid">跑步鞋</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&category=fo&gender=kid">足球鞋</a></li>
											</ul>
										</div>
										<div class="mega-column">
											<h4 class="mega-heading">系列</h4>
											<ul class="mega-item">
												<li><a href="#">Air Jordan 1</a></li>
												<li><a href="#">Air Max</a></li>
												<li><a href="#">Air Force</a></li>
												<li><a href="#">Yeezy boost 350</a></li>
												<li><a href="#">Yeezy boost 700</a></li>
												<li><a href="#">1970s</a></li>
											</ul>
										</div>

										<div class="mega-column">
											<h4 class="mega-heading">品牌</h4>
											<ul class="mega-item">
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=NIKE&gender=kid">NIKE</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ADIDAS&gender=kid">ADIDAS</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=LINING&gender=kid">LINING</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ANTA&gender=kid">ANTA</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=XTEP&gender=kid">XTEP</a></li>
												<li><a href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ERKE&gender=kid">ERKE</a></li>
											</ul>
										</div>
									</div>
								</div>
							</li>
							<li class="menu-item menu-item-has-children dropdown"><a
								href="#">消息</a>
								<ul class="sub-menu">
									<c:if test="${empty user }">
										<li class="menu-item menu-item-has-children dropdown">
											<a href="${basePath}/tologin">客服</a>
										</li>
										<li class="menu-item"><a href="${basePath}/tologin">订单物流信息</a></li>
									</c:if>
									<c:if test="${not empty user }">
										<li class="menu-item menu-item-has-children dropdown">
											<a href="http://192.168.1.110:8080/shop-controlle/user/login2?userid=${user.username }&password=${user.passwd}">客服</a>
										</li>
										<li class="menu-item"><a href="${basePath}/Order/showOrder">订单物流信息</a></li>
									</c:if>
									
								</ul>
							</li>
							<li class="menu-item menu-item-has-children dropdown"><a href="#">优惠活动</a>
								<ul class="sub-menu">
									<li class="menu-item"><a href="#">限时9.3折</a></li>
									<li class="menu-item"><a href="#">最高减300元</a></li>
								</ul>
							</li>
						</ul>
					</div>

					<!-- 查询商品-->
					<div class="navigation__column right">
						<form class="ps-search--header" action="${basePath }/Product/searchProductByKey?pn=1" method="post">
							<input class="form-control" name="searchKey" type="text" placeholder="搜索商品......">
							<button><i class="glyphicon glyphicon-search"></i></button>
						</form>
						<!-- 购物车-->
						<div class="ps-cart">
							<c:if test="${empty user }">
								<a class="ps-cart__toggle" href="${basePath }/tologin"> 
									<i class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></i>
								</a>
							</c:if>
							<c:if test="${not empty user }">
								<a class="ps-cart__toggle" href="${basePath }/Cart/showCart"> 
									<i class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></i>
								</a>
							</c:if>
							
						</div>
						<div class="menu-toggle">
							<span></span>
						</div>
					</div>
				</div>
			</nav>
		</div>
	</header>
	<div class="header-services">
		<div class="ps-services owl-slider" data-owl-auto="true"
			data-owl-loop="true" data-owl-speed="3000" data-owl-gap="0"
			data-owl-nav="true" data-owl-dots="false" data-owl-item="1"
			data-owl-item-xs="1" data-owl-item-sm="1" data-owl-item-md="1"
			data-owl-item-lg="1" data-owl-duration="1000" data-owl-mousedrag="on">
			<p class="ps-service">
				<i class="glyphicon glyphicon-bullhorn"></i><strong>好消息</strong>:全场限时9.8折
			</p>
			<p class="ps-service">
				<i class="glyphicon glyphicon-bullhorn"></i><strong>上新</strong>: Air
				Jordan 1 低帮倒钩联名
			</p>
			<p class="ps-service">
				<i class="glyphicon glyphicon-bullhorn"></i><strong>品牌联合</strong>:最高减300元
			</p>
		</div>
	</div>




	<main class="ps-main"> <!-- 轮播图 -->
	<div class="ps-banner">
		<div class="rev_slider fullscreenbanner" id="home-banner">
			<ul>
				<!-- 第一张轮播图-->
				<li class="ps-banner" data-index="rs-2972" data-transition="random"
					data-slotamount="default" data-hideafterloop="0"
					data-hideslideonmobile="off" data-rotate="0">
					<img class="rev-slidebg" src="/pic/${brandThreeImage[0].brRoute} "
					alt="" data-bgposition="center center" data-bgfit="cover"
					data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
					<div class="tp-caption ps-banner__header" id="layer-1"
						data-x="left" data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-150','-120','-150','-170']"
						data-width="['none','none','none','400']" data-type="text"
						data-responsive_offset="on"
						data-frames="[{&quot;delay&quot;:1000,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">

					</div>
					<div class="tp-caption ps-banner__title" id="layer21"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-60','-40','-50','-70']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						<c:choose>
							<c:when test="${brandThreeImage[0].bname =='LINING'}">
								<p class="text-uppercase">李宁</p>
							</c:when>
							<c:when test="${brandThreeImage[0].bname =='ANTA'}">
								<p class="text-uppercase">安踏</p>
							</c:when>
							<c:when test="${brandThreeImage[0].bname =='NIKE'}">
								<p class="text-uppercase">耐克</p>
							</c:when>
							<c:when test="${brandThreeImage[0].bname =='ADIDAS'}">
								<p class="text-uppercase">阿迪达斯</p>
							</c:when>
							<c:when test="${brandThreeImage[0].bname =='XTEP'}">
								<p class="text-uppercase">特步</p>
							</c:when>
							<c:otherwise>
								<p class="text-uppercase">鸿星尔克</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="tp-caption ps-banner__description" id="layer211"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['30','50','50','50']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
					</div> 
					<a class="tp-caption ps-btn" id="layer31" 
					href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ANTA"
					data-x="['left','left','left','left']"
					data-hoffset="['-60','15','15','15']"
					data-y="['middle','middle','middle','middle']"
					data-voffset="['120','140','200','200']" data-type="text"
					data-responsive_offset="on"
					data-textAlign="['center','center','center','center']"
					data-frames="[{&quot;delay&quot;:1500,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						立即选购 <i class="ps-icon-next"></i>
				</a></li>

				<!-- 第二张轮播图-->
				<li class="ps-banner ps-banner--white" data-index="rs-100"
					data-transition="random" data-slotamount="default"
					data-hideafterloop="0" data-hideslideonmobile="off" data-rotate="0">
					<img class="rev-slidebg" src="/pic/${brandThreeImage[1].brRoute}"
					alt="" data-bgposition="center center" data-bgfit="cover"
					data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
					<div class="tp-caption ps-banner__header" id="layer20"
						data-x="left" data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-150','-120','-150','-170']"
						data-width="['none','none','none','400']" data-type="text"
						data-responsive_offset="on"
						data-frames="[{&quot;delay&quot;:1000,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
					</div>
					<div class="tp-caption ps-banner__title" id="layer339"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-60','-40','-50','-70']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						<c:choose>
							<c:when test="${brandThreeImage[1].bname =='LINING'}">
								<p class="text-uppercase">李宁</p>
							</c:when>
							<c:when test="${brandThreeImage[1].bname =='ANTA'}">
								<p class="text-uppercase">安踏</p>
							</c:when>
							<c:when test="${brandThreeImage[1].bname =='NIKE'}">
								<p class="text-uppercase">耐克</p>
							</c:when>
							<c:when test="${brandThreeImage[1].bname =='ADIDAS'}">
								<p class="text-uppercase">阿迪达斯</p>
							</c:when>
							<c:when test="${brandThreeImage[1].bname =='ERKE'}">
								<p class="text-uppercase">鸿星尔克</p>
							</c:when>
							<c:otherwise>
								<p class="text-uppercase">特步</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="tp-caption ps-banner__description" id="layer2-14"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['30','50','50','50']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
					</div> <a class="tp-caption ps-btn" id="layer364" 
					href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=NIKE"
					data-x="['left','left','left','left']"
					data-hoffset="['-60','15','15','15']"
					data-y="['middle','middle','middle','middle']"
					data-voffset="['120','140','200','200']" data-type="text"
					data-responsive_offset="on"
					data-textAlign="['center','center','center','center']"
					data-frames="[{&quot;delay&quot;:1500,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						立即选购 <i class="ps-icon-next"></i>
				</a>
				</li>

				<!-- 第三张轮播图-->
				<li class="ps-banner " data-index="rs-666" data-transition="random"
					data-slotamount="default" data-hideafterloop="0"
					data-hideslideonmobile="off" data-rotate="0"><img
					class="rev-slidebg" src="/pic/${brandThreeImage[2].brRoute}" alt=""
					data-bgposition="center center" data-bgfit="cover"
					data-bgrepeat="no-repeat" data-bgparallax="5" data-no-retina>
					<div class="tp-caption ps-banner__header" id="layer20"
						data-x="left" data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-150','-120','-150','-170']"
						data-width="['none','none','none','400']" data-type="text"
						data-responsive_offset="on"
						data-frames="[{&quot;delay&quot;:1000,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">

					</div>
					<div class="tp-caption ps-banner__title" id="layer339"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['-60','-40','-50','-70']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						<c:choose>
							<c:when test="${brandThreeImage[2].bname =='LINING'}">
								<p class="text-uppercase">李宁</p>
							</c:when>
							<c:when test="${brandThreeImage[2].bname =='ANTA'}">
								<p class="text-uppercase">安踏</p>
							</c:when>
							<c:when test="${brandThreeImage[2].bname =='NIKE'}">
								<p class="text-uppercase">耐克</p>
							</c:when>
							<c:when test="${brandThreeImage[2].bname =='ADIDAS'}">
								<p class="text-uppercase">阿迪达斯</p>
							</c:when>
							<c:when test="${brandThreeImage[2].bname =='ERKE'}">
								<p class="text-uppercase">鸿星尔克</p>
							</c:when>
							<c:otherwise>
								<p class="text-uppercase">特步</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="tp-caption ps-banner__description" id="layer2-14"
						data-x="['left','left','left','left']"
						data-hoffset="['-60','15','15','15']"
						data-y="['middle','middle','middle','middle']"
						data-voffset="['30','50','50','50']" data-type="text"
						data-responsive_offset="on"
						data-textAlign="['center','center','center','center']"
						data-frames="[{&quot;delay&quot;:1200,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
					</div> <a class="tp-caption ps-btn" id="layer364" 
					href="${basePath }/Product/searchProductByKeyIsNull?pn=1&brand=ADIDAS"
					data-x="['left','left','left','left']"
					data-hoffset="['-60','15','15','15']"
					data-y="['middle','middle','middle','middle']"
					data-voffset="['120','140','200','200']" data-type="text"
					data-responsive_offset="on"
					data-textAlign="['center','center','center','center']"
					data-frames="[{&quot;delay&quot;:1500,&quot;speed&quot;:1500,&quot;frame&quot;:&quot;0&quot;,&quot;from&quot;:&quot;x:50px;opacity:0;&quot;,&quot;to&quot;:&quot;o:1;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;},{&quot;delay&quot;:&quot;wait&quot;,&quot;speed&quot;:300,&quot;frame&quot;:&quot;999&quot;,&quot;to&quot;:&quot;x:50px;opacity:0;&quot;,&quot;ease&quot;:&quot;Power3.easeInOut&quot;}]">
						立即选购 <i class="ps-icon-next"></i>
				</a></li>
			</ul>
		</div>
	</div>


	<!-- 热门商品 -->
	<div
		class="ps-section--features-product ps-section masonry-root pt-100 pb-100">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="ps-container">
					<!-- 热门商品 + 热门商品左下角的分类 -->
					<div class="ps-section__header mb-50">
						<h3 class="ps-section__title" data-mask="features">热门商品</h3>
						<ul class="ps-masonry__filter">
							<li class="current"><a href="#" data-filter="*">All</a></li>
							<li><a href="#" data-filter=".men">Men</a></li>
							<li><a href="#" data-filter=".women">Women</a></li>
							<li><a href="#" data-filter=".kids">Kid</a></li>
						</ul>
					</div>

					<div class="ps-section__content pb-50">
						<div class="masonry-wrapper" data-col-md="4" data-col-sm="2"
							data-col-xs="1" data-gap="30" data-radio="100%">
							<div class="ps-masonry">
								<div class="grid-sizer"></div>
								<c:forEach items="${hotProductList}" var="hotproduct">
									<c:choose>
										<c:when test="${hotproduct.cid =='30688d8f9bfe4e7d'}">
											<div class="grid-item men">
												<div class="grid-item__content-wrapper">
													<div class="ps-shoe mb-30">					
														<div class="ps-shoe__thumbnail">
															<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"> <i
																class="glyphicon glyphicon-heart"></i>
															</a> 
															<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																<img src="/pic/${hotproduct.imageProducts[0].ipRoute }" alt="">
															</a>
															<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"></a>
														</div>
														<div class="ps-shoe__content">
															<div class="ps-shoe__variants">
																<div class="ps-shoe__variant normal">
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[1].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[2].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[3].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[4].ipRoute }" alt="">
																	</a>			
																</div>
																<select class="ps-rating ps-shoe__rating">
																	<option value="1">1</option>
																	<option value="1">2</option>
																	<option value="1">3</option>
																	<option value="1">4</option>
																	<option value="2">5</option>
																</select>
															</div>
															<div class="ps-shoe__detail">
																<div>
																	<a class="ps-shoe__name" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																	${hotproduct.pname}
																	</a>
																	<span class="ps-shoe__price">${hotproduct.shopPrice}</span>
																</div>
																<br />
																<p class="ps-shoe__categories">${hotproduct.pdesc}</p>
															</div>
														</div>
													</div>
												</div>
											</div>
										</c:when>
										<c:when test="${hotproduct.cid =='9ef0f06dbd35469b'}">
											<div class="grid-item women">
												<div class="grid-item__content-wrapper">
													<div class="ps-shoe mb-30">					
														<div class="ps-shoe__thumbnail">
															<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"> <i
																class="glyphicon glyphicon-heart"></i>
															</a> 
															<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																<img src="/pic/${hotproduct.imageProducts[0].ipRoute }" alt="">
															</a>
															<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"></a>
														</div>
														<div class="ps-shoe__content">
															<div class="ps-shoe__variants">
																<div class="ps-shoe__variant normal">
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[1].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[2].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[3].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[4].ipRoute }" alt="">
																	</a>			
																</div>
																<select class="ps-rating ps-shoe__rating">
																	<option value="1">1</option>
																	<option value="1">2</option>
																	<option value="1">3</option>
																	<option value="1">4</option>
																	<option value="2">5</option>
																</select>
															</div>
															<div class="ps-shoe__detail">
																<div>
																	<a class="ps-shoe__name" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																	${hotproduct.pname}
																	</a>
																	<span class="ps-shoe__price">${hotproduct.shopPrice}</span>
																</div>
																<br />
																<p class="ps-shoe__categories">${hotproduct.pdesc}</p>
															</div>
														</div>
													</div>
												</div>
											</div>
										</c:when>
										<c:otherwise>
											<div class="grid-item kids">
												<div class="grid-item__content-wrapper">
													<div class="ps-shoe mb-30">					
														<div class="ps-shoe__thumbnail">
															<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"> <i
																class="glyphicon glyphicon-heart"></i>
															</a> 
															<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																<img src="/pic/${hotproduct.imageProducts[0].ipRoute }" alt="">
															</a>
															<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}"></a>
														</div>
														<div class="ps-shoe__content">
															<div class="ps-shoe__variants">
																<div class="ps-shoe__variant normal">
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[1].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[2].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[3].ipRoute }" alt="">
																	</a>
																	<a href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																		<img src="/pic/${hotproduct.imageProducts[4].ipRoute }" alt="">
																	</a>			
																</div>
																<select class="ps-rating ps-shoe__rating">
																	<option value="1">1</option>
																	<option value="1">2</option>
																	<option value="1">3</option>
																	<option value="1">4</option>
																	<option value="2">5</option>
																</select>
															</div>
															<div class="ps-shoe__detail">
																<div>
																	<a class="ps-shoe__name" href="${basePath }/Product/product_detail/?pid=${hotproduct.pid}">
																	${hotproduct.pname}</a>
																	<span class="ps-shoe__price">${hotproduct.shopPrice}</span>
																</div>
																<br />
																<p class="ps-shoe__categories">${hotproduct.pdesc}</p>
															</div>
														</div>
													</div>
												</div>
											</div>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>

	<!--优惠活动 两张图片 == 点击进详情页面alt="" -->
	<div class="panel panel-default">
		<div class="panel-body">
			<div class="ps-section--offer">
				<h3 class="ps-section__title" data-mask="BEST SALE">优惠活动</h3>
				<div class="ps-column">
					<a class="ps-offer" href="#"> 
						<img src="${basePath}/staticIndex/images/banner/10.png" alt="">
					</a>
				</div>
				<div class="ps-column">
					<a class="ps-offer" href="#"> 
						<img src="${basePath}/staticIndex/images/banner/12.png" alt="">
					</a>
				</div>
			</div>
		</div>
	</div>


	<!--男子系列-->
	<div class="ps-section ps-section--top-sales ps-owl-root pt-80 pb-80">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="ps-container">
					<!-- 标题 - 男子精选 + 左右滑动 -->
					<div class="ps-section__header mb-50">
						<div class="row">
							<!-- 标题 - 男子精选 -->
							<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 ">
								<h3 class="ps-section__title" data-mask="BEST SALE">男子精选</h3>
							</div>
							<!-- 左右滑动 -->
							<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
								<div class="ps-owl-actions">
									<a class="ps-prev" href="#"><i class="ps-icon-arrow-right"></i>Prev</a>
									<a class="ps-next" href="#">Next<i
										class="ps-icon-arrow-left"></i></a>
								</div>
							</div>
						</div>
					</div>

					<div class="ps-section__content">
						<div class="ps-owl--colection owl-slider" data-owl-auto="true"
							data-owl-loop="true" data-owl-speed="5000" data-owl-gap="30"
							data-owl-nav="false" data-owl-dots="false" data-owl-item="4"
							data-owl-item-xs="1" data-owl-item-sm="2" data-owl-item-md="3"
							data-owl-item-lg="4" data-owl-duration="1000"
							data-owl-mousedrag="on">

							<c:forEach items="${manList}" var="manproduct">
								<div class="ps-shoes--carousel">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<div class="ps-badge">
												<span>New</span>
											</div>
											<div class="ps-badge ps-badge--sale ps-badge--2nd">
												<span>-2.5%</span>
											</div>
											<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
											 <i class="glyphicon glyphicon-heart"></i></a> <img
												src="/pic/${manproduct.imageProducts[0].ipRoute}" alt="">
											<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail?pid=${manproduct.pid}"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<a href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
														<img src="/pic/${manproduct.imageProducts[1].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
														<img src="/pic/${manproduct.imageProducts[2].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
														<img src="/pic/${manproduct.imageProducts[3].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
														<img src="/pic/${manproduct.imageProducts[4].ipRoute}" alt=""> 
													</a>
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<div>
													<a class="ps-shoe__name" href="${basePath }/Product/product_detail?pid=${manproduct.pid}">
													${manproduct.pname}
													</a> 
													<span class="ps-shoe__price">${manproduct.shopPrice}</span>
												</div>
												<br />
												<p class="ps-shoe__categories">${manproduct.pdesc}</p>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!--女子系列-->
	<div class="ps-section ps-section--top-sales ps-owl-root pt-80 pb-80">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="ps-container">
					<div class="ps-section__header mb-50">
						<div class="row">
							<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 ">
								<h3 class="ps-section__title" data-mask="BEST SALE">女子精选</h3>
							</div>
							<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
								<div class="ps-owl-actions">
									<a class="ps-prev" href="#"><i class="ps-icon-arrow-right"></i>Prev</a>
									<a class="ps-next" href="#">Next<i
										class="ps-icon-arrow-left"></i></a>
								</div>
							</div>
						</div>
					</div>

					<div class="ps-section__content">
						<div class="ps-owl--colection owl-slider" data-owl-auto="true"
							data-owl-loop="true" data-owl-speed="5000" data-owl-gap="30"
							data-owl-nav="false" data-owl-dots="false" data-owl-item="4"
							data-owl-item-xs="1" data-owl-item-sm="2" data-owl-item-md="3"
							data-owl-item-lg="4" data-owl-duration="1000"
							data-owl-mousedrag="on">
							<c:forEach items="${womenList}" var="womenproduct">
								<div class="ps-shoes--carousel">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<div class="ps-badge">
												<span>New</span>
											</div>
											<div class="ps-badge ps-badge--sale ps-badge--2nd">
												<span>-3%</span>
											</div>
											<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail?pid=${womenproduct.pid}"><i
												class="glyphicon glyphicon-heart"></i></a> <img
												src="/pic/${womenproduct.imageProducts[0].ipRoute}" alt="">
											<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail?pid=${womenproduct.pid}"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<a href="${basePath }/Product/product_detail?pid=${womenproduct.pid}">
														<img src="/pic/${womenproduct.imageProducts[1].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${womenproduct.pid}">
														<img src="/pic/${womenproduct.imageProducts[2].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${womenproduct.pid}">
														<img src="/pic/${womenproduct.imageProducts[3].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${womenproduct.pid}">
														<img src="/pic/${womenproduct.imageProducts[4].ipRoute}" alt=""> 
													</a>
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<div>
													<a class="ps-shoe__name" href="${basePath }/Product/product_detail?pid=${womenproduct.pid}">
													${womenproduct.pname}
													</a>
													<span class="ps-shoe__price">${womenproduct.shopPrice}</span>
												</div>
												<br />
												<p class="ps-shoe__categories">${womenproduct.pdesc}</p>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!--儿童系列-->
	<div class="ps-section ps-section--top-sales ps-owl-root pt-80 pb-80">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="ps-container">
					<!-- 标题 - 男子精选 + 左右滑动 -->
					<div class="ps-section__header mb-50">
						<div class="row">
							<!-- 标题 - 男子精选 -->
							<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 ">
								<h3 class="ps-section__title" data-mask="BEST SALE">儿童精选</h3>
							</div>
							<!-- 左右滑动 -->
							<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
								<div class="ps-owl-actions">
									<a class="ps-prev" href="#"><i class="ps-icon-arrow-right"></i>Prev</a>
									<a class="ps-next" href="#">Next<i
										class="ps-icon-arrow-left"></i></a>
								</div>
							</div>
						</div>
					</div>

					<div class="ps-section__content">
						<div class="ps-owl--colection owl-slider" data-owl-auto="true"
							data-owl-loop="true" data-owl-speed="5000" data-owl-gap="30"
							data-owl-nav="false" data-owl-dots="false" data-owl-item="4"
							data-owl-item-xs="1" data-owl-item-sm="2" data-owl-item-md="3"
							data-owl-item-lg="4" data-owl-duration="1000"
							data-owl-mousedrag="on">
							<c:forEach items="${childList}" var="childproduct">
								<div class="ps-shoes--carousel">
									<div class="ps-shoe mb-30">
										<div class="ps-shoe__thumbnail">
											<div class="ps-badge">
												<span>New</span>
											</div>
											<div class="ps-badge ps-badge--sale ps-badge--2nd">
												<span>-2%</span>
											</div>
											<a class="ps-shoe__favorite" href="${basePath }/Product/product_detail?pid=${childproduct.pid}"><i
												class="glyphicon glyphicon-heart"></i></a> <img
												src="/pic/${childproduct.imageProducts[0].ipRoute}" alt="">
											<a class="ps-shoe__overlay" href="${basePath }/Product/product_detail?pid=${childproduct.pid}"></a>
										</div>
										<div class="ps-shoe__content">
											<div class="ps-shoe__variants">
												<div class="ps-shoe__variant normal">
													<a href="${basePath }/Product/product_detail?pid=${childproduct.pid}">
														<img src="/pic/${childproduct.imageProducts[1].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${childproduct.pid}">
														<img src="/pic/${childproduct.imageProducts[2].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${childproduct.pid}">
														<img src="/pic/${childproduct.imageProducts[3].ipRoute}" alt=""> 
													</a>
													<a href="${basePath }/Product/product_detail?pid=${childproduct.pid}">
														<img src="/pic/${childproduct.imageProducts[4].ipRoute}" alt=""> 
													</a>
												</div>
												<select class="ps-rating ps-shoe__rating">
													<option value="1">1</option>
													<option value="1">2</option>
													<option value="1">3</option>
													<option value="1">4</option>
													<option value="2">5</option>
												</select>
											</div>
											<div class="ps-shoe__detail">
												<div>
													<a class="ps-shoe__name" href="${basePath }/Product/product_detail?pid=${childproduct.pid}">
													${childproduct.pname}
													</a>
													<span class="ps-shoe__price">${childproduct.shopPrice}</span>
												</div>
												<br />
												<p class="ps-shoe__categories">${childproduct.pdesc}</p>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!--底部-->
	<div class="ps-home-contact">
		<div class="ps-footer bg--cover"
			>
			<div class="ps-footer__content">
				<div class="ps-container">
					<div class="row">
						<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--info">
								<header>
									<a class="ps-logo" href="#"> 
									<img src="${basePath}/staticIndex/images/logo-white.png" alt="">
									</a>
									<h3 class="ps-widget__title">Address Office 1</h3>
								</header>
								<footer>
									<p>
										<strong>460 West 34th Street, 15th floor, New York</strong>
									</p>
									<p>
										Email: <a href="#">support@store.com</a>
									</p>
									<p>Phone: +111 222 333</p>
									<p>Fax: ++323 32434 5333</p>
								</footer>
							</aside>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--info second">
								<header>
									<h3 class="ps-widget__title">Address Office 2</h3>
								</header>
								<footer>
									<p>
										<strong>PO Box 16122 Collins Victoria 3000 Australia</strong>
									</p>
									<p>
										Email: <a href="#">support@store.com</a>
									</p>
									<p>Phone: +323 32434 5334</p>
									<p>Fax: ++323 32434 5333</p>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Find Our store</h3>
								</header>
								<footer>
									<ul class="ps-list--link">
										<li><a href="#">Coupon Code</a></li>
										<li><a href="#">SignUp For Email</a></li>
										<li><a href="#">Site Feedback</a></li>
										<li><a href="#">Careers</a></li>
									</ul>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Get Help</h3>
								</header>
								<footer>
									<ul class="ps-list--line">
										<li><a href="#">Order Status</a></li>
										<li><a href="#">Shipping and Delivery</a></li>
										<li><a href="#">Returns</a></li>
										<li><a href="#">Payment Options</a></li>
										<li><a href="#">Contact Us</a></li>
									</ul>
								</footer>
							</aside>
						</div>
						<div class="col-lg-2 col-md-2 col-sm-4 col-xs-12 ">
							<aside class="ps-widget--footer ps-widget--link">
								<header>
									<h3 class="ps-widget__title">Products</h3>
								</header>
								<footer>
									<ul class="ps-list--line">
										<li><a href="#">Shoes</a></li>
										<li><a href="#">Clothing</a></li>
										<li><a href="#">Accessries</a></li>
										<li><a href="http://localhost:8080/shop-controller/backstage/login">商城后台管理</a></li>
									</ul>
								</footer>
							</aside>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	</main>

</body>
</html>
