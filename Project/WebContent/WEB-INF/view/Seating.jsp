<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <body>
   <form:form method="post" class="example" action="saveSeating" modelAttribute="seating">
<div class="fsize">SEATING PLAN</div><br><br><br>
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
Regno:<form:select path="nominalRoleId" id="nominalRoleId">
<form:option value="0" label="----Select Regno----"/>
<form:options items="${regnoList}" itemValue="id" itemLabel="value"/> 
</form:select><br><br>
Total no of students:<form:input path="noofstudents" id="noofstudents"/><br><br>

<button type="submit">Save</button>
<button type="button">Cancel</button><br><br>
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
<style type="text/css">
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