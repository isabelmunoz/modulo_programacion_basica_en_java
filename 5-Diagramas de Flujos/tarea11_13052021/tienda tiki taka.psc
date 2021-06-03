Proceso tienda_tiki_taka
	Definir cantVentas,valorVentas,cont1,cont2,cont3,i Como Entero;
	Escribir 'Ingrese cantidad de ventas';
	Leer cantVentas;
	i <- 0;
	cont1 <- 0;
	cont2 <- 0;
	cont3 <- 0;
	valorVentas <- 0;
	Escribir cantVentas;
	Para i<-0 Hasta cantVentas-1 Con Paso i+1 Hacer
		Escribir 'Ingrese valor de la venta';
		Leer valorVentas;
		Si valorVentas<=500 Entonces
			cont3 <- cont3+valorVentas;
		FinSi
		Si valorVentas>500 Y valorVentas<=1000 Entonces
			cont2 <- cont2+valorVentas;
		FinSi
		Si valorVentas>1000 Entonces
			cont1 <- cont1+valorVentas;
		FinSi
	FinPara
	Escribir 'El valor total de las ventas mayores a $1000 es: ',cont1;
	Escribir 'El valor total de las ventas mayores a $500 pero menores o iguales a $1000 es: ',cont2;
	Escribir 'El valor total de las ventas mayores o igual a $500 es: ',cont3;
	Escribir 'El valor total de todas las ventas es: ',cont1+cont2+cont3;
FinProceso
