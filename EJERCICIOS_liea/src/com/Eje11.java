package com;

import java.util.Scanner;

public class Eje11 {

	public static void main(String[] args) {
		double peso;
		double altura;
		double masa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA MEDIR TU MASA CORPORAL");
		System.out.println("INGRESA TU PESO(kg)");
		peso=entrada.nextDouble();
		System.out.println("INGRESA TU ALTURA(m)");
		altura=entrada.nextDouble();
		
		masa=peso/altura;
		System.out.println("MASA CORPORAL: "+masa+"kg/m");
		
		if(masa<16) {
			System.out.println("CRITICO: INGRESAR A HOSPITAL");	
		}else if(masa>=16 && masa<17){
			System.out.println("INFRAPESO");
		}else if(masa>=17 && masa<18) {
			System.out.println("PESO BAJO");
		}else if(masa>=18 && masa<25) {
			System.out.println("PESO NORMAL SALUDABLE");
		}else if(masa>=25 && masa<30) {
			System.out.println("SOBRE PESO GRADO 1");
		}else if(masa>=30 && masa<35) {
			System.out.println("SOBREPESO CRONICO");
		}else if(masa>=35 && masa<40) {
			System.out.println("OBESIDAD PREMORBIDA");
		}else if(masa>=40) {
			System.out.println("OBESIDAD MORBIDA");
		}else {
			System.out.println("ERROR");
		}
	}
}
