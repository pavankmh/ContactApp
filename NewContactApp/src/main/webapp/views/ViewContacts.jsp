<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function deleteConfirm(){

return confirm("Are you sure wnat to delete ?");	
}

</script>
<body>
		<font color='green'>${deleteSucMsg}</font><br></br>
	<a href="/ContactApp">Add New Contact</a>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>PhoneNumber</th>
			<th>Email</th>
			<th>ContactId</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.cname}</td>
				<td>${contact.cphoneNo}</td>
				<td>${contact.email}</td>
				<td>${contact.cid}</td>
				<td><a href="editContact?cid=${contact.cid}">Edit</a> <a
					href="deleteContact?cid=${contact.cid}" onclick="return deleteConfirm()">Delete</a></td>

			</tr>

		</c:forEach>


	</table>

</body>
</html>