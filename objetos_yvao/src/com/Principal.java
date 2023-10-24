package com;

public class Principal {

	public static void main(String[] args) {
		
		//llamar a la clase y crear una referencia le estoy asignando un new constructor (Reloj vacio)
		//contructor vacio
		Reloj r1 = new Reloj();//objeto1
		
		r1.setPrecio(35.00);// asignando un valor a precio
		r1.setForma("Cuadrado");
		r1.setTipo("Pulsera");
	
		System.out.println(r1); //imprime valores que componen al objeto
		
		//constructor lleno(objeto instanciado con el constructor de todos los parametros)
		Reloj r2 = new Reloj("Pulsera", "Azul", "Redondo", "Goma", "Digital", "Pequeño", 100.00);
		System.out.println(r2);
		
		Reloj r3 = new Reloj ("negro","manecillas");
		System.out.println(r3);
		
		System.out.println(r1.consultarhora());//imprime la hora (el metodo consultar hora) 
		System.out.println(r1.getPrecio());//imprimes el precio
		
		System.out.println( "\n ");
		
		//----------------------------------------------//-----------------------------------------------------//
		
		//constructor vario
		Mouse r4 =new Mouse(); //objeto1
		
		r4.setPrecio(150.00);//asigna un valor
		r4.setDiseño("ergonomico");
		r4.setTipo("Mecanico");
		
		System.out.println(r4);// imprime el valor que compone al objeto
		
		//constructor lleno 6
		Mouse r5 = new Mouse("Rosa","Optico","Ergonomico","Mini","Plastico",200.00);
		System.out.println(r5);
		// constructor recibe 2
		Mouse r6 = new Mouse("azul","Goma");
		System.out.println(r6);
		
		System.out.println(r4.getPrecio());
		
		System.out.println( "\n ");
		
		//-------------------------------------------//-----------------------------------------------------------//
		
		//se crea el objeto
		Smartwatch sm1= new Smartwatch("Android OS","Inflarojos,presion");
		Pantalla pantalla = new Pantalla("240x230", "TFT", 2.00, 80);
		Smartwatch sm2= new Smartwatch("Pulsera","Blanco","Cuadrada","Aluminio","Digital","Mediano",900.00,"Android OS","Inflarojos", pantalla);
	
		System.out.println(sm2);
		
	}
}
