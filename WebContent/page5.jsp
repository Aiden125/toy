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
	<p class="right">Q5/Q12</p>
	<table id=table>
	<caption class="title">반갑게 인사하며 지나가는 친구에게 인사를 했다. 하지만 이름이 기억나지 않는다 나는?</caption>
		<tr>
			<td><a href="../page6.do?mbti=S">쟤 이름이 뭐였지? 이따 친구한테 물어봐야겠다.</a></td>
		</tr>
		<tr>
			<td><a href="../page6.do?mbti=N">쟤 이름이 뭐였더라? 괜히 스스로 떠올리고 싶은 오기가 생긴다.</a></td>
		</tr>
	</table>
</div>

</body>
</html>