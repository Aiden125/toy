<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="conPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${conPath }/css/style.css" rel="stylesheet">
</head>
<body>

<p>로딩 페이지</p>
<form action="${conPath }/result.do" method="post">
	<input type="hidden" name="mbti" value="${mbtiResult }">
	<input type="submit" value="결과보기">
</form>


</body>
</html>