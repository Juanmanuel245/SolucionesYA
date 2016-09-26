<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="registro" method="post" modelAttribute="usuario">
<img src="../images/logo.png">
		Nombre
		<form:input path="nombre" />

		Apellido
		<form:input path="apellido" />

		<input type="submit" value="Enviar">
		
	</form:form>
</body>
</html>