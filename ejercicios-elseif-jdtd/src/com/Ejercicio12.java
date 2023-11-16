package com;

public class Ejercicio12 {
	public static void main(String[] args) {
		float donacion = 10000f;
		double salud;
		double comedor;
		double bolsa;
		
		if(donacion<=10000) {
			salud= 0.30*donacion;
			comedor=0.50*donacion;
			bolsa=0.20*donacion;
			
		}else {
			salud= 0.25*donacion;
			comedor=0.60*donacion;
			bolsa=0.15*donacion;
			
			
		}
		
		System.out.println("a el centro de salud se le destinarala cantidad de:"+salud);
		System.out.println("a el comedor de niños se le destinarala cantidad de"+comedor);
		System.out.println("Se invertira a la bolsa la cantidad de:"+bolsa);
		
		
		
	}

}
