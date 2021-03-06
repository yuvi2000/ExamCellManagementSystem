<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<div class="menuBox">
<h2><center>FACULTY INVIGILATION</center></h2>
<form:form method="post" class="example" action="saveInvigilation" modelAttribute="invigilation">
Hall no:<form:select path="hallnoId" id="hall">
<form:option value="0" label="----Select Hall----"/>
<form:options items="${hallList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Date:<form:input type="date" path="date"/><br><br>
Session:<form:select path="session" id="degree">
<form:option value="0" label="--Select Session--"/>
<form:option value="FN"/>
<form:option value="AN"/>
</form:select><br><br>
Faculty Name:<form:select path="facultyId" id="facultyId">
<form:option value="0" label="----Select Faculty----"/>
<form:options items="${facultyList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Dept:<form:select path="deptId" id="dept">
<form:option value="0" label="----Select Dept----"/>
<form:options items="${deptList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
<button type="Submit">save</button><br><br>
<table>
<br><br>
<tr>
<th scope="col">S.no</th>
<th scope="col">Date</th>
<th scope="col">Session</th>
<th scope="col">Hall no</th>
<th scope="col">Name of the faculty</th>
<th scope="col">Dept</th>
<th scope="col">Signature</th>
</tr>
</table>
</form:form>
</div>
<style type="text/css">
body{
  font-family:"Arial", Serif;
  background-color:#f4f4f4;
  overflow-x:hidden;
  background-image:url("https://images.pexels.com/photos/7103/writing-notes-idea-conference.jpg?cs=srgb&dl=check-class-desk-7103.jpg&fm=jpg");
  background-size:cover;
  width:50%;
}
.menuBox
{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width: 1010px;
	height: 600px;
	padding: 80px 40px;
	box-sizing: border-box;
	background:#a9a9a9;
	opacity:0.8;
}

.fsize
{
font-size:25px;
text-align:center;
font-weight:bold;
}
table
{
    border-collapse:collapse;
    width:50%;
}
table,th
{
    border:1px solid black;
}
</style>
</body>
</html>

		