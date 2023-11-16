package com;
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		int horas;
		int salario;
		int extras;
		System.out.println("Teclee la cantidad de horas");
		horas = scanner.nextInt();
		
		if(horas<=40) {
			System.out.println("Su salario es de "+horas*16);
			}else if(horas>=41) {
				extras = horas-40;
				System.out.println("Su salario es de "+((40*16)+(extras*20)));
			}
		
	}
}

