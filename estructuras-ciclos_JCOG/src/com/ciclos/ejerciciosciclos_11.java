package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_11 {
public static void main(String[] args) {
// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
// Ejemplo: 8 x 8

	Scanner sc = new Scanner (System.in);
	
	int ancho;
	int alto;
	
	System.out.println("INGRESE EL ANCHO DEL CUADRADO: ");
	ancho=sc.nextInt();
	
	System.out.println("INGRESE LA ALTURA DEL CUADRADO");
	alto=sc.nextInt();
	
	for (int i = 0; i <ancho; i++) {
		for (int j = 0; j < alto; j++) {
			System.out.print("# ");
		} System.out.println();
	} 
	
}
}
