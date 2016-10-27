<!DOCTYPE html>
<html lang="es">
<head><%@ include file="includes/cabecera.jsp" %>	<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) --></head>
<body>
<!-- MENU NAVEGACION -->
<%@ include file="includes/menuPrincipal.jsp" %>
<!-- FIN MENU NAVEGACION -->

  <div class="col-sm-12" style="padding-top: 145px"> </div>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<!--TITULO-->
			   <div class="panel-heading"><center><h2 class="panel-title">Subir foto de trabajos realizados</h2></center></div>
				<div class="panel-body">
					<!--SECTOR DE CARGA DE IMAGENES-->
					<div class="row">
					  <div class="col-sm-12">
						<a style="background-color: #c2c2c2">
							<div class="form-group"><a href="#" class="btn btn-success" role="button">
								<img class="img-rounded" src="images/camera.jpg" alt="">Subir imagen</a>
							</div>
						 </a>
					  </div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
			<!--SECTOR DE IMAGENES-->
			   <div class="panel-heading"><center><h2 class="panel-title">Imagenes archivadas</h2></center></div>
				<div class="panel-body">
					<div class="row">
					  <div class="col-md-3">
						  <img class="img-responsive" src="images/trabajos/barandaEscalera.jpg" alt="Baranda de escalera" style="width: 100%; height: 300px">
							<h4 style="width: 20,2%" class="alert alert-success">Baranda para escalera de madera</h4>
					  </div>
					  <div class="col-md-3" >
						  <img class="img-responsive" src="images/trabajos/barreraPileta.jpg" alt="Valla para piscina" style="width: 100%; height: 300px">
							<h4 class="alert alert-success">Baranda para piscina</h4>
					  </div>
					  <div class="col-md-3">
						  <img class="img-responsive" src="images/trabajos/escaleraHierro.jpg" alt="Escalera de hierro tipo caracol" style="width: 100%; height: 300px" >
							<h4 class="alert alert-success">Escalera caracol de hierro</h4>
					  </div>
					  <div class="col-md-3">
						  <img class="img-responsive" src="images/trabajos/puertaIglesia.jpg" alt="Portón de hierro" style="width: 100%; height: 300px">
							<h4 class="alert alert-success">Portón vaivén</h4>
						
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="includes/pie.jsp" %><!-- PIE (Incluye los script de bootstrap) -->   
  </body>
</html>