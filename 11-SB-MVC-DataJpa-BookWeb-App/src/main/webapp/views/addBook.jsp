<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Add Book</h3>

	<p>${msg}</p>

	<form:form action="book/addBook" modelAttribute="book" method="POST">
		<table>
			<tr>
				<td>Book Name :</td>
				<td><form:input path="bookName" /></td>
			</tr>
			<tr>
				<td>Author Name :</td>
				<td><form:input path="authorName" /></td>
			</tr>
			<tr>
				<td>Book Price :</td>
				<td><form:input path="bookPrice" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Add Book" /></td>
			</tr>
		</table>
	</form:form>

	<a href="book/viewBooks">View All Books</a>

</body>
</html>