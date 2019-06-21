<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

   <body>
<h2><center>SUBJECTS FOR THE CLASSES</center></h2>
<form:form method="post" class="example" action="savePapers" modelAttribute="papers">

Degree:<form:select path="degree" id="degree">
<form:option value="0" label="----Select Degree----"/>
<form:options items="${degreeList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Dept:<form:select path="dept" id="dept">
<form:option value="0" label="----Select Dept----"/>
<form:options items="${deptList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Year:<form:select path="year" id="year">
<form:option value="0" label="----Select Year----"/>
<form:options items="${yearList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Semester:<form:select path="semester" id="semester">
<form:option value="0" label="----Select Semester----"/>
<form:options items="${semesterList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Papers:<form:select path="paper" id="paper">
<form:option value="0" label="----Select Paper----"/>
<form:options items="${paperList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
<button type="Submit">save</button><br><br>
<table border=1>
<tr>
<th scope="col">Degree</th>
<th scope="col">Dept</th>
<th scope="col">Academic year</th>
<th scope="col">Semester</th>
<th scope="col">Subjects</th>
</tr>
</table>
</form:form>
<style type="text/css">
fsize
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
