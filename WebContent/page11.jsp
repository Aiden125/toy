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
	<p class="right">Q11/Q12</p>
	<table id=table>
	<caption class="title">학교가는 중 교수님께 온 휴강 문자 나는?</caption>
		<tr>
			<td><a href="${conPath }/page12.do?mbti=P">개이득? 일단 기분이 좋고 당장 비게 된 시간에 뭐할지 생각한다</a></td>
		</tr>
		<tr>
			<td><a href="${conPath }/page12.do?mbti=J">아 어차피 나중에 보강할텐데 미리 좀 알려주지..</a></td>
		</tr>
	</table>
</div>

</body>
</html>