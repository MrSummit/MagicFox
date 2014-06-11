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
		session.setAttribute("user", tuser);
		session.setAttribute("pswd", tpswd);
		 %>
		 <p>注册成功</p>
		<a href="login.jsp">登陆 </a>
	
</body>
</html>