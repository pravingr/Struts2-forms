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
		<div class="box1" id="login">
			<h2>Login</h2>
			<s:form action="login" class="form">
				<s:textfield class="textfield" align="center" name="email"
					placeholder="Email" />
				<s:password class="pass" align="center" name="password"
					placeholder="Password" />
				<s:submit class="button1" value="Log Me In" align="center" />

			</s:form>
		</div>

	</div>
	<div class="footer">Struts2 Framework</div>
</body>
</html>