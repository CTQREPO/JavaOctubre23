package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//List es una interface
		//ArrayList es una clase (de tantas) implementación de List
//		List<Integer> lista = new ArrayList<Integer>();
//
//	    //Imprimir el contenido
//		System.out.println(lista);
//		
//		//Agregar elementos
//		lista.add(500);
//		lista.add(1);
//		lista.add(90);
//		lista.add(500);
//		lista.add(500);
//		System.out.println(lista);
//		
//		//la lista permite duplicados pero no los ordena
//		
//		//Añade un elemento en la posiicion deseada, recorriendo los demas elementos
//		lista.add(2, 800);
//		System.out.println(lista);
//		//Devuelve true si existe el elemento buscado al menos 1 vez dentro de la lista
//		System.out.println(lista.contains (900));
//		//Devuelve el objeto en la posicion especificada
//		System.out.println(lista.get(3));
//		//Devuelve la posicion donde encuentra por primera vez el elemento especificada
//		System.out.println(lista.indexOf(500));
//		//Devuelve la ultima posicion donde encuentra al elemento especificado
//		System.out.println(lista.lastIndexOf(500));
//	
//		//Vacía la lista
////		lista.clear();
//		//Devuelve true si la lista esta vacia
//		System.out.println(lista.isEmpty());
//		
//		//Elimina el elemento en la posicion indicada
//		Integer n = new Integer(500);
//		System.out.println(lista.remove(n));
//		//Devuelve el tamaño de la lista
//		System.out.println(lista.size());
//		
//		List<Integer> listita = new ArrayList<Integer>();
//		listita.add(500);
//		//Elimina en esta lista, todos los valores especificados en una coleccion previa
//		System.out.println(lista.removeAll(listita));
//		//Reemplaza un elemento en la posicion deseada con el nuevo elemento especificado
//		System.out.println(lista.set(2, 1500));
//		System.out.println(lista);
		
		//BD
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		Cuenta.SALDO_MIN = 1000;
		Cuenta.SALDO_MAX = 20000;
		Cuenta c1 = new Cuenta(5000, "Angel", "001", "CBE1", "Debito");
		Cuenta c2 = new Cuenta(3000, "Jose", "002", "CBE2", "Credito");
		Cuenta c3 = new Cuenta(20000, "Mario", "003", "CBE3", "Debito");
		Cuenta c4 = new Cuenta(7000, "Miguel", "004", "CBE4", "Debito");
		Cuenta c5 = new Cuenta(1500, "Luisa", "005", "CBE5", "Debito");
		Cuenta c6 = new Cuenta(9834, "Karla", "006", "CBE6", "Credito");
		Cuenta c7 = new Cuenta(6500, "Jessica", "007", "CBE7", "Debito");
		Cuenta c8 = new Cuenta(2300, "Frida", "008", "CBE8", "Credito");
		Cuenta c9 = new Cuenta(8549, "Lucero", "009", "CBE9", "Credito");
		Cuenta c10 = new Cuenta(2800, "Carlos", "010", "CBE10", "Credito");
		Cuenta c11 = new Cuenta(50000, "Emanuel", "011", "CBE11", "Debito");
		cuentas.add(c1);
		cuentas.add(c2);
		cuentas.add(c3);
		cuentas.add(c4);
		cuentas.add(c5);
		cuentas.add(c6);
		cuentas.add(c7);
		cuentas.add(c8);
		cuentas.add(c9);
		cuentas.add(c10);
		cuentas.add(c11);
		Cajero atm = new Cajero("Av Juarez 9800", 10000.00, cuentas);
		List<Object> datos = atm.retirar(c1, 2000);
		
		Ticket ticket1 = (Ticket) datos.get(0);
		System.out.println(datos.get(1));
		System.out.println(ticket1);

		//System.out.println(atm.depositar(c1, 198000));
		//
		Ticket t1 = atm.transferir(c3, c10, 15000);
		System.out.println(t1.imprimir());
		
	}
}
