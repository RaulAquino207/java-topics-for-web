<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
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
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
}

h1 {
	font-weight: bold;
	margin: 0;
}

</style>
<body>
			<%!
			boolean checkNullOrEmpty(String phrase){
				if(phrase == null || phrase == ""){
					return true;
				}else{
					return false;	
				}	
			}
			%>
			<%
			String fullName = (String)request.getAttribute("fullName");
			String email = (String)request.getAttribute("email");
			String subject = (String)request.getAttribute("subject");
			String content = (String)request.getAttribute("content");
			
			if((!checkNullOrEmpty(fullName)|| !checkNullOrEmpty(email) || !checkNullOrEmpty(subject) || !checkNullOrEmpty(content))){
				out.println("<h1>Result : <h1>");
			}
			
			if(!checkNullOrEmpty(fullName)){
				out.println("<p> full name : " + fullName + "</p>");
			}
			if(!checkNullOrEmpty(email)){
				out.println("<p> email : " + email + "</p>");
			}
			if(!checkNullOrEmpty(subject)){
				out.println("<p> subject : " + subject + "</p>");
			}
			if(!checkNullOrEmpty(content)){
				out.println("<p> content : " + content + "</p>");
			}
			%>
</body>
</html>