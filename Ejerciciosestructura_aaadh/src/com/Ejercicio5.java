//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
//Precio inicial se recibe desde teclado

package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		float Precio = 0;
		float tama�o= 0 ;
		String tipo = "";
		
		Scanner entrada = new Scanner(System.in);
	
		
		
		System.out.println("Escribe el precio:");
		Precio= entrada.nextInt();
	
		System.out.println("Seleccione el tama�o:");
		tama�o = entrada.nextInt();
		
		System.out.println("Seleccione el tipo:");
		entrada.nextLine();
		tipo= entrada.nextLine();
		
	
			
			
		if ( tipo.equals("A")) {
			
			if (tama�o==1) {
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
