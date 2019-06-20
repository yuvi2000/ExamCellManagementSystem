<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<div class="fsize">DISPATCHMENT OF ANSWER SHEETS</div><br><br><br>
<label for="no">Class:</label>
<select id="name">   
<option for="name"> </option>
</select>
<br><br>
<table>
<tr>
<th scope="col">class</th>
<th scope="col">Subject</th>
<th scope="col">No of students</th>
<th scope="col">No of absentees</th>
<th scope="col">Total no of answer sheets</th>
<th scope="col">Faculty</th>
<th scope="col">Receiver's sign</th>
</tr>
</table>
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
    width:100%;
}
table,th
{
    border:1px solid black;
}
button
{
width:10%;
}
</style>
</body>
</html>

		