<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<div class="fsize">HALL SLIP</div><br><br><br>
<label for="no">Hall no</label>
<input type="text" required maxlength="10" minlength="3" size="15"\><br><br>
<label for="date">Date</label>
<input type="date"\><br><br>
<label for="session">Session</label>
<select id="session">
<option for=""></option>
<option for="FN">FN</option>
<option for="AN">AN</option>
</select><br><br>
<table>
<tr>
<th scope="col">S.no</th>
<th scope="col">Class</th>
<th scope="col">Regno</th>
<th scope="col">Absentees Regno</th>
<th scope="col">Total present</th>
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
</style>
</body>
</html>

		