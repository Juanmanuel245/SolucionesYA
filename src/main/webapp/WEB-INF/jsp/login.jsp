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
							datos para ingresar</h3>
					</div>
					<div class="panel-body">
										<form:form action="loginOk" method="POST" modelAttribute="usuario">
										
											<label for="email">Ingresar Correo Electronico</label>
											<form:input path="email" id="email" type="email" class="form-control" />
											<br>
											<label for="pwd">Ingresar Contraseña</label>
											<form:input path="password" type="password" id="pwd" class="form-control" />

											<br>

											<div class="form-group col-lg-12">
												<button type="submit" class="btn btn-success">Acceder</button>
											</div>


											<div>
												<a href="irRegistro"> No estas registrado? Hace click aca</a>
											</div>

										</form:form>
									</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>