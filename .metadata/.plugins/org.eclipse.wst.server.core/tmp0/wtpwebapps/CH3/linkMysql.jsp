
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Connection con;
	Statement sql;
	ResultSet rs;
	try{
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch(Exception e){
		out.print(e);
	}
	try{
		String uri="jdbc:mysql://localhost/user";
		con=DriverManager.getConnection(uri,"root","root");
		sql=con.createStatement();
		rs=sql.executeQuery("select * from employee");
		out.print("<table border=2>");
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td>");
			out.print("<td>"+rs.getString(3)+"</td>");
			out.print("<td>"+rs.getString(4)+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		con.close();
	}
	catch(SQLException e1){
		out.print(e1);
	}
	%>
</body>
</html>