package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cajero implements IOperaciones {

	String direccion;
	double liquidez;
	int folio = 0;

	// Simula ser una db
	List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Cajero() {

	}

	public Cajero(String direccion, double liquidez, List<Cuenta> cuentas) {
		super();
		this.direccion = direccion;
		this.liquidez = liquidez;
		this.cuentas = cuentas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLiquidez() {
		return liquidez;
	}

	public void setLiquidez(double liquidez) {
		this.liquidez = liquidez;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", liquidez=" + liquidez + ", cuentas=" + cuentas + "]";
	}

	// Comportamiento

	@Override 
	 public Ticket depositar(Cuenta destino, double monto) { 
	   
	  Ticket ticket = null;   
	  //Comprobamos si existe la cuenta en la lista   
	  if(cuentas.contains(destino)) {    
	   //Valida que el monto no sea mayor al maximo 
	   if(monto>destino.getSALDO_MAX()) { 
	    System.out.println("El monto excede el maximo permitido en la cuenta"); 
	   }else if(  (monto + destino.getSaldoDisponible())>destino.getSALDO_MAX()   ) { 
	    System.out.println("El desposito excederia el maximo permitido en la cuenta"); 
	   }else { 
	    destino.setSaldoDisponible(destino.getSaldoDisponible() + monto); 
	    ticket = new Ticket(new Date(),destino.getSaldoDisponible(), 
	      "DEPOSITO", 1, folio+1); 
	   }    
	  }else { 
	   System.out.println("La cuenta no existe !!"); 
	  } 
	  return ticket; 
	 } 
	 
	 @Override 
	 public List<Object> retirar(Cuenta origen, double monto) { 
	  List<Object> datos = new ArrayList<Object>(); 
	  Ticket ticket = null; 
	   
	  //Comprobamos si existe la cuenta en la lista   
	  if(cuentas.contains(origen)) {    
	   //Valida que el monto no sea mayor al saldo Disponible 
	   if(origen.getSaldoDisponible()<monto) { 
	    System.out.println("Fondos insuficientes"); 
	   }else if(  (origen.getSaldoDisponible()-monto)<origen.getSALDO_MIN()   ) { 
	    System.out.println("El retiro dejaria por debajo del mininmo permitido en la cuenta"); 
	   }else { 
	    origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);     
	    ticket = new Ticket(new Date(),origen.getSaldoDisponible(), 
	      "RETIRO", 1, folio+1); 
	    datos.add(ticket); 
	    datos.add(monto); 
	   }    
	  }else { 
	   System.out.println("La cuenta no existe !!"); 
	  } 
	  return datos; 
	   
	 }

	@Override
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {

		Ticket ticket = null;
		// Verificar si la cuenta Origen existe
		if (cuentas.contains(origen)) {

			// Verificar si la cuenta Destino existe
			if (cuentas.contains(destino)) {

				// Validar que el monto no sea mayor a lo disponible en la cuenta origen
				if (origen.getSaldoDisponible() < monto) {
					System.out.println("Fondos insuficientes");
					// Validar que la cuenta origen no se quede por debajo del minimo
				} else if ((origen.getSaldoDisponible() - monto) < origen.getSALDO_MIN()) {
					System.out.println("La transferencia dejaria por debajo del minimo de saldo a la cuenta origen");
					// Validar que el monto a transferir no exceda el saldo maximo de la cuenta
					// destino
				} else if (destino.getSALDO_MAX() < monto) {
					System.out.println("El monto de la transferencia rebasa el saldo maximo permitido en la cuenta");
					// Validar que la transferencia y el saldo actual no rebasen el saldo maximo de
					// la cuenta destino
				} else if ((destino.getSaldoDisponible() + monto) > destino.getSALDO_MAX()) {
					System.out.println("La transferencia superaria el saldo maximo de la cuenta");
					// Realizar la transferencia
				} else {
					origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
					destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
					ticket = new Ticket(new Date(), "TRANSFERENCIA", 1, this.folio=folio + 1,monto);
				}

			} else {
				System.out.println("La cuenta destino no existe");
			}
		} else {
			System.out.println("La cuenta de origen no existe");
		}

		return ticket;
	}

	// retirar
	// depositar
	// transferir
}
