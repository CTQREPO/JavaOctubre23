package com;

public class Estructuradecision_aaaddg {

	public static void main(String[] args) {
//		int xx=30;
//		int yy=100;
//
//		// true false
//
//		System.out.println(xx > 100 && yy <= 50);

		// AND OR NOT
		// false true

//		if (!(xx > 100)) {// SI
//			System.out.println("ok");
//		} else {
//			System.out.println("NO");
//		}
//	}
//}

// 1,2,3,4,5
// 5,7,9,11,13

int terminacion = 4;
int total = 200;
double descuento= 0.0 ;
if ( terminacion== 1) {
	descuento = total* 0.95;
//	
//	//}else if (terminacion == 2) {
//		//descuento = total* 0.93;
//		//}else if (terminacion == 3) {
//		//descuento = total* 0.91;
//		//}else if (terminacion == 4) {
//		//descuento = total* 0.89;
//		//}else if (terminacion == 5) {
//		//descuento = total* 0.87;
//		//}else {
//		//System.out.println("No valido");
//	
//		//}
		//System.out.println ("A pagar:" +descuento);
	
		switch (terminacion) {
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
			descuento =  total * 0.87;
			break;
			
	}
	System.out.println("A pagar:" +descuento);
	
	}
	}}
	
