<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//전송 데이터 수신
	//내장 객체라서 new request로 선언해줄 필요 없음
	String queryString = request.getQueryString();
	String uid = request.getParameter("uid");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>



<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>요청 결과(전송 데이터 수신)</h3>
		
		<p>
			쿼리스트링 : <%= queryString %><br/>
			아이디 : <%= uid %><br/>
			이름 : <%= name %><br/>
			나이 : <%= age %><br/>
		</p>
		<a href="../1_Request.jsp">뒤로가기</a>
	</body>
</html>