<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#errorDiv{border: 1px solid black; margin: auto; margin-top: 150px; padding: 150px; width: 500px;}
	#errorDiv>a{color: black; text-decoration: none;}
	#errorDiv>a:hover{font-wight: bold; text-decoration: underline; cursor: pointer;}
</style>
</head>
<body>
	<jsp:include page="top.jsp" />
	<div align="center" id="errorDiv">
		<h1>${ msg } </h1>
		<br/>
		<a href="javascript:history.back();">이전 페이지</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="${ contextPath }">메인으로</a>
	</div>
</body>
</html>