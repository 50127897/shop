<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<span>${msg}</span>
<form id="uploadPictureByPidForm" action="${pageContext.request.contextPath }/ImageProduct/uploadPictureByPid"  enctype="multipart/form-data" method="post">
		<table width="100%" border=1>
			<tr>
				<td>pid</td>
				<td>
					<input type="text" name="pid"/>
				</td>
			</tr>
			<tr>
				<td>品牌图片</td>
				<td>
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