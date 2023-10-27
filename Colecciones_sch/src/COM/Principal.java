package COM;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
//		//List es una interface
//		//ArrayList es una clase (de tantas) implementacion de List
//		List<Integer> lista = new ArrayList<Integer>();
//		
//		//imprimir el contenido
//		
//		System.out.println(lista);
//		
//		//agregar elementos
//		lista.add(500);
//		lista.add(1);
//		lista.add(2);
//		lista.add(3);
//		lista.add(500);
//		
//		System.out.println(lista);
//		
//		//añade un elemento en especifico donde se desea pero solo lo recorre
//		lista.add(2, 8000);
//		
//		System.out.println(lista);
//		
//		//arroja true solo si el elemento indicado lo contiene la lista y false si no lo contiene
//		System.out.println(lista.contains(1));
//		//devuelve el objeto en la posicion especifica 
//		System.out.println(lista.get(3));
//		//devuelve la posicion donde encuentra por primera vez el elemento especificado
//		System.out.println(lista.indexOf(500));
//		//devuelve la ultima posicion donde encuentra por ultima vez al elemento
//		System.out.println(lista.lastIndexOf(500));
//		//vacia la lista
//		//lista.clear();
//		//me indica si esta vacia o no la lista 
//		System.out.println(lista.isEmpty());
//		//elimina el elemento en la posicion indicada
//		System.out.println(lista.remove(3));
//		System.out.println(lista);
//		//devuelve el tamaño de la lista
//		System.out.println(lista.size());
//		//elimina el objeto especifico 
//		Integer n=new Integer(2);
//		System.out.println(lista.remove(n));
//		
//		//elimina en esta lista todo los valores especificados en una coleccion(lista)
//		//previamente definida
//		List<Integer> listita = new ArrayList<Integer>();
//		listita.add(500);
//		System.out.println(lista.removeAll(listita));
//		System.out.println(lista);
//		//Reemplaza un elemento en la posicion deseada con el nuevo elemento especificado
//		System.out.println(lista.set(1, 14500));
//		System.out.println(lista);
//	
		
		//BD
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		Cuenta.SALDO_MIN = 1000;
		Cuenta.SALDO_MAX = 200000;
		
		Cuenta c1= new Cuenta(5000,"Angel","001","CBE1","Debito");
		Cuenta c2= new Cuenta(3000,"Jose","002","CBE2","Credito");
		Cuenta c3= new Cuenta(20000,"Mario","003","CBE3","Debito");
		Cuenta c4= new Cuenta(7000,"Miguel","004","CBE4","Debito");
		Cuenta c5= new Cuenta(1500,"Luisa","005","CBE5","Debito");
		Cuenta c6= new Cuenta(9283,"Karla","006","CBE6","Credito");
		Cuenta c7= new Cuenta(6500,"Jessica","007","CBE7","Debito");
		Cuenta c8= new Cuenta(2300,"Frida","008","CBE8","Credito");
		Cuenta c9= new Cuenta(8549,"Lucero","009","CBE9","Credito");
		Cuenta c10= new Cuenta(2800,"Carlos","010","CBE10","Credito");
		Cuenta c11= new Cuenta(50000,"Emanuel","011","CBE11","Credito");

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
		
		Cajero atm = new Cajero("Av Juarez 9800",10000.00, cuentas);
		
		List<Object> datos = atm.retirar(c1, 2000);
		
		Ticket ticket1 = (Ticket) datos.get(0);
		System.out.println(datos.get(1));
		System.out.println(ticket1);
		
		//BD
		//llamamos a la cuenta 1, por lo tanto se guarda la transaccion ya hecha
//		System.out.println(c1.getSaldoDisponible());
		
		System.out.println(atm.depositar(c1, 198000));
		//                           20000   2800 
		System.out.println(atm.transferir(c3, c10, 2000));
		
		Ticket t1 = atm.transferir(c2, c3, 1000);
		System.out.println(t1.imprime());
		
		
		
		
	}

}
