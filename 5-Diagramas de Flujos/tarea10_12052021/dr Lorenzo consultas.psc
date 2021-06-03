Proceso Dr_Lorenzo
	Definir n,pago, total Como Entero;
	Escribir "Ingresa el numero de citas";
	leer n;
	si n <= 3 Entonces 
		pago<-20000;
		total<-n*pago;
	SiNo
		si n <= 5 Entonces 
			pago<-15000;
			total<-((n-3) * pago) + 60000;
		SiNo
			si n <= 8 Entonces 
				pago<-10000;
				total<-((n-5) * pago) + 90000;
			SiNo
				pago<-5000;
				total<-((n-8) * pago) + 120000;
			FinSi
		FinSi
	FinSi
	Escribir "El pago de la cita es: $",pago;
	Escribir "Lo que ha pagado por el tramiento es: $",total;
FinProceso
