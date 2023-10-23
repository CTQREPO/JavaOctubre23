package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_08 {
public static void main(String[] args) {
//	8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor	
	
	int num1;
	int num2;
	int maximo;
	int minimo;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("INGRESE EL PRIMER NUMERO: ");
	num1 = sc.nextInt();
	
	System.out.println("INGRESE EL SEGUNDO NUMERO: ");
	num2 = sc.nextInt();
	
	minimo = Math.min(num1, num2);
	maximo = Math.max(num1, num2);
		
	System.out.println("LOS NUMEROS DESDE EL MENOR AL MAYOR SON: ");
	for (int i = minimo; i <= maximo; i++) {
		 System.out.println(i+"");
	
	}
		
}
}
