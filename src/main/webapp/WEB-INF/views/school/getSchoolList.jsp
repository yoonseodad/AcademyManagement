<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학교 관리</title>
</head>
<body>
<center>
<h1><spring:message code="m.board.list.mainTitle" /></h1>
<h3>${userName}<spring:message code="m.board.list.welcome" /><a href="logout_proc.jsp">Log-out</a></h3>

<!-- 검색시작 
<form action="getBoardList.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<td align="right">
		<select name="searchCondition">
 		<c:forEach items="${conditionMap }" var="option">
 			<option value="${option.value}">${option.key }</option>
 		</c:forEach>			
		</select>
		<input name="searchKeyword" type="text" />
		<input name="검색" type="submit" />
	</td>
</table>
</form>
검색종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td bgcolor="#orange" width="100">번호</td>
		<td bgcolor="#orange" width="250">학교 구분</td>
		<td bgcolor="#orange" width="350">학교명</td>
	</tr>

<c:forEach items="${schoolList}" var="school">
	<tr>
		<td>${school.s_seq }</td>
		<td>${school.s_grade }</td>
		<td align="left"><a href="getschool.do?seq=${school.s_seq }">${school.name }</a></td>
	</tr>
</c:forEach>
</table>
<br>
<a href="registration.ricemen">새학교 등록</a>
</center>
</body>
</html>