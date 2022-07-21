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
	<p class="right">Q9/Q12</p>
	<table id=table>
	<caption class="title">술마신 다음 날 늦은 오후까지 연락이 안되는 친구 나는?</caption>
		<tr>
			<td><a href="${conPath }/page10.do?mbti=F">래도 그렇지 이정도면 무슨일 있는거 아니야?</a></td>
		</tr>
		<tr>
			<td><a href="${conPath }/page10.do?mbti=T">늦게까지 자네</a></td>
		</tr>
	</table>
</div>

</body>
</html>