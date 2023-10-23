package com;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("ingrese el numero a multiplicar");
		num1 = a.nextInt();
		System.out.println("Ingrese la iteracion");
		num2 = a.nextInt();
		
		for( int i = 1; i<=num2 ; i++) {
			System.out.println(num1 +"*"+i+ "="+(num1*i));
			
		}
	}
}
