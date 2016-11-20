CREATE DATABASE IF NOT EXISTS SolucionesYA;
USE SolucionesYA;

SELECT * FROM Publicacion;
SELECT * FROM usuario;
SELECT * FROM especialidad;
SELECT * FROM Galeria;
SELECT * FROM Reputacion;
SELECT * FROM Zona;
SELECT * FROM Contratar;

UPDATE usuario set logoEmpresa="images/emp2.jpg" WHERE id=2;
