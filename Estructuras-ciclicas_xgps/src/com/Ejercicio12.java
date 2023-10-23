package com;
import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int ed = 0;
		    double suma = 0;
		    double contador = 0;
		    double promedio = 0;
		    while (promedio <= 25) {
		    	
		      System.out.println("Teclee las edades a calcular");
		      ed = scanner.nextInt();
		      suma = suma + ed;
		      contador = contador + 1;
		      promedio = suma / contador;
		      if (promedio > 25) {
		        break;
		      }
		    }
		    System.out.println("El promedio de edades es: " + promedio +" ");
		  }
}