package com;

import java.util.Scanner;

public class ejercicio_11 {
public static void main(String[] args) {
	/*11.	Construir un programa que calcule el índice de masa corporal de una persona
	(IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		valor del IMC 			DIAGNOSTICO
			<16				criterio de ingreso en hospital
		de 16 a 17			infrapeso
		de 17 a 18			bajo peso
		de 18 a 25			peso normal (saludable)
		de 25 a 30			sobrepeso (obesidad de grado I)
		de 30 a 35			sobrepeso cronico (obesidad de grado II)
		de 35 a 40			obesidad premorbida (obesidad de grado III)
			>40				obesidad morbida (obesidad de grado IV)
			
			Nota 1: se recomienda el empleo de sentencias if–else anidadas.
			Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		*/
	Scanner sc = new Scanner(System.in);
	double peso, altura, imc;
	
	System.out.println("INGRESA EL PESO EN kg: ");
	peso = sc.nextDouble();
	
	System.out.println("INGRESA LA ALTURA EN METROS: ");
	altura = sc.nextDouble();
	
	imc = peso /(altura * altura);
	System.out.println("SU IMC ES: "+ imc);
	
	if (imc<16) {
        System.out.println("CRITERIO DE INGRESO EN HOSPITAL");
    } else if (imc>=16 && imc<=17) {
        System.out.println("INFRAPESO");
    } else if (imc>=17 && imc<=18) {
        System.out.println("BAJO PESO");   
    } else if (imc>=18 && imc<=25) {
        System.out.println("PESO NORMAL (SALUDABLE");   
    } else if (imc>=25 && imc<=30) {
        System.out.println("SOBRE PESO (OBESIDAD DE GRADO I)");
    } else if (imc>=30 && imc<=35) {
        System.out.println("SOBRE PESO CRONICO (OBESIDAD DE GRADO II)");
    } else if (imc>=35 && imc<=40) {
        System.out.println("OBESIDAD PREMORBIDA (OBESIDAD DE GRADO III)");    
    } else if (imc>45) {
        System.out.println("OBESIDAD MORBIDA (OBESIDAD DE GRADO IV)");
    }
	
		
}
}
