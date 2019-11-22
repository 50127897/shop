<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户列表</title>
</head>
<body>
<span>${msg}</span>
	<form action="${pageContext.request.contextPath }/User/showAllUser"
		method="post">
		<table width="100%" border=1>
			<tr>
				<td>userid</td>
				<td>username</td>
				<td>passwd</td>
				<td>email</td>
				<td>birthday</td>
				<td>sex</td>
				<td>state</td>
				<td>code</td>
				<td>telephone</td>
				<td>operation</td>
			</tr>
			<c:forEach items="${queryAllUser}" var="user" varStatus="status">
				<tr>
					<td><input type="text" name="items[${status.index }].userid" value="${user.userid}"></td>
					<td><input type="text" name="items[${status.index }].username" value="${user.username}"></td>	
					<td><input type="text" name="items[${status.index }].passwd" value="${user.passwd}"></td>
				    <td><input type="text" name="items[${status.index }].email" value="${user.email}"></td>
					<td><input type="text" name="items[${status.index }].birthday" value='<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd HH:mm:ss" />'></td> 
					<td><input type="text" name="items[${status.index }].sex" value="${user.sex}"></td>
					<td><input type="text" name="items[${status.index }].state" value="${user.state}"></td>
					<td><input type="text" name="items[${status.index }].code" value="${user.code}"></td>
					<td><input type="text" name="items[${status.index }].telephone" value="${user.telephone}"></td>
					<td><a href="${pageContext.request.contextPath }/User/updateUserByUserid?userid=${user.userid}">修改</a></td>
				</tr>
			</c:forEach>

		</table>
	</form>
</body>

</html>