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
	<p class="right">Q7/Q12</p>
	<table id=table>
	<caption class="title">어색한 분위기의 OT 나는?</caption>
		<tr>
			<td><a href="${conPath }/page8.do?mbti=F">괜찮아?이번에 어렵긴 했어ㅠㅠ</a></td>
		</tr>
		<tr>
			<td><a href="${conPath }/page8.do?mbti=T">뭐야 그래도 나보다 잘 봤는데?</a></td>
		</tr>
	</table>
</div>

</body>
</html>