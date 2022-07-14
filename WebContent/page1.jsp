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
<%
	session.setAttribute("E", 0);
	session.setAttribute("I", 0);
	session.setAttribute("S", 0);
	session.setAttribute("N", 0);
	session.setAttribute("F", 0);
	session.setAttribute("T", 0);
	session.setAttribute("P", 0);
	session.setAttribute("J", 0);
%>

<div id=wrap>
	<form action="../page2.jsp" method="post">
		<p>Q1/Q12</p>
		<h4>어색한 분위기의 OT 나는?</h4>
		<table id=table>
			<tr>
				<td><a href="../page2.jsp?E=E">잘 맞을거 같은 사람에게 먼저 다가간다</a></td>
			</tr>
			<tr>
				<td><input type="button" name="page1" value="I" onclick="../page2.jsp">일단은 기다리며 주위를 둘러본다</td>
			</tr>
		</table>
			<br><input type="submit" value="다음질문" id="submit">
	</form>
</div>
</body>
</html>