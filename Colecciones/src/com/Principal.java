package com;

import java.util.List;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
//		//LIST ES UNA INTERFACE
//		//ARRAYLIST ES NA CLASE (DE TANTAS) IMPLEMENTACION DE LLIST
//		List<Integer> lista = new ArrayList<Integer>();
//			
//		//imprimmir
//		//System.out.println(lista);
//		
//		//AGREGAR ELEMANTOS
//		
//		lista.add(500);
//		lista.add(50);
//		lista.add(600);
//		lista.add(900);
//		lista.add(30);
//		lista.add(34500);
//		lista.add(5040);
//		lista.add(500);
//		lista.add(500);
//		lista.add(500);
//		lista.add(30);
//		
//		System.out.println(lista);
//		
//		
//		lista.add(2,666);
//		System.out.println(lista);
//		
//		
//		///Devuelve true si existe el elemeto
//		lista.contains(500);
//		System.out.println(lista.contains(500));
//		
//		///devuelve el objeto en la posicion
//		
//		System.out.println(lista.get(3));
//		
//		///DEVUELVE LA POSICION DONDE ENCUENNTRA POR PRIMERA VEZ EL ELEMENTO ESPICIFICADO
//		System.out.println(lista.indexOf(500));
//		
//		///devuelve la posicion del ultimo valor especificado aun si este es repetido
//		System.out.println(lista.lastIndexOf(30));
//		
//		// si la lsita esta vacia devuelve un true
//		System.out.println(lista.isEmpty());
//		
//		///elimina posicion
//		lista.remove(3);
//		System.out.println(lista);
//		
//		///elimina valor
//		Integer n = new Integer(34500);
//		lista.remove(n);
//		System.out.println(lista);
//		
//		///tamaño de lista
//		System.out.println(lista.size());
//		
//		///ELIMINAR VARIOS ELEMENTOS 
//		
//		ArrayList<Integer> listita = new ArrayList();
//		
//		listita.add(5040);
//		listita.add(500);
//		
//		lista.removeAll(listita);//remueve todos los elementos que se encuentren en la lista incluso los repetidos
//		System.out.println(lista);
//		
		
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

		Cuenta.SALDO_MIN=1000;
		Cuenta.SALDO_MAX=200000;
		
		///CREA LAS INSTANCIAS (OBJETO) CON LA INFORMACION DE LOS USUARIOS  
		Cuenta c1 = new Cuenta(5000, "Angel", "001", "CBE1", "Debito");
		Cuenta c2 = new Cuenta(3440, "Jose", "002", "CBE2", "Credito");
		Cuenta c3 = new Cuenta(2300, "Jovi", "003", "CBE3", "Debito");
		Cuenta c4 = new Cuenta(1000, "Roman", "004", "CBE4", "Debito");
		Cuenta c5 = new Cuenta(5000, "Jessica", "005", "CBE5", "Credito");
		Cuenta c6 = new Cuenta(6500, "Juan", "006", "CBE6", "Debito");
		Cuenta c7 = new Cuenta(50550, "Alan", "007", "CBE7", "Credito");
		Cuenta c8 = new Cuenta(34500, "Patricia", "008", "CBE8", "Debito");
		Cuenta c9 = new Cuenta(12300, "Pedro", "009", "CBE9", "Credito");
		Cuenta c10 = new Cuenta(12340, "Gabby", "010", "CBE10", "Debito");
		Cuenta c11 = new Cuenta(3200, "Yoselin", "011", "CBE11", "Debito");
		Cuenta c12 = new Cuenta(12300, "Viridiana", "012", "CBE12", "Credito");
		
		
		///ALMACENA LAS INSTANCIAS EN UNA CELDA DE LA LISTA CUENTAS
		
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
		cuentas.add(c12);
		
		Cajero atm = new Cajero("Av Juarez 9800", 10000.00, cuentas);
		
		List<Object> datos = atm.retirar(c1, 600);
		Ticket ticket1 = (Ticket) datos.get(0);
		System.out.println(datos.get(1));
		System.out.println(ticket1);
		
//		
//		System.out.println(c1.saldoDisponible);
//		
//		
//		System.out.println(atm.depositar(c1, 5000));
		
		
		
		System.out.println(atm.transferir(c1, c4, 1000));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
