<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index</title>
		<%--
				JSP 로그와 배포 실습하기
				
			로그
			- 시스템의 실행 과정 및 서비스 개선을 위한 작업
			- 로그 단계별 기록을 통해 서비스 개선
			
			라이브러리(maven 다운로드)
			- logback-classic-1.5.18.jar
			- logback-core-1.5.18.jar
			-slf4j-api-2.0.17.jar
			
			로그 설정
			- WEB-INF > classes 폴더 생성 > logback.xml 파일 생성
			- https://logback.qos.ch/manual/configuration.html 에서 설정 XML 복사
			
			배포
			- 이클립스 프로젝트 > export > war생성
			- C:\Users\사용자\apache-tomcat-10.1.43\bin\startup.bat 실행
			- C:\Users\사용자\apache-tomcat-10.1.43\webapps 폴더에 배포파일(ch10.war) 업로드 후 Deploy 확인 후 브라우저 확인
		 --%>
	</head>
	<body>
		<h3>JSP 로그와 배포</h3>	
		
		<h4>Shop</h4>
		<a href = "/ch10/shop/customer/list.do">CUSTOMER CRUD</a>
		<a href = "/ch10/shop/product/list.do">PRODUCT CRUD</a>
		
		
		<h4>College</h4>
		<a href = "/ch10/college/student/list.do">STUDENT CRUD</a>
	</body>
</html>