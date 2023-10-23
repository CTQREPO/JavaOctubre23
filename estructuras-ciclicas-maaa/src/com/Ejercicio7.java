package com;

public class Ejercicio7 {

	//7- Una persona desea invertir $700.00 en un banco, 
	//el cual le otorga un 2% de interés mensual. En cuantos meses tendrá mas de $1500,
	//si reinvierte cada mes todo su dinero?.
	
	public static void main(String[] args) {
		
		
		double suma=700;
		int cont=0;
		
		do {
			suma*=1.02;
			cont++;
			System.out.println("Total en el mes "+cont+" : $"+suma);
			
		}while(suma<1500);
		
		System.out.println("En "+cont+" meses obtendra mas de $1500");
	}
}
