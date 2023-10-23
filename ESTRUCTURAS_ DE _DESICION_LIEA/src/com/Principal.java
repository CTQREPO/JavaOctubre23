package com;

public class Principal {
	
	public static void main(String[] args) {
		
//	int xx = 30;
//		int yy = 10;
//		/// and or not
//		if(xx<100 && yy>50) { // "||" SI CUMPLE UNA SOLA CONDICION ES TRUE
//			System.out.println("ok");
//		}
//		else {
//			System.out.println("no");
//		}
//		
//		//System.out.println("HOLA".equals("HOLA"));// COMPARA OBJETOS STIRINGS INTEGERS BOULENADS
//		
//		
//		if(! (xx<100 && yy>50) ) { // "!" CONVIERTE EL RESULTADO POSITIVO A NEGATIVO
//			System.out.println("ok");
//		}
//		else {
//		System.out.println("no");
//	}
				
		///////////////////////////////////////////////////////////
		
		//CASE//
		
//		int total = 200;
//		int terminacion = 3;
//		double descuento=0.0;
//		
//		if(terminacion == 1) {
//			descuento = total *0.95;		
//		}else if(terminacion == 2) {
//			descuento = total *0.93;
//		}else if(terminacion == 3) {
//			descuento = total *0.91;
//		}else if(terminacion == 4) {
//			descuento = total *0.89;
//		}else if(terminacion == 5) {
//			descuento = total *0.87;
//		}else {
//			System.out.println("NO VALIDO");
//		}
//		
//System.out.println("A PAGAR "+descuento);
//		
//	
		
		int total = 200;
		int terminacion = 2;
		double descuento=0.0;
		
		switch (terminacion) {
		case 1:
		    descuento = total *0.95;
		    break;
		case 2:
			descuento = total *0.93;
			break;
		case 3:
		    descuento = total *0.91;
		    break;
		case 4:
		    descuento = total *0.89;
		    break; 
		case 5:
		    descuento = total *0.87;
		    break; 
		    
		default: System.out.println("invalido");
		}
		System.out.println("pagar "+descuento);
	}

}