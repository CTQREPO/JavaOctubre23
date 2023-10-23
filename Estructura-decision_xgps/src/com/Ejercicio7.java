package com;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 int dado;
		    String uno="Uno", dos="Dos", tres="Tres", cuatro="Cuatro", cinco="Cinco", seis="Seis";
		    
		    System.out.println("Teclee el numero del dado ");
		    dado = scanner.nextInt();
		  
		  switch(dado) {
		  case 1:
		    System.out.println("La cara opuesta es:"+seis);
		    break;
		  case 2:
		    System.out.println("La cara opuesta es:"+cinco);
		    break;
		  case 3:
		    System.out.println("La cara opuesta es:"+cuatro);
		    break;
		  case 4:
		    System.out.println("La cara opuesta es:"+tres);
		    break;
		  case 5:
		    System.out.println("La cara opuesta es:"+dos);
		    break;
		  case 6:
		    System.out.println("La cara opuesta es:"+uno);
		    break;
		  }
		  if(dado>=7) {
		    System.out.println("ERROR: número incorrecto");}
		  }
		
	
}
