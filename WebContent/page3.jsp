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
	<p class="right">Q3/Q12</p>
	<table id=table>
	<caption class="title">점심시간이 되었다. 혼밥할까?</caption>
		<tr>
			<td><a href="../page4.do?mbti=E">같이 먹을 수 있는데 굳이?</a></td>
		</tr>
		<tr>
			<td><a href="../page4.do?mbti=I">혼밥해도 될만한거면 혼밥하지 뭐</a></td>
		</tr>
	</table>
</div>

</body>
</html>