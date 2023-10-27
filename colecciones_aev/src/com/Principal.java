package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
	
		/*
		//List es una interface
		//Array list es una clase (de tantas) implementacion de list
		List<Integer> lista =new ArrayList<Integer>();
		
		//imprimir el contenido
		System.out.println(lista);
		
		//Agregat elementos
		lista.add(500);
		lista.add(167);
		lista.add(90);
		lista.add(450);
		lista.add(500);
		System.out.println(lista);
		
		//Añade un elemento en la posiscion deseada recorriendo los demas elementos
		lista.add(2, 800);
		System.out.println(lista);
		
		//Devuelve true solo si existe el elemento buscado al menos 1 vez dentro de la misma 
		System.out.println(lista.contains(900));
		
		//Devuelve el objeto en la posicion especificada
		System.out.println(lista.get(3));
		
		//Devuelve la posicion donde encuentra por primera vez el elemento especificado
		System.out.println(lista.indexOf(500));
		
		//Devuelve la ultima posicion donde encuentra al elemento especificado
		System.out.println(lista.lastIndexOf(500));
		
		//vacia la lista
		//lista.clear();
		
		//Devuelve true si la lista esta vacia
		System.out.println(lista.isEmpty());
		
		//Elimina el elemento en la posicion indicada
		Integer n = new Integer(450);
		System.out.println(lista.remove(n));
		System.out.println(lista);
	
		//Devuelve el tamañano de la lista
		System.out.println(lista.size());
		
		List<Integer> listita = new ArrayList<Integer>();
		listita.add(500);
		listita.add(90);
		//Elimina en la lista, todos los valores especificados en una coleccion previa
		System.out.println(lista.removeAll(listita));
		
		//Remplaza un elemento en la pocision deseada con el nuevo alemento especificados
		System.out.println(lista.set(1, 1500));
		System.out.println(lista);
		*/
		
		//BD
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		Cuenta.SALDO_MIN = 1000;
		Cuenta.SALDO_MAX = 200000;
		
		Cuenta c1 = new Cuenta(5000, "Angel", "001", "CBE1", "Debito");
		Cuenta c2 = new Cuenta(3000, "Jose", "002", "CBE2", "Credito");
		Cuenta c3 = new Cuenta(59797, "Mario", "003", "CBE3", "Debito");
		Cuenta c4 = new Cuenta(67832, "Miguel", "004", "CBE4", "Debito");
		Cuenta c5 = new Cuenta(2300, "Luisa", "005", "CBE5", "Debito");
		Cuenta c6 = new Cuenta(4987, "Karla", "006", "CBE6", "Debito");
		Cuenta c7 = new Cuenta(10000, "Jessica", "007", "CBE7", "Credito");
		Cuenta c8 = new Cuenta(6000, "Frida", "008", "CBE8", "Credito");
		Cuenta c9 = new Cuenta(7859, "Carlos", "009", "CBE9", "Debito");
		Cuenta c10 = new Cuenta(3240, "Emanuel", "0010", "CBE10", "Credito");
		
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
		
		Cajero atm = new Cajero("Av juarez 9800", 10000.00, cuentas);
		List<Object> datos = atm.retirar(c1, 2000);
		
		Ticket ticket1 = (Ticket) datos.get(0);
		System.out.println(datos.get(1));
		System.out.println(ticket1);
		
		System.out.println(atm.depositar(c1, 50000));
		
		System.out.println(atm.transferir(c3, c10, 30000));
	}

}
