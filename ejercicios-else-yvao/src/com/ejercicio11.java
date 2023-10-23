package com;
import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		double peso=0;
		double altura=0;
		double imc;
		
		
		System.out.println("Ingrese su peso");
		peso = a.nextDouble();
		System.out.println("Ingrese su altura");
		altura = a.nextDouble();
		
		imc=peso/ (Math.pow(altura, 2));
		
		if(imc < 16) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Criterio de ingreso al hospital");
		}else {
			if(imc>=16 && imc<=17) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Infrapeso");
		}else {
			if(imc>=17 && imc<=18) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Bajo peso");
		}else {
			if(imc>=18 && imc<=25) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Peso normal (Saludable)");
		}else {
			if(imc>=25 && imc<=30) {
				System.out.println("Su indice de masa corporal es:"+imc);
			    System.out.println("Sobrepeso (Obesidad de grado 1)");
		}else {
			if(imc>=30 && imc<=35) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Sobre peso cronico(Obesidad grado II");
		}else {
			if(imc>=35 && imc<=40) {
				System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Obesidad Premorbida (Obecidad grado III");
		}else {
			if(imc>40) {
			System.out.println("Su indice de masa corporal es:"+imc);
			System.out.println("Obesidad morbida(Obecidad grado IV)");
	     }
	    }
	   }
	  }
     }
	}
		}
}
	}
}	