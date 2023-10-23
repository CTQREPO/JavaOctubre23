package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	/*Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado
	 *  de seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al
	 *   resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: 
�ERROR: n�mero incorrecto�.
*/
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dado;
		
		dado = Integer.parseInt(JOptionPane.showInputDialog("Proporcione la cara del dado obtenida: "));
		
		switch(dado){
		
		case 1: JOptionPane.showMessageDialog(null, "La cara opuesta es seis");
			break;
		case 2: JOptionPane.showMessageDialog(null, "La cara opuesta es cinco");
			break;
		case 3: JOptionPane.showMessageDialog(null, "La cara opuesta es cuatro");
			break;
		case 4: JOptionPane.showMessageDialog(null, "La cara opuesta es tres");
			break;
		case 5: JOptionPane.showMessageDialog(null, "La cara opuesta es dos");
			break;
		case 6: JOptionPane.showMessageDialog(null, "La cara opuesta es uno");
			break;
		default: JOptionPane.showMessageDialog(null, "ERROR: numero incorrecto");
		}
		
		
		
}
}
