Proceso Viaje_alumnos
	Definir cantAlumnos,costo Como Entero;
	Escribir 'Ingrese cantidad de alumnos';
	Leer cantAlumnos;
	Si (cantAlumnos<30) Entonces
	 costo<-400000;
     FinSi
     Si (cantAlumnos>=30 y cantAlumnos <=49) Entonces
	 costo<-cantAlumnos*9500;
     FinSi
	Si (cantAlumnos>=50 y cantAlumnos <=99) Entonces
		 costo<-cantAlumnos*7000;
     FinSi
	Si (cantAlumnos>=100) Entonces
		 costo<-cantAlumnos*6500;
     FinSi
	Escribir 'El cantidad a pagar segun los ',cantAlumnos ,' alumnos ingresados es de: ',costo;
	
FinProceso
