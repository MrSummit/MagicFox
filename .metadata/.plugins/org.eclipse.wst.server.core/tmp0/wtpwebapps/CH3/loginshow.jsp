<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String user=(String)session.getAttribute("user");
	String pswd=(String)session.getAttribute("pswd");
	String tuser=request.getParameter("user");
	String tpswd=request.getParameter("pswd");
	if(user==null)
	{
		user="";
	}
	if(pswd==null)
		pswd="";
	%>
	<%if(user.equals(tuser)&&pswd.equals(tpswd)){ %>
		<p>登陆成功</p>
		用户名:<%=user %>
		密码:<%=pswd %>
	<%}else {%>
		<p>登陆失败,请重新登陆</p>
		<a href="login.jsp">登陆</a>
		<a href="zhuce.jsp">注册 </a>
	<%} %>
</body>
</html>