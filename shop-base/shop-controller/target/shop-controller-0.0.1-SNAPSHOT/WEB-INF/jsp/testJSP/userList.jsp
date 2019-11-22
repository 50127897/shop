<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("basePath", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题  -->
		<div class="row">
			<div>
				<h1>SSM-CRUD</h1>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>#userid</th>
						<th>username</th>
						<th>passwd</th>
						<th>email</th>
						<th>birthday</th>
						<th>sex</th>
						<th>state</th>
						<th>code</th>
						<th>telephone</th>
						<th>操作</th>
					</tr>
					<!-- user是list的组成元素 -->
					<c:forEach items="${pageInfo.list}" var="user">
						<tr>
							<th>${user.userid }</th>
							<th>${user.username }</th>
							<th>${user.passwd }</th>
							<th>${user.email }</th>
							<th>${user.birthday }</th>
							<th>${user.sex }</th>
							<th>${user.state }</th>
							<th>${user.code }</th>
							<th>${user.telephone }</th>
							<th>
								<button class="btn btn-success  btn-xs">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true">编辑</span>
								</button>
								<button class="btn btn-danger  btn-xs">
									<span class="glyphicon glyphicon-trash" aria-hidden="true">删除</span>
								</button>
							</th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<!-- 显示分页信息栏 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">当前第${pageInfo.pageNum}页,总共${pageInfo.pages }页, 总${pageInfo.total }条记录</div>
			<!-- 分页条信息 -->
			<div>
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<li><a href="${basePath }/User/user_test_pre?pn=1">首页</a></li>
						<c:if test="${pageInfo.hasPreviousPage}">
							<li><a href="${basePath }/User/user_test_pre?pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
									aria-hidden="true">&laquo;</span>
								</a>
							</li>
						</c:if>
						<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
							<c:if test="${page_Num == pageInfo.pageNum }">
								<li class="active"><a href="#">${page_Num}</a></li>
							</c:if>
							<c:if test="${page_Num != pageInfo.pageNum }">
								<li><a href="${basePath }/User/user_test_pre?pn=${page_Num }">${page_Num}</a></li>
							</c:if>
						</c:forEach>
						<c:if test="${pageInfo.hasNextPage}">
							<li><a href="${basePath }/User/user_test_pre?pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
									aria-hidden="true">&raquo;</span>
								</a>
							</li>
						</c:if>
						<li><a href="${basePath }/User/user_test_pre?pn=${pageInfo.pages }">末页</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>