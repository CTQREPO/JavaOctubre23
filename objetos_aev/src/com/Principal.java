package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Reloj r1 = new Reloj(); 
		
		r1.setPrecio(35.00);
		r1.setForma("cuadrado");
		r1.setTipo("Pulsera");
		
		System.out.println(r1);
		
		//Objeto instanciado con el constructor de todos los parametros
		Reloj r2 = new Reloj("pulsera", "azul", "redondo", "Goma", "digital", "pequeño", 100.00);
		System.out.println(r2);
		
		
		Reloj r3 = new Reloj("Negro", "manecillas");
		System.out.println(r3);
		
		System.out.println(r1.consultarHora());
	
		Smartwatch sm1 = new Smartwatch("Android OS", "Infrarrojos, presion");
		Pantalla pantalla = new Pantalla("240x320","TFT", 2.00, 80);
		Smartwatch sm2 = new Smartwatch("pulsera", "blanco", "cuadrada", "aluminio", "digital", "mediano", 900.00, "Android OS", "Infrarrojos", pantalla);
		
		System.out.println(sm2);
		
		
	}

}
