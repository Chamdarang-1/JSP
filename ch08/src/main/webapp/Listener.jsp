<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 세션 가져오기
	String sessId = (String) session.getAttribute("sessUser");


%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listener</title>
		<!-- 서블릿 실습하기 -->
		
	</head>
	<body>
		<h3>Listener 실습하기</h3>
		
		<% if(sessId == null){ %>
		<form action="/ch08/login.do" method="post"><br>
			<input type="text" name="id"/><br>
			<input type="password" name="pw"/><br>
			<input type="submit" value="로그인"/>
		
		</form>
		<%}else { %>
		<p>
			<%= sessId %>님 반갑습니다.<br>
			<a href = "/ch08/logout.do">로그아웃</a>
		</p>
		
		<%} %>
	</body>
</html>