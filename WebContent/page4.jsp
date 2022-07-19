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
	<p class="right">Q4/Q12</p>
	<table id=table>
	<caption class="title">내 뒷담을 까고 다니는 친구가 있다는 소문이 들려온다</caption>
		<tr>
			<td><a href="../page5.do?mbti=S">진짠가? 다른애들한테 좀 물어봐야겠다</a></td>
		</tr>
		<tr>
			<td><a href="../page5.do?mbti=N">내가 걔한테 뭐 했나? 일단 지켜보자</a></td>
		</tr>
	</table>
</div>

</body>
</html>