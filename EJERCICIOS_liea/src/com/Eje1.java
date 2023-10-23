package com;

import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		//int entrada;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESA 2 NUMEROS PARA COMPARARLOS ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " es mayor");
		}else if (num2>num1) {
			System.out.println(num2 + " es mayor");
		}else {
			System.out.println("los 2 numeros son iguales");
		}
	}

}
