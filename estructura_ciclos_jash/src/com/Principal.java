package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		 ciclo1();
		// ciclo2();
		// ciclo3();
		// ciclo4();
		// ciclo5();
		// ciclo6();
		// ciclo7();
		// ciclo8();
		// ciclo9();
		// ciclo10();
		// ciclo11();
		// ciclo12();
	}

	static Scanner sc = new Scanner(System.in);

	static void ciclo1() {
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "x12=" + i * 12);
		}
	}

	static void ciclo2() {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido
		// desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de
		// 23 hasta el 95.
		// 23 x 95 = ???;
		int tabla, limite;

		System.out.print("introduce la tabla de multiplar a generar: ");
		tabla = sc.nextInt();
		System.out.print("Ingresa el limite de la tabla de multiplicar: ");
		limite = sc.nextInt();
		for (int i = 1; i <= limite; i++) {
			System.out.println(i + "x" + tabla + "=" + i * tabla);
		}
	}

	static void ciclo3() {
		// 3. Realiza un programa para determinar si un String es palíndromo.
		String palabra, inverso;

		System.out.println("Ingresa una palabra: ");
		palabra = sc.next();
		inverso = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			inverso = inverso + palabra.charAt(i);
		}
		System.out.println("El inverso es " + inverso);

		if (palabra.equals(inverso)) {
			System.out.println("La palabra " + palabra + " es palindromo");
		} else {
			System.out.println("La palabra " + palabra + " no es polindromo");
		}
	}

	static void ciclo4() {
		// 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como
		// resultado cuántas veces existe esa letra dentro de la frase. Si no existe,
		// imprimir un mensaje “Carácter no encontrado”.
		String frase;
		String letra, letraB;
		int numLetra = 0;
		System.out.println("Ingresa una frase: ");
		frase = sc.next();
		System.out.println("Ingresa la letra que se requiere buscar: ");
		letra = sc.next();
		for (int i = 0; i < frase.length(); i++) {
			letraB = Character.toString(frase.charAt(i));
			if (letraB.equals(letra)) {
				numLetra++;
			}
		}
		if (numLetra == 0) {
			System.out.println("Caracter no encontrado");
		} else {
			System.out.println("La letra buscada se encuentra " + numLetra + " veces");
		}
	}

	static void ciclo5() {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		// minutos y
		// segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		int hora, minutos, segundos;
		for (int i = 0; i < 24; i++) {
			hora = i;
			for (int j = 0; j < 60; j++) {
				minutos = j;
				for (int j2 = 0; j2 < 60; j2++) {
					segundos = j2;
					try {
						Thread.sleep(1000);
						System.out.println(hora + ":" + minutos + ":" + segundos);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}

	}

	static void ciclo6() {
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		// de interés mensual.
		// Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si
		// todo el dinero lo reinvierte?
		double inversion = 1000;
		double interesMensual = 0.02;
		int meses = 12;

//		System.out.println("Ingresa la cantidad del dinero a invertir: ");
//		inversion = sc.nextInt();

		for (int i = 0; i < meses; i++) {
			inversion += inversion * interesMensual;
		}
		System.out.println("al cabo de un año el totol es: " + inversion);

	}

	static void ciclo7() {
		// - Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		// interés mensual.
		// En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.
		double inversion = 700;
		double interesMensual = 0.02;
		int meses = 0;

//		System.out.println("Ingresa la cantidad del dinero a invertir: ");
//		inversion = sc.nextInt();

		while (inversion <= 1500) {
			inversion += inversion * interesMensual;
			meses++;
		}
		System.out.println("el total de meses a cumplir para tener 1500 es : " + meses);
		System.out.println("el valor final de lo invertido es: "+inversion);
	}

	static void ciclo8() {
		// 8. Programa Java que lea dos números y muestre los números desde el menor
		// hasta el mayor
		int valor1, valor2;
		System.out.println("Ingresa un numero entero:");
		valor1 = sc.nextInt();
		System.out.println("Ingresa otro numero entero: ");
		valor2 = sc.nextInt();

		if (valor1 > valor2) {
			for (int i = valor2; i <= valor1; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = valor1; i <= valor2; i++) {
				System.out.println(i);
			}
		}

	}

	static void ciclo9() {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos
		int valor1, valor2;
		System.out.print("Ingresa el primer valor : ");
		valor1 = sc.nextInt();
		System.out.print("Ingresa el segundo valor: ");
		valor2 = sc.nextInt();

		if (valor1 > valor2) {
			for (int i = valor2; i <= valor1; i++) {
				if (i % 2 == 0) {
					int resultado = i;
					System.out.println("Los valores pares : " + resultado);
				} else {
				}
			}
		} else {
			for (int i = valor1; i <= valor2; i++) {
				if (i % 2 == 0) {
					int resultado = i;
					System.out.println("Los valores pares : " + resultado);
				} else {
				}
			}
		}
	}

	static void ciclo10() {
		// 10. Programa que lea 20 números e indique si son positivos o negativos y
		// pares o impares
		// y ademas muestre la sumatoria de los positivos y sumatoria de los impares.
		int[] matriz = new int[20];

		int valorPositivo = 0;
		int valorImpar = 0;

		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Ingresa el valor " + (i + 1) + ":");
			matriz[i] = sc.nextInt();
			if (matriz[i] > 0) {
				System.out.println("Es un numero postivo");
				valorPositivo = valorPositivo + matriz[i];
			} else {
				System.out.println("Es un numero negativo");
			}
			if (matriz[i] % 2 == 0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
				valorImpar = valorImpar + matriz[i];
			}
		}
		System.out.println("La suma de los valores positivos es: " + valorPositivo);
		System.out.println("La suma de los valores impares es: " + valorImpar);
	}

	static void ciclo11() {
		// Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado
		// el ancho y el alto.
		// Ejemplo: 8 x 8
		int ancho, altura;

		System.out.println("Ingresa el ancho del cuadrado: ");
		ancho = sc.nextInt();
		System.out.println("Ingresa el alto del cuadrado: ");
		altura = sc.nextInt();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	static void ciclo12() {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa
		// finalizara cuando el promedio de las edades sea superior a 25.

		int edad;
		double promedioEdad, sumaEdad;
		promedioEdad = 0;
		sumaEdad = 0;
		int personas = 0;

		do {
			System.out.print("ingresa la edad de la persona: ");
			edad = sc.nextInt();
			sumaEdad = sumaEdad + edad;
			personas = personas + 1;
			promedioEdad = sumaEdad / personas;

			System.out.println("promedio de las edades ingresadas es: " + promedioEdad);
		} while (promedioEdad <= 25);
	}
}