<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign in</title>
</head>
<style>
body {
	background: #FF416C !important;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Montserrat', sans-serif !important;
	height: 100vh;
	margin: -20px 0 50px;
	
	
}

h1 {
	font-weight: bold;
	margin: 0;
}

form {
	background-color: #FF416C;
	display: flex !important;
	color: #FFFFFF !important;
	align-items: center !important;
	justify-content: center !important;
	flex-direction: column !important;
	padding: 0 50px;
	height: 100%;
	text-align: center !important;
}

input {
	background-color: #fff;
	border-radius: 20px !important;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 200px;
}

.form-container {
	position: absolute;
	top: 0;
	height: 100%;
	transition: all 0.6s ease-in-out;
}

.sign-in-container {
	left: 0;
	width: 100%;
	z-index: 2;
}

.sing-in-input {
	border-radius: 20px;
	border: 1px solid #FF4B2B;
	background-color: transparent !important;
	border-color: #FFFFFF !important;
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
}
</style>
<body>
	<div class="form-container sign-in-container">
		<form id="form" name="form" method="post" action="login">
			<h1>Sign in</h1>
			<input type="text" name="email" id="email" placeholder="Email" /> 
			<input type="password" name="password" id="password" placeholder="Password" />
			<input class="sing-in-input" type="submit" name="button" id="button" value="Sign In" />
		</form>
	</div>
</body>
</html>