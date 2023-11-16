package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
//		
//		//List es una interface
//		//ArrayList es una clase (de tantas) implementacion de List
//		List<Integer> lista = new ArrayList<>();
//		
//		System.out.println(lista);
//		
//		lista.add(500);
//		lista.add(200);
//		lista.add(300);
//		lista.add(400);
//		lista.add(400);
//		lista.add(400);
//		lista.add(500);
//		System.out.println(lista);
//		//permite dumplicados y no los ordena
//		lista.add(2, 600);
//		//Añade un elemento en la posisicion deceada recorriendo una posicion 
//		System.out.println(lista);
//		//Duevuelve true si existe el lemento buscado al menos 1 vez dentro de la lista
//		System.out.println(lista.contains(500));
//		//Duevuelve el objeto en la poscicion especificado
//		System.out.println(lista.get(3));
//		//devueve la pocicion donde encuentra por prmera vez el elemento especificado
//		System.out.println(lista.indexOf(500));
//		//devueve la ultima pocicion donde encuentra por ultima vez el elemento especificado
//		System.out.println(lista.lastIndexOf(500));
//		//vacia la lista
//		//lista.clear();
//		//Devuelve true si la lsita esta vacio
//		System.out.println(lista.isEmpty());
//		//elimina 
//		System.out.println(lista.remove(0));
//		System.out.println(lista);
//		//elimina el primer obejeto que sea igual a la variable declarada en n
//		Integer n=200;
//		System.out.println(lista.remove(n));
//		System.out.println(lista);
//		//eliminar todos los valores que este en la nueva arrayslist
//		List<Integer> listita = new ArrayList<Integer>();
//		listita.add(400);
//		System.out.println(lista.removeAll(listita));
//		System.out.println(lista);
//		//remplaza el valor indicado en la posicion por el valor proporcionado
//		System.out.println(lista.set(0, 100));
//		System.out.println(lista);
//		//
		
		//BD vacia
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		Cuenta.SALDO_MIN = 1000;
		Cuenta.SALDO_MAX = 20000;
		//agregar cuentas
		Cuenta c1 = new Cuenta(5000, "Angel", "001", "CBE1", "Debito");
		Cuenta c2 = new Cuenta(3000, "Jose", "002", "CBE2", "Credito");
		Cuenta c3 = new Cuenta(200000, "Mario", "003", "CBE3", "Debito");
		Cuenta c4 = new Cuenta(7000, "Miguel", "004", "CBE4", "Debito");
		Cuenta c5 = new Cuenta(1500, "Luisa", "005", "CBE5", "Debito");
		Cuenta c6 = new Cuenta(9283, "Karla", "006", "CBE6", "Credito");
		Cuenta c7 = new Cuenta(6500, "Jessica", "007", "CBE7", "Debito");
		Cuenta c8 = new Cuenta(2300, "Frida", "008", "CBE8", "Credito");
		Cuenta c9 = new Cuenta(8549, "Lucero", "009", "CBE9", "Credito");
		Cuenta c10 = new Cuenta(2800, "Carlos", "010", "CBE10", "Credito");
		Cuenta c11 = new Cuenta(5000, "Manuel", "011", "CBE11", "Credito");
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
		Cajero atm = new Cajero("Av Juarez", 10000.00, cuentas);
		
		List<Object> datos = atm.retirar(c1, 2000);
		Ticket ticket1 = (Ticket) datos.get(0);
				
		System.out.println(datos.get(1));
		System.out.println(ticket1);
		
		//BD
		System.out.println(c1.getSaldoDisponible());
		
		//Depositar
		System.out.println("----Depositar----");
		System.out.println(atm.depositar(c1, 50000));
		//transferir
		System.out.println("----Transferencia----");
		Ticket t1 = atm.transferir(c3, c10, 1800);
		System.out.println(t1.imprimir());
		
	
	}
}
