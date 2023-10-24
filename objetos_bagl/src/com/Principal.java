package com;

public class Principal {

	public static void main(String[] args) {


		Reloj r1 = new Reloj();
		
		
		r1.setPrecio(35.00);
		
		r1.setForma("cuadrado");
		
		r1.setTipo("pulsera");
		
//		Reloj r2 = new Reloj("pulsera", "azul", "digital", "goma", "redondo", "pequeño", 100.00);
		
//		Reloj r3 = new Reloj("Negro","manecillas");
		
		
//		System.out.println(r2);
//		System.out.println(r3);
//		
//		System.out.println(r1.consultarHora());
		
		Calzado zapato = new Calzado ("Negro","Flexi","Zapato","Cuero vacuno","Cuero porcino","Agujetas",10);
		
		System.out.println(zapato);
		
		//Se lava el zapato y se encoge
		
		System.out.println("El " + zapato.tipo + " se lavó y su nuevo tamaño es " + zapato.encogerCalzado());
		
		System.out.println(zapato.talla);
		//Pantalla pantalla = new Pantalla("34", "LED", "22.0", 80);
		Smartwatch sm1 = new Smartwatch ("pulsera", "azul", "digital", "goma", "redondo", "pequeño", 100.00,"Android Os", "Infrarrojos, presión", new Pantalla("34", "LED", "22.0", 80));
		Smartwatch sm2 = new Smartwatch ("Android Os", "Infrarrojos, presión");
		
		
		System.out.println(sm1);
		System.out.println(sm2);
		System.out.println(sm1.consultarHora());
		sm1.contestarLlamadas();
		sm1.medirOxigeno();
	
	}

}
