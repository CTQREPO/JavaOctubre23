package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
//		//List es una interface
//		//ArrayList es una clase (de tantas) implementaciones de List
//		List<Integer> lista = new ArrayList<Integer>();
//		
//		
//		//imprimir el contenido 
//		System.out.println(lista);
//		
//		//agregar elementos 	
//		
//		lista.add(500);
//		lista.add(1);
//		lista.add(90);
//		lista.add(450);
//		lista.add(500);
//		lista.add(500);
//		lista.add(500);
//		System.out.println(lista);
//		//añade un elemento en la posicion deseada rrecorriendo a los demas es decir que si en el indice 2 hay un numero solo lo va arrecorrer no lo remplaza
//		lista.add(2, 800);
//		System.out.println(lista);
//		//devuelve true solo si existe  el metodo budcado  al menos una vez  dentro de la lista 
//		System.out.println(lista.contains(900));
//		//devuelve el contenido de la posicion especificada
//		System.out.println(lista.get(3));
//		//devuelve la posicion donde se encurntra  por primera vez  el elemnto especificado 
//		System.out.println(lista.indexOf(500));
//		//devuelve la ultima posicion donde se encuentra el elemento especificado
//		System.out.println(lista.lastIndexOf(500));
//		// el metodo clear limpia la lista dejando el arraylist completamente vacia |
//		//lista.clear(); <----------------------------------------------------------|
//		//indica si la lista esta vacia o no devuelve false si la lista contienen elementos y un true si esta si se encuetra vacia 
//		System.out.println(lista.isEmpty());
//		//remove(5) remueve la posicion indicada en este caso elimina el elemento del numero 5|| pero si hace un nuevo objeto en este caso de un int a un Integer y ahora borra el valor del objeto no la posicion
//		Integer n = new Integer(500);
//		System.out.println(lista.remove(n));
//		System.out.println(lista);
//		//devuelve la cantidad de elementos que contiene el arraylist
//		System.out.println(lista.size());
//		
//		
//		
//		List<Integer>listita =new ArrayList<Integer>();
//		listita.add(500);
//		
//		//Elimina en esta lista, todos los valores especificados en una collecion previa
//		System.out.println(lista.removeAll(listita));
//		System.out.println(lista);
//		//Remplaza un elemento de la posicion deseada con un nuevo  elemento especificado en este caso el primer valor"2" indica el indice o la posicion
//		System.out.println(lista.set(2, 1500));
//		System.out.println(lista);
//		
//		//BD
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		Cuenta.SALDO_MIN = 1000.00;
		Cuenta.SALDO_MAX =200000.00;
		
		Cuenta c1 = new Cuenta(10000,"Angel","001","CBE1","Debito" );
		Cuenta c2 = new Cuenta(3000,"Jose","002","CBE2","Credito" );
		Cuenta c3 = new Cuenta(18000,"Mario","003","CBE3","Debito" );
		Cuenta c4 = new Cuenta(12000,"Luisa","004","CBE4","Debito" );
		Cuenta c5 = new Cuenta(5000,"Karla","005","CBE5","Debito" );
		Cuenta c6 = new Cuenta(3000,"Jessica","006","CBE6","Credito" );
		Cuenta c7 = new Cuenta(9000,"Frida","007","CBE7","Debito" );
		Cuenta c8 = new Cuenta(14000,"Lucero","008","CBE8","Credito" );
		Cuenta c9 = new Cuenta(2000,"Carlos","009","CBE9","Credito" );
		Cuenta c10 = new Cuenta(9000,"Emanuel","010","CBE10","Credito" );
		Cuenta c11 = new Cuenta(10000,"Miguel","011","CBE11","Credito" );
		
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
		Cajero atm = new Cajero("Av juarez 9800",10000.00, cuentas);
		List<Object> datos = atm.retirar(c1,2000);
		
        Ticket ticket1 = (Ticket) datos.get(0);
        System.out.println(datos.get(1));
        System.out.println(ticket1);
		
       System.out.println(atm.depositar(c1, 50000));
       
       
       System.out.println(atm.transferir(c1, c2, 5000));
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
	}

}
