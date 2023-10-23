package com;

import java.util.Scanner;

public class ejercicio_03 { 
	public static void main(String[] args) {
	//3.	Crea un programa que pida al usuario dos números y muestre 
	//		el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
	
		Scanner sc =new Scanner(System.in);
			
	float num1;
	float num2;
	
	System.out.println("ingrese el primer numero: ");
	num1 = sc.nextInt();
	System.out.println("ingrese el segundo numero: ");
	num2 = sc.nextInt();
	
		if (num2==0) {
			System.out.println("ERROR, no es posible dividir entre cero");
		}else {
			float div1 = num1/num2;
			System.out.println("el resultado es: "+div1);
		}
				
	}
		
}
