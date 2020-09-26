<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts2</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="header">Forms and Validations</div>
	<div class="container">

		<div class="box2" id="register">
			<h2>Registration</h2>
			<s:form action="register" class="form">
				<s:textfield class="textfield" align="center" name="fullName"
					placeholder="Full Name" />
				<s:textfield class="textfield" align="center" name="email"
					placeholder="Email" />
				<s:password class="pass" align="center" name="password"
					placeholder="Password" />
				<s:password class="pass" align="center" name="confirmPassword"
					placeholder="Confirm Password" />
				<s:submit class="button1" value="Register Me" align="center" />

			</s:form>
		</div>


	</div>
	<div class="footer">Struts2 Framework</div>
</body>
</html>