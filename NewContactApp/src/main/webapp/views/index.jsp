<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Contact Info Formmm</h1>
<font color='green'>${succMsg}</font>
<font color='red'>${errMsg}</font>
<font color='green'>${updateMsg}</font>

 	<form:form method="POST" action="saveContact" modelAttribute="contactDTO">
		<table>
			<tr>
				<td><form:label path="cname">Contact Name</form:label></td>
				<td><form:input path="cname" />
				</td>
				<td><form:input path="cid"  type="hidden"/>
				</td>
				
				
			</tr>
			<tr>
				<td><form:label path="email">Contact Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="cphoneNo">Contact Number</form:label></td>
				<td><form:input path="cphoneNo" /></td>
			</tr>
			<tr>
			    <td ><input type="reset" value="Reset" /></td>
				<td ><input type="submit" value="Submit" /></td>
				
			</tr>
		</table>
	</form:form> 
	<a href="viewAllContacts">View All Contacts</a>
</body>
</html>