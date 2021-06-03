Proceso banco_Pueblo_desconocido
	Definir limite,aumento Como Real;
	Definir tipo Como Entero;
	Escribir 'Ingrese el limite';
	Leer limite;
	Escribir 'Ingresa el tipo de tarjeta';
	Leer tipo;
	Si tipo==1 Entonces
		aumento <- (limite*0.25);
	SiNo
		Si tipo==2 Entonces
			aumento <- (limite*0.35);
		SiNo
			Si tipo==3 Entonces
				aumento <- (limite*0.40);
			SiNo
				aumento <- (limite*0.50);
			FinSi
		FinSi
	FinSi
	Escribir 'El aumento del credito es: $',aumento;
	Escribir 'El nuevo limite del credito es: ',limite+aumento;
FinProceso
