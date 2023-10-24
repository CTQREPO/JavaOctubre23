package com;

public class Principal {
	public static void main(String[] args) {
//		//Objeto instanciado con el contructor vacio
//		Reloj r1 = new Reloj();
//		
//		r1.setPrecio(35.00);
//		r1.setForma("Cuadrado");
//		r1.setTipo("pulsera");
//		
//		System.out.println(r1);
//		
//		//Objeto insanciado con el contructor de todos los parametros		
//		Reloj r2=new Reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeño", 100.00);
//		
//		System.out.println(r2);
//		
//		//Tercer constructor con dos parametros
//		Reloj r3 = new Reloj("verde", "manecillas");
//		System.out.println(r3);
//		System.out.println(r1.consultarHora());
//		System.out.println(r1.getPrecio());
		Series serieI= new Series();
		serieI.setTitulo("Redes Sociales");
		serieI.setGenero("Tecnologia");
		serieI.setIdioma("English");
		serieI.setDuracion(1f);
		
		System.out.println(serieI);
		
		
		Series serie= new Series("Superman and Lois","accion","Español",1.2f);
		System.out.println(serie);
		
		Series serie1 = new Series("El mentalista", "accion");
		System.out.println(serie1);
		
		System.out.println(serie1.getTitulo());
		
		Smartwatch sw1 = new Smartwatch("Android SO","Infrarrojo, presion");
		System.out.println(sw1);
		
		Pantalla pantalla =new Pantalla("720x1080", "TFT",2.00, 80 );
		Smartwatch sw2 = new Smartwatch("Pulsera", "Blanco", "Cuadrado", "Aluminio", "Digital", "Mediano", 900.00, "Android SO", "Infrarrojo",pantalla);
		System.out.println(sw2);
		sw2.medirOxigeno();
		
		
	}
}
