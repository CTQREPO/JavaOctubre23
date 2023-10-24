package com;

public class EjercicioObjetosPrincipal {
	public static void main(String[] args) {

		// ejercicio_objetos interiores = new ejercicio_objetos();
		
		EjercicioObjetos interiores = new EjercicioObjetos();
		interiores.setSuelo("loseta");
		interiores.setRecubrimiento(0.02);
		interiores.setCostoreestructura(6000.00);
		
		System.out.println(interiores);
		

		EjercicioObjetos interiores1 = new EjercicioObjetos("loseta", "concreto", "blanco con detalles azules",
				"marco de madera", 2.30, 2.0, 0.02, 6000.00);
		System.out.println(interiores1);

	}
}
