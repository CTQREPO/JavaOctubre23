package com;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int x;
		
		System.out.println("teclee un numero");
		x = a.nextInt();
		
		if(x%2 ==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
				
	
		
	}
}
