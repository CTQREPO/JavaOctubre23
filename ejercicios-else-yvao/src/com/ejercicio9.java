package com;
import java.util.Scanner;

public class ejercicio9 {
     public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int mes;
		int MS1=28;
		int MS2=30;
		int MS3=31;
		
		System.out.println("Ingresa los datos para saber cuantos dias tiene el mes");
		System.out.println("Teclea el numero del mes");
		mes = a.nextInt();
		
		if(mes==2) {
			System.out.println(MS1);
		}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println(MS3);
		}else if(mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println(MS2);
		}else {
			System.out.println("Error");
		}
	}
}
