<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String sideA = new String(request.getParameter("sideA").getBytes("ISO-8859-1"),"utf-8");
	String button=new String(request.getParameter("submit").getBytes("ISO-8859-1"),"utf-8");
	%>
	<p>当前session对象ID为:</p>
	<%String se=session.getId() ;%>
	<%=se %>
	<%if (sideA.length()==0) 
		response.sendRedirect("example3_1.jsp");
	%>
	host的值为:<%=request.getHeader("host") %>
	<br/>button的值为:<%=button %>
	<%if (button.length()>0){%>
	a的值为:<%=sideA %>
	<%} %>
	<%if(sideA.equals("123")) {%>
	<jsp:forward page="./child/sessiontest.jsp" >
		<jsp:param name="se" value="<%=se %>"/>
	</jsp:forward >
	<%} %>
</body>
</html>