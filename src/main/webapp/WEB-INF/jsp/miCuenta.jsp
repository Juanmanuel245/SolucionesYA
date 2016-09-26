<!DOCTYPE html>
<html lang="es">
<head><%@ include file="../../includes/cabecera.jsp" %>	<!-- Cabecera con Meta, Titulos y Archivos Externos (Css) --></head>

<body>

<!-- MENU NAVEGACION -->
<%@ include file="../../includes/menuPrincipal.jsp" %>
<!-- FIN MENU NAVEGACION -->
<div class="container" >
  <div class="row" style="padding-top: 145px;">

    <div class="col-sm-2">
      <div class="list-group">
        <a href="#" class="list-group-item active">Panel del Usuario</a>
        <a href="#" class="list-group-item">Resumen</a>
        <a href="#" class="list-group-item">Editar Cuenta</a>
        <a href="#" class="list-group-item">Mis Especialistas</a>
        <a href="#" class="list-group-item">Mis Opiniones</a>
        <a href="galeria" class="list-group-item">Galeria de Trabajos</a>
      </div>
    </div>


    <div class="col-sm-10">
      <div class="panel panel-default">
        <div class="panel-body">
          Nombre: Juan Manuel Perez<br>
          Usuario: Tuco87<br>
          Email: Anonym@gmail.com<br>
          <br>
          Especialistas Contratados: 24<br>
          Balance de Cuenta: $240<br>
        </div>
      </div>      
    </div>

  </div>
</div>
<%@ include file="../../includes/pie.jsp" %><!-- PIE (Incluye los script de bootstrap) -->   s
</body>
</html>




