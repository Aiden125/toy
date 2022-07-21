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

<div id="wrap">
	<p class="right">Q1/Q12</p>
	<table id="table">
	<caption class="title">어색한 분위기의 OT 나는?</caption>
		<tr>
			<td><a href="${conPath }/page2.do?mbti=E">잘 맞을거 같은 사람에게 먼저 다가간다</a></td>
		</tr>
		<tr>
			<td><a href="${conPath }/page2.do?mbti=I">일단은 기다리며 주위를 둘러본다</a></td>
		</tr>
	</table>
</div>

</body>
</html>