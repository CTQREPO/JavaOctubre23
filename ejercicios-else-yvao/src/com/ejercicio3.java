package com;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		float x;
		float y;
		float resultado;
		
		
		System.out.println("Teclee el primer numero");
		x = a.nextFloat();
		
		System.out.println("Teclee el segundo numero");
		y = a.nextFloat();
		
		resultado = x/y;
		if (y == 0) {
			System.out.println("Error");
		}else{
			System.out.println("El resultado es:" + resultado);
		}
		
		
		
	}
}
