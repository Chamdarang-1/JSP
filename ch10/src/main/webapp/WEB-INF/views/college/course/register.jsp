<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>College/Course::register</title>
	</head>
	<body>
		<h3>College/Course 등록</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/college/course/list.do">목록이동</a>
		
		<form action="/ch10/college/course/register.do" method="post">
			<table border="1">
				<tr>
					<td>수강번호</td>
					<td><input type="text" name="stdno" placeholder="학번 입력"/></td>
				</tr>
				<tr>
					<td>강의명</td>
					<td><input type="text" name="name" placeholder="이름 입력"/></td>
				</tr>
				<tr>
					<td>학점</td>
					<td><input type="date" name="birth" /></td>
				</tr>
				<tr>
					<td>개설학과</td>
				</tr>
				<tr>					
					<td colspan="2" align="right">
						<input type="submit" value="등록하기"/>
					</td>
				</tr>			
			</table>		
		</form>
	</body>
</html>