<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>当前session对象ID为:</p>
	<%String se=session.getId() ;%>
	<%=se %>
	<br/>
	<form action="computer.jsp" method="get" name="form">
		<input type="text" name="sideA" value="1" size="6">
		<input type="submit" value="提交" name="submit"> 
	</form>
</body>
</html>