package com;

import java.util.Scanner;

public class Ejercicio3{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double numero1;
		double numero2;
		System.out.println("Introduce el numero:");
		numero1 = scanner.nextDouble();
		System.out.println("Introduce el denominador");
		numero2 = scanner.nextDouble();
		if (numero2 != 0) {
			System.out.println(numero1/numero2); 
				}else{
					System.out.println("Introduzca el segundo numero es 0"+ "error");
				}
		}
				
	}
