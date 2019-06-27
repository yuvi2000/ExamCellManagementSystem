    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Faculty Invigilation</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>InvigilationId</th><th>Date</th><th>session</th><th>Hall</th><th>Faculty Name</th><th>Dept</th><th><th>Edit</th></tr>
    <c:forEach var="NominalRole" items="${list}"> 
    <tr>
    <td>${Invigilation.invigilationId}</td>
    <td>${Invigilation.date}</td>
    <td>${Invigilation.session}</td>
    <td>${Invigilation.hallnoId}</td>
     <td>${Invigilation.facultyId}</td>
     <td>${Invigilation.deptId}</td>
    <td><a href="edit/${Invigilation.invigilationId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>

    