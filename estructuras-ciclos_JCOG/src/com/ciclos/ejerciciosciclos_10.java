package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_10 {
public static void main(String[] args) {
//	 10. Programa que lea 20 números e indique si son positivos o negativos y
//   pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.	

	 Scanner sc = new Scanner(System.in);
     
     int sumapositivos = 0;
     int sumaimpares = 0;

     for (int i = 1; i <= 20; i++) {
         System.out.print("Introduce el número " + i + ": ");
         int numero = sc.nextInt();

         // numero positivo o negativo
         if (numero > 0) {
             System.out.println(numero + " es positivo.");
             sumapositivos += numero;
         } else if (numero < 0) {
             System.out.println(numero + " es negativo.");
         } else {
             System.out.println(numero + " es cero.");
         }

         // numero par o impar
         if (numero % 2 == 0) {
             System.out.println(numero + " es par.");
         } else {
             System.out.println(numero + " es impar.");
             sumaimpares += numero;
         }
     }

     System.out.println("Sumatoria de números positivos: " + sumapositivos);
     System.out.println("Sumatoria de números impares: " + sumaimpares);
}
}
