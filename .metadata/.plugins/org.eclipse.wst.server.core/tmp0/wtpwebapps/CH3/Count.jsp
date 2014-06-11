<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="circle" class="tom.jiafei.Circle" scope="page">
		<%circle.setRadius(23); %>
		<p>面积为:<%=circle.cirleArea()%></p>
		<p>周长为:<%=circle.cricleLength() %></p>
	</jsp:useBean>
</body>
</html>