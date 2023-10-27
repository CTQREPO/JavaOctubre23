package com;

public class Cuenta {
	
	double saldoDisponible;
	String cliente;
	String Numerodecuenta;
	String clave;
	String tipo;
	public static  double SALDO_MAX = 0.0;
	public static  double SALDO_MIN =0.0;
	
	
	
	public Cuenta () {
		
	}
	
	public Cuenta(double saldoDisponible, String cliente, String numerodecuenta, String clave, String tipo) {
		super();
		this.saldoDisponible = saldoDisponible;
		this.cliente = cliente;
		Numerodecuenta = numerodecuenta;
		this.clave = clave;
		this.tipo = tipo;
	}



	public double getSaldoDisponible() {
		return saldoDisponible;
	}



	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public String getNumerodecuenta() {
		return Numerodecuenta;
	}



	public void setNumerodecuenta(String numerodecuenta) {
		Numerodecuenta = numerodecuenta;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public static double getSALDO_MAX() {
		return SALDO_MAX;
	}



	public static void setSALDO_MAX(double sALDO_MAX) {
		SALDO_MAX = sALDO_MAX;
	}



	public static double getSALDO_MIN() {
		return SALDO_MIN;
	}



	public static void setSALDO_MIN(double sALDO_MIN) {
		SALDO_MIN = sALDO_MIN;
	}



	@Override
	public String toString() {
		return "Cuenta [saldoDisponible=" + saldoDisponible + ", cliente=" + cliente + ", Numerodecuenta="
				+ Numerodecuenta + ", clave=" + clave + ", tipo=" + tipo + "]";
	}


}
