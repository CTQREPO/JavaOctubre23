package com;

import java.util.Scanner;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
//		ejercicio10();
//		ejercicio11();
//		ejercicio12();
//		ejercicio13();
	}
	
	 static void ejercicio1() {
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		double valor1,valor2;
		
		System.out.print("Ingresa el primer valor: ");
		valor1 = entrada.nextDouble();
		System.out.print("Ingresa el segundo valor: ");
		valor2 = entrada.nextDouble();
		
		if(valor1>valor2) {
			System.out.println("El primer valor es mayor");
		}else if(valor1<valor2) {
			System.out.println("el segundo valor es mayor");
		}else if(valor1==valor2) {
			System.out.println("los dos valores son iguales");			
		}
	}
	
	static void ejercicio2() {
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		int numero;
		System.out.print("Ingresa un numero entero:");
		numero = entrada.nextInt();
		if(numero % 2 == 0) {
			System.out.println("El valor ingresado es un numero par");
		}else {
			System.out.println("El valor del numero ingresado es inpar");
		}
		
	}
	
	static void ejercicio3() {
		//Crea un programa que pida al usuario dos números y muestre el resultado de su 
		//división. Si el segundo número es 0, debe mostrar un mensaje de error.
		double valor1, valor2;
		System.out.print("Ingresa el primer valor: ");
		valor1 = entrada.nextDouble();
		System.out.print("Ingresa el segundo valor: ");
		valor2 = entrada.nextDouble();
		if(valor2 == 0) {
			System.out.println("ERROR");
		}else {
			System.out.println("La divicion del valor 1 entre el valor 2 es: "+valor1/valor2);
		}
	}
	
	static void ejercicio4() {
		//Realiza un programa que calcule la aceptación de una solicitud en base a los 
		//siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA
		int nota, edad;
		String sexo;
		System.out.println("Ingresa la letra correspondiente a tu Sexo");
		System.out.println("Masculino es M  --  Femenino es F");
		sexo = entrada.next();
		System.out.print("Tu nota es: ");
		nota = entrada.nextInt();
		System.out.print("Tu edad es: ");
		edad = entrada.nextInt();
		
		if(sexo.equals("M")) {
			if(nota>=5 && edad>=18) {
				System.out.println("POSIBLE");
			}else {
				System.out.println("NO ACEPTADO");
			}
		}else if(sexo.equals("F")) {
			if(nota>=5 && edad>=18) {
				System.out.println("ACEPTADA");
			}else {
				System.out.println("NO ACEPTADA");
			}
		}
	}
	
	static void ejercicio5() {
		//La asociación de vinicultores tiene como política fijar un precio inicial al 
		//kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
		//requiere determinar cuanto recibirá un productor por la uva que entrega en un 
		//embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 
		//y 30 céntimos si es de tamaño 2.
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos 
		//cuando es de tamaño 2.
		//Precio inicial se recibe desde teclado
		
		int tamaño;
		double kilos,precioInicial,tamañoA1,tamañoA2,tamañoB1,tamañoB2,precioFinal;
		String tipo;
		tamañoA1 = 0.20;
		tamañoA2 = 0.30;
		tamañoB1 = 0.30;
		tamañoB2 = 0.50;
		
		System.out.println("Ingresa el precio InicialxKilo: ");
		precioInicial = entrada.nextDouble();
		System.out.println("Ingresa el tipo de Uva -- A o B --");
		tipo = entrada.next();
		System.out.println("Ingresa el tamaño de la uva -- 1 o 2--");
		tamaño=entrada.nextInt();
		System.out.println("Ingresa el numero total de kilos");
		kilos = entrada.nextDouble();
		
		switch(tipo) {
		 	case "A":
		 		if(tamaño==1) {
		 			precioFinal = (precioInicial+tamañoA1)*kilos;
		 			System.out.println("El precio total es: "+precioFinal);
		 		}else if(tamaño==2) {
		 			precioFinal = (precioInicial+tamañoA2)*kilos;
		 			System.out.println("El precio total es: "+precioFinal);
		 		}else {
		 			System.out.println("ERROR");
		 		}
			 break;
		 	case "B":
		 		if(tamaño==1) {
		 			precioFinal = (precioInicial-tamañoB1)*kilos;
		 			System.out.println("El precio total es: "+precioFinal);
		 		}else if(tamaño==2) {
		 			precioFinal = (precioInicial-tamañoB2)*kilos;
		 			System.out.println("El precio total es: "+precioFinal);
		 		}else {
		 			System.out.println("ERROR");
		 		}		 		
		 		break;
		}
	}

	static void ejercicio6() {
//		El director de una escuela está organizando un viaje de estudios y requiere determinar 
//		cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el 
//		servicio. La forma de cobrar es la siguiente:
//
//			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin 
//			importar el número de alumnos.
//
//			Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo 
//			que debe pagar cada alumno por el viaje.
		
		int totalAlumnos,costoViaje;
		double costoxalumno;
		
		System.out.println("Ingresa el numero total de alumnos");
		totalAlumnos = entrada.nextInt();
		
		if(totalAlumnos>=100){
			costoViaje = totalAlumnos*65;
			System.out.println("El costo total del viaje es: "+costoViaje+" euros");
			System.out.println("El costo por alumno es de 65 euros");
		}else if(totalAlumnos>=50 && totalAlumnos<=99) {
			costoViaje = totalAlumnos*70;
			System.out.println("El costo total del viaje es: "+costoViaje+" euros");
			System.out.println("El costo por alumno es de 70 euros");
		}else if(totalAlumnos>=30 && totalAlumnos<=49) {
			costoViaje = totalAlumnos*95;
			System.out.println("El costo total del viaje es: "+costoViaje+" euros");
			System.out.println("El costo por alumno es de 95 euros");
		}else if(totalAlumnos<30){
			costoxalumno = 4000/totalAlumnos;
			System.out.println("Al ser menos de 30 alumnos deben pagar "+costoxalumno + " euros por alumno");
			System.out.println("El costo total del viaje es de 4000 euros");
		}
	}

	static void ejercicio7() {
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis 
//		caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
//			“ERROR: número incorrecto”.
	int valorentero;
	String cadena;
		System.out.println("Ingresa el numero de cara obtenida");
		valorentero = entrada.nextInt();
		
			switch(valorentero) {
			case 1:
				cadena="Seis";
				System.out.println(cadena);
				break;
			case 2:
				cadena="Cinco";
				System.out.println(cadena);
				break;
			case 3:
				cadena="Cuatro";
				System.out.println(cadena);
				break;
			case 4:
				cadena="Tres";
				System.out.println(cadena);
				break;
			case 5:
				cadena="Dos";
				System.out.println(cadena);
				break;
			case 6:
				cadena="Uno";
				System.out.println(cadena);
				break;
			default:
				System.out.println("ERROR: numero incorrecto");	
			}
	}

	static void ejercicio8() {
//		Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
//		Si introducimos otro número nos da un error.
		
		int dia; 
		System.out.print("Ingresa un numero del 1 al 7 referente al dia de la semana: ");
		dia = entrada.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ERROR: Numero invalido");
		}
	}
	
	static void ejercicio9() {
//		Realiza un programa que pida un número entero entre uno y doce e imprima el número de 
//		días que tiene el mes correspondiente.
		
		int mes; 
		System.out.print("Ingresa un numero del 1 al 12 referente a un mes del año ");
		mes = entrada.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Enero tiene 31 dias");
			break;
		case 2:
			System.out.println("Febrero tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo tiene 31 dias");
			break;
		case 4:
			System.out.println("Abril tiene 30 dias");
			break;
		case 5:
			System.out.println("Mayo tiene 31 dias");
			break;
		case 6:
			System.out.println("Junio tiene 30 dias");
			break;
		case 7:
			System.out.println("Julio tiene 31 dias");
			break;
		case 8:
			System.out.println("Agosto tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre tiene 31 dias");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 dias");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 dias");
			break;
		default:
			System.out.println("ERROR: Numero de mes invalido");
		}

	}
	
	static void ejercicio10() {
//		Una compañía de transporte internacional tiene servicio en algunos países de 
//		América del Norte, América Central, América del Sur, Europa y Asia. El costo 
//		por servicio de transporte se basa en el peso del paquete y la zona a la que 
//		va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		int zonaUbicacion;
		double pesoPaquete,precioFinal;
		double americaN, americaC,americaS,europa,asia;
		americaN = 24;
		americaC = 20;
		americaS = 21;
		europa = 10;
		asia = 18;
		
		System.out.println("|1 Amerca del norte | 2 America Central | 3 America del sur | 4 Europa | 5 asia |");
		System.out.print("Ingresa el numero de la zona de ubicacion a transportar: ");
		zonaUbicacion = entrada.nextInt();

		
		switch(zonaUbicacion) {
			case 1:
				System.out.print("Ingresa el total del peso del paquete: ");
				pesoPaquete = entrada.nextDouble();
				
				if(pesoPaquete<=5 && pesoPaquete>=0) {
					precioFinal= pesoPaquete*americaN;
					System.out.println("El costo del envio es: "+precioFinal);
				}else if(pesoPaquete>5) {
					System.out.println("Paquete rechazado");
				}else {
					System.out.println("ERROR");
				}
				break;
			case 2:
				System.out.print("Ingresa el total del peso del paquete: ");
				pesoPaquete = entrada.nextDouble();
				
				if(pesoPaquete<=5 && pesoPaquete>=0) {
					precioFinal= pesoPaquete*americaC;
					System.out.println("El costo del envio es: "+precioFinal);
				}else if(pesoPaquete>5) {
					System.out.println("Paquete rechazado");
				}else {
					System.out.println("ERROR");
				}
				break;
			case 3:
				System.out.print("Ingresa el total del peso del paquete: ");
				pesoPaquete = entrada.nextDouble();
				
				if(pesoPaquete<=5 && pesoPaquete>=0) {
					precioFinal= pesoPaquete*americaS;
					System.out.println("El costo del envio es: "+precioFinal);
				}else if(pesoPaquete>5) {
					System.out.println("Paquete rechazado");
				}else {
					System.out.println("ERROR");
				}
				break;
			case 4:
				System.out.print("Ingresa el total del peso del paquete: ");
				pesoPaquete = entrada.nextDouble();
				
				if(pesoPaquete<=5 && pesoPaquete>=0) {
					precioFinal= pesoPaquete*europa;
					System.out.println("El costo del envio es: "+precioFinal);
				}else if(pesoPaquete>5) {
					System.out.println("Paquete rechazado");
				}else {
					System.out.println("ERROR");
				}
				break;
			case 5:
				System.out.print("Ingresa el total del peso del paquete: ");
				pesoPaquete = entrada.nextDouble();
				
				if(pesoPaquete<=5 && pesoPaquete>=0) {
					precioFinal= pesoPaquete*asia;
					System.out.println("El costo del envio es: "+precioFinal);
				}else if(pesoPaquete>5) {
					System.out.println("Paquete rechazado");
				}else {
					System.out.println("ERROR");
				}
				break;
				
			default:
					System.out.println("ERROR");
		}
	}
	
	static void ejercicio11() {
//		Construir un programa que calcule el índice de masa corporal de una persona 
//		(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra 
//		esa persona en función del valor de IMC:
//			
//		Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
//		Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		double peso,estatura,imc;
		System.out.println("Ingresa el peso de la persona en KG: ");
		peso = entrada.nextDouble();
		System.out.println("Ingresa al estatura de la persona en M: ");
		estatura = entrada.nextDouble();
		
		imc = peso/(estatura*estatura);
		System.out.println("El IMC es: "+imc);
		if(imc<16){
			System.out.println("Ingreso de criterio de hospital");
		}else if(imc>=16 && imc<=17 ){
			System.out.println("Infrapeso");
		}else if(imc>17 && imc<=18 ){
			System.out.println("Bajo peso");
		}else if(imc>18 && imc<=25 ){
			System.out.println("Peso normal (Saludable)");
		}else if(imc>25 && imc<=30 ){
			System.out.println("Sobrepeso (obecidad de grado I)");
		}else if(imc>30 && imc<=35 ){
			System.out.println("Sobrepeso cronico (obecidad de grado II)");
		}else if(imc>35 && imc<=40 ){
			System.out.println("Obesidad premorbida (obecidad de grado III)");
		}else if(imc>40){
			System.out.println("obecidad morbica (obecidad de grado ) grado IV");
		}else {
			System.out.println("ERROR");
		}

	}
	
	static void ejercicio12() {
//	Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre 
//	un centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//
//	Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//	y el resto se invierte en la bolsa.
//	Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños 
//	y el resto se invierte en la bolsa.
//
//	La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		int donacion;
		double centroSalud,comedor,inversion;
		
		System.out.println("Monto de la donacion;");
		donacion= entrada.nextInt();
		if(donacion>=10000) {
			centroSalud = donacion*0.3;
			comedor = donacion*0.5;
			inversion = donacion-centroSalud-comedor;
			System.out.println("El centro de salud recibe: "+centroSalud);
			System.out.println("El comedor recibe: "+comedor);
			System.out.println("Se invertira en la bolsa : "+inversion);
		}else {
			centroSalud = donacion*0.25;
			comedor = donacion*0.6;
			inversion = donacion-centroSalud-comedor;
			System.out.println("El centro de salud recibe: "+centroSalud);
			System.out.println("El comedor recibe: "+comedor);
			System.out.println("Se invertira en la bolsa : "+inversion);
		}
	}
	
	static void ejercicio13() {
//		Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
//		Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le 
//		paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		int horasTrabajadas;
		double sueldo,horasExtra;
		
		System.out.print("Ingresa las horas trabajadas: ");
		horasTrabajadas = entrada.nextInt();
		
		if(horasTrabajadas<=40) {
			sueldo=horasTrabajadas*16;
			System.out.println("El sueldo de la semana por "+horasTrabajadas+" horas trabajadas es: $"+sueldo);
		}else if(horasTrabajadas>40) {
			sueldo=40*16;
			horasExtra = (horasTrabajadas-40)*20;
			System.out.println("El sueldo de la semana por "+horasTrabajadas+" horas trabajadas es :"+(sueldo+horasExtra));
			
		}
	}
	
	
}