package com.compu;

public class Principal {
	
	public static void main(String[] args) {
		
		Compu c1 = new Compu();/// SE TIENE QUE REALIZAR UN CONSTRUCTOR VACIO PARA LLAMAR ESTE METODO
		
		c1.setMarca("HP");
		c1.setAlmacenamiento(500);
		c1.setMemoria(8);
		c1.setPortatil(true);
		c1.setPrecio(3234.56);
		c1.setTamaño("grande");
		System.out.println(c1);
		
		Compu c2 = new Compu("DELL","CHICA", 500, 12, false, 2345.67);
		System.out.println(c2);
		
		
	}

}
