<!DOCTYPE html>
<html lang="es">
<head>
<%@ include file="includes/cabecera.jsp" %>
</head>


<body>
	<%@ include file="/includes/menuPrincipal.jsp" %><!-- MENU NAVEGACION -->

	<div class="container">

		<div class="row paddingMenuPrincipal">
			<!-- Informacion Basica sobre el especialista -->
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<div class="col-sm-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Datos del Especialista</h3>
						</div>
						<div class="panel-body">

							<div class="col-sm-12">
								<div class="col-sm-4">
									<img src="${logoEmpresa}" class="img-thumbnail"><br><br>
									<button type="button" class="btn btn-default btn-xs btn-block"><b>Zona
										de Trabajo:</b> ${zona}</button>
									<button type="button" class="btn btn-default btn-xs btn-block"><b>Reputacion:</b> No disponible</button>
									<button type="button" class="btn btn-default btn-xs btn-block"><b>Tipo de Especialista:</b> ${esp}</button>
								</div>
								<div class="col-sm-8">
									<div class="col-sm-12">
										<h3 class="textoCentrado">${nombreEmpresa}</h3>
									</div>
									<div class="col-sm-12">
										<div class="alert alert-warning textoCentrado">El Usuario fue contratado ${contratado} veces</div>
									</div>
									<div class="col-sm-12 text-center">
										<button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">Contratar Especialista</button>
									</div>
								
								
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- Contenido extra de la publicacion del especialista -->
				<div class="col-sm-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Datos de la Publicacion</h3>
						</div>
						<div class="panel-body textoCentrado">
							${contenido }
							<br>
							<br>
							<button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">Contratar Especialista</button>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-1"></div>
		</div>
		</div>
		
		<!-- Modal -->
										<div id="myModal" class="modal fade" role="dialog">
										  <div class="modal-dialog">
										
										    <!-- Modal content-->
										    <br><br><br><br><br><br><br><br><br>
										    <div class="modal-content">
										      <div class="modal-header">
										        <button type="button" class="close" data-dismiss="modal">&times;</button>
										        <h4 class="modal-title">Contratar a ${nombreEmpresa}</h4>
										      </div>
										      <div class="modal-body">
										        <p>¿Estas seguro que deseas contratar a este Usuario?</p>
										      </div>
										      <div class="modal-footer">										      
												<a href="contratar?idp=${publicacion}&&idup=${idPublicador}&&iduc=${idSesion}&&esp=${esp}" type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok" ></span> Contratar!</a>
										        <button type="button" class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Mejor no</button>
										      </div>
										    </div>
										
										  </div>
										</div>
										<!-- fin modal -->
	
	
	
								

	<!--  INICIO PIE DE PAG -->
<%@ include file="includes/pie.jsp"%><!-- PIE (Incluye los script de bootstrap) -->
		
		<!--  FIN PIE -->
</body>
</html>


