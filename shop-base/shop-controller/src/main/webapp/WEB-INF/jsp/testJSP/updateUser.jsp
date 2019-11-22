<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
</head>
<body> 
<span>${msg}</span>
	<form id="userForm"	action="${pageContext.request.contextPath }/User/updateUser" method="post">
		<input type="text" name="userid" value="${user.userid }" />修改用户信息
		<table width="100%" border=1>
			<tr>
				<td>username</td>
				<td><input type="text" name="username" value="${user.username }" /></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value="${user.email }" /></td>
			</tr>
			<tr>
				<td>birthday</td>
				<td><input type="text" name="birthday" value="${user.birthday }" /></td>
			</tr>
			<tr>
				<td>sex</td>
				<td><input type="text" name="sex" value="${user.sex }" /></td>
			</tr>
			
			<tr>
				<td>telephone</td>
				<td><input type="text" name="telephone" value="${user.telephone }" /></td>
			</tr>
			<tr>
				<td>passwd</td>
				<td><input type="text" name="passwd" value="${user.passwd }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" /></td>
			</tr>
		</table>

	</form>
</body>

</html>