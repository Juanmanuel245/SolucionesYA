<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head><%@ include file="includes/cabecera.jsp"%>
</head>
<body>
	<%@ include file="includes/menuPrincipal.jsp"%>
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
						<div class="row">
							<div class="col-sm-12 text-center">
								<h1>Tus Datos</h1>
							</div>
							<div class="col-sm-12">
								<div class="col-sm-4"></div>

								<div class="col-sm-5">
									<div class="col-sm-6">
										<img class="img-thumbnail" src="${usuario.logoEmpresa } " width="150"
											height="150" alt="">
									</div>

									<div class="col-sm-6">
										<label>Empresa: </label> <span class="label label-primary">${usuario.nombreEmpresa}</span><br>
										<label>Nombre: </label> <span class="label label-primary">${usuario.nombre}</span><br>
										<label>Apellido: </label> <span class="label label-primary">${usuario.apellido}</span><br>
										<label>Email: </label> <span class="label label-primary">${usuario.email}</span><br>
										<label>Telefono: </label> <span class="label label-primary">${usuario.telefono}</span><br>
									</div>
								</div>

								<div class="col-sm-3"></div>

							</div>
						</div>
						<div class="alert alert-warning text-center">Recuerde que crear una publicacion tiene un costo unico de $100 que seran agregados a su cuenta</div> 	
						<form:form action="publicacionOk" modelAttribute="publicacionDTO"  method="POST">

							 <!--  ZONA  -->
							<form:select class="form-control" path="idZona" name="zona">
								<option value="0">Selecciona una Zona</option>
								<c:forEach items="${zona}" var="zona">
									<form:option value="${zona.idZona}">${zona.nombre}</form:option>
								</c:forEach>
							</form:select>

							<br>
							<br>
							<!--  ESPECIALIDAD  -->
							<form:select class="form-control" path="idEspecialidad" name="especialidad">
								<form:option value="0">Selecciona una Especialidad</form:option>
								<c:forEach items="${especialidad}" var="especialidad">
									<form:option value="${especialidad.idEspecialidad}">${especialidad.nombreEspecialidad}</form:option>
								</c:forEach>
							</form:select>
							<br>
							<br>

							<!-- CAMPO DE CONTEIDO -->
							<form:textarea class="form-control" path="contenido" rows="15"
								placeholder="Agregar Informacion sobre tu publicacion. No puede contener datos de contacto"></form:textarea>


							<br>
							<br>
							<div class="form-group col-lg-12">
								<button type="submit" class="btn btn-success btn-lg btn-block">Crear
									Publicacion</button>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@ include file="includes/pie.jsp"%>

</body>
</html>