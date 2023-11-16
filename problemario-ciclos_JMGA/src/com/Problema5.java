package com;

public class Problema5 {
	public static void main(String[] args) {
		
		
		
		int hora;
		
		for ( hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
                    // La expresión "%02d" formatea la hora, minuto y segundo para que tengan siempre dos dígitos.
                    // El "%n" agrega un salto de línea.
                }
            }
        }
		
		
		
	}

}
