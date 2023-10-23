package com;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int uvas;
	    char tipo;
	    int tamaño;
	    
	    System.out.println("Introduzca el precio inicial de el kilo ");
	    uvas = scanner.nextInt();
	    System.out.println("Uva de valor A o B");
	    tipo = scanner.next().charAt(0);
	    System.out.println("Tipo de uva 1 o 2");
	    tamaño = scanner.nextInt();
	    
	    if(tipo == 'A'|| tipo == 'a')
	    if(tamaño == 1) {
	    	System.out.println("El precio final es de: "+(uvas+20));
	    }else {
	    	System.out.println("El precio final es de:"+(uvas+30));{
	    		if(tipo =='A' || tipo == 'a')
	    		if (tamaño == 2) {
	    		System.out.println("El precio final es de:"+(uvas-30));
	    	}else {
	    		System.out.println("El precio final es de:"+(uvas-50));
	    	}
	    	}
	    	
	    }
	    
	    

	    
	    
	    
	    
	    

	}
}
