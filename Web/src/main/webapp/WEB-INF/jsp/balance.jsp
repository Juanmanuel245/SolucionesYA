<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			  <a href="#" class="btn btn-default">Balance</a>
			  <a href="logout" class="btn btn-danger">Cerrar Sesion</a>
			</div>
				<div class="panel panel-default">
					<div class="panel-body text-center">
						<div class="alert alert-danger text-center">Recuerda que tienes una semana para pagar lo adeudado, caso contrario se suspenderan todas tus publicaciones</div>
						<c:choose>
							<c:when test="${usuario.balance > 0}">
									Adeudado: <span class="label label-danger">$ ${usuario.balance}</span><br><br>
									<button type="button" class="btn btn-default">Generar Factura</button>
							</c:when>
							
							<c:otherwise>
								El usuario no adeuda dinero
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>