package com;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Cajero implements IOperaciones {

	String direccion;
	double liquidez;
	int cajeroID = 1;
	int folio = 0;

	List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Cajero() {

	}

	public Cajero(String direccion, double liquidez, int cajeroID, int folio, List<Cuenta> cuentas) {
		this.direccion = direccion;
		this.liquidez = liquidez;
		this.cajeroID = cajeroID;
		this.folio = folio;
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

	public int getCajeroID() {
		return cajeroID;
	}

	public void setCajeroID(int cajeroID) {
		this.cajeroID = cajeroID;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public Ticket depositar(Cuenta destino, double monto) {
		Ticket ticket = null;
		// Comprobamos si existe la cuenta en la lista
		if (cuentas.contains(destino)) {
			// Valida que el monto no sea mayor al maximo
			if (monto > destino.getSALDO_MAX()) {
				System.out.println("El monto excede el maximo permitido en la cuenta");
			} else if ((monto + destino.getSaldoDispnible()) > destino.getSALDO_MAX()) {
				System.out.println("El desposito excederia el maximo permitido en la cuenta");
			} else {
				destino.setSaldoDispnible(destino.getSaldoDispnible() + monto);
				ticket = new Ticket(new Date(), destino.getSaldoDispnible(), "DEPOSITO", this.folio + 1);
			}
		} else {
			System.out.println("La cuenta no existe !!");
		}
		return ticket;
	}

	@Override
	public List<Object> retirar(Cuenta origen, double monto) {
		List<Object> datos = new ArrayList<Object>();
		Ticket ticket = null;

		// Comprobamos si existe la cuenta en la lista
		if (cuentas.contains(origen)) {
			// Valida que el monto no sea mayor al saldo Disponible
			if (origen.getSaldoDispnible() < monto) {
				System.out.println("Fondos insuficientes");
			} else if ((origen.getSaldoDispnible() - monto) < origen.getSALDO_MIN()) {
				System.out.println("El retiro dejaria por debajo del mininmo permitido en la cuenta");
			} else {
				origen.setSaldoDispnible(origen.getSaldoDispnible() - monto);
				ticket = new Ticket(new Date(), origen.getSaldoDispnible(), "RETIRO", this.folio + 1);
				datos.add(ticket);
				datos.add(monto);
			}
		} else {
			System.out.println("La cuenta no existe !!");
		}
		return datos;
	}

	@Override
	public Ticket transferir(Cuenta origen, Cuenta destino, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", liquidez=" + liquidez + ", cajeroID=" + cajeroID + ", folio="
				+ folio + ", cuentas=" + cuentas + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
