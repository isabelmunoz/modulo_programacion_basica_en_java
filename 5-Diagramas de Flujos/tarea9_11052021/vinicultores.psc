Proceso Vinicultores
	Definir valorKilo,cantKilo,precio,tamano Como Entero;
	Definir tipo Como Caracter;
	Escribir 'Ingrese cantidad de Kilos';
	Leer cantKilo;
	Escribir 'Ingrese valor del Kilo';
	Leer valorKilo;
	Escribir 'Ingrese tipo de uva: A o B';
	Leer tipo;
	Escribir 'Ingrese tamaño uva: 1 o 2';
	Leer tamano;
	Si (tipo=='A') Entonces
		Si (tamano==1) Entonces
			precio <- (valorKilo*cantKilo)+(cantKilo*20);
		SiNo
			precio <- (valorKilo*cantKilo)+(cantKilo*30);
		FinSi
	SiNo
		Si (tamano==1) Entonces
			precio <- (valorKilo*cantKilo)-(cantKilo*30);
		SiNo
			precio <- (valorKilo*cantKilo)-(cantKilo*50);
		FinSi
	FinSi
	Escribir 'El cantidad de kilos ingresados fue: ',cantKilo;
	Escribir 'El valor por kilo fue: ',valorKilo;
	Escribir 'El precio total es de:',precio;
FinProceso
