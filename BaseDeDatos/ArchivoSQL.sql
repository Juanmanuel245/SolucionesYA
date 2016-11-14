CREATE DATABASE IF NOT EXISTS SolucionesYA;
USE SolucionesYA;

SELECT * FROM Publicacion;
SELECT * FROM usuario;
SELECT * FROM especialidad;
SELECT * FROM Galeria;
SELECT * FROM Reputacion;
SELECT * FROM Zona;

UPDATE usuario set logoEmpresa="images/emp3.jpg" WHERE id=1;