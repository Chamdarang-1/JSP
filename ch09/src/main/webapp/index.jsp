<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index</title>
		<%-- MVC 아키텍처 실습하기 
			
			index.jsp
			- MVC 아키텍처 구조의 시작페이지
			- 요청 주소 생략
		
		--%>
	</head>
	<body>
		<h3>MVC 아키텍처 실습</h3>
		
		<h4>MVC 기본</h4>
		<a href = "/ch09/hello.do">hello</a><br>
		<a href = "/ch09/welcome.do">welcome</a><br>
		<a href = "/ch09/greeting.do">greeting</a><br>
		
		<h4>USER1 CRUD</h4>
		<a href = "/ch09/user1/list.do">user1 목록</a>
	</body>
</html>