<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function editStudent()
{
	document.fn.action="edit";
	document.fn.submit();
}
function deleteStudent()
{
	document.fn.action="delete";
	document.fn.submit();
}

</script>
</head>
<body>
<h1>Login Success...</h1>
</body>
<form name="fn">
<table border="1">
<tr>
    <th>select</th>
    <th>RollNo</th>
    <th>Name</th>
    <th>Marks</th>
    <th>Contact</th>
    <th>UserName</th>
    <th colspan="2">Action</th>
</tr>

<c:forEach items="${data}" var="s">
<tr>
    <td><input type="radio" name="rollno" value="${s.rollno}"></td>
    <td>${s.rollno}</td>
    <td>${s.sname}</td>
    <td>${s.marks}</td>
    <td>${s.contact}</td>
    <td>${s.username}</td>
    <td><input type="button" value="Edit" onclick="editStudent()"></td>
     <td><input type="button" value="Delete" onclick="deleteStudent()"></td>
</tr>
</c:forEach>
</table>
</form>
</html>