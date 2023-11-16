package com;

import javax.swing.JOptionPane;

public class Ejercicio10 {
/*
 * Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte,
 * Am�rica Central, Am�rica del Sur, Europa y Asia.
 *  El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida
 *  1 Am�rica del Norte	24,00 euros
 *  2 Am�rica Central	20, 00 euros
 *  3 Am�rica del Sur	21,00 euros
 *  4 Europa	10,00 euros
 *  5 Asia	18,00 euros
 *  Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, 
 *  por cuestiones de log�stica y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

 */
	public static void main(String[] args) {
		
		double peso;
		int zona;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite el peso del paquete en kg: "));
		
		if (peso<=5) {
			
			zona = Integer.parseInt(JOptionPane.showInputDialog("Digite la zona deseada: \n"+
			"1.America del Norte\n"+"2.America Central\n"+"3.America del Sur\n"+"4.Europa\n"+
			"5.Asia"));
			
			switch(zona) {
			
			case 1: JOptionPane.showMessageDialog(null, "El costo total por su paquete es de "+
			(24*peso)+" euros");
				break;
			case 2: JOptionPane.showMessageDialog(null, "El costo total por su paquete es de "+
					(20*peso)+" euros");
				break;
			case 3: JOptionPane.showMessageDialog(null, "El costo total por su paquete es de "+
					(21*peso)+" euros");
				break;
			case 4: JOptionPane.showMessageDialog(null, "El costo total por su paquete es de "+
					(10*peso)+" euros");
				break;
			case 5: JOptionPane.showMessageDialog(null, "El costo total por su paquete es de "+
					(18*peso)+" euros");
				break;
			default: JOptionPane.showMessageDialog(null, "Zona invalida");
			}
		}
		else {JOptionPane.showMessageDialog(null,"No es posible enviar este paquete ya que excede el peso maximo de 5 kg");
			
		}
				
	}
}
