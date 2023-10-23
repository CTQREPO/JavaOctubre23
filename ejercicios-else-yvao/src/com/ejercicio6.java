package com;
import java.util.Scanner;
public class ejercicio6 {
       public static void main(String[] args) {
    	   Scanner a=new Scanner(System.in);
    	   
    	   double alumnos;
    	   
    	   System.out.println("Teclee el numero de alumnos que viajaran");
    	   alumnos = a.nextDouble();
    	   
    	   if(alumnos>=100) {
    		   System.out.println("El precio por alumno es de $65");
    		   System.out.println("El costo de la renta del autobus es de: $" +(alumnos*65));
    	   }else if(alumnos>=50 && alumnos<=99) {
    		   System.out.println("El precio por alumno es de $70");
    		   System.out.println("El costo de la renta del autobus es de: $" +(alumnos*70));
    	   }else if(alumnos>=30 && alumnos<=49) {
    		   System.out.println("El precio por alumno es de $95");
    		   System.out.println("El costo de la renta del autobus es de: $" +(alumnos*95));
    	   }else if(alumnos>=30) {
    		   System.out.println("El precio por alumno es de:" +(4000/alumnos));
    	   }
    			   
	
}
}
