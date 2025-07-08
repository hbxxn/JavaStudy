<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${ contextPath }/js/jquery-3.7.1.min.js"></script>
<style>
	h1>a{color: black; text-decoration: none;}
	h1>a:active{color: orangered;}
</style>
</head>
<body>
	<c:set value="${ pageContext.servletContext.contextPath }" var="contextPath" scope="application"/>
	<h1 align="center"><a href="${ contextPath }">JSP&amp;Servlet JDBC Project</a></h1>
</body>
</html>