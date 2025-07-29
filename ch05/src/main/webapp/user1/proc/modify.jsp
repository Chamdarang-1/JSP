<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

// 전송 데이터 수신
	String user_id = request.getParameter("user_id");
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String age = request.getParameter("age");
	
	// DB INSERT
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "joseph8034";
		String pass = "1234";
	
	try{
		// 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// DB 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		 
		// SQL 실행 객체 생성		
		Statement stmt = conn.createStatement();
		
		String sql = "UPDATE USER1 SET name='"+name+ "', hp='" + hp+"',age=" +age +" ";
			sql += "WHERE user_id='"+user_id+"'";
		// SQL 실행
		stmt.executeUpdate(sql);
		
		// DB 종료
		stmt.close();
		conn.close();
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	// 목록이동
	response.sendRedirect("../list.jsp");



%>