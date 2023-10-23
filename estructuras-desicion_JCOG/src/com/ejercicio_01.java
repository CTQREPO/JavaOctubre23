package com;

import java.util.Scanner;

public class ejercicio_01 {
	
	
	public static void main(String[] args) {
		
		//1. Realiza un programa que reciba dos números por teclado e indique
		//cuál es mayor o si son iguales.

		Scanner sc=new Scanner(System.in);
		
		int num1=0;
		System.out.println("digite el numero 1: ");
		
		num1=sc.nextInt();
			
		int num2=0;
		System.out.println("digite el numero 2: ");
		
		num2 = sc.nextInt();
		
		if (num1 > num2) {
		System.out.println("Numero 1 es mayor");
		} else if (num1 < num2) {
			System.out.println("Numero 2 es mayor");
		}else if (num1 == num2) {
			System.out.println("los numeros son iguales");
			
		}
			
	}
}