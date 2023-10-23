package com;

public class Ejercicio07 {

	public static void main(String[] args) {
		double inversionInicial = 700.00;
		double interesMensual = 0.02;
		int meses = 1;
		while (inversionInicial < 1500.00) {
			inversionInicial += inversionInicial * interesMensual;
			System.out.println("En el mes " + meses + " tiene $ " + String.format("%.2f", inversionInicial));
			meses++;
		}
		System.out.println("En " + (meses-1) + " meses, la inversi�n superar� los $1500.");
	}
}
