package com;
import java.util.Scanner;
public class ejercicio8 {
     public static void main(String[] args) {
    	 Scanner a=new Scanner(System.in);
    	 
    	 int dia;
    	 String L="Lunes";
    	 String M="Martes";
    	 String Mi="Miercoles";
    	 String J="Jueves";
    	 String V="Viernes";
    	 String S="Sabado";
    	 String D="Domingo";
    	 
    	 System.out.println("Teclee el dia de la semana(1 al 7)");
    	 dia = a.nextInt();
    	 
    	 if(dia==1) {
    		 System.out.println(L);
    	 }else if(dia==2) {
    		 System.out.println(M);
    	 }else if(dia==3) {
    		 System.out.println(Mi);
    	 }else if(dia==4) {
    		 System.out.println(J);
    	 }else if(dia==5) {
    		 System.out.println(V);
    	 }else if(dia==6) {
    		 System.out.println(S);
    	 }else if(dia==7) {
    		 System.out.println(D);
    	 }else {
    		 System.out.println("Error");
    	 }
    	 		
	
}
}
