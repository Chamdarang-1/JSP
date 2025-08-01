<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>college/student::modify</title>
	</head>
	<body>
		<h3>college/student 수정</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/college/student/list.do">목록이동</a>
		
		<form action="/ch10/college/student/modify.do" method="post">
			<table border="1">
				<tr>
					<td>학번</td>
					<td><input type="text" name="stdNo" readonly value="${studentDTO.stdNo}" placeholder="아이디 입력"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${studentDTO.name}" placeholder="이름 입력"/></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input type="date" name="birth" readonly value="${studentDTO.birth}"/></td>
				</tr>
				<tr>
					<td>전공</td>
					<td>
						<select name = "major">
							<option>국문학과</option>
							<option>영문학과</option>
							<option>경제학과</option>
							<option>컴퓨터학과</option>
							<option>경영학과</option>
							<option>심리학과</option>
							<option>지리학과</option>
							<option>수학과</option>
						</select>
					</td>
				</tr>
				<tr>
				<tr>					
					<td colspan="2" align="right">
						<input type="submit" value="수정하기"/>
					</td>
				</tr>			
			</table>		
		</form>			
	</body>
</html>