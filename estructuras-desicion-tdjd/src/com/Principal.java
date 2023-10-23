package com;

public class Principal {
	public static void main(String[] args) {
	
	int xx = 30;
	int yy = 0;
	    //true o false 
	if(!(xx>100)) {//si
		System.out.println("OK");
	}else {
		System.out.println("NO");
		
	}
	
	int terminacion = 9;
	int total = 200;
	double descuento =0.0;
	
	//if (terminacion ==1) {
	//	descuento = total * 0.95;		
	//} else if(terminacion ==2) {
	//	descuento = total *0.93 ;
	//} else if (terminacion == 3) {
	//	descuento =total * 0.91;
	//} else if (terminacion == 4) {
	//	descuento = total * 0.89;
	//} else if (terminacion == 5) {
	//	descuento = total * 0.87;
	//} else {
	//	System.out.println("no valido");
	//}
	 //  System.out.println("a pagar"+descuento);
	       
		
	
	switch (terminacion) {
	case 1:
		descuento = total * 0.95;
		break;
		
	case 2:
		descuento = total *0.93;
		break;
	case 3:
		descuento = total * 0.91;
		break;
		
	case 4:
		descuento = total *0.89;
		break;
	case 5:
		descuento = total *0.87;
		break;
		default:
			System.out.println("terminacion no valida");
			break;
	
	}
	System.out.println("a pagar:"+ descuento);
	
	
	
	
	
	
	
	
	
	}
}
