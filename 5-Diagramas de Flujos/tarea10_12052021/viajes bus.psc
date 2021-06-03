Proceso Viajes_bus
	Definir tipo Como Caracter;
	Definir kilometro ,n Como Entero;
	Definir total, precio como real;
	Escribir 'Seleccione un tipo bus: A ? B ? C';
	leer tipo;
	Escribir "Ingresa los kilometros a recorrer";
	leer kilometro;
	Escribir "Ingresa el numero de personas";
	leer n;		
	
	si tipo == "A" o tipo == "B" o tipo == "C" Entonces
		si tipo == "A" Entonces
			precio <-kilometro * 200;
		SiNo
			si tipo == "B" Entonces
				precio <- kilometro  * 250;
			SiNo
				precio <- kilometro  * 300;
			FinSi
		FinSi
	SiNo
		Escribir "Ingresa un tipo de bus correcto";
	FinSi
	
	si n < 20 Entonces
		total <-20 * precio;
	SiNo
		total <- n * precio;
	FinSi
	Escribir "El total a pagar por el viaje $",total;
	Escribir "El total a pagar por persona es: $",total / n;
FinProceso
