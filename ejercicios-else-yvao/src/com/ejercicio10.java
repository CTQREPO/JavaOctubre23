package com;

import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int zona=0;
		int peso=0;
		int costo=0;
		
		System.out.println("Indica la zona de ubicacion");
		System.out.println("1.America del norte");
		System.out.println("2.Amercia central");
		System.out.println("3.America del sur");
		System.out.println("4.Europa");
		System.out.println("5.Asia");
		
		System.out.println("Selecciona una opcion del 1 al 5");
		zona=a.nextInt();
		System.out.println("Indica el peso de tu paquete");
		peso=a.nextInt();
		
		if (peso>5) {
			System.out.println("El paquete es rechazado");
		}else if (peso<=5){
			System.out.println("El paquete es aceptado");
		}
		switch (zona) {
	      case 1:
		System.out.println(" El paquete enviado a América del Norte sale por " +(peso*24.00) + " euros.");
		break;
			case 2:
				System.out.println("el paquete enviado a America central sale por"+(peso*20.00)+ "euros");
				break;
			case 3:
				System.out.println("El paquete enviado a America del sur sale por"+(peso*21.00)+ "euros");
			break;
			case 4:
				System.out.println("El paquete enviado a Europa sale por"+(peso*10.00)+ "euros");
				break;
			case 5:
				System.out.println("El paquete enviado a Asia sale por"+(peso*18.00)+ "euros");
				break;
				default:
					System.out.println("Error");
					
		}
			}
	}
