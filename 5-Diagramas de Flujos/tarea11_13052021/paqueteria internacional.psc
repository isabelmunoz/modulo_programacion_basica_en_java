Proceso paqueteria_internacional
	Definir peso,costo Como Real;
	Definir zona Como Entero;
	Escribir 'Ingresa el peso del paquete en kilos';
	Leer peso;
	Si peso>5 Entonces
		Escribir 'El paquete no se puede transportar';
	SiNo
		Escribir 'Ingresa la zona a donde va dirigido';
		Escribir '1 = America del Norte';
		Escribir '2 = America Central';
		Escribir '3 = America del sur';
		Escribir '4 = Europa';
		Escribir '5 = Asia';
		Leer zona;
		Si zona>=1 Y zona<=5 Entonces
			Si zona==1 Entonces
				costo <- (peso*1000)*110;
				Escribir '1 = America del Norte';
			SiNo
				Si zona==2 Entonces
					costo <- (peso*1000)*100;
					Si zona==3 Entonces
						costo <- (peso*1000)*120;
						Escribir '3 = America del sur';
					SiNo
						Si zona==4 Entonces
							costo <- (peso*1000)*240;
							Escribir '4 = Europa';
						SiNo
							costo <- (peso*1000)*270;
							Escribir '5 = Asia';
						FinSi
					FinSi
				FinSi
			FinSi
			Escribir 'El cobro por el envio del paquete es: $',costo;
			Escribir 'El paquete tiene un peso de: ',peso,' kilos';
		SiNo
			Escribir 'El paquete no se puede enviar a esa zona';
		FinSi
	FinSi
FinProceso
