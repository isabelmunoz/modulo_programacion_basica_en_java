Proceso ahorro_anual
	Definir deposito,i Como Entero;
	Definir ahorro Como Real;
	i <- 0;
	ahorro <- 0;
	Para i<-1 Hasta 12 Con Paso i+1 Hacer
		Escribir 'Ingrese dinero depositado, mes ',i;
		Leer deposito;
		ahorro <- ahorro+deposito;
		Si i<=12 Entonces
			Escribir 'El dinero depositado acumulado al ',i,' es: ',ahorro;
		FinSi
	FinPara
	Escribir 'El ahorro  de dinero total es $',ahorro;
	Escribir 'El ahorro  promedio mensual es $',ahorro/12;
FinProceso
