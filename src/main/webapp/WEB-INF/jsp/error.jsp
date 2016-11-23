<!DOCTYPE html>
<html lang="es">
<head><%@ include file="includes/cabecera.jsp" %>
<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) -->
</head>

<body>
    <%@ include file="includes/menuPrincipal.jsp" %><!-- MENU NAVEGACION -->
	<div class="container">
		<div class="row">

			<!-- PUBLICACIONES DESTACADAS -->
			<div class="col-sm-12 paddingMenuPrincipal">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">ERROR!</h3>
					</div>
					<div class="panel-body">
						${mensaje}

					</div>
				</div>
			</div>

		</div>
		<div class="col-sm-1"></div>
	</div>
</body>