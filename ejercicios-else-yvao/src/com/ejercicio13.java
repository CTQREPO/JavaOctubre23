package com;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int sueldoxhora=16;
		int horast=0;
		double total=0;
		int horasex=0;
		
		System.out.println("Teclee las horas trabajadas");
		horast = a.nextInt();
		
		if(horast <= 40) {
			total= (sueldoxhora*40);
		}else {
			if(horast>40) {
				horasex=(horast-40);
				total=(sueldoxhora*40)+(horasex*20);
			}
		}
		System.out.println("Su salario total semanal es:" +total);
		
	}
}
