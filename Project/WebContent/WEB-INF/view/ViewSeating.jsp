    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Seating Arrangements</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>seatingId</th><th>Hallno</th><th>year</th><th>degree</th><th>section</th><th>Regno</th><th>Total no of students</th><th>EDIT</th></tr>
    <c:forEach var="Seating" items="${list}"> 
    <tr>
    <td>${Seating.seatingId}</td>
    <td>${Seating.hallnoId}</td>
    <td>${Seating.yearId}</td>
    <td>${Seating.degreeId}</td>
    <td>${Seating.sectionId}</td>
    <td>${Seating.nominalRoleId}</td>
     <td>${Seating.noofstudents}</td>
    <td><a href="Edit/${Seating.seatingId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
      