package com;

public class Principal {

	public static void main(String[] args) {
		Relog miRelog = new Relog();

		miRelog.setPrecio(35.0);
		miRelog.setForma("Cuadrado");
		miRelog.setTipo("Pulsera");

//		System.out.println(miRelog);

//		Relog miRelog2 = new Relog("pulsera", "azul", "redondo", "digital", "pequeño", 100.00);
//		System.out.println(miRelog2);

//		System.out.println(miRelog.consultarHora());
		
		Articulo discoDuro = new Articulo(1, 100, "Kingston A400 SATA 2.5", "75010259887020", "23-10-2023", 1000.00);
		
//		System.out.println(discoDuro);
		
		discoDuro.setCantidadStock(1500 + 100);
//		System.out.println(discoDuro.getCantidadStock());
		System.out.println(discoDuro.toString());
		
		Smartwatch miSmartwatch = new Smartwatch();
		Smartwatch miSmartwatch2 = new Smartwatch("Android OS", "Infrarrojos de presion");
		Pantalla pantalla = new Pantalla("1024px", "ls", 45, 22);
		
//		Smartwatch miSmartwatch3 = new Smartwatch("Pulso", "Azul", "Cuadrado", "CUerda", "mediano", 350.00, "Android OS", "Movimimiento");
		Smartwatch miSmartwatch4 = new Smartwatch("Pulso", "Azul", "Cuadrado", "CUerda", "mediano", 350.00, "Android OS", "Movimimiento", pantalla);
		
		
		
		System.out.println(miSmartwatch4);
		
	}
}
