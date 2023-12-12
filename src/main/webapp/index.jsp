<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Student Management</title>
</head>
	<form action="set-student" method="post">
		<input type="text" placeholder="Enter Student id" name="id" autocomplete="off">
		<input type="text" placeholder="Enter Student Name" name="name" autocomplete="off"> 
		<input type="text" placeholder="Enter Student Number" name="contact" autocomplete="off">
		<input type="submit" value="submit">
	</form>
	<a href="show-all-records">Show All records</a>
	
	
	
</html>