package com;
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		double peso;
		double altura;
		double masaCorporal;
	    System.out.println("Ingresa su altura");
	    altura = scanner.nextDouble();
	    System.out.println("Ingresa su peso");
	    peso = scanner.nextDouble();
	    
		masaCorporal = peso/(altura*2);
		 if(masaCorporal<16) {
			 System.out.println("Criterio de ingreso en hospital");
			 }else if(masaCorporal>=16 && masaCorporal<=17){
				 System.out.println("Infrapeso");
			 
			}else if(masaCorporal>17.1 && masaCorporal<=18){
				System.out.println("Bajo peso");
				
			}else if(masaCorporal>18.1 && masaCorporal<=25) {
				System.out.println("Peso normal (Saludable)");
			}else if(masaCorporal>25.1 && masaCorporal<=30){
				System.out.println("Sobrepeso (Obesidad de grado I)");
			}else if(masaCorporal>30.1 && masaCorporal<35) {
				System.out.println("Sobrepeso crónico(Obesidad de grado II");
			}else if(masaCorporal>35.1 && masaCorporal<40) {
				System.out.println("Obesidad mórbida(Obesidad de grado IV)");
			}
			 
	}
		
	}


