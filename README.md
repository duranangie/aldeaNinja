# ALDEA NINJA DE KONOHA 

la aldea ninja de Konoha a decidido modernizar su sistema de gestion de misiones y datos de ninjas para mejorar su eficiencia y la coordinacion entre los equipos . Se le ha encomendado la tarea de desarrollar una aplicacion de java que gestione esta informacion de manera integral. La aplicacion debera incuir:
 
 * Manejo de archivo de texto
 * conexion con una base de datos
 * seguir principios y patrones de diseño 
 * utilizar expresiones lambda y stream API ( para expresiones de forma concisa )
 * interfaz de usuario por consola


 ## Diseño base de datos

![Alt text](image-1.png)

 ## Diseño UML 

 ![Alt text](image.png)



 /* consultas*/
````
	select Ninja.nombreNinja as nombre , Habilidad.descripcion as estado
	from Ninja
	Inner join Habilidad on Habilidad.id_Ninja =  Ninja.id;
````
````
	select Ninja.nombreNinja as nombre , MisionNinja.estado as disponible
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	where nombreNinja = "ninjaFu"; 
````
````
	select Ninja.nombreNinja as nombre , MisionNinja.estado as disponible
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	where nombreNinja = "ninjaKoon"; 
````
````
	select Ninja.nombreNinja as nombre , Mision.rangoMision as rango
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	inner join Mision on MisionNinja.id_Ninja = Mision.id
	where nombreNinja = "ninjaKoon";

````
/*verificar si esta disponible */
````
select Ninja.nombreNinja as nombre , Mision.descripcion as descripcion
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	inner join Mision on MisionNinja.id_Ninja = Mision.id
	where nombreNinja = "ninjaKoon" and rangoMision= 8 ;
````
/* verificar si se completo */
````
select Ninja.nombreNinja as nombre , Mision.descripcion as descripcion ,MisionNinja.estado as estado


	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	inner join Mision on MisionNinja.id_Ninja = Mision.id
	where nombreNinja = "ninjaKoon" and rangoMision= 2 ;
````

verificar ya las misiones que tiene

````
select Ninja.nombreNinja as nombre , Mision.descripcion as descripcion ,MisionNinja.estado as estado
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	inner join Mision on MisionNinja.id_Ninja = Mision.id
	where nombreNinja = "ninjaKoon" ;
````

````
select Ninja.nombreNinja as nombre , Mision.descripcion as descripcion ,MisionNinja.estado as estado
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	inner join Mision on MisionNinja.id_Ninja = Mision.id
	where nombreNinja = "ninjaKoon" and estado = "completado" ;
````
	
````
	select Ninja.nombreNinja as nombre , MisionNinja.fechaFin as descripcion ,MisionNinja.estado as estado
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	where fechaFin = "2024-01-25" and estado = "completado" ;
````



````
	select Ninja.nombreNinja as nombre , MisionNinja.fechaFin as descripcion ,MisionNinja.estado as estado
	from Ninja 
	inner join MisionNinja on Ninja.id = MisionNinja.id_Ninja
	where fechaFin = "2024-01-25" and estado = "completado" ;
````


	