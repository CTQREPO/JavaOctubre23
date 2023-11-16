package com;

public class principal {
public static void main(String[] args) {
	
	
	//objeto instanciado con el constructor vacio
	reloj r1 = new reloj();	//llamar a la clase y tener una referencia // instanciar un onjeto (crear un objeto)
	
	r1.setPrecio(35.00);
	r1.setForma("cuadrado");
	r1.setTipo("pulsera");
		
	System.out.println(r1);
	
	
	//objeto instanciado con el constructor de todos los parametros
	reloj r2 = new reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeño", 100.00);
	
	System.out.println(r2);

	reloj r3 = new reloj("negro","manecillas"); //tengo un constructor que me pide 2 posiciones, si quitas un "", no funciona
	System.out.println(r3);
	
	//System.out.println(r1.consultahora()); //devuelve un String
	r1.consultahora();
	System.out.println(r1.consultahora());
						//System.out.println(r1.getPrecio()); //Settetr -> establece //getter -> regresa
	
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	//HERENCIA
	
	Smartwatch sm1 = new Smartwatch("android OS","infrarojos, presion");
	
	pantalla pantalla = new pantalla("240 x 320", "TFT", 2.00, 80);
	
	Smartwatch sm2 = new Smartwatch("pulsera", "blanco", "cuadrada", "aluminio", "digital", "mediano", 900.00, "android os", "infrarojos", pantalla);
	
	
	System.out.println(sm2);
	
	
	
}
}
