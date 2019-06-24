    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Papers List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>paperId</th><th>degree</th><th>dept</th><th>year</th><th>semester</th><th>paper</th><th>Edit</th></tr>
    <c:forEach var="Papers" items="${list}"> 
    <tr>
    <td>${Papers.paperId}</td>
    <td>${Papers.degreeName}</td>
    <td>${Papers.deptName}</td>
    <td>${Papers.yearName}</td>
    <td>${Papers.semesterName}</td>
     <td>${Papers.paperName}</td>
    <td><a href="Edit/${Papers.paperId}">Edit</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
  