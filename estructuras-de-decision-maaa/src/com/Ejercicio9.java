package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio9 {
/*
 * Realiza un programa que pida un número entero entre uno y doce 
 * e imprima el número de días que tiene el mes correspondiente.
 */
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Proporcione un mes entre 1 y 12: "));
		
		switch(dia){
		
		case 1: JOptionPane.showMessageDialog(null, "El mes 1 contiene 31 dias");
			break;
		case 2: JOptionPane.showMessageDialog(null, "El mes 2 contiene 28 o 29 dias");
			break;
		case 3: JOptionPane.showMessageDialog(null, "El mes 3 contiene 31 dias");
			break;
		case 4: JOptionPane.showMessageDialog(null, "El mes 4 contiene 30 dias");
			break;
		case 5: JOptionPane.showMessageDialog(null, "El mes 5 contiene 31 dias");
			break;
		case 6: JOptionPane.showMessageDialog(null, "El mes 6 contiene 30 dias");
			break;
		case 7: JOptionPane.showMessageDialog(null, "El mes 7 contiene 31 dias");
			break;
		case 8: JOptionPane.showMessageDialog(null, "El mes 8 contiene 31 dias");
			break;
		case 9: JOptionPane.showMessageDialog(null, "El mes 9 contiene 30 dias");
			break;
		case 10: JOptionPane.showMessageDialog(null, "El mes 10 contiene 31 dias");
			break;
		case 11: JOptionPane.showMessageDialog(null, "El mes 11 contiene 30 dias");
			break;
		case 12: JOptionPane.showMessageDialog(null, "El mes 12 contiene 31 dias");
			break;
		default: JOptionPane.showMessageDialog(null, "ERROR");
		}
		
	}
}
