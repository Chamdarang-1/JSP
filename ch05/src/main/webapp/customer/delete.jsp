<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

//전송 데이터 수신
	String cid = request.getParameter("cid");

	try{
	// DBCP 커넥션 풀 가져오기
	Context initCtx = new InitialContext(); /// 환경 객체 생성
	Context ctx = (Context) initCtx.lookup("java:comp/env"); // java 기본 환경 객체
	DataSource ds =(DataSource) ctx.lookup("jdbc/joseph8034"); // jdbc/joseph8034 커넥션 풀 객체 검색
	
	// 커넥션 풀에서 접속 커넥션 가저오기
	Connection conn = ds.getConnection();
	
	// SQL 실행객체
	String sql = "DELETE FROM CUSTOMER WHERE CID = ?";
	PreparedStatement psmt= conn.prepareStatement(sql);
	
	psmt.setString(1, cid);
	
	// SQL 실행
	psmt.executeUpdate();
	
	// 종료
	psmt.close();
	conn.close();
	
	}catch(Exception e){
		e.printStackTrace();
	}

//목록 이동
response.sendRedirect("/ch05/customer/list.jsp");
