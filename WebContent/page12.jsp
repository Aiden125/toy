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
	<p class="right">Q12/Q12</p>
	<table id=table>
	<caption class="title">학교 내에서 맘에 드는 사람이 생겼다 나는?</caption>
		<tr>
			<td><a href="../result.do?mbti=P">어떻게 고백하는게 가장 좋지? 고백에 대한 생각부터 한다.</a></td>
		</tr>
		<tr>
			<td><a href="../result.do?mbti=J">나 말고 관심 보이는 사람이 또 있었나? 주변사람부터 떠올려본다.</a></td>
		</tr>
	</table>
</div>

</body>
</html>