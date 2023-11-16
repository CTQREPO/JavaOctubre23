package com;

public class Principal {

	public static void main(String[] args) {
	
		Reloj r1= new Reloj();
		
		r1.setPrecio(35.00);
		r1.setForma("cuadrado");
		r1.setTipo("pulsera");
		
		
		
		System.out.println(r1);
//Objeto instanciado con el constructor de todos los parámetros
		Reloj r2= new Reloj("pulsera", "azul", "redondo","goma","digital", "pequeño", 100.00);
		
		System.out.println(r2);
		
		Reloj r3= new Reloj ("Negro", "mancillas");
		System.out.println(r3);
	
//		Lampara lamp3bases= new Lampara();
//		
//		lamp3bases.setForma("circular");
//		lamp3bases.setTipo("led");
//		lamp3bases.setMaterial("cristal");
//		lamp3bases.setTamaño("3 bases");
//		
//		
//		
//		System.out.println(lamp3bases);
//		
//		Lampara lamp1base= new Lampara ("digital", "rectangular","plastico","1 base");
//		
//		System.out.println(lamp1base);
			//-----------------------------------------------------------------------------------------------
		
	smartwach sm1= new smartwach ("Android OS", "Ifrarrojos,presion");
	pantalla Pantalla= new pantalla ("240x320", "TFT", 2.00,80);
	smartwach sm2= new smartwach ("Android OS", "Ifrarrojos,presion");
	System.out.println(sm2);
		
	}

}
