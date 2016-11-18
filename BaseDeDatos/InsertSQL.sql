INSERT INTO zona (nombre) values
("Capital Federal"), ("Ramos Mejia"), ("Moron"), ("Moreno");

INSERT INTO Reputacion (puntuacion) values
(10), (1), (8);

INSERT INTO Galeria (imagen) values
("imagen.jpg");

INSERT INTO Especialidad (nombreEspecialidad) values
("Plomero"), ("Electrisista"), ("Gasista");

INSERT INTO Usuario (apellido, email, logoEmpresa, nombre, nombreEmpresa, password, telefono, vecesContratado, balance, ID_GALERIA, ID_REPUTACION) values
("Caffi", "juanmanuelcaffi@gmail.com", "images/sinLogo.jpg", "Juan Manuel", "Caffi SA", "123456", "1159423002", 0, 0, 1, 3);

INSERT INTO Publicacion (contenido, ID_ESPECIALIDAD, ID_USUARIO, ID_ZONA) values
("texto generado", 1, 1, 1);




