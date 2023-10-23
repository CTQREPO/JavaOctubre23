package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_09 {
	public static void main(String[] args) {
		//9. Programa Java que lea dos números y muestre los números pares entre ellos
	
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
         num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
		
        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
		
		
	}
  }
}
