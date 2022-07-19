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
	<p class="right">Q8/Q12</p>
	<table id=table>
	<caption class="title">가장 친한 친구와 좋아하는 선배가 겹친걸 나만 알게됐다 나는?</caption>
		<tr>
			<td><a href="../page9.do?mbti=F">음.. 많이 좋아하나? 나는 일단 모른 척 해야겠다</a></td>
		</tr>
		<tr>
			<td><a href="../page9.do?mbti=T">선택은 그 선배가 하는거니까 상관없지 않나?</a></td>
		</tr>
	</table>
</div>

</body>
</html>