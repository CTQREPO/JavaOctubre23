package com;

public class Problema7 {
	/*public static void main(String[] args) {
        double inversionInicial = 700.00;
        double tasaInteresMensual = 0.02;
        double objetivo = 1500.00;
        int meses = 0;

        while (inversionInicial < objetivo) {
            inversionInicial += inversionInicial * tasaInteresMensual;
            meses++;

            if (meses > 12) {
                System.out.println("No alcanzó el objetivo de $1500 en un año.");
                break;
            }
        }

        if (inversionInicial >= objetivo) {
            System.out.println("Tardó " + meses + " meses en alcanzar más de $1500.");
        }
    }*/
	
	public static void main(String[] args) {
		double dinero = 700;
		int mes = 1;
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println("En "+ mes+" meses");
		System.out.println("tendra "+dinero);
		}

}
