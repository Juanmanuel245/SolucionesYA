<!DOCTYPE html>
<html>
<head><%@ include file="../../includes/cabecera.jsp" %>	<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) --></head>

<div class="row">
	<div class="col-sm-1"></div>
	
	<div class="col-sm-10">
		<div class="col-sm-12">
			<div class="panel panel-default">
	  		<div class="panel-heading textoCentrado"><h3 class="panel-title">Datos del Registro</h3></div>
	  		<div class="panel-body">
	  			<form class="form-horizontal" role="form" method="post" action="" style="float:left">
					<div class="row">
					
						<div class="form-group">
	        				<label class="control-label col-xs-3">Nombre:</label>
	        				<div class="col-xs-5"><input type="text" class="form-control" placeholder="Nombre"></div>
	    				</div>
	    
	    				<div class="form-group">
	        				<label class="control-label col-xs-3">Apellido:</label>
	        				<div class="col-xs-5"><input type="text" class="form-control" placeholder="Apellido"></div>
	    				</div>
	    				
	   					<div class="form-group">
	        				<label class="control-label col-xs-3">Email:</label>
	        				<div class="col-xs-5"><input type="email" class="form-control" id="inputEmail" placeholder="Email"></div>
	    				</div>
	    				
	    				<div class="form-group">
	        			<label class="control-label col-xs-3">Password:</label>
	        				<div class="col-xs-5"><input type="password" class="form-control" id="inputPassword" placeholder="Password"></div>
	    				</div>
	    
	    				<div class="form-group">
	        				<label class="control-label col-xs-3">Confirmar Password:</label>
	        				<div class="col-xs-5"><input type="password" class="form-control" placeholder="Confirmar Password"></div>
	    				</div>
	   
	    				<div class="form-group">
	        				<label class="control-label col-xs-3" >Telefono:</label>
	        				<div class="col-xs-5"><input type="tel" class="form-control" placeholder="Telefono"></div>
	    				</div>
	    				
	    				<div class="form-group">
	        				<label class="control-label col-xs-3">F. Nacimiento:</label>
	        				<div class="col-xs-3"><input type="text" class="form-control letra_negra" placeholder="DD" name="fechaNacDia" pattern="[0-9]{1,2}" required></div>
	       					<div class="col-xs-3"><input type="text" class="form-control letra_negra" placeholder="MM" name="fechaNacMes" pattern="[0-9]{1,2}" required></div>
	        				<div class="col-xs-3"><input type="text" class="form-control letra_negra" placeholder="AAAA" name="fechaNacAnno" pattern="[0-9]{4,4}" required></div>
	    				</div>
   
						<div class="form-group">
	     					<label class="control-label col-xs-3">Pais:</label>
	     					<div class="col-xs-5">
	     						<select class="form-control" id="pais" name="pais" required><option class='letra_negra'  value="0">Seleccione un país</option></select>
	     					</div>
	 					</div>

					   <div class="form-group">
					     <label class="control-label col-xs-3">Provincia:</label>
					     <div class="col-xs-5">
					     	<select class="form-control" id="provincia" name="provincia" required><option class="form-control"  value="0">Seleccione una Provincia</option></select>
					     </div>
					  </div>

					   <div class="form-group">
					     <label class="control-label col-xs-3">Localidad:</label>
					     <div class="col-xs-5">
					     	<select class="form-control" id="pais" name="pais" required><option class='letra_negra'  value="0">Seleccione una Localidad</option></select>
					     </div>
					  </div>

					    <div class="form-group">
					     <label class="control-label col-xs-3">Calle:</label>
					     <div class="col-xs-5">
					     	<input type="text" class="form-control" name="calle" placeholder="Por Ejemplo: Av.Rivadavia" pattern="[A-zA-Z0-9./\s/][a-zA-ZÑÁÉÍÓÚáéíóú./\s/][a-zA-Zñáéíóú./\s/]{1,20}" required><br>
					     </div>
					   </div>

					   <div class="form-group">
					     <label class="control-label col-xs-3">Altura:</label>
					     <div class="col-xs-5">
					     	<input class="form-control" name="altura" type="text"  placeholder="Por Ejemplo: 224344" required>
					     </div>
					   </div>
	   
	    				<br>
	    				
					     <div class="form-group">
					     	<div class="col-xs-offset-3 col-xs-3"><input type="submit" class="btn btn-success" value="Registrarse a SolucionesYa"></div>
					    </div>
	    			</div>
				</form>
	  		</div>
	  	</div>
	  </div>
	</div>
</div>
<%@ include file="../../includes/pie.jsp" %><!-- PIE (Incluye los script de bootstrap) -->   
</html>