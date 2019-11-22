<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>用户管理</title>
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
		
		<script type="text/javascript">  
		
		function del(param)
		
		{
		
		         if(window.confirm("您确定要删除"+"李四"+"吗？")){
		
		   		 document.location="DeleteNew?id="+param
		
			}
		
		 }  
		
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
		                    <h1 class="page-header"> 用户列表 </h1>
		                </div>
		            </div>
		    
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="selete">
						<form id="loginform" action="${pageContext.request.contextPath}/backstage/searchUserBackStage" method="post">
							<div class="form-group">
								<ul class="list-inline">
								<li><input type="text" name="name" class="form-control" placeholder="用户名" value="${name}"></li>
								<li><input type="submit" placeholder="" class="btn btn-default" value="查询"></li>											
								</ul>
							</div>				
						</form>
					${tips4}
					<table class="table table-striped ">
					<thead >
						
						<th>用户名</th>
						<th>密码</th>
						<th>邮箱</th>
						<th >生日</th>
						<th>性别</th>
						<th>身份状态</th>
						<th>激活码</th>
						<th>电话</th>
					</thead>
					<tbody >
					
						<c:forEach var="users" items="${pageInfo.list}"  >  		
						<tr class="hehe">
							<td>${users.username}</td>
							<td>${users.passwd}</td>
							<td>${users.email}</td>
							<td><fmt:formatDate value="${users.birthday}" pattern="yyyy-MM-dd "/></td>    			
							<td>${users.sex}</td>
							<td>${users.state}</td>
							<td>${users.code}</td>
							<td>${users.telephone}</td>
							<td>
								<div class="btn-group">
								<a href="${pageContext.request.contextPath}/backstage/updateUserBackStage?userid=${users.userid}" class="btn btn-default">修改</a>
								<a href="${pageContext.request.contextPath}/backstage/deleteUserBackStage?userid=${users.userid}"  class="btn btn-danger">删除</a>
								
								</div>
								</td>
						</tr>
						</c:forEach>   		
					</tbody>
					</table>
					
					
						<ul class="pagination">
							<li><a href="${pageContext.request.contextPath}/backstage/searchUserBackStage?name=${name}&pn=1">首页</a></li>
							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchUserBackStage?name=${name}&pn=${pageInfo.pageNum - 1 }" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
									</a>
								</li>
							</c:if>
							<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == pageInfo.pageNum }">
									<li class="active"><a href="#">${page_Num}</a></li>
								</c:if>
								<c:if test="${page_Num != pageInfo.pageNum }">
									<li><a href="${pageContext.request.contextPath}/backstage/searchUserBackStage?name=${name}&pn=${page_Num }">${page_Num}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a href="${pageContext.request.contextPath}/backstage/searchUserBackStage?name=${name}&pn=${pageInfo.pageNum + 1 }" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
									</a>
								</li>
							</c:if>
							<li><a href="${pageContext.request.contextPath}/backstage/searchUserBackStage?name=${name}&pn=${pageInfo.pages }">末页</a></li>
						</ul>
					
<!-- 					<ul class="pagination" style="float: right;"> -->
<%-- 						<li><a href="javascript:void(0)">${user.currentPage}/${user.totalPage}页</a></li> --%>
<!-- 						<li><a href="/myDemo/login?currentPage=1">首页</a></li> -->
<%-- 						<li><a href="/myDemo/login?currentPage=${user.currentPage-1}">上页</a></li> --%>
<%-- 						<li><a href="/myDemo/login?currentPage=${user.currentPage+1}">下页</a></li> --%>
<%-- 						<li><a href="/myDemo/login?currentPage=${user.totalPage}">尾页</a></li> --%>
<!-- 						<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li> -->
<!-- 					</ul> -->
				</div>
			</div>
			
		
		
			
			
			
		            
		
		            
		                
		            <!-- </div>
		            <!-- /. ROW  -->
					<!-- <footer><p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p></footer>
		        </div> -->
		        <!-- /. PAGE INNER  --> 
		    </div>
		    <!-- /. PAGE WRAPPER  -->
		</div>
		</div>
		</div>
	</body>
</html>
