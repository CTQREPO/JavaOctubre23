package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		
		/*//lista es ina interface
		//ArrayList es una clase(de tantas) implementaciones de list
		List <Integer>lista = new ArrayList<Integer>();
		
		//imprimir el contenido
		
		System.out.println(lista);
		
		//Aregar elementos 
		lista.add(500);
		lista.add(1);
		lista.add(90);
		lista.add(500);
		lista.add(450);
		lista.add(500);
		lista.add(6757);
		lista.add(9876);
		System.out.println(lista);
		
		
		//añade un elemento en la posision deseada recorriendo los demas elemntos 
		lista.add(2, 800);
		System.out.println(lista);
		
		
		//inverso del index of
		//retorna verdaderos si contiene al menos un elemento
		lista.contains(lista);
		//devuelve true solo si existe el elemnto buscado el menos 1 vez en la lista
		System.out.println(lista.contains(500));
		//devuelve el objeto en la posision especificada
		System.out.println(lista.get(3));	
		
		//devuelve la posision donde encuntra por primer vez el elemnto especificado
		System.out.println(lista.indexOf(500));
		
		//devuelve la ultima posision dodnde encuentra al elemto especificado
		System.out.println(lista.lastIndexOf(500));
		
		//vaciar lista
		//lista.clear();
		
		
		//ve sie stá vacio
		System.out.println(lista.isEmpty());
		
		//elimina el elemento de la posicion vacia con numero borra la posision y con un objeto borra el objeto especificado
		Integer n = new Integer(6757);
		System.out.println(lista.remove(3));
		System.out.println(lista.remove(n));
		System.out.println(lista);
		//devuelve el tamaño
		System.out.println(lista.size());
		
		List<Integer> listita = new ArrayList<Integer>();
		listita.add(500);
		listita.add(500);
		
		//elimina en esta lista todos los valores especificados en una coleccion previa 
		System.out.println(lista.removeAll(listita));
		
		//remplaza un elemto en la posicion deseada con el nuevo elemento especificado
		System.out.println(lista);
		System.out.println(lista.set(2, 1500));
		System.out.println(lista);
		
		//controla si existe el elemento*/
		
		//simulacion de BD vacia 
		List <Cuenta> cuentas = new ArrayList<Cuenta>();
		Cuenta.SALDO_MIN=1000;
		Cuenta.SALDO_MAX=20000;
		
		
		Cuenta c1 = new Cuenta(5000,"Angel", "001","CBE1 ","Debito");
		Cuenta c2 = new Cuenta(3000,"Jose", "002","CBE2 ","Credito");
		Cuenta c3 = new Cuenta(20000,"Mario", "003","CBE3 ","Debito");
		Cuenta c4 = new Cuenta(7000,"Miguel ", "004","CBE4 ","Debito");
		Cuenta c5 = new Cuenta(1500,"Luisa", "005","CBE5 ","Debito");
		Cuenta c6 = new Cuenta(9283,"Karla", "006","CBE6 ","Credito");
		Cuenta c7 = new Cuenta(6500,"Jessica", "007","CBE7 ","Debito");
		Cuenta c8 = new Cuenta(2300,"Frida", "008","CBE8 ","Credito");
		Cuenta c9 = new Cuenta(8549,"Lucero", "009","CBE9 ","Credito");
		Cuenta c10 = new Cuenta(2800,"Carlos", "010","CBE10 ","Credito");
		Cuenta c11 = new Cuenta(50000,"Emanuel", "011","CBE11 ","Credito");
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
		
		Cajero atm = new Cajero("AV juarez 9800", 1000.00, cuentas);
		List<Object> datos = atm.retirar(c1, 2000);
		
		Ticket ticket1 = (Ticket)datos.get(0);
		System.out.println(datos.get(1));
		System.out.println(ticket1);
		
		
		//System.out.println(c1.getSaldoDisponible());
		
		//System.out.println(atm.depositar(c1, 198000));
		System.out.println(atm.transferir(c3, c10, 15000));
	
		
		
	}

}
