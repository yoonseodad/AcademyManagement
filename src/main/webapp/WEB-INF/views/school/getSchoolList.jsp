<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%
/*
	EL 과 JSTL 로 대체 
	BoardVO board = new BoardVO();
	BoardDAO boardDAO = new BoardDAO();
	List<BoardVO> list = boardDAO.getBoardList(board);

	List<BoardVO> list = (List)session.getAttribute("boardList");
	*/	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1><spring:message code="m.board.list.mainTitle" /></h1>
<h3>${userName}<spring:message code="m.board.list.welcome" /><a href="logout_proc.jsp">Log-out</a></h3>

<!-- 검색시작 -->
<form action="getBoardList.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
	<td align="right">
		<select name="searchCondition">
		<!-- 
			<option value="TITLE">제목</option>
			<option value="TITLE">내용</option>
 		-->
 		<c:forEach items="${conditionMap }" var="option">
 			<option value="${option.value}">${option.key }</option>
 		</c:forEach>			
		</select>
		<input name="searchKeyword" type="text" />
		<input name="검색" type="submit" />
	</td>
</table>
</form>
<!-- 검색종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td bgcolor="#orange" width="100">번호</td>
		<td bgcolor="#orange" width="200">제목</td>
		<td bgcolor="#orange" width="150">작성자</td>
		<td bgcolor="#orange" width="150">등록일</td>
		<td bgcolor="#orange" width="100">조회수</td>
	</tr>

<c:forEach items="${boardList}" var="board">
	<tr>
		<td>${board.seq }</td>
		<td align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
		<td>${board.writer }</td>
		<td>${board.regdate }</td>
		<td>${board.cnt }</td>
	</tr>
</c:forEach>
</table>
<br>
<a href="insertBoard.jsp">새글 등록</a>
</center>
</body>
</html>