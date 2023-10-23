package COM;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		int contador = 0;
		int cantidad = 0;
		int suma = 0;
		int numero = 0;

		Scanner sc = new Scanner(System.in);
//		System.out.println("Cantidad de numeros a ingresar");
//		cantidad = sc.nextInt();
//		
//		while(contador<cantidad) {
//			System.out.println("Ingresa un numero");
//			numero = sc.nextInt();
//			
//			suma = suma+numero;
//			contador++;
//		}
//		System.out.println("La suma es: "+ suma);	
		//
		// do {
		// System.out.println("Ingresa un numero positivo");
		// numero = sc.nextInt();
		// suma=suma+numero;
		//
		// }while(numero>0);
		// System.out.println(suma);

		// }
//		int num1 = 0;
//		int num2 = 0;
//		
//		System.out.println("Ingresa el numero a multiplicar ");
//		num1 = sc.nextInt();
//		System.out.println("Iteracion deseada ");
//		num2 = sc.nextInt();
//
//		//for (int K = 0; K < num2; K++) {
//		for(int K= num2; K>=0;K-=2) {	
//			
////			if(K%2==0) {//solo si k es valor par
////				
////				System.out.println(num1+"*"+K+"="+(num1*K));
////			}
//			System.out.println(num1+"*"+K+"="+(num1*K));
//			
//		}

		String cadena = "kjbwe4786109bc9786tcr23b408ym9y=)?=)?5430o123)·!%·$8976+-`+!=?^_8798o8";
		String caracter = "";
		int conteo = 0;
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		int c7=0;
		int c8=0;
		int c9=0;
		int c0=0;

		for (int i = 0; i < cadena.length(); i++) {

			caracter = Character.toString(cadena.charAt(i));
			System.out.println(caracter);

			switch (caracter) {
			case "1":
				c1++;
				break;
			case "2":
				c2++;
				break;
			case "3":
				c3++;
				break;
			case "4":
				c4++;
				break;
			case "5":
				c5++;
				break;
			case "6":
				c6++;
				break;
			case "7":
				c7++;
				break;
			case "8":
				c8++;
				break;
			case "9":
				c9++;
				break;
			case "0":
				c0++;
				break;
			}
		}
		
		System.out.println("1: "+c1);
		System.out.println("2: "+c2);
		System.out.println("3: "+c3);
		System.out.println("4: "+c4);
		System.out.println("5: "+c5);
		System.out.println("6: "+c6);
		System.out.println("7: "+c7);
		System.out.println("8: "+c8);
		System.out.println("9: "+c9);
		System.out.println("0: "+c0);
		
	}
}
