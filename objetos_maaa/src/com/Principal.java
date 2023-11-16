package com;

public class Principal {

	public static void main(String[] args) {
		
		//Objeto Instanciado con el constructror vacio
		Reloj r1 = new Reloj();
		r1.setPrecio(35.00);
		r1.setForma("cuadrado");
		r1.setTipo("pulsera");
		
		System.out.println(r1);
		
		//Objeto instanciado con el constructor
		Reloj r2 = new Reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeno", 100.00);
		System.out.println(r2 );
		
		Reloj r3 = new Reloj("Negro","manecillas");
		System.out.println(r3);
		
		System.out.println(r1.consultarHora());
		
//--------------------------------------------------------------------------------
		
		Cobertor c1 =new Cobertor();
		c1.setColor("blanco");
		c1.setMarca("Vianney");
		c1.setMaterial("lana");
		c1.setTamano("matrimonial");
		c1.setPrecio(499.99);
		System.out.println(c1);
		
		Cobertor c2 = new Cobertor("individual","azul","poliester","Baby Mink",369.99);
		System.out.println(c2);
		
		Cobertor c3 = new Cobertor("amarillo",669.99);
		System.out.println(c3);
		
//-----------------------------------------------------
		
		Smartwatch sm1 = new Smartwatch("Android OS", "Infrarrojos, presion");
		Pantalla pantalla = new Pantalla("240x320", "TFT", 2.0, 80);
		Smartwatch sm2 = new Smartwatch("pulsera", "blanco", "cuadrada", "aluminio", "digital", "mediano", 900.00, "Android OS", "Infrarrojos", pantalla);
		System.out.println(sm2);
		
		
		
	}
	
}
