<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="es">
<head><%@ include file="includes/cabecera.jsp"%>
<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) -->
</head>

<body>

	<!-- MENU NAVEGACION -->
	<%@ include file="includes/menuPrincipal.jsp"%>
	<!-- FIN MENU NAVEGACION -->
	<div class="container">
		<div class="row paddingMenuPrincipal">

			<div class="col-sm-12">
			 <div class="btn-group">
			  <a href="miCuenta" class="btn btn-success">Resumen</a>
			  <a href="#" class="btn btn-default">Editar Cuenta</a>
			  <a href="misEspecialistas" class="btn btn-default">Mis Especialistas</a>
			  <a href="#" class="btn btn-default">Galeria de Trabajos</a>
			  <a href="#" class="btn btn-danger">Cerrar Sesion</a>
			</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<form:form action="edicionOk" modelAttribute="usuario" method="POST">
							<label for="nombre">Nombre</label>
							<form:input path="nombre" id="nombre" type="text" pattern="{4-16}" placeholder="Ingresar Nombre (Minimo 4 Letras. Maximo 16)" class="form-control" />

							<label for="apellido">Apellido</label>
							<form:input path="apellido" id="apellido" type="text" pattern="{4-16}" placeholder="Ingresar Apellido (Minimo 4 Letras. Maximo 16)" class="form-control" />

							<label for="email">Email</label>
							<form:input path="email" id="email" type="text"	placeholder="Ingresar Correo Electronico" class="form-control"/>

							<label for="password">Password</label>
							<form:input path="password" name="psw1" id="password" type="password" pattern="{6-32}" placeholder="Ingresar Password (Minimo 6 digitos. Maximo 32)" class="form-control" />
							
							<label for="telefono">Telefono</label>
							<form:input path="telefono" id="telefono" type="text" pattern="{4-16}" placeholder="Ingresar Nombre (Minimo 4 Letras. Maximo 16)" class="form-control" />
							
							<label for="nombreEmpresa">Nombre de la Empresa</label>
							<form:input path="nombreEmpresa" id="nombreEmpresa" type="text" pattern="{4-16}" placeholder="Ingresar Nombre (Minimo 4 Letras. Maximo 16)" class="form-control" />
							
							<label for="logoEmpresa">Logo de la Empresa</label>
							<form:input path="logoEmpresa" id="logoEmpresa" type="text" pattern="{4-16}" placeholder="Ingresar Nombre (Minimo 4 Letras. Maximo 16)" class="form-control" />
							
							<br>
							<input class="form-control btn btn-success" type="submit" value="Actualizar Informacion">
						
						</form:form>
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>