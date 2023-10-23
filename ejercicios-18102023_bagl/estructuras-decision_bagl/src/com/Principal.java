package com;

public class Principal {

	public static void main(String[] args) {
	/*
		int x = 40;
		int y = 50;
		
		System.out.println("x < y");
		
		if (x < y ) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		if (x == y ) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		if (x != y ) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
			if (x == y ) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}*/
			
			int terminacion = 5;
			int total = 200;
			double descuento = 0.0;
/*
			if (terminacion == 1) {
				descuento = total * 0.95;
			}else if (terminacion == 2) {
				descuento = total * 0.93;
			}else if (terminacion == 3) {
				descuento = total * 0.91;
			}else if (terminacion == 4) {
				descuento = total * 0.89;
			}else if (terminacion == 5) {
				descuento = total * 0.87;
			}else {
				System.out.println("No valido");
			}
			System.out.println("A pagar: " + descuento);
			
			*/
			
			switch(terminacion) {
			case 1:
				descuento = total * 0.95;
				break;
			case 2:
				descuento = total * 0.93;
				break;
			case 3:
				descuento = total * 0.91;
				break;
			case 4:
  				descuento = total * 0.89;
  				break;
			case 5:
				descuento = total * 0.87;
				break;
			default:
				System.out.println("No valido");
			}
			System.out.println("A pagar: " + descuento);
	}
}