<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>shop/product::list</title>
	</head>
	<body>
		<h3>Shop/product 목록</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/shop/product/register.do">등록하기</a>
		
		<table border="1">
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>수량</th>
				<th>가격</th>
				<th>회사</th>
				<th>관리</th>
			</tr>
			<c:forEach var = "product" items="${dtoList}">
			<tr>
				<td>${customer.pno}</td>
				<td>${customer.pname}</td>
				<td>${customer.stock}</td><!-- 표현언어에서 getter 호출 안하고 직접 속성 참조해서 출력 가능 -->
				<td>${customer.price}</td>
				<td>${customer.company}</td>
				<td>					
					<a href="#">수정</a>					
					<a href="# ">삭제</a>
				</td>
			</tr>
			</c:forEach>
		</table>		
	</body>
</html>