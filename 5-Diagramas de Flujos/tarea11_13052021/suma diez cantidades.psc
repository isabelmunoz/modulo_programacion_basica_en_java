Proceso suma_diez_cantidades
	Definir cantidad,i,suma,num Como Entero;
	Escribir 'Ingrese cuantos numeros va a sumar';
	Leer cantidad;
	i <- 0;
	suma <- 0;
	num <- 0;
	Para i<-1 Hasta cantidad Con Paso i+1 Hacer
		Escribir 'Ingrese numero';
		Leer num;
		suma <- suma+num;
	FinPara
	Escribir 'EL total de la suma es: ',suma;
FinProceso
