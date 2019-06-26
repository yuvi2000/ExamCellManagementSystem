    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Seating Arrangements</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>seatingId</th><th>hallno</th><th>class</th><th>Regnumbers</th><th>Total no of students</th><th>EDIT</th></tr>
    <c:forEach var="Seating" items="${list}"> 
    <tr>
    <td>${Seating.seatingId}</td>
    <td>${Seating.hallName}</td>
    <td>${Seating.className}</td> 
    <td>${Seating.regnumbers}</td>
    <td>${Seating.noofstudents}</td>
     <td><a href="Edit/${Seating.seatingId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
      