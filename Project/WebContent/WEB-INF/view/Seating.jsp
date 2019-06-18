<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<!DOCTYPE html>
<html>
   <body>
<div class="fsize">SEATING PLAN</div><br><br><br>
<label for="no">Hall no:</label>
<input type="text" maxlength="10" minlength="3" size="20"\><br><br>
<label for="class">class:</label>
<input type="text" maxlength="10" minlength="3" size="20"\><br><br>
<label for="regno">Regno:</label>
<input type="text" maxlength="10" minlength="3" size="20"\><br><br>
<label for="seats">Seating capacity:</label>
<input type="text" maxlength="10" minlength="3" size="20"\><br><br>
<button type="button"/>Save</button>
<button type="button">Cancel</button><br><br>
<table border=1>
    <tr>
        <th scope="col">S.no</th></th>
        <th scope="col">Hall no</th></th>
        <th scope="col">Class</th></th>
        <th scope="col">Regno</th></th>
        <th scope="col">Total no of students</th></th>
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
}
table
{
border:1px solid black;
width:50%;
}
</style>
</body>
</html>