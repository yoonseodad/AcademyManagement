<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
/**
	EL로 대체
		
	String seq = request.getParameter("seq");

	boardVO vo = new boardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDao = new BoardDAO();
	boardVO boardVO = boardDao.getBoard(vo);

	boardVO boardVO = (boardVO) session.getAttribute("boardVO");
	boardVO vo = (boardVO) session.getAttribute("vo");
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
<h1>글 상세</h1>
<a href="logout_proc.jsp">Log-out</a>
<hr />
<form action="updateBoard.do" method="post">
<input type="hidden" name="seq" value="${boardVO.seq }" />
	<table border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input name="title" type="text" value="${boardVO.title }" /></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">작성자</td>
			<td align="left">${boardVO.writer }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">내용</td>
			<td align="left">
				<textarea name="content" cols="40" rows="10">${boardVO.content }</textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">등록일</td>
			<td align="left">${boardVO.regdate }</td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">조회수</td>
			<td align="left">${boardVO.cnt }</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="글 수정" /></td>
		</tr>
	</table>
</form>
<hr />
<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=${boardVO.seq }">글 삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do">글 목록</a>&nbsp;&nbsp;&nbsp;
</center>

</body>
</html>