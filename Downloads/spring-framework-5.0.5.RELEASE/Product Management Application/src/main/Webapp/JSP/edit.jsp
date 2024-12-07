<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Page...</h1>
<form action="update">
<pre>
Roll NO   : <input type="text" name="rollno" value="${stu.rollno}"> <br>
Name      : <input type="text" name="sname" value="${stu.sname}"> <br>
Marks     : <input type="text" name="marks" value="${stu.marks}"> <br>
Contact   : <input type="text" name="contact" value="${stu.contact}"> <br>
UserName  : <input type="text" name="username" value="${stu.username}"> <br>
Password  : <input type="text" name="password" value="${stu.password}"> <br>
<input type="submit" value="update">
</pre>
</form>
</body>
</html>