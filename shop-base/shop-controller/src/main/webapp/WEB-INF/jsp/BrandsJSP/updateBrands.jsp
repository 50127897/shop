<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改品牌信息</title>
</head>
<body> 
<span>${msg}</span>
	<form id="brandForm" action="${pageContext.request.contextPath }/Brands/updateBrands"  enctype="multipart/form-data" method="post">
		<input type="text" name="bid" value="${brands.bid }" />修改品牌信息
		<table width="100%" border=1>
			<tr>
				<td>品牌名</td>
				<td>
					<input type="text" name="bname" value="${brands.bname }" />
				</td>
			</tr>
			<tr>
				<td>品牌图片</td>
				<td>
					<c:if test="${brands.brRoute !=null}">
						<img src="/pic/${brands.brRoute}" width=300 height=300/>
						<br/>
					</c:if>
					<input type="file"  name="pictureFile"/> 
				</td>
			</tr>	
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>

</html>