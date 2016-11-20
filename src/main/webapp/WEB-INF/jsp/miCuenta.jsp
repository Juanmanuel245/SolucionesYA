<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<c:choose>
						<c:when test="${valido}">
							<c:forEach items="${publicaciones}" var="pub">
							<div class="col-sm-12 listar">
				 				<div class="col-sm-3 paddingLogoListar"><img src="${pub.usuario.logoEmpresa}" width="200" /></div>
				 				<div class="col-sm-7 text-center">	
				 					<div class="col-sm-12"><br><br>
				 						<div class="col-sm-6"><div class="alert alert-warning">${pub.especialidad.nombreEspecialidad}</div></div>
				 						<div class="col-sm-6"><div class="alert alert-warning">${pub.zona.nombre}</div></div>
				 					</div> 
				 					
				 					<div class="col-sm-12">
				 						<div class="col-sm-6"><div class="alert alert-success">Contratado: ${pub.usuario.vecesContratado} veces</div></div>
				 						<div class="col-sm-6"><div class="alert alert-success">Visitas: ${pub.visitas}</div></div>
				 					</div> 				
				 				</div>
				 				<div class="col-sm-2 paddingBotonVer"><a href="publicacion?idp=${pub.idPublicacion }" type="button" class="btn btn-success btn-lg btn-block">Ver</a></div>
			 				</div>
							</c:forEach>
						</c:when>
						<c:otherwise>NO TIENE PUBLICACIONES ACTIVAS</c:otherwise>
					</c:choose>
					
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
