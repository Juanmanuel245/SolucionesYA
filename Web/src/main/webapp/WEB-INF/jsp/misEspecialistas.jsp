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
			  <a href="editarCuenta" class="btn btn-default">Editar Cuenta</a>
			  <a href="#" class="btn btn-default">Mis Especialistas</a>
			  <a href="balance" class="btn btn-default">Balance</a>
			  <a href="logout" class="btn btn-danger">Cerrar Sesion</a>
			</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="list-group">
						  <a href="#" class="list-group-item active">
						    Especialistas Contratados
						  </a>
						   <a href="#" class="list-group-item text-center" >

						   <img src="images/emp3.jpg" width="100">
						   <span class="label label-primary">Empresa: Logon Sistemas</span>
						   <span class="label label-info">Especialidad: Plomero</span>
						   <span class="label label-primary">Titular: Juan Manuel Caffi</span>
						   <span class="label label-info">Email: JuanManuelCaffi@Gmail.com</span>
						   <span class="label label-primary">Telefono: 116924006</span>
						   </a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
