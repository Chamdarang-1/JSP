<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Product::modify</title>
	</head>
	<body>
		<h3>Product 수정</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/shop/product/list.do">목록이동</a>
		
		<form action="/ch10/shop/product/modify.do" method="post">
			<table border="1">
				<tr>
					<td>상품번호</td>
					<td><input type="text" name="pno" readonly value="${productDTO.pno}" placeholder="상품번호 입력"/></td>
				</tr>
				<tr>
					<td>상품명</td>
					<td><input type="text" name="pname" value="${productDTO.pname}" placeholder="상품명 입력"/></td>
				</tr>
				<tr>
					<td>수량</td>
					<td><input type="number" name="stock" value="${productDTO.stock}" placeholder="수량 입력"/></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="price" value="${productDTO.price}" placeholder="가격 입력"/></td>
				</tr>
				<tr>
					<td>회사</td>
					<td><input type="text" name="company" value="${productDTO.company}" placeholder="회사 입력"/></td>
				</tr>
				<tr>					
					<td colspan="2" align="right">
						<input type="submit" value="수정하기"/>
					</td>
				</tr>			
			</table>		
		</form>			
	</body>
</html>