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
		<div class="row">
			<div class="col-sm-12 paddingMenuPrincipal">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title text-center">BUSCAR ESPECIALISTA</h3>
					</div>
					<div class="panel-body">
						<form:form action="listarPublicaciones"
							modelAttribute="publicacionDTO" method="POST">
						<div class="col-sm-12">
						<div class="col-sm-3">
							<!--  ZONA  -->
							<form:select class="form-control" path="idZona" name="zona">
								<option value="0">Selecciona una Zona</option>
								<c:forEach items="${zona}" var="zona">
									<form:option value="${zona.idZona}">${zona.nombre}</form:option>
								</c:forEach>
							</form:select>

						</div>
						<div class="col-sm-3">
							<!--  ESPECIALIDAD  -->
							<form:select class="form-control" path="idEspecialidad"
								name="especialidad">
								<form:option value="0">Selecciona una Especialidad</form:option>
								<c:forEach items="${especialidad}" var="especialidad">
									<form:option value="${especialidad.idEspecialidad}">${especialidad.nombreEspecialidad}</form:option>
								</c:forEach>
							</form:select>
						</div>
						<div class="col-sm-6">
							<div class="form-group col-lg-12">
								<button type="submit" class="btn btn-success btn-block">Buscar</button>
							</div>
						</div>
						</div>
						</form:form>
					</div>
				</div>
			</div>



			<!-- PUBLICACIONES DESTACADAS -->
			<div class="col-sm-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">VENDEDORES DESTACADOS</h3>
					</div>
					<div class="panel-body">
						<c:choose>
							<c:when test="${valido}">
							
								<c:forEach items="${destacadas}" var="pub">
									<div class="col-lg-3 col-md-4 col-xs-6 thumb">
										<a href="publicacion?idp=${pub.idPublicacion}"><img class="img-thumbnail" src="${pub.usuario.logoEmpresa}" height="170px" width="170px"></a>
									</div>
								</c:forEach>
							</c:when>
							
							<c:otherwise>
								No hay publicaciones destacadas
							</c:otherwise>
						
						</c:choose>

						
					</div>
				</div>
			</div>

			<!-- Contenido extra de la publicacion del especialista -->
			<div class="col-sm-12" style="padding-top: 10px;">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">REGISTRATE, ES MUY FACIL!</h3>
					</div>
					<div class="panel-body">
						<div class="col-sm-12">
							<div class="col-lg-3 col-md-3 col-xs-3"></div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<img class="img-responsive" src="images/paso1.png" alt="">
							</div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<img class="img-responsive" src="images/paso2.png" alt="">
							</div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<img class="img-responsive" src="images/paso3.png" alt="">
							</div>
							<div class="col-lg-3 col-md-3 col-xs-3"></div>
						</div>

						<div class="col-sm-12">
							<div class="col-lg-3 col-md-3 col-xs-3"></div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<p>
									<b>1-PUBLICA:</b><br> <small>Publicá en
										SolucionesYa, registrate y hace una publicacion en pocos
										minutos. Es rapido y facil!</small>
								</p>
							</div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<p>
									<b>2-TE CONTACTAN:</b><br> <small>Dejá tu número
										de teléfono o email en el aviso para que te puedan contactar
										fácil y rápidamente los interesados.</small>
								</p>
							</div>
							<div class="col-lg-2 col-md-3 col-xs-3">
								<p>
									<b>3-SE ENCUENTRAN:</b><br> <small>Coordinan con
										el interesado de tu zona para realizar los trabajos pactados,
										nunca fue mas rapido y facil.</small>
								</p>
							</div>
							<div class="col-lg-3 col-md-3 col-xs-3"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-1"></div>
	</div>
</body>