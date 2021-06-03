Proceso naufrago_satisfecho
	Definir n,tarjeta,hamburguesa como entero;
	Definir total Como Real;
	Escribir "Cuantas hamburguesas desea comprar";
	leer n;
Escribir "Seleccione el numero correspondiente al tipo de hamburguesa: ";
Escribir "1. sencilla $2000";
Escribir "2. doble $2500";	
Escribir "3. triples $2800";
	leer hamburguesa;
	Segun hamburguesa Hacer
		
		1:
			total<-n*2000;
		2:
			total<-n*2500;
		3:
			total<-n*2800;
		De Otro Modo:
			Escribir "La opción ingresada no es válida";
			
	FinSegun  
	
Escribir "Elige el tipo de pago:";
	Escribir "1.- Efectivo";
	Escribir "2.- Tarjeta de credito";	
	leer tarjeta;
	Segun tarjeta Hacer
		
		1:
		Escribir "El total a pagar es de: ",total, " pesos";
			
		2:
			total <- total + (total*0.05);
			
			Escribir "El total a pagar es de: "	,total, " pesos";
			
		De Otro Modo:
			
			Escribir "Elija una opciónn correcta";
			
	FinSegun       
FinProceso
