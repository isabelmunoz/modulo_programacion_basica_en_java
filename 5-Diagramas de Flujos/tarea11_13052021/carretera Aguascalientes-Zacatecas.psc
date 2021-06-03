Proceso carretera_Aguascalientes_zacatecas
	Definir kms1,kms2,distancia Como Entero;
	kms1 <- 70;
	kms2 <- 150;
	Escribir 'La persona 1 parte con destino a Aguascalientes desde el kilometro 70 de la ruta';
	Escribir 'La persona 2 parte con destino a Zacatecas desde el kilometro 150 de la ruta';
	Mientras kms1<>kms2 Hacer
		kms1 <- kms1+1;
		kms2 <- kms2-1;
	FinMientras
	Si kms1==kms2 Entonces
		Escribir 'Las personas se encontrarán en el kilómetro: ',kms1,' de la ruta';
	FinSi
FinProceso
