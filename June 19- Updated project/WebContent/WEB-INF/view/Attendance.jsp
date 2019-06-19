<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<div class="fsize">ATTENDANCE FORM</div><br><br><br>
<label for="hall no">Hall no:</label>
<input type="text" required maxlength="10" minlength="3" size="10"/><br><br>
<table border=1>
<tr>
<th scope="col">S.no</th>
<th scope="col">Reg no</th>
<th scope="col">Name of the student</th>
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
		