<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
</head>
<body>
<form:form method="post" class="example" action="saveTimetable" modelAttribute="timetable">

<div class="fsize">TIMETABLE ENTRY</div><br>
<table border=1>
<tr>
<th scope="col" date="draw">class</th>
<th scope="col" class="draw">Date</th>
<th scope="col" class="draw">Date</th>
<th scope="col" class="draw">Date</th>
</caption>
</tr>
</table><br><br>
</form:form>
<button type="submit">Save</button>
<button type="button">Reset</button>
<button type="button">Cancel</button>
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
table
{
border:1px solid black;
}
</style>
</body>
</html>

		