Proceso Producto_a_cuotas
	Definir cuota,n,pago,total,i Como Entero;
	Escribir 'Ingrese valor inicial de cuota';
	Leer n;
	i <- 0;
	total <- 0;
	pago <- 0;
	Escribir 'valor de cuota 1 es ',n;
	Para i<-2 Hasta 20 Con Paso i+1 Hacer
		pago <- n*2;
		n <- pago;
		total <- total+pago;
		Escribir 'valor de cuota ',i,' es ',pago;
	FinPara
	Escribir 'el valor total a pagar es: ',total;
FinProceso
