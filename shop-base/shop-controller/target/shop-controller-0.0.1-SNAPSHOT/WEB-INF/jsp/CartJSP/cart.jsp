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
		
		<div class="panel panel-default">
			<div class="panel-body">
			<div class="page-header" >
				  <h2 style="margin-left: 100px;">购物车</h2>
				</div>
				<div style="margin-left: 100px;margin-right: 100px;width:auto">
				
				<form id="formtoorder" action="${basePath}/Order/createOrder" type="post">
				<table class="table table-hover" id="tablecart">
					<thead>
						<tr>						
						<!-- <th><input type="checkbox" id="check_all" >全选</th> -->
						<th></th>
						<th>商品信息</th>
						<th></th>
						<th>单价</th>
						<th>尺码</th>
						<th>数量</th>
						<th>操作</th>
						</tr>					
					</thead>
					<tbody>
					
							<c:forEach items="${cart.cartitemList}" var="cartitem" varStatus="status" >
								<input type="hidden" name="pid"  value="${cartitem.productSpec.pid }"/>
								<input type="hidden" name="shopPrice"  value="${cartitem.productSpec.descProduct.shopPrice }"/>
								<input type="hidden" name="cartitemid"  value="${cartitem.cartitemid}"/>
								<input type="hidden" name="psSpec"  value="${cartitem.productSpec.psSpec}"/>
								<input type="hidden" name="cartitemid"  value="${cartitem.cartitemid}"/>
								<tr>
									<td>
										<input type="checkbox" name="index" value="${status.index }">
									</td>
									<td><img style="width:60px;height:60px;" class="img-rounded" src="/pic/${cartitem.productSpec.descProduct.imageProducts[0].ipRoute}"></td>
									<td><strong>${cartitem.productSpec.descProduct.pname}</strong></td>						
									<td>${cartitem.productSpec.descProduct.shopPrice}</td>
									<td>${cartitem.productSpec.psSpec}</td>
									<td>
										<div class="form-group" >
											<input class="btn btn-default" type="number" value="1" name="profuct_num">
										</div>
									</td>
									<td>
										
										<a class="btn btn-danger" href="${basePath}/Cart/deleteCartItem?cartitemid=${cartitem.cartitemid}" >删除</a>
									</td>
								</tr>
						
						
							</c:forEach>
								<tr>
									<td colspan="7">请选择收货地址并提交订单:</td>
								</tr>
							<tr style="font-size:17px;">
								<td></td>
								<td>收货人</td>
								<td>联系电话</td>	
								<td>收货地址</td>								
							</tr>
							<c:forEach items="${takeDeliveryList }" var="takeDelivery">
							<tr style="font-size:15px;">
								<td><input type="radio" name="tdId" value="${takeDelivery.tdId}"></td>
								<td>${takeDelivery.tdName }</td>
								<td>${takeDelivery.tdTelephone }</td>	
								<td>${takeDelivery.tdAddress }</td>								
							</tr>
							</c:forEach>	
							<tr>
								
								<td><input class="btn btn-default" type="submit" value="提交"/></td>
							</tr>
							
					</tbody>
				</table>
				
				<div class="text-right">
				
				
				</div>
			</form>	
			</div>
			</div>
		</div>
		
	</body>
<!-- 	<script type="text/javascript">
		/*全选 */
		$("#check_all").click(function(){
			$(".check_item").prop("checked",$(this).prop("checked"));
		});
		
		 $("#cart_btn").click(function(){
			var cartitemid=this.value;
			$.each($(".check_item:checked"),function(){
				$.ajax({
					url:,
					type:"POST",
					data:
				})	
			});
		}); 
	</script> -->
	
</html>
