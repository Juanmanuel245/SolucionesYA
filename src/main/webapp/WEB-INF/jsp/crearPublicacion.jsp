<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
										<form:form action="publicacionOk" method="POST" modelAttribute="publicacion">
										
			<!--  ZONA  -->
			<select class="form-control" name="zona">
				  <option value="0">Selecciona una Zona</option>
				<c:forEach items="${zona}" var="zona">
				<option value="${zona.nombre}">${zona.nombre}</option>
				</c:forEach> 

			</select>											

											
											

											<div class="form-group col-lg-12">
												<button type="submit" class="btn btn-success">Acceder</button>
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