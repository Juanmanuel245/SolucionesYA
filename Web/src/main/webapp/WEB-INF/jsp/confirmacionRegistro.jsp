<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
						<h3 class="panel-title">Registro Exitoso!</h3>
					</div>
					<div class="panel-body">
										Te has registrado correctamente!! <a href="irLogin">Haz click aqui para Logear</a>
									</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
