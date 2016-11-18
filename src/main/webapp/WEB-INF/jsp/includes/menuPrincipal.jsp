<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="position: fixed; z-index:9999; background-color: white; padding-top: 5px;" class="col-sm-12">
	<div class="col-sm-5"><a href="inicio"><img src="images/logo.png"></a><br><br> </div>
	<div class="col-sm-5"></div>
	<div class="col-sm-2"><br>
		<c:choose>
    <c:when test="${idSesion != null}">
      <a href="miCuenta" class="btn btn-default btn-block btn-xs"><span class="glyphicon glyphicon-user"> Mi Cuenta</span></a>
	  <a href="crearPublicacion" class="btn btn-success btn-block btn-xs"><span class="glyphicon glyphicon-edit"></span> Crear Publicacion</a>
    </c:when>
    <c:otherwise>
       <a href="irLogin" class="btn btn-default btn-xs btn-block">Entrar</a>
	  <a href="irRegistro" class="btn btn-default btn-xs btn-block">Registrarse</a>
    </c:otherwise>
</c:choose>
	</div>
</div>