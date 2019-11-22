<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body>
<span>${msg}</span>
	<form action="${pageContext.request.contextPath }/Product/showAllProduct"
		method="post">
		<table width="100%" border=1>
			<tr>
				<td>pid</td>
				<td>pname</td>
				<td>shopPrice</td>
				<td>marketPrice</td>
				<td>pdate</td>
			</tr>
			<tr>
				<td>pdesc</td>
				<td>pflag</td>
				<td>cid</td>
				<td>psale</td>
				<td>bid</td>
			</tr>
			<tr>
				<td>searchinformation</td>
				<td>imageProducts</td>
				<td>operation</td>
			</tr>
			<c:forEach items="${queryAllProductWithIMG}" var="product" varStatus="status">
				<tr>
					<td><input type="text" name="items[${status.index }].pid" value="${product.pid}"></td>
					<td><input type="text" name="items[${status.index }].pname" value="${product.pname}"></td>	
					<td><input type="text" name="items[${status.index }].shopPrice" value="${product.shopPrice}"></td>
				    <td><input type="text" name="items[${status.index }].marketPrice" value="${product.marketPrice}"></td>
					<td><input type="text" name="items[${status.index }].pdate" value='<fmt:formatDate value="${product.pdate}" pattern="yyyy-MM-dd HH:mm:ss" />'></td> 	
				</tr>
				<tr>
					<td><input type="text" name="items[${status.index }].pdesc" value="${product.pdesc}"></td>
				    <td><input type="text" name="items[${status.index }].pflag" value="${product.pflag}"></td>
					<td><input type="text" name="items[${status.index }].cid" value="${product.cid}"></td>
					<td><input type="text" name="items[${status.index }].psale" value="${product.psale}"></td>
					<td><input type="text" name="items[${status.index }].bid" value="${product.bid}"></td>
				</tr>
				<tr>
					<td><input type="text" name="items[${status.index }].searchinformation" value="${product.searchinformation}"></td>
				</tr>
				<tr>
					<c:forEach items="${product.imageProducts}" var="imageProduct">
						<td >
							<img alt="#" style="width:200px; height:auto" src="/pic/${imageProduct.ipRoute}"/>
							<a>${imageProduct.ipRoute}</a>
						</td>
					</c:forEach>
				</tr>
			</c:forEach>

		</table>
	</form>
</body>

</html>