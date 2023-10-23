package com;
import java.util.Scanner;

public class ciclos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		/*int num1=0;
		int num2=0;
		System.out.println("ingresa el numero a multiplicador");
		num1 =sc.nextInt();
		System.out.println("iteracion deseada");
		num2 =sc.nextInt();
		
		for (int k = num2; k>=1; k=-2);{
			System.out.println(num1+ " * "+k+" = "+(num1*k));
		}*/
		
		String cadena = "kjbwe4786109bc9786tcr23b408ym9y=)?=)?5430o123)·!%·$8976+-`+!=?^_8798o8";
		
		String caracter ="";
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
		
		int conteo = 0;
		for(int i = 0; i < cadena.length(); i++) {
			caracter = Character.toString(cadena.charAt(i));
			//System.out.println(caracter);
			
			switch(caracter) {
			case"1":
				c1++;
				break;
			case"2":
				c2++;
				break;
			case"3":
				c3++;
				break;
			case"4":
				c4++;
				break;
			case"5":
				c5++;
				break;
			case"6":
				c6++;
				break;
			case"7":
				c7++;
				break;
			case"8":
				c8++;
				break;
			case"9":
				c9++;
				break;
			case"0":
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