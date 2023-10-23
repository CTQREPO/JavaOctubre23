package com;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio05 {

	public static void main(String[] args) {
		 DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		 LocalTime hora = LocalTime.of(0, 0, 0);
		 
	        for (int i = 0; i < 24 * 60 * 60; i++) {
	            System.out.println(hora.format(formatoHora));
	            hora = hora.plusSeconds(1);
	            try {
	                Thread.sleep(1000); 
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	}

}
