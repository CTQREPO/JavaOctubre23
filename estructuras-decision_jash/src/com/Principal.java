package com;

public class Principal {
	public static void main(String[] args) {
//		int xx = 30;
//		int yy = 0;
//		System.out.println(!(xx>100));
//		if(!(xx>100)) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
		
		
//---------------------------------------------------------------
		//1=5%	2=7%	3=9%	4=11%	5=13%
//		int terminacion= 3;
//		int total = 100; 
//		double descuento = 0.0;
//		
//		if(terminacion==1) {
//			descuento=total*0.95;
//		}else if(terminacion==2) {
//			descuento=total*0.93;
//		}else if(terminacion==3) {
//			descuento=total*0.91;
//		}else if(terminacion==4) {
//			descuento=total*0.89;
//		}else if(terminacion==5) {
//			descuento=total*0.87;
//		}else {
//			System.out.println("Descuento no valido");
//		}
//		System.out.println("Precion final con descuento es: "+descuento);
		
//---------------------------------------------------------------------------
		int terminacion= 8;
		int total = 100; 
		double descuento = 0.0;
		
		
		switch(terminacion) {
		case 1:
			descuento=total*0.95;
			
			break;
		case 2:
			descuento=total*0.93;
			break;
		case 3:
			descuento=total*0.91;
			break;
		case 4:
			descuento=total*0.89;
			break;
		case 5:
			descuento=total*0.87;
			break;
		default: System.out.println("Descuento no valido");
		}
		System.out.println("Precion final con descuento es: "+descuento);
	}
}
