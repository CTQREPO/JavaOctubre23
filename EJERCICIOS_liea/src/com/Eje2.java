package com;

import java.util.Scanner;

public class Eje2 {

	public static void main(String[] args) {

		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE UN NUMERO PARA SABER SI ES PAR O IMPAR");
		num = entrada.nextInt();
		
		if(num%2==0) {
			System.out.println("EL NUMERO ES PAR");
		}else {
			System.out.println("EL NUMERO ES IMPAR");
		}
		entrada.close();
	}
}
