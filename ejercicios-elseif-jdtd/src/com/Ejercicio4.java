package com;
import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[] args) {
	
Scanner sn = new Scanner(System.in); 

 int edad = 0 ;
 int nota = 0 ;
 char sexo;

 System.out.println("ingrese el numero de nota: ");
   nota = sn.nextInt();
 System.out.println("ingrese su edad: ");
  edad = sn.nextInt();
  System.out.println("Ingrese su sexo con la letra (M) para masculini y (F) para femenino");
  sexo = sn.next().charAt(0);
  
	if(nota>=5 && edad>=18 && sexo=='M'|| sexo=='m') {
		System.out.println("posible");
		} else if (nota>=5 && edad>=18 && sexo=='F' || sexo=='f') {
			System.out.println("Aceptada");
		}else {
			System.out.println("No aceptada");
		}
	
	
	
	
	
	
	
	
}
}
