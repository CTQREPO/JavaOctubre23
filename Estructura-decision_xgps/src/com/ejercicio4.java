package com;
import java.util.Scanner;
public class ejercicio4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int edad;
	int nota;
	char sexo;
	System.out.println("Introduzca su edad:");
	edad = scanner.nextInt();
	System.out.println("Introduce su nota:");
	nota = scanner.nextInt();
	System.out.println("Introduzca su sexo Femenino o Masculino");
	sexo = scanner.next().charAt(0);
	
	if(sexo== 'm'){
		if((nota>=5)&&(edad>=18)){
			System.out.println("Posible");
		}else {
			System.out.println("No aceptado");
			}
		}
	if(sexo=='f') {
		if((nota>=5)&&(edad>=18)) {
			System.out.println("Aceptada");
		}else {
			System.out.println("No aceptado");
		}
	}
}

}
