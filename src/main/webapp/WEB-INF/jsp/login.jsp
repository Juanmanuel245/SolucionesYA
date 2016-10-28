<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="es">
<head><%@ include file="includes/cabecera.jsp"%>
<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) -->
</head>

<body>
	<%@ include file="includes/menuPrincipal.jsp"%>
	<!-- MENU NAVEGACION -->
	<div class="container">
		<div class="row paddingMenuPrincipal">
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<div class="col-sm-12">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="container">
								<div class="row">
									<div class="box">
										<form:form method="post" action="loginOk">
											modelAttribute="usuario">
											<div class="textos">
												<div class="form-group col-lg-3">
													Nombre de Usuario
													<form:input path="nombre" class="form-control" />
													<br>
												</div>

												<div class="form-group col-lg-3">
													Contraseña
													<form:input type="password" path="password"
														class="form-control" />
												</div>

												<div class="clearfix"></div>

												<div class="form-group col-lg-12">
													<button type="submit" class="btn btn-success">Acceder</button>
												</div>

												<div>
													<a href="irRegistro"> No estas registrado? Hace click
														aca</a>
												</div>
											</div>
										</form:form>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
