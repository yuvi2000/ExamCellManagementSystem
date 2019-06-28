<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<html>
		<head>
		<meta charset="utf-8">
			<meta http-equiv="Content-Type"
				content="text/html; charset=ISO-8859-1">
				
				<link rel="stylesheet">
			<title>Login</title>
		</head>
		<body>
			<form:form id="loginForm" modelAttribute="login"
				action="loginProcess" method="post">
				
			<div class="loginBox">
			<img src="https://png.pngtree.com/svg/20170418/287473299e.png" class="user">
			<h2>Login Here</h2>
			<form action="LoginCheck.jsp" method="post">
				<form:label path="username">
								Username:
							</form:label>	
							<form:input path="username" id="username" placeholder="Enter username"/>		
							<form:label path="password">
								Password:
							</form:label>	
							<form:password path="password"
								id="password" placeholder="Enter Password"/>
				
                   <form:button id="login" type="submit" value="login" path="login">login
                   </form:button>	
			</form>
				
			</form:form>
			
			
	</body>
	<style>
	body
{
	margin: 0;
	padding: 0;
	background-image:url("https://www.sagefrog.com/wp-content/uploads/2016/06/Laptop-000089829865_Large-830x400.jpg");
	background-size: cover;
	background-width:100;
	font-family: sans-serif;
}
.loginBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 350px;
	height: 420px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}

.sanBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 600px;
	height: 500px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}


.menuBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 1040px;
	height: 500px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}

.mapBox
{
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 1280px;
	height: 600px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}
.user
{
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/2);
	left: calc(50% - 50px);
}
h2
{
	margin: 0;
	padding: 0 0 20px;
	color: #efed40;
	text-align: center;
}
h3
{
	color: #efed40;
}
h1
{
	color: #efed40;
	text-align: center;
}
.loginBox p
{
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #fff;
}
.loginBox input
{
	width: 100%;
	margin-bottom: 20px;
}
.loginBox input[type="text"],
.loginBox input[type="password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
::placeholder
{
	color: rgba(255,255,255,.5);
}
.loginBox button[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
	background: #fb2525;
	width: 230px;
	cursor: pointer;
	border-radius: 20px;
}
.loginBox button[type="submit"]:hover
{
	background: #efed40;
	color: #262626;
}
.loginBox a
{
	color: #fff;
	font-size: 14px;
	font-weight: bold;
	text-decoration: none;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 10px;
    overflow: hidden;
    background-color: #333;
}

li {
    float: right;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: skyblue;
}

.active {
    background-color: red;
    
    
    
	
	</style>
</html>
		