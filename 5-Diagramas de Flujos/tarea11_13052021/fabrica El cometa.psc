Proceso Fabrica_El_cometa
	Definir materiaPrima,manoObra,gastoFabricacion,costoProduccion,precioVenta Como Real;
	Definir clave Como Entero;
	Escribir 'Ingresa la clave del articulo';
	Leer clave;
	Si clave>=1 Y clave<=6 Entonces
		Escribir 'Ingresa el costo de la materia prima';
		Leer materiaPrima;
		Si clave==3 O clave==4 Entonces
			manoObra <- materiaPrima*0.75;
		SiNo
			Si clave==1 O clave==5 Entonces
				manoObra <- materiaPrima*0.80;
			SiNo
				manoObra <- materiaPrima*0.85;
			FinSi
		FinSi
		Si clave==2 O clave==5 Entonces
			gastoFabricacion <- materiaPrima*0.30;
		SiNo
			Si clave==3 O clave==6 Entonces
				gastoFabricacion <- materiaPrima*0.35;
			SiNo
				gastoFabricacion <- materiaPrima*0.28;
			FinSi
		FinSi
		costoProduccion <- materiaPrima+manoObra+gastoFabricacion;
		precioVenta <- costoProduccion+(costoProduccion*.45);
		Escribir 'El gasto de mano de obra para el articulo con clave ',clave,' es: $',manoObra;
		Escribir 'El gasto de fabricacion para el articulo con clave ',clave,' es: $',gastoFabricacion;
		Escribir 'El costo de produccion para el articulo con clave ',clave,' es: $',costoProduccion;
		Escribir 'El precio de venta para el articulo con clave ',clave,' es $',precioVenta;
	SiNo
		Escribir 'Ingresa una clave correcta';
	FinSi
FinProceso
