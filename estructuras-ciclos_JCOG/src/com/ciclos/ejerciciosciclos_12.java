package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_12 {
public static void main(String[] args) {
// 12. Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
	// cuando el promedio de las edades sea superior a 25.
	
	 int numeroedades = 0;
	 int sumaedades = 0;
	 double promedio;
	 int edad;
	
	Scanner sc = new Scanner(System.in);
    
   
    while (true) {
        System.out.print("INGRESE UNA EDAD: ");
        edad = sc.nextInt();

        if (edad <= 0) {
            break;
        }

        sumaedades += edad;
        numeroedades++;
        promedio = (double) sumaedades / numeroedades;

        System.out.println("Promedio actual: " + promedio);

        if (promedio > 25) {
            System.out.println("El promedio es mayor que 25. Finaliza el programa.");
            break;
        }
}
}
}
