<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <body>
   <form:form method="post" class="example" action="saveSeating" modelAttribute="seating">
<div class="fsize">SEATING PLAN</div><br><br><br>
Hall no:<form:input path="hallno"/><br><br>
Year:<form:input path="year" id="year"/><br><br>
Degree:<form:input path="degree" id="degree"/><br><br>
Section:<form:input path="section" id="section"/><br><br>
Regno:<form:input path="regno" id="regno"/><br><br>
Seating Capacity:<form:input path="seats" id="seats"/><br><br>
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