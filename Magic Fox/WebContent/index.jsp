<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="sql" class="model.home.Theme" scope="page"/>
	<%
		ResultSet study,work,life;
		study=sql.getStudy();
		work=sql.getWork();
		life=sql.getLife();
	%>
<!DOCTYPE html ./View/Home/Public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Magic fox</title>
<link rel="stylesheet" href="./View/Home/Public/CSS/index.css">
</head>
<body>
	<div class="head">
		<div class="logo">
			<img src="./View/Home/Public/Image/logo.png" alt="logo">
		</div>
		<div class="about">
			<a href="">Attention</a>
			<a href="">Log</a>
		</div>
		<div class="message">
			<p>let us change the world</p>
		</div>
		<div class="join">
			<p><a href="">Join Me And Enjoy The World</a></p>
		</div>
	</div>
		<!--结束head部分-->
		<!--开始nav部分-->
	<div class="nav">
		<ul>
			<li>
				<img src="./View/Home/Public/Image/study.png" class="nav-./View/Home/Public/Image">
				<a href="" class="nav-a">study</a>
			</li>
			<li>
				<img src="./View/Home/Public/Image/work.png" class="nav-./View/Home/Public/Image">
				<a href="" class="nav-a">work</a>
			</li>
			<li>
				<img src="./View/Home/Public/Image/life.png" class="nav-./View/Home/Public/Image">
				<a href="" class="nav-a">life</a>
			</li>
		</ul>
	</div>
	<!--结束nav部分-->
	<!--开始main部分-->
	<div class="main">
	
		<div class="clude">
			<div class="article study">
				<h1>stay hungry , stay foolish</h1>
				<%while(study.next()) {%>
				<div class=<%="'theme "+study.getString(3)+"'" %>>
					<img src=<%="'./View/Home/Public/Image/Index/"+study.getString(3)+".jpg'" %>>
					<form action="" class="title">
						<input type="hidden" name="title" value=<%=study.getString(3)%>>
						<input type="submit" value=<%=study.getString(4)%>>
					</form>
					<p><%=study.getString(5)%>
				</div>
				<%} %>
			</div>
			<div class="article work">
				<h1>Work is worth doing of worth doing well</h1>
				<%while(work.next()) {%>
				<div class=<%="'theme "+work.getString(3)+"'" %>>
					<img src=<%="'./View/Home/Public/Image/Index/"+work.getString(3)+".jpg'" %>>
					<form action="" class="title">
						<input type="hidden" name="title" value=<%=work.getString(3)%>>
						<input type="submit" value=<%=work.getString(4)%>>
					</form>
					<p><%=work.getString(5)%>
					</p>
				</div>
				<%} %>
			</div>
			<div class="article life">
				<h1>Love rules my kingdom without a sword</h1>
				<%while(life.next()) {%>
				<div class=<%="'theme "+life.getString(3)+"'" %>>
					<img src=<%="'./View/Home/Public/Image/Index/"+life.getString(3)+".jpg'" %>>
					<form action="" class="title">
						<input type="hidden" name="title" value=<%=life.getString(3)%>>
						<input type="submit" value=<%=life.getString(4)%>>
					</form>
					<p><%=life.getString(5)%>
					</p>
				</div>
				<%} %>
				
			</div>
		</div>
	</div>
	<!--main部分结束-->
	<div class="footer">
		<ul>
			<li><a href="">Home</a></li>
			<li><a href="">About</a></li>
			<li><a href="">Contact</a></li>
			<li><a href="">More</a></li>
		</ul>
		<p>Direct by <a href="">Summit</a></p>
	</div>
</body>
</html>