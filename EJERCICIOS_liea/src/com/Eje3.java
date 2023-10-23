package com;

import java.util.Scanner;

public class Eje3 {

	public static void main(String[] args) {

		double num1, num2;
		double div;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESA EL DIVIDENDO");
		num1 = entrada.nextDouble();
		
		System.out.println("INGRESA EL DIVISOR");
		num2 = entrada.nextDouble();
		
		if(num2==0) {
			System.out.println("ERROR DE OPERACION");
		}
		else {
			div = num1/num2;
			System.out.println("EL RESULTADO ES " +div);
		}
		entrada.close();
	}

}
