package com.live;

public class Principal {

	public static void main(String[] args) {
		
		Reloj r1 = new Reloj();   
		
		r1.consultaHora();
		r1.setPrecio(35.50); /// ASIGNA UN VALOR A LA VARIABLE
		r1.setForma("Cuadrado");
		r1.setTipo("pulsera");
		
		System.out.println(r1);
		
		
		
		
		///					tienen que ir en el mismo orden del constructor 
		Reloj r2 = new Reloj("azul","digital","goma","pequeño","redondo","digital",100.50);
		
		System.out.println(r2);
		
		Reloj r3 =new Reloj("azul","digital");
//		r3.setPrecio(34.6);
//		r3.setColor("amarillo");
//		r3.setTamaño("mediano");
		System.out.println(r3);
		
		System.out.println(r1.consultaHora());
		
		
		Smartwatch sm1 = new Smartwatch(); // OBTIENE LA INFORMACION DE LA CLASE SMARTWATCH "CONSTRUCTOR VACIO"
		
		
		Pantalla p1 = new Pantalla("1080p","AMOLED",14.5,590);
		Smartwatch sm2 = new Smartwatch("Rojo","portatil","plastico","Chico","redondo","digital",2345.89,"iOS","Cardiaco", p1);
							//CONSTRUCTOR LLENO CON LOS ATRIBUTOS DE RELOJ + LOS DE SMARTWATCH

		System.out.println(sm1);
		System.out.println(sm2);
		
		System.out.println(sm1.consultaHora());
		//System.out.println(sm2.contestarLlamadas());
		
	}

}
