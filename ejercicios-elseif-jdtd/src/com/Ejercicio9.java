package com;
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int   M = 0  ;
		int DS1 = 31 ;
		int DS2 = 30 ;
		int DS3 = 28 ;
		
		System.out.println("Ingrese el numero del mes para saber los dias que contiene");
		M =sc.nextInt();
		
		if (M==2) {
			System.out.println(DS3);
		}else if(M==4 || M==6 || M==9 || M==11) {
			System.out.println(DS2);
		}else if(M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12) {
			System.out.println(DS1);
		}else {
			System.out.println("ERRO! ingreso un numero invalido");
		}
		
		
		
		
		
		
		
		
	}

}
