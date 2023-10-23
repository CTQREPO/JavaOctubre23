package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//
//		int contador = 0;
//		int cantidad = 0;
//		int suma = 0;
//		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Cantidad de número a ingresar");
//		cantidad = sc.nextInt();
		
//		while (contador < cantidad ) {
//			System.out.println("Ingresa un número: ");
//			numero = sc.nextInt();
//			
//			suma = suma + numero;
//			
//			contador ++;
//		}
//		System.out.println("La suma es: " + suma );
//		
		
//		int num1 = 0 ;
//		int num2 = 0;
//		
//		System.out.println("Ingresa el primer número a multiplicar");
//		num1 = sc.nextInt();
//		System.out.println("Iteración deseada");
//		num2 = sc.nextInt();
//		
//		for (int i = 1; i <= num2; i++) {
//			if (i % 2 == 0 ) {
//				System.out.println(num1 + " * "+i + " = " + (num1*i));
//			}
//		}
		
		String cadena="kjbwe4786109bc9786tcr23b408ym9y=)?=)?5430o123)·!%·$8976+-`+!=?^_8798o8";
		
		int contador = 0;
		
		for (int j = 0; j < 10; j++) {
			String caracter = String.valueOf(j);
			for (int i = 0; i < cadena.length(); i++) {
				if( caracter.equals(Character.toString(cadena.charAt(i) )) ) {
					contador++;
				}
			}
			System.out.println("Se repite " + j + " en la cadena " + contador + " veces");
			contador = 0;
		}
	}
}
