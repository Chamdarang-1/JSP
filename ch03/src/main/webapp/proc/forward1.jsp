<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
		<h3>forward1 페이지</h3>
		<%
			// 서버 내에서 페이지 처리 이동
			pageContext.forward("../1_Request.jsp");
		%>
	</body>
</html>