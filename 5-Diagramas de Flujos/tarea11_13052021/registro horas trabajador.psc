Proceso registro_horas_trabajador
	Definir horas,total,valorHora,sueldo,i Como Entero;
	total <- 0;
	sueldo <- 0;
	horas <- 0;
	i <- 1;
	Mientras i<=6 Hacer
		Escribir 'Ingrese horas trabajadas día ',i;
		Leer horas;
		total <- total+horas;
		i <- i+1;
	FinMientras
	Escribir '*************Ingrese valor hora*****************';
	Leer valorHora;
	sueldo <- total*valorHora;
	Escribir 'El total de horas trabajadas es :',total;
	Escribir 'El sueldo total a la semana es :',sueldo;
FinProceso
