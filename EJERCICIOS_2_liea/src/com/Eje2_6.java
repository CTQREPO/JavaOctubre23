package com;

import java.util.Scanner;

public class Eje2_6 {
	
	public static void main(String[] args) {
		
		int inversion=1000;
		double interes=0.02;
		double total=0;
		double gan=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("INVERSION MENSUAL DE $1000 2% INTERES POR UN AÑO ");
		
		gan=inversion*interes;
		
			for (int i = 1; i <= 12; i++) {
				total=inversion*1.02;
			}
		System.out.println("$"+total);
	}

		

}
