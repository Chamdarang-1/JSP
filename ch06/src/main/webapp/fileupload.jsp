<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>fileupload</title>
		<!-- 파일 업로드 실습 
		
		JSP 파일 업로드 방식
		1) cos.jar
		- MultipartRequest를 이용한 파일 업로드, 가장 많이 알려진 방식
		- 너무 오래된 라이브러리 지원으로 최신 Java와 호환성이 좋지 않음
		2) apache-fileupload
		
		3) WAS의 part 방식
		
		
		
		
		
		-->
	</head>
	<body>
		<h3>파일 업로드</h3>
		
		<form action="/ch06/proc/fileUpload.jsp" method="post" enctype = "multipart/form-data">
			<input type="text" name="title" placeholder="파일 제목 입력"/><br>
			<input type="text" name="name" placeholder="이름 입력"/><br>
			<input type="file" name="file1" /><br>
			<input type="submit" value = "파일 업로드 전송하기" /><br>
			
		
		
		</form>
		
	</body>
</html>