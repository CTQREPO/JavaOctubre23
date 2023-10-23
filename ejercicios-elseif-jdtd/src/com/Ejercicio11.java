package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		float peso;
		float altura;
		float IMC;
		System.out.println("ingrese su peso: ");
		peso = sc.nextFloat();
		System.out.println("ingrese su altura: ");
		altura =sc.nextFloat();
		IMC= peso/(altura*altura);
		
		if(IMC<16) {
			System.out.println("criterio de ingreso en  hospital"+IMC);
		}else {
			if(IMC>=16 && IMC<=17) {
				System.out.println("Usted cuenta con infrapeso"+IMC);
			}else {
				if(IMC>=17 && IMC<=18) {
					System.out.println("Usted cuenta con bajo peso"+IMC);
				}else {
					if(IMC>=18 && IMC<=25) {
						System.out.println("Usted cuenta con un peso normal (saludable)"+IMC);
					}else {
						if(IMC>=25 && IMC<=30) {
							System.out.println("Usted cuenta con sobrepeso (obesidad grado I)"+IMC);
						}else {
							if(IMC>=30 && IMC<=35) {
								System.out.println("Usted cuenta con sobrepeso cronico(obesidad grado II)"+IMC);
							}else {
								if(IMC>=35 && IMC<=40) {
									System.out.println("Usted cuenta con Obesidad premorbida(obesidad de grado III)"+IMC);
								}else {
									if(IMC>40) {
										System.out.println("Usted cuenta con obesidad morbida(Obesidad de grado IV)"+IMC);
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



