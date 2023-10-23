package com;
import java.util.Scanner; 

public class ejercicio12 {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	
	int donativo=0;
    double salud = 0;
    double comedor=0;
    double inversion=0;
    

	System.out.println("Ingrese la cantidad de donativo recibido");
	donativo = a.nextInt();
	
	
	if(donativo >= 10000 ) {
		salud=(donativo*.30);
		comedor=(donativo*.50);
		inversion=(donativo-salud)-(comedor);
	}else {
		if(donativo < 10000) {
			salud=(donativo*.25);
			comedor=(donativo*.60);
			inversion=(donativo-salud)-(comedor);
		}
	}
		System.out.println("Total salud:" +salud);
		System.out.println("Total comedor:" +comedor);
		System.out.println("Total inversion:" +inversion);
		
	}
		
}
