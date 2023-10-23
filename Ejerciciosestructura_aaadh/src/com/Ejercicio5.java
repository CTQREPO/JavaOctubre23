//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
//Precio inicial se recibe desde teclado

package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		float Precio = 0;
		float tamaño= 0 ;
		String tipo = "";
		
		Scanner entrada = new Scanner(System.in);
	
		
		
		System.out.println("Escribe el precio:");
		Precio= entrada.nextInt();
	
		System.out.println("Seleccione el tamaño:");
		tamaño = entrada.nextInt();
		
		System.out.println("Seleccione el tipo:");
		entrada.nextLine();
		tipo= entrada.nextLine();
		
	
			
			
		if ( tipo.equals("A")) {
			
			if (tamaño==1) {
				System.out.println("preciototal"+(Precio+0.20));
			}else  {
               System.out.println("preciototal"+(Precio+0.30));
               }
			
		}else if(tipo.equals("B")) {
				System.out.println("preciototal:"+(Precio-0.30));
			}else {
		System.out.println("preciototal:" + (Precio-0.50));
	}

}

}
