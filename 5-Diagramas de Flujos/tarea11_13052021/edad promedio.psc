Proceso edad_promedio
	Definir numAlumno,edad,n,suma Como Entero;
	Definir promedio Como Real;
	Escribir 'Ingrese cuantas edades de alumnos va a sumar';
	Leer numAlumno;
	n <- 0;
	suma <- 0;
	Mientras n<numAlumno Hacer
		Escribir 'Ingrese edad';
		Leer edad;
		suma <- suma+edad;
		promedio <- suma/numAlumno;
		n <- n+1;
	FinMientras
	Escribir 'El promedio de las edades es:',promedio;
FinProceso
