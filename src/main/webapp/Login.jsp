<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentLoginForm</title>
<script type="text/javascript">
function checkEmptyValues(){
	if(document.getElementById('userName').value==""){
		alert("Please provide valid Credentials");
		return false;
	}
	if(document.getElementById('password').value==""){
		alert("Please provide valid Credentials");
		return false;
	}
}
</script>
</head>
<body>
<h1 align="center">Student Login Form</h1>
<form action="Login" method="post" onsubmit="return checkEmptyValues()">
  <div align="center"><label>UserName:<input type="text" id="userName" name="userName"></label></div><br>
  <div align="center"><label>Password:<input type="text" id="password" name="password"></label></div><br>
  <div align="center"><input type="submit" value="Login"></div>
</form>

</body>
</html>