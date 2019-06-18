<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<div class="fsize">FACULTY INVIGILATION SCHEDULE</div><br><br><br>
<label for="no">Hall no:</label>
<input type="text" required maxlength="5" minlength="2" size="15"\><br><br>
<label for="date">Date:</label>
<input type="date" required maxlength="5" minlength="2" size="15"\><br><br>
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
    width:50%;
}
table,th
{
    border:1px solid black;
}
</style>
</body>
</html>

		