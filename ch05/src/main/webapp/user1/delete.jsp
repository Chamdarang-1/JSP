<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String user_id = request.getParameter("user_id");

	// DB INSERT
	String host = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "joseph8034";
	String pass = "1234";

try{
	// 드라이버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	// DB 접속
	Connection conn = DriverManager.getConnection(host, user, pass);
	
	PreparedStatement psmt = conn.prepareStatement("DELETE FROM USER1 WHERE USER_ID = ?");
	psmt.setString(1, user_id);

	psmt.executeUpdate();
	

	psmt.close();
	conn.close();
	
	}catch(Exception e){
		e.printStackTrace();
	}

	response.sendRedirect("./list.jsp");

%>