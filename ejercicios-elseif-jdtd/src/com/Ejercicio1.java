package com;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int xx = 0 ;
		int yy = 0 ;
		
		System.out.println("ingrese un numero");
		xx = sn.nextInt();
		System.out.println("ingrese un numero");
		yy = sn .nextInt();
		
		
		if(xx>yy) {
			System.out.println("el nunero mayor es: "+ xx );
		} else if(xx<yy){
			System.out.println("el numero mayor es: "+ yy );
		} else if(xx==yy) {
			System.out.println("los numero son iguales: ");
		}
		
		
		
		
		
		
		
		
	}

}
