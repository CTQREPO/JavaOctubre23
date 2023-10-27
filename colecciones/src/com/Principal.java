package com;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//		ArrayList<Integer> bakety = new ArrayList ();
//		
//		bakety.add(34);
//		System.out.println(bakety);
//		
//		
		/*
		List<Integer> lista = new ArrayList<Integer>();
		
//		Imprimir el contenido
		System.out.println(lista);
		
		lista.add(500);
		lista.add(3);
		lista.add(543);
		lista.add(23);
		lista.add(3);
		lista.add(23);
		lista.add(23);
		lista.add(3);
		lista.add(23);
		
		
		System.out.println(lista);
		
		
		//Añade un elemento en la posición deseada recorriendo los demás elementos
		lista.add(2,800);
		
		System.out.println(lista);
		
		
		
		//Devuelve tur solo si existe el elemento buscado al menos una vez dentro de la lista
		System.out.println(lista.contains(23));
		
		System.out.println(lista.get(3));
		//Devuelve la posición donde se encuentra por promera vez el elemento especificado
		System.out.println(lista.indexOf(3));
		//Devuelve la posición donde se encuentra por última vez el elemento especificado
		System.out.println(lista.lastIndexOf(3));
		
  		//Limpia la lista y elimina las posiciones
//		lista.clear();
//		System.out.println(lista);
//		System.out.println(lista.isEmpty() + " ya fuiste");
		
		//Elimina la posicion envidada
		System.out.println(lista.remove(3));
		
		System.out.println(lista);
		
		
		System.out.println(lista.size());
		Integer n = new Integer (3);
		System.out.println(lista.remove(n));
		
		System.out.println(lista);
		
		
		List<Integer> listita = new ArrayList<Integer>();
		listita.add(23);
		listita.add(3);
		
		System.out.println(lista.removeAll(listita));
		
		System.out.println(lista);
		
		System.out.println(lista.set(1, 1500));
		System.out.println(lista);
		
//		lis
//		Cajero cajero = new Cajero();
//		
//		cajero.depositar(destino, monto);
//		
//		Ticket imprimir = new */
		
		
		//------BORRAR--------------------------Ejercicio de Cajero-------------------
		
		
		
		
		/* Lista de datos de los clientes
		 * Saldo         Cliente            N° de cuenta          Cuenta Clabe
		 * 
		 * 8000          01675670             057923565        01500010057923565 1
		 * 8000          01675671             057923566        01500010057923566 1
		 * 8000          01675672             057923567        01500010057923567 1
		 * 8000          01675672             057923568        01500010057923568 1
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		
		int operacion = 0;
		double monto= 0;
		
		//Suponiendo que la cuenta de origen es cuenta1
		System.out.println("El saldo disponible de la cuenta es: " + cuenta1.getSaldoDisponible());
		
		System.out.println("Ingrese operación: \n"
				+ "1 -- Retiro de fondos\n"
				+ "2 -- Deposito a cuenta\n"
				+ "3 -- Tranferencia a cuenta\n");
		operacion = sc.nextInt();
		
		System.out.println("Ingrese monto");
		monto = sc.nextInt();
		
		switch (operacion) {
		case 1:
			System.out.println(cajero.retirar(cuenta1, monto));
			break;
		case 2:
			System.out.println(cajero.depositar(cuenta1, monto));
			break;
		case 3:
			System.out.println(cajero.transferir(cuenta1, cuenta3, monto));
			break;
		default:
			break;
		}
		
		
		*/
		
		//----------------------------------------------------------------------
		
		List<Cuenta> cuentas = new ArrayList <Cuenta>();
		
		Cuenta.SALDO_MIN = 1000;
		Cuenta.SALDO_MAX = 200000;
		
		Cuenta cuenta1 = new Cuenta(8000, "01675670", "057923565", "01500010057923565 1","Debito");
		Cuenta cuenta2 = new Cuenta(3453, "01675671", "057923566", "01500010057923566 1","Credito");
		Cuenta cuenta3 = new Cuenta(8360, "01675672", "057923567", "01500010057923567 1","Debito");
		Cuenta cuenta4 = new Cuenta(8564, "01675673", "057923568", "01500010057923568 1","Debito");
		Cuenta cuenta5 = new Cuenta(2356, "01675674", "057923569", "01500010057923569 1","Debito");
		Cuenta cuenta6 = new Cuenta(8342, "01675675", "057923570", "01500010057923570 1","Credito");
		Cuenta cuenta7 = new Cuenta(9143, "01675676", "057923571", "01500010057923571 1","Debito");
		Cuenta cuenta8 = new Cuenta(23734, "01675677", "057923572", "01500010057923572 1","Credito");
		Cuenta cuenta9 = new Cuenta(27462, "01675678", "057923573", "01500010057923573 1","Credito");
		Cuenta cuenta10 = new Cuenta(3463, "01675679", "057923574", "01500010057923574 1","Credito");
		Cuenta cuenta11 = new Cuenta(37684, "01675680", "057923575", "01500010057923575 1","Credito");
		
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		cuentas.add(cuenta4);
		cuentas.add(cuenta5);
		cuentas.add(cuenta6);
		cuentas.add(cuenta7);
		cuentas.add(cuenta8);
		cuentas.add(cuenta9);
		cuentas.add(cuenta10);
		cuentas.add(cuenta11);
		
		Cajero atm = new Cajero("CDMX Av Reforma", 0.00, cuentas);
		
		System.out.println(atm.depositar(cuenta1, 10000));
		
		System.out.println(atm.retirar(cuenta1, 10000));
		
		Ticket ticket = atm.transferir(cuenta8, cuenta10, 10000);
		
		System.out.println(ticket.imprimir());
		
		
	}

}
