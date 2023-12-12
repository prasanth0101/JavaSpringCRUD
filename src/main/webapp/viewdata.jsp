<%@page import="java.util.List"%>
<%@page import="com.student.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Student Management</title>
</head>
<form action="set-student" method="post">
	<input type="text" placeholder="Enter Student id" name="id"
		autocomplete="off"> <input type="text"
		placeholder="Enter Student Name" name="name" autocomplete="off">
	<input type="text" placeholder="Enter Student Number" name="contact"
		autocomplete="off"> <input type="submit" value="submit">
</form>
<table border="1">

	<thead>
		<th>id</th>
		<th>name</th>
		<th>contact</th>


	</thead>

	
		<%
		List<Student> students = (List<Student>) request.getAttribute("alldata");
		for (Student s : students) {
		%>
<tbody>
		<th><%=s.getStudentId()%></th>
		<th><%=s.getStudentName()%></th>
		<th><%=s.getStudentContact()%></th>
		<th> <a href="update/${s.getStudentId()}">update</a> </th>
		<th>delete</th>
		
</tbody>
	<%
		}
		%>
	


</table>



</html>