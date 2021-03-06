<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <body>
   <form:form method="post" class="example" action="saveSeating" modelAttribute="seating">
<div class="menuBox">
<h2><center>SEATING PLAN</center></h2>
Hallno:<form:select path="hallnoId" id="hall">
<form:option value="0" label="----Select hall----"/>
<form:options items="${hallList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Year:<form:select path="yearId" id="year">
<form:option value="0" label="----Select Year----"/>
<form:options items="${yearList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Degree:<form:select path="degreeId" id="degree">
<form:option value="0" label="----Select Degree----"/>
<form:options items="${degreeList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Section:<form:select path="sectionId" id="section">
<form:option value="0" label="----Select Section----"/>
<form:options items="${sectionList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
From:<form:select path="nominalRolefrom" id="from">
<form:option value="0" label="----Select Regno----"/>
<form:options items="${regnoList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
upto:<form:select path="nominalRoleupto" id="upto" onChange="str()">
<form:option value="0" label="----Select Regno----"/>
<form:options items="${regnoList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Total no of students:<form:input path="noofstudents" id="noofstudents" onblur="str();"/><br><br>

<button type="submit">Save</button>
<button type="button">Cancel</button><br><br>
<script> 
function str()
{
	
	var from = document.getElementById("from").options[document.getElementById("from").selectedIndex].text;
	var upto = document.getElementById("upto").options[document.getElementById("upto").selectedIndex].text;
	//var noofstudents = document.getElementById("noofstudents").text;
		
	if((from.substr(0,5) == upto.substr(0,5)) && from.substr(5)>0 && upto.substr(5))
	{
		var regnumberfrom =from.substr(5);
		var regnumberupto =upto.substr(5);
		
		var noofstudents =(regnumberupto-regnumberfrom)+1;
		if(noofstudents >0)
			document.getElementById("noofstudents").value = noofstudents;
		else
			alert("Choose valid regno!");
	}
	else
	{
			alert("Choose valid regno!");
	}
	}
	</script>
<table border=1>
    <tr>
        <th scope="col">S.no</th>
        <th scope="col">Hall no</th>
        <th scope="col">Class</th>
        <th scope="col">Regno</th>
        <th scope="col">Total no of students</th>
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
}
table
{
border:1px solid black;
width:50%;
}
</style>
</body>
</html>