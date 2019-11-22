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

<script src="${basePath}/staticIndex/assets/js/jquery-3.4.1.js"></script>
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
				<table class="table table-hover" id="users_table">
					<thead>
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
					</thead>
					<tbody>
					
					</tbody>
				</table>
			</div>
		</div>
		<!-- 显示分页信息栏 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav"></div>
		</div>
	</div>
	
	<script type="text/javascript">
		//1-页面加载完成以后,直接去发送一个AJAX请求,要到分页数据.
		$(function(){
			//去首页
			to_page(1);
		});
		
		function to_page(pn){
				$.ajax({
					url:"${basePath}/User/user_test",
					data:"pn="+pn,
					type:"GET",
					success:function(result){
						//forTest: console.log(result);
						//1-1解析并显示员工数据
						build_users_table(result);
						//1-2解析显示分页信息
						build_page_info(result);
						//1-3解析显示分页条
						build_page_nav(result);
					}
				});
		}
		
		//1-1解析并显示员工数据
		function build_users_table(result){
			$("#users_table tbody").empty();
			var users = result.extend.pageInfo.list;
			$.each(users,function(index,item){
				//foTest: alert(item.username);
				var user_id = $("<td></td>").append(item.userid);
				var user_name = $("<td></td>").append(item.username);
				var user_passwd = $("<td></td>").append(item.passwd);
				var user_email = $("<td></td>").append(item.email);
				var user_birthday = $("<td></td>").append(item.birthday);
				var user_sex = $("<td></td>").append(item.sex);
				var user_state = $("<td></td>").append(item.state);
				var user_code = $("<td></td>").append(item.code);
				var user_telephone = $("<td></td>").append(item.telephone);	
				/*  Button的构建:		
				<button class="btn btn-success  btn-xs">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true">新增</span>
		    	</button> 
		    	*/
				var editBtn = $("<button></button>").addClass("btn btn-success  btn-xs")
													.append( $("<span></span>").addClass("glyphicon glyphicon-pencil") )
													.append("编辑");
				var delBtn = $("<button></button>").addClass("btn btn-danger  btn-xs")
													.append( $("<span></span>").addClass("glyphicon glyphicon-trash") )
													.append("删除");
				var btnTD = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				$("<tr></tr>").append(user_id)
					.append(user_name)
					.append(user_passwd)
					.append(user_email)
					.append(user_birthday)
					.append(user_sex)
					.append(user_state)
					.append(user_code)
					.append(user_telephone)
					.append(btnTD)
					.appendTo("#users_table tbody");
			});
		}
		
		//1-2解析显示分页信息
		function build_page_info(result){
			 $("#page_info").empty();
			 $("#page_info").append(" 当前第"+result.extend.pageInfo.pageNum+"页, 总共"+result.extend.pageInfo.pages+"页, 总"+result.extend.pageInfo.total+" 条记录")
		}
		
		//1-3解析显示分页条
		function build_page_nav(result){
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append( $("<a></a>").append("首页").attr("href","#") );
			var previousPageLi = $("<li></li>").append( $("<a></a>").append("&laquo;").attr("href","#") );
			
			firstPageLi.click(function(){
				to_page(1);
			});
			
			previousPageLi.click(function(){
				to_page(result.extend.pageInfo.pageNum - 1);
			});
			
			if(result.extend.pageInfo.hasPreviousPage == false){
				firstPageLi.addClass("disabled");
				previousPageLi.addClass("disabled");
			}
			var nextPageLi = $("<li></li>").append( $("<a></a>").append("&raquo;").attr("href","#") );
			var lastPageLi = $("<li></li>").append( $("<a></a>").append("末页").attr("href","#") );
			
			if(result.extend.pageInfo.hasNextPage == false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}
			
			nextPageLi.click(function(){
				to_page(result.extend.pageInfo.pageNum + 1);
			});
			
			lastPageLi.click(function(){
				to_page(result.extend.pageInfo.pages);
			});
			
			//添加首页和前一页
			ul.append(firstPageLi).append(previousPageLi);
			
			$.each(result.extend.pageInfo.navigatepageNums, function(index,item){
				var numLi = $("<li></li>").append( $("<a></a>").append(item).attr("href","#") );
				if(result.extend.pageInfo.pageNum == item){
					numLi.addClass("active");
				}
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			
			//添加下一页和末页
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			$("#page_nav").append(navEle);
		}
	</script>
</body>
</html>