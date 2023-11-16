package com;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	double alumnos;
	
System.out.println("Introduzca el numero de alumnos:");
alumnos = scanner.nextInt();
if(alumnos>=100){
	System.out.println("El precio por alumno es de 65 euros");
	System.out.println("El pago de la renta de autobus es de:"+alumnos*65);

}else if (alumnos>=50 && alumnos<=99) {
	System.out.println("El precio por alumno es 70 euros");
	System.out.println("El pago de la renta de autobus es de:"+alumnos*70);
}else if (alumnos>=30 && alumnos<=49) {
	System.out.println("El precio por alumnos es de 95 euros");
	System.out.println("El pago de la renta de autobuses es de"+alumnos*95);
	}else {
	System.out.println("El precio por alumno es de"+(4000/alumnos)+"euros");
	}
	
	}
}
		


