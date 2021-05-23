Proceso Lapices
	Definir cantLapices,valorLapices Como Entero;
	Escribir 'Ingrese cantidad de lápices';
	Leer cantLapices;
	Si cantLapices>=1000 Entonces
		valorLapices<-cantLapices*85;
	SiNo
		valorLapices<-cantLapices*90;
	FinSi
	Escribir 'El valor total de lapices es: ',valorLapices;
FinProceso
