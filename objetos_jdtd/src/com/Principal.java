package com;

public class Principal {
	public static void main(String[] args) {
		
		//objeto instanciado con el constructor vacio
		Reloj r1 = new Reloj();// se crea y se instancia un objeto se llama al construtor vacio y se contiene dentro de r1
		r1.setPrecio(35.00);
		r1.setForma("cuadrado");
		r1.setTipo("pulsera");
	    System.out.println(r1);
		//objeto instanciado con el constructor de todos los paramtros
		Reloj r2= new Reloj("pulsera", "Azul", "redondo", "goma", "digitla", "pequeño", 100.00);
		System.out.println(r2);
		
		
		Reloj r3 = new Reloj("negro", "manecillas");
		System.out.println(r3);
		
		System.out.println(r3.consultarHora());
		System.out.println(r1.getPrecio());
		
		Libreta l1= new Libreta();
		l1.setCalidad("pasta gruesa");
		l1.setForma("cuadro chico");
		l1.setTamaño("Profesional");
		l1.setPrecio(30.00);
		
		System.out.println(l1);
		
		System.out.println(l1.getTamaño());
		
		Libreta l2 = new Libreta("xD", "profesional", "dibujo", "economica", "200 hojas", 75.00);
		System.out.println(l2);
		
		//------------------------------------------------------------------------------------------
		
	   Smartwatch sm1 = new Smartwatch("Android OS", "infrarojos, presion");
	   Pantalla pantalla= new Pantalla("240x320", "TFT", 2.00,80 );
	   Smartwatch sm2 = new Smartwatch("pulsera", "negro", "cuadrada", "aluminio", "digital", "mediano", 900.00, "android OS","Infrarojos,presion",pantalla);

	  // System.out.println(sm1);
       System.out.println(sm2);	   
	   
		
		
		
		
		
		
		
		
		
	}

}
