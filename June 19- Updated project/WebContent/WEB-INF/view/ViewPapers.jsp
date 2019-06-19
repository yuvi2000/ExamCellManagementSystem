    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Papers List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>paperId</th><th>degree</th><th>dept</th><th>year</th><th>semester</th><th>paper</th><th>Edit</th></tr>
    <c:forEach var="Papers" items="${list}"> 
    <tr>
    <td>${Papers.paperId}</td>
    <td>${Papers.degree}</td>
    <td>${Papers.dept}</td>
    <td>${Papers.year}</td>
    <td>${Papers.semester}</td>
     <td>${Papers.paper}</td>
    <td><a href="edit/${Papers.paperId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="papers">Add New Papers</a>