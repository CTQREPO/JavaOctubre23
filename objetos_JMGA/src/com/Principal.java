package com;

public class Principal {
	public static void main(String[] args) {
		
		
		//instancia con el constructor vacio
		Reloj r1 = new Reloj(); //instancia de clase llamando al constructor vacio
		
		System.out.println(r1);
		
		r1.setPrecio(35.00);//los set establecen 
		r1.setForma("cuadrado");
		r1.setTipo("pulsera");
		
		System.out.println(r1);

		//objeto intanciado con el contructor 
		Reloj r2 = new Reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeño", 100.00);//hay que respetar la posicion de los argumentos
		
		System.out.println(r2);
	
	
		Reloj r3 = new Reloj("","");
		
		
		System.out.println(r1.consultaHora());
	
	//Otro ejemplo de modelando de clase 
		Lapiz lp = new Lapiz();
		lp.setColor("Negro");
		System.out.println(lp);
		
		
		Lapiz lp2 = new Lapiz ("Rojo","Madera ",5);
		System.out.println(lp2);
		
		lp2.escribir();
		
	
	
		
		
		//-----------------------//
		Smartwatch sm1 = new Smartwatch("Android OS"," presion");// aqui llamamos alconstructor vacio con el super
		Pantalla pantalla = new Pantalla("240x320","TFT", 2.00, 80);
		Smartwatch sm2 = new Smartwatch("pulsera", "Blanco", "cuadrado", "aluminio", "digital", "mediano", 900.00, "Android SO", "infrarojos", pantalla);
		System.out.println(sm2);
		
		
		
		
		
		
		
		
		
		
	
	}
	
	

}
