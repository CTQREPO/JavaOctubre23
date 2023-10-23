package com;
import java.util.Scanner;
public class Ejercicio2 {
	

		public static void main(String[] args){
			Scanner scanner = new Scanner (System.in);
		int num1=0;
		int num2=0;
		System.out.println("Ingresa el numero a multiplicar");
		num1= scanner.nextInt();
		System.out.println("Interaccion deseada");
		num2= scanner.nextInt();
		for(int i = 1; i<=num2; i++){
			System.out.println(num1+ " * "+i+" = "+(num1*i));
		}
		}
	}




