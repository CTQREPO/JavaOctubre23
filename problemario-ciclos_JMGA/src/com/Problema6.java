package com;

public class Problema6 {
	public static void main(String[] args) {
		
		
		double inversion = 1000.00;
		double intmes= 0.02;
		int año=12;
		
		
		for (int i = 1; i <= año; i++) {
			
			inversion = inversion+(inversion*intmes);
			
		}
		
		System.out.println("La inversion al " +año+ " es de"+inversion);
		
	
		
		
		
		
		
	}

}
