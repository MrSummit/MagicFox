<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>create Theme</title>
</head>
<body>
	<div class="main">
		<jsp:useBean id="sql" class="model.home.Theme" scope="page"/>
		<jsp:setProperty property="belong" name="sql"/>
		<jsp:setProperty property="title" name="sql"/>
		<jsp:setProperty property="link" name="sql"/>
		<jsp:setProperty property="intro" name="sql"/>
		<jsp:setProperty property="action" name="sql"/>
		<form action="" method="post">
			所属模块:<input type="text" name="belong">
			主题:<input type="text" name="title">
			名称<input type="text" name="link">
			</br>
			简介<textarea rows="10" cols="30" name="intro">	
			</textarea>
			<input type="submit" value="提交" >
			<input type="hidden" name="action" value="1">
		</form>
		<jsp:getProperty name="sql" property="info"/>
	</div>
</body>
</html>