package com;

 import java.util.Scanner;
 
public class ejercicio5 {
 public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	
	int kilo;
	int tama�o;
	int pinicial;
	int pfinal;
	char tipo;
	
	
	System.out.println("Ingrese el precio inicial por kilo de uva");
	pinicial =a.nextInt();
	System.out.println("Teclee los kilos de uva entregada");
	kilo = a.nextInt();
	System.out.println("Ingrese el tipo (A o B) de uva entregada");
	tipo = a.next().charAt(0);
	System.out.println("ingrese el tama�o (1 o 2) de uva entregada");
	tama�o= a.nextInt();	
	
	if(tama�o==1 && tipo=='A'){
		pfinal= (pinicial+20)*kilo;
		System.out.println("El precio total es:"+ pfinal);
	}else if(tama�o==2 && tipo=='A') {
		pfinal= (pinicial+30)*kilo;
		System.out.println("El precio total es:"+ pfinal);
	}else if(tama�o==1 && tipo=='B') {
		pfinal= (pinicial-30)*kilo;
		System.out.println("El precio total es:"+ pfinal);
	}else if(tama�o==2 && tipo=='B') {
		pfinal= (pinicial-50)*kilo;
		System.out.println("El precio total es:"+ pfinal);
	}else {
	System.out.println("error");
	}
		
	
		
	
		

	}
	
}
