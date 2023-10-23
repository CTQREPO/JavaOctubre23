package com.ciclos;

import java.util.Scanner;

public class ejerciciosciclos_07 {
public static void main(String[] args) {
// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual.
//	En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.	

	
	Scanner sc = new Scanner(System.in);
	
	double capitalinicio= 700.00;
    double tasainteres = 0.02; 
    int meses = 0; 
    double meta = 1500;
    
    while (capitalinicio < meta) {
        capitalinicio += capitalinicio * tasainteres;
        meses++;
    }

    System.out.println("Tomará " + meses + " llegar a los $1500.");
    
}
}
