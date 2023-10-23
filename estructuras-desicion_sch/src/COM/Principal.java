package COM;

public class Principal {
	
		public static void main(String[] args) {
		
			int xx = 30;
			int yy = 10;
			
			//true false
			
			//System.out.println(xx>100 || yy<=50);
			
			// AND OR NO
		/*
			if(  ! (xx>100 || yy>=50)   ){   //SI
				
				System.out.println("OK");
				
			}else {      //NO
				System.out.println("NO");
			}
			
			if(xx !=30 ){   //SI
				
				System.out.println("OK");
				
			}else {      //NO
				System.out.println("NO");
			} */
			
			//System.out.println(xx==yy);
			//System.out.println("hola".equals("hola"));
			
			
			//1,2,3,4,5
			//5,7,9,11,13
			/*
			int terminacion =6;
			int total =200;
			double descuento=0.00;
			
			if(terminacion == 1) {
				descuento = total * 0.95;

			}else if(terminacion == 2) {
				descuento = total * 0.93;
			}else if(terminacion == 3) {
				descuento = total * 0.91;
			}else if(terminacion == 4) {
				descuento = total * 0.89;
			}else if(terminacion == 5) {
				descuento = total * 0.87;
			}else {
				System.out.println("no valido");		
			}
			System.out.println("A Pagar:"+descuento);
			*/
			char terminacion ='A';
			int total =200;
			double descuento=0.00;
			
			switch(terminacion) {
			case 'A':
				descuento = total * 0.95;
				break;
			case 'B':
				descuento = total * 0.93;
				break;
			case 'C':
				descuento = total * 0.91;
				break;
			case 'D':
				descuento = total * 0.89;
		
				break;
			case 'F':
				descuento = total * 0.87;
				break;
				//default: System.out.println("invalido");
			
			
			}
			
			System.out.println("A pagar: "+descuento);
		}
}
