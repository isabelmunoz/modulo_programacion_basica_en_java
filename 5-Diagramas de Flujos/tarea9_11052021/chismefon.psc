Proceso Chismefon
	Definir cantMinutos,costo Como Real;
	Definir impuesto Como Entero;
	Escribir 'Ingrese cantidad de minutos que dur� la llamada';
	Leer cantMinutos;
	Escribir 'Ingrese d�a llamado:1)turno matutino-d�a h�bil , 2)turno vespertino- d�a h�bil, 3)Domingo';
	Leer impuesto;
	Si (cantMinutos<=5) Entonces
		costo <- cantMinutos*100;
	FinSi
	Si (cantMinutos>5 Y cantMinutos<=8) Entonces
		costo <- cantMinutos*80;
	FinSi
	Si (cantMinutos>8 Y cantMinutos<=10) Entonces
		costo <- cantMinutos*70;
	FinSi
	Si (cantMinutos>10) Entonces
		costo <- cantMinutos*50;
	FinSi
	Segun impuesto Hacer
		1:
			costo<-costo+((costo*3)/100);
		2:
			costo<-costo+((costo*15)/100);
		De Otro Modo:
			costo<-costo+((costo*10)/100);
	FinSegun
	Escribir 'El cantidad a pagar segun los ',cantMinutos,' minutos ingresados es de: ',costo;
	
FinProceso
