package com;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int edad;
		int nota;
		char sexo;
		
		System.out.println("Teclee la informacion solicitada");
		System.out.println("Tecle su edad:");
		edad = a.nextInt();
		System.out.println("Tecle su nota:");
		nota = a.nextInt();
		System.out.println("Teclee el sexo (F) o (M) segun sea el caso:");
		sexo = a.next().charAt(0);
		
		if(nota>=5 && edad>=18 && sexo=='M' || sexo=='m'){
			System.out.println("POSIBLE");
		}else if (nota>=5 && edad>=18 && sexo=='F' || sexo=='f') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
		
		
	}
	}

