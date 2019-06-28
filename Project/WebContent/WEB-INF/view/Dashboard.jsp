<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Dashboard</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <nav class="navbar">
    <span class="open-slide">
      <a href="#" onclick="openSlideMenu()">
        <svg width="30" height="30">
            <path d="M0,5 30,5" stroke="#fff" stroke-width="5"/>
            <path d="M0,14 30,14" stroke="#fff" stroke-width="5"/>
            <path d="M0,23 30,23" stroke="#fff" stroke-width="5"/>
        </svg>
      </a>
    </span>
<ul class="navbar-nav">
		    
		       <li> <a href="logOut">logout</a></li>
               <li><a href="" >About</a></li>
		       <li><a href="">Home</a></li>    	
		  
    </ul>
  </nav>
  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="/ExamCell/nominalRole">NominalRole</a>
    <a href="/ExamCell/papers">Papers</a>
    <a href="/ExamCell/timetable">Timetable</a>
    <a href="/ExamCell/seating">Seating plan</a>
    <a href="/ExamCell/invigilation">Faculty Invigilation</a>
    <a href="/ExamCell/attendance">Attendance</a>
    <a href="/ExamCell/hallslip">Hall Slip</a>
    <a href="/ExamCell/dispatch">Dispatch</a>
  </div>

  <div id="menuBox">
       <h1>Welcome!</h1>
       <h1>You have been successfully logged in</h1>
       
  </div>
  

  <script>
    function openSlideMenu(){
      document.getElementById('side-menu').style.width = '250px';
      document.getElementById('main').style.marginLeft = '250px';
    }

    function closeSlideMenu(){
      document.getElementById('side-menu').style.width = '0';
      document.getElementById('main').style.marginLeft = '0';
    }
  </script>
<style type="text/css">

body{
  font-family:"Arial", Serif;
  background-color:#f4f4f4;
  overflow-x:hidden;
  background-image: url("https://images.pexels.com/photos/7103/writing-notes-idea-conference.jpg?cs=srgb&dl=check-class-desk-7103.jpg&fm=jpg");
  background-size:cover;
}

li {
    float: right;
}
h1
{
	color: #ffffff;
	text-align: center;
}


.menuBox
{
	position: absolute;
	top: 50%;
	left: 60%;
	transform: translate(-50%,-50%);
	width: 800px;
	height: 500px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0,0,0,.5);
}

.navbar{
  background-color:#111;
  overflow:hidden;
  height:63px;
  opacity:0.9;
}

.navbar a{
  float:left;
  display:block;
  color:#f2f2f2;
  text-align:center;
  padding:14px 16px;
  text-decoration:none;
  font-size:17px;
}

.navbar ul{
  margin:8px 0 0 0;
  list-style:none;
}

.navbar a:hover{
  background-color:#ddd;
  color:#000;
}

.side-nav{
  height:100%;
  width:0;
  position:fixed;
  z-index:1;
  top:0;
  left:0;
  background-color:#111;
  opacity:0.9;
  overflow-x:hidden;
  padding-top:60px;
  transition:0.5s;
}

.side-nav a{
  padding:10px 10px 10px 30px;
  text-decoration:none;
  font-size:22px;
  color:#ccc;
  display:block;
  transition:0.3s;
}

.side-nav a:hover{
  color:#fff;
}

.side-nav .btn-close{
  position:absolute;
  top:0;
  right:22px;
  font-size:36px;
  margin-left:50px;
}

#main{
  transition:margin-left 0.5s;
  padding:20px;
  overflow:hidden;
  width:100%;
  color:white;
}

@media(max-width:568px){
  .navbar-nav{display:none}
}

@media(min-width:568px){
  /*.open-slide{display:none}*/
}
.navbar-nav
{
color:white;
}
</style>
</body>
</html>
    