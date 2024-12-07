<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body{
   background-color:aqua;
}
.btn{
   background-color:maroon;
   color:white;
}
</style>

</head>
<body>
<h1>Login Page...</h1>
<form action="login">
<pre>
UserName : <input type="text" name="username"><br>
Password : <input type="text" name="password"><br>
<input class="btn" type="submit" value="login"><br>
<a href="register">Register Here</a>
</pre>
</form>
</body>
</html>