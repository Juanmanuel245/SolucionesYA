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
			  <a href="miCuenta" class="btn btn-success">Resumen</a>
			  <a href="editarCuenta" class="btn btn-default">Editar Cuenta</a>
			  <a href="#" class="btn btn-default">Mis Especialistas</a>
			  <a href="balance" class="btn btn-default">Balance</a>
			  <a href="logout" class="btn btn-danger">Cerrar Sesion</a>
			</div>
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="list-group">
						  <a href="#" class="list-group-item active">Especialistas Contratados (Clic en la fila para ver la publicacion)</a>
						  <c:choose >
							  <c:when test="${contratados != null}">
								  <c:forEach items="${contratados}" var="contratados">
								   <a href="publicacion?idp=${contratados.idPublicacion}" class="list-group-item text-center" >
									   <img src="${contratados.usuarioContratado.logoEmpresa}" width="100">
									   <span class="label label-primary">Empresa: ${contratados.usuarioContratado.nombreEmpresa}</span>
									   <span class="label label-info">Especialidad: ${contratados.nombreEspecialidad}</span>
									   <span class="label label-primary">Titular: ${contratados.usuarioContratado.nombre} ${contratados.usuarioContratado.apellido}</span>
									   <span class="label label-info">Email: ${contratados.usuarioContratado.email}</span>
									   <span class="label label-primary">Telefono: ${contratados.usuarioContratado.telefono}</span>
									   
								   </a>
								  </c:forEach>
							  </c:when>
							  
							  <c:otherwise>
							  	<div class="text-center" >No haz contratado a ningun especialista </div>
							  </c:otherwise>
						  </c:choose>

						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>
