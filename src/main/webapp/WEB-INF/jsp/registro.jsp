<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head><%@ include file="includes/cabecera.jsp" %>	<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) --></head>
<body>
<%@ include file="includes/menuPrincipal.jsp" %><!-- MENU NAVEGACION -->
<div class="row paddingMenuPrincipal">
	<div class="col-sm-1"></div>
	
	<div class="col-sm-10">
		<div class="col-sm-12">
			<div class="panel panel-default">
	  		<div class="panel-heading textoCentrado"><h3 class="panel-title">Por favor, complete los siguientes datos de registro</h3></div>
	  		<div class="panel-body">	
				<form:form action="registroOk" method="POST" modelAttribute="usuario">
			    		
					<label for="nombre">Nombre</label>
					<form:input path="nombre" id="nombre" type="text" placeholder="Ingresar Nombre" class="form-control" />
					
					<label for="apellido">Apellido</label>
					<form:input path="apellido" id="apellido" type="text" placeholder="Ingresar Apellido" class="form-control" />
					
					<label for="apellido">Email</label>
					<form:input path="email" id="email" type="text" placeholder="Ingresar Correo Electronico" class="form-control" />
					
					<label for="password">Password</label>
					<form:input path="password" id="password" type="password" placeholder="Ingresar Password" class="form-control" />
					
					<%-- Como se pone la verificacion del password --%>
					<label for="passwordDos">Confirmar Password</label>
					<form:input path="password" id="passwordDos" type="text" placeholder="Vuelva a ingresar su password" class="form-control" />
					
					<label for="telefono">Telefono Celular</label>
					<form:input path="telefono" id="telefono" type="text" placeholder="Ej: 1152688785" class="form-control" />
					
					<!--  FECHA DE NACIMIENTO -->
					<%-- 
					<label for="fechaNacimiento">Fecha de Nacimiento:</label>
	        		<form:input path="diaNacimiento" type="text" class="form-control" placeholder="DD" name="fechaNacDia" pattern="[0-9]{1,2}" required />
	       			<form:input path="mesNacimiento" type="text" class="form-control" placeholder="MM" name="fechaNacMes" pattern="[0-9]{1,2}" required />
	        		<form:input path="AnnoNacimiento" type="text" class="form-control" placeholder="AAAA" name="fechaNacAnno" pattern="[0-9]{4,4}" required />
	        		--%>
					<br>
					<input class="form-control btn btn-success" type="submit" value="Enviar">
				</form:form>
	  		</div>
	  	</div>
	  </div>
	</div>
</div>
<%@ include file="includes/pie.jsp" %><!-- PIE (Incluye los script de bootstrap) -->   
</body>
</html>