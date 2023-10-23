package com;

import java.util.Arrays;
import java.util.Scanner;

public class Eje2_8 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int[] numeros = new int[2];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESA 2 NUMEROS PARA ORDENARLOS DE MENOR A MAYOR");
		
		System.out.println("INGRESE PRIMER NUMERO");
		num1 = entrada.nextInt();
		
		System.out.println("INGRESE SEGUNDO NUMERO");
		num2 = entrada.nextInt();
		
		if(num1<num2) {
			for (int i = num1; i < num2+1; i++) {
				System.out.println(i);
			}
		
		}else {
			for (int i = num2; i < num1+1; i++) {
				System.out.println(i);
			}
		}
		//<>

	}
}
