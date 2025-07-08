<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#loginbar{text-align: right; margin: 50px;}
	#loginbar>a{color: black; text-decoration: none;}
	#loginbar>a:hover{font-weight: bold; text-decoration: underline;}
</style>
</head>
<body>
	<div id="loginbar">
		<c:if test="${ empty loginUser }">
			<a href="${ contextPath }/LoginView.me">로그인</a>
		</c:if>
		<c:if test="${ !empty loginUser }">
			<b>${ loginUser.empName }님, 반갑습니다.</b><br/><br/>
			<a href="${ contextPath }/editPage.me">내 정보 수정</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/logout.me">로그아웃</a>
		</c:if>
	</div>
</body>
</html>