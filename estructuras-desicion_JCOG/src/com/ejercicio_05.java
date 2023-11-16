package com;

import java.util.Scanner;

public class ejercicio_05 {
public static void main(String[] args) {
	
	/*5.	La asociación de vinicultores tiene como política fijar un precio inicial 
	 		al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
	 		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere
	 		determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando
	 		lo siguiente:
	 		
	 		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
	 		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
			Precio inicial se recibe desde teclado */
	
	Scanner sc = new Scanner (System.in);
	
	double precioinicial;
	int kilos;
	double preciofinal;
	int tamaño;
	String tipo;
	
	System.out.println("INGRESA EL PRECIO INICIAL POR kg: ");
	precioinicial= sc.nextDouble();
	
	System.out.println("INGRESA LOS kg VENDIDOS: ");
	kilos = sc.nextInt();
	
	System.out.println("Valor de uva A o tipo B : " );
	tipo =sc.next();
	sc.nextLine();
	
	System.out.println("Tipo de uva 1 o tipo 2: ");
	tamaño = sc.nextInt();
	
	if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tamaño == 1 || tamaño == 2))) {
	      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tamaño == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioinicial)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioinicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioinicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioinicial)-(kilos*0.50)));
	
	  } 
   }
  }
}
