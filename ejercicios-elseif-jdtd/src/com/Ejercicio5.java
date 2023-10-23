package com;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		char  Tipo    ;
		int   Tamaño  ;
	    int   precio  ;
	    int  total = 0; 
	    int kilo ;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("ingres el precio inicial del kilo de la uva: ");
		precio = sc.nextInt();
		System.out.println("La cantidad de kilos solicitados");
		kilo = sc.nextInt();
		System.out.println("ingrese el tipo de de Uva (A) y (B): ");
		Tipo = sc.next().charAt(0);
		System.out.println("ingrese el tamaño de la Uva (1) y (2): ");
		Tamaño = sc.nextInt();
		
		if(Tipo=='A' || Tipo=='a' && Tamaño==1) {
			total = (precio + 20)* kilo;
			System.out.println("El precio total es: "+total);
		}else if(Tipo=='A' || Tipo== 'a' && Tamaño==2) {
			total = (precio + 30)* kilo;
			System.out.println("El precio total es: "+total);
		}else if (Tipo=='B'|| Tipo=='b'&& Tamaño==1) {
			total = (precio - 30)* kilo;
			System.out.println("El precio total es : "+ total);
		}else if(Tipo=='B'|| Tipo=='b'&& Tamaño==2) {
			total = (precio - 50)* kilo;
			System.out.println("El precio total es: "+ total );
		}else {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
