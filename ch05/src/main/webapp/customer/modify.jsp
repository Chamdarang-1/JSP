<%@page import="vo.CustomerDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String cid = request.getParameter("cid");

	CustomerDTO customer = null;
	
	try{
	// DBCP 커넥션 풀 가져오기
		Context ctx = (Context) new InitialContext().lookup("java:comp/env"); // java 기본 환경 객체
		DataSource ds =(DataSource) ctx.lookup("jdbc/joseph8034"); // jdbc/joseph8034 커넥션 풀 객체 검색
	
		Connection conn = ds.getConnection();
		
		String sql = "SELECT * FROM CUSTOMER WHERE CID=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, cid);
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next()){
			customer = new CustomerDTO();
			customer.setCid(rs.getString(1));
			customer.setName(rs.getString(2));
			customer.setHp(rs.getString(3));
			customer.setAddress(rs.getString(4));
			customer.setRdate(rs.getString(5));
		}
		
		rs.close();
		psmt.close();
		conn.close();	
		
	}catch(Exception e){
		e.printStackTrace();
	}
	

%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer::modify</title>
	</head>
	<body>
		<h3>Customer 수정</h3>
		
		<a href = " /ch05/dbcp.jsp">처음으로</a>
		<a href = " /ch05/customer/list.jsp">목록이동</a>
		<form action="/ch05/customer/proc/modify.jsp" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type = "text" name ="cid" placeholder="아이디 입력"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type = "text" name ="name" placeholder="이름 입력"/></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type = "text" name ="hp" placeholder="휴대폰 입력(- 포함)"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type = "text" name ="address" placeholder="주소 입력"/></td>
				</tr>
				<tr>
					<td>등록일</td>
					<td><input type = "date" name ="rdate"/></td>
				</tr>
				<tr>
					<td colspan="2" align= "right">
						<input type = "submit" value = "수정하기"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>