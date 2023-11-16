package com;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int d;
		String L="Lunes";
		String M1= "Martes";
		String M2= "Miercoles";
		String J= "jueves";
		String V= "Jueves";
		String S="Sabado";
		String D="Doimingo";
		
		System.out.println("Ingrese El Dia de la semana en numero (1-7;");
		d=sc.nextInt();
		if(d==1) {
			System.out.println(L);
		}else if(d==2) {
			System.out.println(M1);
		}else if(d==3) {
			System.out.println(M2);
		}else if(d==4) {
			System.out.println(J);
		}else if(d==5) {
			System.out.println(V);
		}else if(d==6) {
			System.out.println(S);
		}else if(d==7) {
			System.out.println(D);
		}else {
			System.out.println("ERROR! el numero que ingreso no es valido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
