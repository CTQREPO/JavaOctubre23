package com;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		double s;
		double c;
		double i;
		double donacion;
		System.out.println("Teclee la donacion que desee");
		donacion = scanner.nextDouble();
		
		if(donacion>=10000) {
			System.out.println("El monto destinado al centro de salud es de  "+(donacion*.30));
			System.out.println("El monto destinado al comedor de niños es de "+(donacion*.50));
			System.out.println("El monto destinado a la bolsa de inversiones es de "+(donacion*.20));
		} else if(donacion<=10000) {
			System.out.println("El monto destinado al centro de salud es de "+(donacion*.25));
			System.out.println("El monto destinado al comedor de niños es de "+(donacion*.60));
			System.out.println("El monto destinado a la bolsa de inversiones es de "+(donacion*.15));
		}
	}
}
