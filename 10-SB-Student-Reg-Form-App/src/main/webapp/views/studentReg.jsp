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

	<h3>Register Here</h3>

	<h3><font color='green'>${succMsg}</font></h3>

	<form:form action="register" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="pwd" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
						path="gender" value="F" /> Fe-Male</td>
			</tr>

			<tr>
				<td>Course :</td>
				<td><form:select path="course">
						<form:option value="">-Select-</form:option>
						<form:options items="${courses}"/>
					</form:select></td>
			</tr>

			<tr>
				<td>Preferrable Timings :</td>
				<td>
					<form:checkboxes items="${timings}" path="preferrableTimings"/>
				</td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>