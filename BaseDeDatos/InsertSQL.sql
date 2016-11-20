INSERT INTO zona (nombre) values
				 ("Capital Federal"),
                 ("Ituzaingo"),
                 ("Castelar"),
                 ("Moron"),
                 ("Haedo"),
                 ("Ramos Mejia"),
                 ("Ciudadela"),
                 ("Liniers"),
                 ("Floresta"),
                 ("Flores"),
                 ("Caballito");

INSERT INTO Especialidad	(nombreEspecialidad) values
							1("Plomero"),
							2("Electricista"),
							3("Gasista"),
							4("Albañil"),
							5("Techista"),
							6("Jardinero"),
							7("Tecnico Informatico"),
							8("Tecnico aire acondicionado"),
                            9("Carpintero"),
							10("Mecanico");

INSERT INTO Usuario (nombre			,apellido	,password,email	 					 ,telefono		,nombreEmpresa			,logoEmpresa	  	 ,vecesContratado  	,balance) values
					("Juan Manuel"	,"Caffi"	,"123456","juanmanuelcaffi@gmail.com", "1135887899"	,"Caffi SA"				,"images/emp1.jpg"	 ,0					,0),
					("Brian"		,"Kuz"		,"123456","briankuz@gmail.com"		 , "1544212236"	,"Cuz & CO"				,"images/emp2.jpg"	 ,0					,0),
                    ("Nicolas"		,"Escobar"	,"123456","nicolase@gmail.com"		 , "1561290575"	,"NeK Solutions"		,"images/emp3.jpg"	 ,0					,0),
                    ("Juan"			,"Cichello"	,"123456","jcichello@gmail.com"		 , "1588775456"	,"Jardineria Cichello"	,"images/emp4.jpg"	 ,0					,0),
                    ("Carlos"		,"Perez"	,"123456","cp@gmail.com"			 , "1544733365"	,"Carpinteria P & P"	,"images/emp5.jpg"	 ,0					,0),
                    ("Cristian"		,"Martinez"	,"123456","cm@gmail.com"			 , "1544733365"	,"Carpinteria P & P"	,"images/emp6.jpg"	 ,0					,0),
                    ("Alexis"		,"Collona"	,"123456","ac@gmail.com"			 , "1544733365"	,"Carpinteria P & P"	,"images/emp7.jpg"	 ,0					,0),
                    ("Matias"		,"Baque"	,"123456","mb@gmail.com"			 , "1544733365"	,"Carpinteria P & P"	,"images/emp8.jpg"	 ,0					,0),
                    ("Brenda"		,"Cichello"	,"123456","brendis_1990@gmail.com"	 , "1502578898"	,""						,"images/sinLogo.jpg",0					,0), 
					("Marcela"		,"Copello"	,"123456","alfinde@gmail.com"		 , "1533558798"	,""						,"images/sinLogo.jpg",0					,0); 

INSERT INTO Publicacion (contenido																						,visitas,ID_ESPECIALIDAD,ID_USUARIO ,ID_ZONA ,destacado) values
						("Plomero especializado, con años de experiencia y un servicio de primer nivel"					,0		,1				,1			,1	     ,1),
						("Electricista especializado, con años de experiencia y un servicio de primer nivel"			,0		,2				,2			,2		 ,1),
                        ("Tecnico informatico especializado, con años de experiencia y un servicio de primer nivel"		,0		,7				,3			,6		 ,1),
						("Jardinero especializado, con años de experiencia y un servicio de primer nivel"				,0		,6				,4			,9       ,1),
						("Gasista especializado, con años de experiencia y un servicio de primer nivel"					,0		,3				,5			,10		 ,0),
                        ("Albañil especializado, con años de experiencia y un servicio de primer nivel"					,0		,4				,6			,10		 ,1),
						("Techista especializado, con años de experiencia y un servicio de primer nivel"				,0		,5				,7			,10		 ,1),
						("Mecanico especializado, con años de experiencia y un servicio de primer nivel"				,0		,10				,8			,10		 ,0);