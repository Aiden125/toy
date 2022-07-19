<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String conPath = request.getContextPath();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=conPath%>/css/style.css" rel="stylesheet">
</head>
<body>

<div id="wrap">
	<p class="right">Q2/Q12</p>
	<table id=table>
	<caption class="title">아직은 어색한 무리가 더 놀자고 한다 나는?</caption>
		<tr>
			<td><a href="../page3.do?mbti=E">즐겨야지 일단 가보자</a></td>
		</tr>
		<tr>
			<td><a href="../page3.do?mbti=I">좀 더 친해지면 가자</a></td>
		</tr>
	</table>
</div>

</body>
</html>