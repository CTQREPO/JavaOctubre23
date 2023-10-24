package com;

public class Principal2 {
	public static void main(String[] args) {
		
		Sudaderas r1 = new Sudaderas();
		r1.setTipo("Capucha");
		r1.setTamaño("Mediano");
		r1.setColor("Rojo");
		r1.setMaterial("Algodon");
		r1.setPrecio(100.00);
		
		System.out.println(r1);
		
		Sudaderas r2 = new Sudaderas("Deportiva", "Grande", "Azul", "Algodon",300.00);
		System.out.println(r2);
		System.out.println(r1.getPrecio());
		System.out.println(r2.getPrecio());
	}
	
}
