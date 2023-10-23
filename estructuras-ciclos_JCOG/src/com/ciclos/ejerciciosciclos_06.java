package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_06 {
public static void main(String[] args) {
	//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual.
	//Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.

	Scanner sc = new Scanner(System.in);
	
	 double capitalinicio = 0;
     double tasainteres = 0.02; 
     int meses = 12; 
     
     System.out.println("INGRESE LA CANTIDAD A INVERTIR EN UN AÑO: ");
     capitalinicio = sc.nextDouble();
     
     for (int i = 0; i < meses; i++) {
         capitalinicio += capitalinicio * tasainteres; 
     }

     
     System.out.println("EL CAPITAL CON LA TASA DE INTERES ANUAL ES: $" + capitalinicio);
	
}
}
