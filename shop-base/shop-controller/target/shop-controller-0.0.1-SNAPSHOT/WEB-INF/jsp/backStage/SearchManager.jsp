<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>普通管理员管理</title>
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
		                    <h1 class="page-header"> 普通管理员列表 </h1>
		                </div>
		            </div>
		   
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
						<form action="${pageContext.request.contextPath}/backstage/searchManagerBackStage" method="post">
							<div class="form-group">
								<ul class="list-inline">
								<li><input type="text" name="name" class="form-control" placeholder="用户名" value="${name}"></li>
								<li><input type="submit"  class="btn btn-default" value="查询"></li>
								<li><a class="btn btn-default" href="${pageContext.request.contextPath}/backstage/addManagerPageBackStage" role="button">添加管理员</a></li>				
								</ul>
							</div>				
						</form>
				
		
			<table class="table table-striped ">
			<thead >
				
				<th>用户名</th>
				<th>密码</th>
				<th>邮箱</th>
				<th>生日</th>
				<th>身份状态</th>
				<th>电话</th>
			</thead>
			<tbody >
			
				<c:forEach var="employee2" items="${pageInfo.list}"  >  		
				<tr class="hehe">
					
					<td>${employee2.ename}</td>
					<td>${employee2.epassword}</td>
					<td>${employee2.email}</td>
					<td><fmt:formatDate value="1998-11-12" pattern="yyyy-MM-dd "/>${employee2.ehiretime}</td> 
					<td>
						<c:if test="${employee2.estate eq '1'}">
							高级管理员
						</c:if>
						<c:if test="${employee2.estate eq '2'}">
							普通管理员
						</c:if>
						<c:if test="${employee2.estate eq '3'}">
							客服人员
						</c:if>
					<input type="hidden" name="eid" value="${employee2.eid}">
					</td>
					<td>${employee2.etelephone}</td>
					<td>
						<div class="btn-group">
		    			<a href="${pageContext.request.contextPath}/backstage/updateManagerPageBackStage?eid=${employee2.eid}" class="btn btn-default">修改</a>
		    			<a href="${pageContext.request.contextPath}/backstage/deleteManagerBackStage?eid=${employee2.eid}"  class="btn btn-danger">删除</a>
		    			${tips2}
		    			</div>
		    			</td>
				</tr>
				
				</c:forEach>  
				
				 		
			</tbody>
			</table>
			
			<ul class="pagination">
							<li><a href="${pageContext.request.contextPath}/backstage/searchManagerBackStage?name=${name}&pn=1">首页</a></li>
							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchManagerBackStage?name=${name}&pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == pageInfo.pageNum }">
									<li class="active"><a href="#">${page_Num}</a></li>
								</c:if>
								<c:if test="${page_Num != pageInfo.pageNum }">
									<li><a href="${pageContext.request.contextPath}/backstage/searchManagerBackStage?name=${name}&pn=${page_Num }">${page_Num}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchManagerBackStage?name=${name}&pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<li><a href="${pageContext.request.contextPath}/backstage/searchManagerBackStage?name=${name}&pn=${pageInfo.pages }">末页</a></li>
						</ul>
		           
		           
		           
		           
					</div>
				</div>
		
		    </div>
		    
		</div>
	</body>.
	<script type="text/javascript">  
		
		function del(param)
		
		{
			var ename = param;
			alert(ename);
		         if(window.confirm("您确定要删除"+param+"吗？")){
		
		   		 document.location="DeleteNew?id="+param
		
			}
		
		 }   
		
		</script> 
</html>
