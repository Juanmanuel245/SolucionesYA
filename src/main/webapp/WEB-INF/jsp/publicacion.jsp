<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">

	<title> SolucionesYA - Los servicios que necesitas en un solo lugar </title>

	<!-- ARCHIVOS CSS BOOTSTRAP -->
	<link href="css/bootstrap.min.css" rel="stylesheet" >
	<link href="css/thumbnail-gallery.css" rel="stylesheet">
	
	<!-- ARCHIVOS CSS PROPIO -->
	<link href="css/solucionesya.css" rel="stylesheet" >
	
	<!-- FUENTES -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
</head>

<body>
	<%@ include file="includes/menuPrincipal.jsp" %><!-- MENU NAVEGACION -->

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
								<div class="col-sm-3">
									<img src="images/MateosMacias.jpg" class="img-thumbnail">
									<button type="button" class="btn btn-default btn-xs btn-block">Zona
										de Trabajo</button>
									<button type="button" class="btn btn-default btn-xs btn-block">Reputacion</button>
								</div>
								<div class="col-sm-9">
									<div class="col-sm-12">
										<h3 class="textoCentrado">${especialistaNombreEmpresa}</h3>
									</div>
									<div class="col-sm-12">
										<div class="alert alert-warning textoCentrado">El
											especialista fue contratado 208 veces, con una aprobacion del
											%80.</div>
									</div>
									<div class="col-sm-12">
										<button type="button" class="btn btn-success btn-lg btn-block">Contratar
											Especialista</button>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- Galeria de Trabajos del Especialista -->
				<div class="col-sm-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Galeria de Trabajos</h3>
						</div>
						<div class="panel-body">
							<div class="col-lg-3 col-md-4 col-xs-6 thumb">
								<a class="thumbnail" href="#"><img class="img-responsive"
									src="images/trabajos/user152-1.jpg" alt=""></a>
							</div>
							<div class="col-lg-3 col-md-4 col-xs-6 thumb">
								<a class="thumbnail" href="#"><img class="img-responsive"
									src="images/trabajos/user152-2.jpg" alt=""></a>
							</div>
							<div class="col-lg-3 col-md-4 col-xs-6 thumb">
								<a class="thumbnail" href="#"><img class="img-responsive"
									src="images/trabajos/user152-4.JPG" alt=""></a>
							</div>
							<div class="col-lg-3 col-md-4 col-xs-6 thumb">
								<a class="thumbnail" href="#"><img class="img-responsive"
									src="images/trabajos/user152-3.jpg" alt=""></a>
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
							<img alt="" src="http://i65.tinypic.com/2rwu978.jpg"> <br>
							<br>
							<br>
							<button type="button"
								class="btn btn-lg btn-success btn-lg btn-block">Contratar
								Especialista</button>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>
	<%@ include file="includes/pie.jsp" %><!-- PIE (Incluye los script de bootstrap) -->
</body>
</html>