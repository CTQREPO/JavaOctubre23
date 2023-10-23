package com;

///import java.util.Scanner;

public class Eje2_7 {

	public static void main(String[] args) {

		double invInicial=700;
		double inteMensual=0.02;
		double objetivo=1500;
		int mes=0;
		double intGanado=0;
		
		///Scanner scanner = new Scanner(System.in);
		
		while(invInicial<=objetivo) {
			invInicial=invInicial*1.02;
			
			mes++;
		}
		
		System.out.println("La persona tendrá más de $1500 después de " + mes + " meses.");
	}

}
