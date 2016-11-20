<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head><%@ include file="includes/cabecera.jsp"%>
<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) -->
</head>
<body>
	<%@ include file="includes/menuPrincipal.jsp"%><!-- MENU NAVEGACION -->
	<div class="row paddingMenuPrincipal">
		<div class="col-sm-1"></div>

		<div class="col-sm-10">
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading textoCentrado">
						<h3 class="panel-title">Por favor, complete los siguientes
							datos de registro</h3>
					</div>
					<div class="panel-body">
						<form:form action="registroOk" method="POST" modelAttribute="usuario">

							<label for="nombre">Nombre</label>
							<form:input path="nombre" id="nombre" type="text" pattern="{4-16}" placeholder="Ingresar Nombre (Minimo 4 Letras. Maximo 16)" class="form-control" />

							<label for="apellido">Apellido</label>
							<form:input path="apellido" id="apellido" type="text" pattern="{4-16}" placeholder="Ingresar Apellido (Minimo 4 Letras. Maximo 16)" class="form-control" />

							<label for="apellido">Email</label>
							<form:input path="email" id="email" type="text"	placeholder="Ingresar Correo Electronico" class="form-control"/>

							<label for="password">Password</label>
							<form:input path="password" name="psw1" id="password" type="password" pattern="{6-32}" placeholder="Ingresar Password (Minimo 6 digitos. Maximo 32)" class="form-control" />

							<br>
							<input class="form-control btn btn-success" type="submit" value="Enviar">
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
	
</body>
</html>