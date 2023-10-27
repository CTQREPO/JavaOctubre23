package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cajero implements IOperaciones {
	
	String direccion;
	double liquidez;
	int folio = 0;
	
	List < Cuenta > cuentas = new ArrayList <Cuenta>();
	
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

	//Comportamiento
	
	@Override
	public Ticket depositar(Cuenta destino, double monto) {
		
		Ticket ticket = null;
		
		if (cuentas.contains(destino)) {
			if (monto > Cuenta.getSALDO_MAX()) {
				System.out.println("El monto excede el máximo permitido en la cuenta");
				
			}else if ((monto +  destino.getSaldoDisponible() )> Cuenta.getSALDO_MAX()){
				
				System.out.println("El depósito excedería el máximo permitido en la cuenta");
			}else {
				destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
				
				ticket = new Ticket(new Date(), destino.getSaldoDisponible(), 
						"Depositar a cuenta", 1, this.folio = folio +1,monto);
				System.out.println("Movimiento exitoso");

			}
		}else {
			System.out.println("La cuenta no existe");
		}
		return ticket;//destino.getSaldoDisponible();
	}

	@Override
	public List<Object> retirar(Cuenta origen, double monto) {
		
		List<Object> datos = new ArrayList<Object>();
		
		Ticket ticket = null;
		
		if (cuentas.contains(origen)) {
			if (origen.getSaldoDisponible()<monto) {
				System.out.println("El monto excede el saldo disponible");
				
			}else if ((origen.getSaldoDisponible() - monto )< Cuenta.getSALDO_MIN()){
				
				System.out.println("El retiro ocasiona un saldo mínimo menor al saldo mínimo");
			}else {
				origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
				
				ticket = new Ticket(new Date(), origen.getSaldoDisponible(), 
						"Retiro de cuenta", 1, this.folio = folio + 1,monto);
				System.out.println("Movimiento exitoso");

				datos.add(ticket);
				datos.add(monto);
			}
		}else {
			System.out.println("La cuenta no existe");
		}
		
		return datos;
	}


	@Override
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {

		Ticket ticket = null;
		
		//Verifica existencia de ambas cuentas
		if (cuentas.contains(origen)) {
			if (cuentas.contains(destino)) {
				
				//Comprueba saldos mínimos y máximos de las cuentas
				
				if (origen.getSaldoDisponible()<monto) {
					System.out.println("El monto excede el saldo disponible en la cuenta de origen");
					
				}else if ((origen.getSaldoDisponible() - monto )< Cuenta.getSALDO_MIN()){
					
					System.out.println("El retiro ocasiona un saldo mínimo menor al saldo mínimo para la cuenta de origen");
					
				}else if (monto > Cuenta.getSALDO_MAX()) {
					System.out.println("El monto excede el máximo permitido en la cuenta");
					
				}else if ((monto +  destino.getSaldoDisponible() )> Cuenta.getSALDO_MAX()){
					
					System.out.println("El depósito excedería el máximo permitido en la cuenta");
				}else {
					//Se resta el monto a la cuenta de origen
					origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
					//Se suma el monto a la cuenta de destino
					destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);

					//Se genera el ticket
					ticket = new Ticket(new Date(), origen.getSaldoDisponible() ,"Depósito a cuenta" , 1, this.folio = folio+1,monto);
					System.out.println("Movimiento exitoso");
				}
				
				
			}else {
				System.out.println("La cuenta de destino no existe");
			}
		}else {
			System.out.println("La cuenta de origen no existe");
		}
		
		return ticket;
	}
	
}
