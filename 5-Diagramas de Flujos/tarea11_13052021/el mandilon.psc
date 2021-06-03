Proceso El_mandilon
	Definir ciudad,tienda,colaborador,venta Como Entero;
	Definir totalTienda,totalCiudad,totalCadena Como Real;
	ciudad <- 0;
	tienda <- 0;
	colaborador <- 0;
	venta <- 0;
	totalTienda <- 0;
	totalCiudad <- 0;
	totalCadena <- 0;
	Escribir 'Ingrese la cantidad de ciudades';
	Leer ciudad;
	Mientras ciudad>0 Hacer
		Escribir 'Ingrese la cantidad de tiendas en la ciudad',ciudad;
		Leer tienda;
		Mientras tienda>0 Hacer
			Escribir 'Ingrese la cantidad de colaboradores ',tienda;
			Leer colaborador;
			Mientras colaborador>0 Hacer
				Escribir 'Ingrese el total de venta del colaborador ',colaborador;
				Leer venta;
				Escribir 'El total de venta del colaborador ',colaborador,' es: $',venta;
				totalTienda <- totalTienda+venta;
				colaborador <- colaborador-1;
			FinMientras
			Escribir 'El total de venta de la tienda ',tienda,' es: $',totalTienda;
			totalCiudad <- totalCiudad+totalTienda;
			tienda <- tienda-1;
		FinMientras
		Escribir 'El total de la venta de la ciudad ',ciudad,' es: $ ',totalCiudad;
		totalCadena <- totalCadena+totalCiudad;
		ciudad <- ciudad-1;
	FinMientras
	Escribir 'El total de la venta de la empresa es : $',totalCadena;
FinProceso
