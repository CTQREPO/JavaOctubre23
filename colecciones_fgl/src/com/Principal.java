package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
//		List<Integer> lista = new ArrayList<Integer>();
//		List<Object> lista2 = new ArrayList<Object>();
//
//		lista2.add(45);
//		lista2.add("ahjsdahg");
//		System.out.println(lista2);
//
//		lista.add(500);
//		lista.add(1);
//		lista.add(90);
//		lista.add(450);
//		lista.add(500);
//		System.out.println(lista);
//
//		// añade un elemeto en la posicion deseado, recorriedno los demas datos
//		lista.add(2, 800);
//		System.out.println(lista);
//
//		System.out.println(lista.contains(500));
//
//		System.out.println(lista.get(3));
//
//		System.out.println(lista.indexOf(500));
//		System.out.println(lista.lastIndexOf(500));
//
//		System.out.println(lista.isEmpty());
//
//		System.out.println(lista.remove(3));
//		List<Integer> listita = new ArrayList<Integer>();
//		listita.add(500);
//		listita.add(90);
//		
//		System.out.println(lista.removeAll(listita));
//
//		System.out.println(lista);

		List<Cuenta> cuentas = new ArrayList<Cuenta>();

		Cuenta.SALDO_MAX = 200000;
		Cuenta.SALDO_MIN = 1000;

		Cuenta c1 = new Cuenta(5000, "Angel", "001", "CBE1", "DEBITO");
		Cuenta c2 = new Cuenta(2020, "Angel", "001", "CBE2", "CREDITO");
		Cuenta c3 = new Cuenta(20000, "Angel", "001", "CBE3", "DEBITO");
		Cuenta c4 = new Cuenta(1200, "Angel", "001", "CBE4", "CREDITO");
		Cuenta c5 = new Cuenta(8000, "Angel", "001", "CBE5", "DEBITO");
		Cuenta c6 = new Cuenta(9051, "Angel", "001", "CBE6", "CREDITO");
		Cuenta c7 = new Cuenta(1502, "Angel", "001", "CBE7", "DEBITO");
		Cuenta c8 = new Cuenta(3520, "Angel", "001", "CBE8", "CREDITO");
		Cuenta c9 = new Cuenta(4027, "Angel", "001", "CBE9", "DEBITO");
		Cuenta c10 = new Cuenta(7175, "Angel", "001", "CBE10", "CREDITO");
		Cuenta c11 = new Cuenta(7055, "Angel", "001", "CBE11", "DEBITO");

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

		Cajero atm = new Cajero("Av Juares 860", 10000.00, 0, 0, cuentas);

		// System.out.println(atm.retirar(c1, 2000));
		List<Object> datos = atm.retirar(c1, 2000);

		Ticket ticket1 = (Ticket) datos.get(0);

		System.out.println(datos.get(1));

		System.out.println(ticket1);
		// System.out.println(atm.depositar(c1, 198000));
		System.out.println(atm.transferir(c3, c10, 19500));
	}
}
