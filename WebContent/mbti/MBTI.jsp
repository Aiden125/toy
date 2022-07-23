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
<style>
	p{
		text-align:left;
		margin-left:20px;
	}
</style>
</head>
<body>
한꺼번에 모아두는 임시 페이지

<c:if test="${mbti eq 'ENFJ'}">
ENFJ입니다
</c:if>

<c:if test="${mbti eq 'ENFP'}">
ENFP입니다
</c:if>


<c:if test="${mbti eq 'ENTJ'}">
ENTJ입니다
</c:if>

<c:if test="${mbti eq 'ENTP'}">
ENTP입니다
</c:if>


<c:if test="${mbti eq 'ESFJ'}">
ESFJ입니다
</c:if>

<c:if test="${mbti eq 'ESFP'}">
ESFP입니다
</c:if>


<c:if test="${mbti eq 'ESTJ'}">
ESTJ입니다
</c:if>

<c:if test="${mbti eq 'ESTP'}">
ESTP입니다
</c:if>



<c:if test="${mbti eq 'INFJ'}">
INFJ입니다
</c:if>

<c:if test="${mbti eq 'INFP'}">
INFP입니다
</c:if>


<c:if test="${mbti eq 'INTJ'}">
INTJ입니다
</c:if>

<c:if test="${mbti eq 'INTP'}">
INTP입니다
</c:if>


<c:if test="${mbti eq 'ISFJ'}">
ISFJ입니다
</c:if>

<c:if test="${mbti eq 'ISFP'}">
ISFP입니다
</c:if>


<c:if test="${mbti eq 'ISTJ'}">
ISTJ입니다
</c:if>

<c:if test="${mbti eq 'ISTP'}">
ISTP입니다
</c:if>
</body>
</html>