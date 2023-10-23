package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	/*
	 * Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e
	 *  indique el estado en el que se encuentra esa persona en función del valor de IMC:
	 *  Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
	 *  Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Indique el peso en kg: ");
		peso = entrada.nextDouble();
		
		System.out.println("Indique la estatura en m: ");
		altura = entrada.nextDouble();
		
		imc = peso/Math.pow(altura,2);
		System.out.println(imc);
		
		if (imc<=16) {
//			JOptionPane.showMessageDialog(null,
//		"Esta persona tiene un IMC equivalente a " + imc + " por lo cual deberia ser ingresado al hospital");
			JOptionPane.showMessageDialog(null, "Esta persona tiene un IMC equivalente a " + imc + " por lo cual deberia ser ingresado al hospital", "Error", 0);
		}
		else if(imc>16 && imc<=17) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con infrapeso");
		}
		else if(imc>17 && imc<=18) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con bajo peso");
		}
		else if(imc>18 && imc<=25) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra en el peso normal (saludable)");
		}
		else if(imc>25 && imc<=30) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con sobrepeso (obesidad de grado I");
		}
		else if(imc>30 && imc<=35) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con sobrepeso cronico (obesidad de gradoII");
		}
		else if(imc>35 && imc<=40) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con obesidad premorbida (obesidad de grado III)");
		}
		else if(imc>40) {
			JOptionPane.showMessageDialog(null,
					"Esta persona tiene un IMC equivalente a " + imc + " por lo cual se encuentra con obesidad morbida (obesidad de grado IV)");
		}
		else {
			JOptionPane.showMessageDialog(null,"Los datos proporcionados son erroneos");
		}
	}
}
