<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H3>View Books</H3>

	<a href="bookForm">Add New Book</a>
	<table>
		<thead>
			<tr>
				<th>Book Name</th>
				<th>Author Name</th>
				<th>Book Price</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${books}" var="b">
				<tr>
					<td>${b.bookName}</td>
					<td>${b.authorName}</td>
					<td>${b.bookPrice}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>