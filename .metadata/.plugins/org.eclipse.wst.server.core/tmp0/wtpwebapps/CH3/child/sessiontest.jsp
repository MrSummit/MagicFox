<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String chse=session.getId();
		String pase=request.getParameter("se");
	%>
	<p>当前session对象ID为:</p>
	<%=chse%><br/>
	<%if(chse.equals(pase)){%>
		<p>session相同</p>
	<%} %>
</body>
</html>