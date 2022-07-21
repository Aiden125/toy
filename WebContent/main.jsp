<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="conPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<%
	String conPath = request.getContextPath();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${conPath }/css/style.css" rel="stylesheet">
<style>
	h3{
		margin-top:100px;
	}
</style>
</head>
<body>
<div id="wrap">
		<h3>자고 일어났는데 20살, <br>대학교 1학년이 되어있다면?</h3>
		<table id="table">
		</table>
			<br><input type="button" onclick="location.href='${conPath}/page1.do'" value="시작하기" id="submit">
</div>
</body>
</html>