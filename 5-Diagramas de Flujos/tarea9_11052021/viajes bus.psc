Proceso Viajes_bus
	Definir tipo Como Caracter;
	Definir kilometro,n Como Entero;
	Definir total,precio Como Real;
	Escribir 'Seleccione un tipo bus: A ? B ? C';
	Leer tipo;
	Escribir 'Ingresa los kilometros a recorrer';
	Leer kilometro;
	Escribir 'Ingresa el numero de personas';
	Leer n;
	Si tipo=='A' O tipo=='B' O tipo=='C' Entonces
		Si tipo=='A' Entonces
			precio <- kilometro*200;
		SiNo
			Si tipo=='B' Entonces
				precio <- kilometro*250;
			SiNo
				precio <- kilometro*300;
			FinSi
		FinSi
	SiNo
		Escribir 'Ingresa un tipo de bus correcto';
	FinSi
	Si n<20 Entonces
		total <- 20*precio;
	SiNo
		total <- n*precio;
	FinSi
	Escribir 'El total a pagar por el viaje $',total;
	Escribir 'El total a pagar por persona es: $',total/n;
FinProceso
