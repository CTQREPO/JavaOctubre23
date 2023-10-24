package com;

public class Principal {

	public static void main(String[] args) {
		
//		Reloj r1 = new Reloj();
//		
//		r1.setPrecio(35);
//		r1.setForma("cuadrado");
//		r1.setTipo("pulsera");
//		
//		
//		System.out.println(r1);
//		
//		
//		//objeto instanciado con el constructor de todos los parametros
//		Reloj r2 = new Reloj("pulsera", "azul", "redondo", "goma", "digital", "pequeño", 100.00);
//		
//		System.out.println(r2);
//		
//		//los metodos constructores son el mecanismo para definir estados iniciales de un objeto
//	    Reloj r3 = new Reloj("negro", "manecillas");
//	
//	    System.out.println(r1.consultaHora());
//	    System.out.println(r1.getPrecio());
	    
	    
	    EjercicioObjetos obj1 = new EjercicioObjetos();
	    
	    obj1.setNombre("Angel");
	    obj1.setApellido("Anselmo");
	    obj1.setCiudad("Puebla");
	    
	    System.out.println(obj1);
	  
	    EjercicioObjetos obj2 = new EjercicioObjetos("Angel","Anselmo", "Puebla", 23, 1.60);
	    System.out.println(obj2);
	    
	    EjercicioObjetos obj3 = new EjercicioObjetos("Angel","Anselmo");
	    System.out.println(obj3.getNombre());
	    System.out.println(obj3.getApellido());

	    Smartwatch sm1= new Smartwatch("Android OS", "Infrarrojo, presion");
	    
	    Pantalla pantalla = new Pantalla("240x320","TFT", 2.00, 80);
	    Smartwatch sm2= new Smartwatch("Pulsera", "blanco", "cuadrada", "aluminio", "digital", "mediano", 900.00, "Android OS", "Infrarrojos", pantalla);
		   
	    System.out.println(sm2);
	}
}
