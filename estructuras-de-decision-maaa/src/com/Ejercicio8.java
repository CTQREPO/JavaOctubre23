package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio8 {
/*
 * Realiza un programa que pida el día de la semana (del 1 al 7) 
 * y escriba el día correspondiente. Si introducimos otro número nos da un error.
 */
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Proporcione un dia entre 1 y 7: "));
		
		switch(dia){
		
		case 1: JOptionPane.showMessageDialog(null, "Lunes");
			break;
		case 2: JOptionPane.showMessageDialog(null, "Martes");
			break;
		case 3: JOptionPane.showMessageDialog(null, "Miercoles");
			break;
		case 4: JOptionPane.showMessageDialog(null, "Jueves");
			break;
		case 5: JOptionPane.showMessageDialog(null, "Viernes");
			break;
		case 6: JOptionPane.showMessageDialog(null, "Sabado");
			break;
		case 7: JOptionPane.showMessageDialog(null, "Domingo");
			break;
		default: JOptionPane.showMessageDialog(null, "ERROR");
		}
		
	}
}
