<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><%@ include file="includes/cabecera.jsp" %>	<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) --></head>
<body>
<br><br><br>
<div class="col-sm-2"></div>
<div class="col-sm-8">
<div class="panel panel-default">
  <div class="panel-heading">Registro Exitoso!!</div>
  <div class="panel-body">
    Gracias por registrarte en SolucionesYA <b>${usuario.nombre} ${usuario.apellido}</b>, recuerda que tu password es: "<b>${usuario.password}</b>"
  </div>
</div>
</div>
<div class="col-sm-2"></div>
</body>
</html>