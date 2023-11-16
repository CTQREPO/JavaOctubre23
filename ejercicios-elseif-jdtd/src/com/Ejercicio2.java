package com;
import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
	
	Scanner sn = new Scanner(System.in);
	int x = 0;
	
	System.out.println("ingrese un numero:");
	x = sn.nextInt();
	
	if(x % 2 == 0) {
		System.out.println("el numero es par");
	}else {
		System.out.println("el numero es impar");
	}
	
}
}
