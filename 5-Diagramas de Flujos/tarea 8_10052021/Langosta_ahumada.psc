Proceso Langosta_Ahumada
	Definir cantPlatos,valorPlato Como Entero;
	Escribir 'Ingrese cantidad de platos a cotizar';
	Leer cantPlatos;
	Si (cantPlatos>300) Entonces
		valorPlato <- cantPlatos*7500;
	FinSi
	Si (cantPlatos>200 Y cantPlatos<=300) Entonces
		valorPlato <- cantPlatos*8500;
	FinSi
	Si (cantPlatos<=200) Entonces
		valorPlato <- cantPlatos*9500;
	FinSi
	Escribir 'El valor total a pagar por la cantidad de platos es: ',valorPlato;
FinProceso
