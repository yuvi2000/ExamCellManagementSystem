    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Nominal Roles List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>nominalRoleId</th><th>regno</th><th>name</th><th>yoj</th><th>year</th><th>degree</th><th>dept</th><th>section</th><th>email</th><th>Edit</th></tr>
    <c:forEach var="NominalRole" items="${list}"> 
    <tr>
    <td>${NominalRole.nominalRoleId}</td>
    <td>${NominalRole.regno}</td>
    <td>${NominalRole.name}</td>
    <td>${NominalRole.yoj}</td>
     <td>${NominalRole.year}</td>
     <td>${NominalRole.degree}</td>
     <td>${NominalRole.dept}</td>
     <td>${NominalRole.section}</td>
     <td>${NominalRole.email}</td>
    <td><a href="edit/${NominalRole.nominalRoleId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="nominalRole">Add New Nominal Role</a>