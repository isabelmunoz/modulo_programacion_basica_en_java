Proceso El_harapiento_distinguido
	Definir valorTraje Como Real;
	Escribir 'Ingrese valor de traje';
	Leer valorTraje;
	Si valorTraje>250000 Entonces
		valorTraje <-valorTraje-((valorTraje *15)/100);
	SiNo
		valorTraje <- valorTraje-((valorTraje*8)/100);
	FinSi
	Escribir 'El valor total a pagar por el traje es: ', valorTraje;
	
FinProceso
