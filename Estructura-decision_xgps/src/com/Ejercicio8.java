package com;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	    int semana;
	     System.out.println("Teclee el dia de la semana ");
	    semana = scanner.nextInt();
	  
	  switch(semana) {
	  case 1:
	    System.out.println("Lunes");
	    break;
	  case 2:
	    System.out.println("Martes");
	    break;
	  case 3:
	    System.out.println("Miercoles");
	    break;
	  case 4:
	    System.out.println("Jueves");
	    break;
	  case 5:
	    System.out.println("Viernes");
	    break;
	  case 6:
	    System.out.println("Sabado");
	    break;
	  case 7:
	    System.out.println("Domingo");
	    break;
	  }
	  if(semana>=8) {
	    System.out.println("Error");}
	  }

	}


