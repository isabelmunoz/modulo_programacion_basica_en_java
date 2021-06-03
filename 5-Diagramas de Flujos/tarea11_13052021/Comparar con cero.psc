Proceso comparacion_cero
	Definir cantidad,num,contUno,contDos,i Como Real;
	Escribir 'Ingrese cantidad de números a ingresar';
	Leer cantidad;
	contUno <- 0;
	contDos <- 0;
	i <- 0;
	Mientras i<cantidad Hacer
		Escribir 'Ingrese numero a comparar';
		Leer num;
		Si num<=0 Entonces
			contUno <- contUno+1;
		SiNo
			contDos <- contDos+1;
		FinSi
		i <- i+1;
	FinMientras
	Escribir 'La cantidad de números menores o igual a cero ingresados es: ',contUno;
	Escribir 'La cantidad de números mayores a cero ingresados es: ',contDos;
FinProceso
