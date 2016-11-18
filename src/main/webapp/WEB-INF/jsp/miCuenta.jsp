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
			  <a href="#" class="btn btn-success">Resumen</a>
			  <a href="editarCuenta" class="btn btn-default">Editar Cuenta</a>
			  <a href="misEspecialistas" class="btn btn-default">Mis Especialistas</a>
			  <a href="balance" class="btn btn-default">Balance</a>
			  <a href="logout" class="btn btn-danger">Cerrar Sesion</a>
			</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<h3>Hola ${usuario.nombre} :) !</h3>
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
