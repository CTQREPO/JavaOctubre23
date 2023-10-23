package com;
import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		int numero1;
		int numero2;
	
		System.out.println("teclee un numero");
		numero1 = a.nextInt();
		
		System.out.println("teclee un numero");
		numero2 = a.nextInt();
		
		if(numero1<numero2) {
			System.out.println("El mayor es" +numero2);
		}else if(numero1>numero2) {
			System.out.println("El mayor es" +numero1);
		}else if(numero1==numero2) {
			System.out.println("Los numeros son iguales");
		}
			
	}
}
