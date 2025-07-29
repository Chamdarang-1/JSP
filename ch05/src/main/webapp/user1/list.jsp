<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.User1VO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String host = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "joseph8034";
	String pass = "1234";
	
	List<User1VO> users = new ArrayList<>();

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이버를 메모리에 등록
		Connection conn = DriverManager.getConnection(host, user, pass); //DB에 실제로 접속
		
		Statement stmt = conn.createStatement(); //SQL문을 실행할 수 있는 객체 생성
		
		String sql = "SELECT * FROM USER1"; 
		ResultSet rs = stmt.executeQuery(sql);// SQL을 실행해서 결과를 받아옴
		
		while(rs.next()){
			
			User1VO vo = new User1VO();
			vo.setUser_id(rs.getString(1));// rs.getString(1)은 첫번째 컬럼값, 즉 USER_ID(SQL)를 꺼내는 것
			vo.setName(rs.getString(2));
			vo.setHp(rs.getString(3));
			vo.setAge(rs.getInt(4));
			
			users.add(vo); // 한 줄씩 데이터를 꺼내서 User1VO 객체로 만들고 users 리스트에 담는 과정 
		}
	
		rs.close();
		stmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}

	

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::list</title>
	</head>
	<body>
		<h3>User1 목록</h3>
		
		<a href = " ../jdbc.jsp">처음으로</a>
		<a href = " ./register.jsp">등록하기</a>
		
		<table border ="1">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>휴대폰</th>
				<th>나이</th>
				<th>관리</th>
			</tr>
			
			<%for (User1VO user1VO : users){ %>
			<tr>
				<td><%= user1VO.getUser_id() %></td>
				<td><%= user1VO.getName() %></td>
				<td><%= user1VO.getHp() %></td>
				<td><%= user1VO.getAge() %></td>
				<td>
					<!-- 수정하고자 하는 사용자 아이디를 modify.jsp로 전송 -->
					<a href = "./modify.jsp?user_id=<%=user1VO.getUser_id()%>">수정</a>
					<a href = "./delete.jsp?user_id=<%= user1VO.getUser_id()%>">삭제</a>
				</td>
			</tr>	
			<% } %>
		</table>
	</body>
</html>