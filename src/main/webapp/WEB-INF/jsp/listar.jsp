<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head><%@ include file="includes/cabecera.jsp"%>
<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) -->
</head>

<body>
	<%@ include file="includes/menuPrincipal.jsp"%><!-- MENU NAVEGACION -->
	<div class="container">
		<div class="row paddingMenuPrincipal">
				<c:forEach items="${publicaciones}" var="pub">
			 			<div class="col-sm-12 listar">
			 				<div class="col-sm-3 paddingLogoListar"><img src="${pub.usuario.logoEmpresa}" width="200" /></div>
			 				<div class="col-sm-7 text-center">
			 				<div class="col-sm-12"><h3 class="text-center">${pub.usuario.nombreEmpresa}</h3></div>
			 					<span class="label label-success">Tipo de Especialista: ${pub.especialidad.nombreEspecialidad}</span>
			 					<span class="label label-info">Nombre y Apellido: ${pub.usuario.nombre} ${pub.usuario.apellido}</span>
			 					<span class="label label-success">Zona de trabajo: ${pub.zona.nombre}</span>	<br><br>		
			 					<div class="col-sm-12"><div class="alert alert-success">Este usuario fue contratado: ${pub.usuario.vecesContratado} veces</div><br></div> 				
			 				</div>
			 				<div class="col-sm-2 paddingBotonVer"><button type="button" class="btn btn-success btn-lg btn-block">Ver</button></div>
			 				
			 			</div>
			 		<div class="col-sm-12"><br></div>
			 	</c:forEach>
		</div>
	</div>
</body>






</ul>



								