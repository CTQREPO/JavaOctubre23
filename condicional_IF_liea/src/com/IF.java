package com;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num, dato = 10;
		
		System.out.println("DAME UN NUMERO");
		num = entrada.nextInt();
		if(num == dato) {
			System.out.println("NUMERO CORRECTO");
		}
		else {
			System.out.println("NUMERO INCORRECTO");
		}
			
		
	}
}
