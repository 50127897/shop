<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<span>${msg}</span>
	<form action="${pageContext.request.contextPath }/Brands/showAllBrands"
		method="post">
		<table width="100%" border=1>
			<tr>
				<td>bid</td>
				<td>bname</td>
				<td>brRoute</td>
				<td>operation</td>
			</tr>
			<c:forEach items="${queryAllBrands}" var="brands" varStatus="status">
				<tr>
					<td><input type="text" name="items[${status.index }].bid" value="${brands.bid}"></td>
					<td><input type="text" name="items[${status.index }].bname" value="${brands.bname}"></td>	
					<td>		
						<c:if test="${brands.brRoute !=null}">
							<img src="/pic/${brands.brRoute}" width=300 height=300/>
							<br/>
						</c:if>
					</td>
					<td><a href="${pageContext.request.contextPath }/Brands/updateBrandsByBid?bid=${brands.bid}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>