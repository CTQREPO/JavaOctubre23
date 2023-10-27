package com;

public class Cuenta {

	double saldoDisponible;
	String cliente;
	String numeroCuenta;
	String clabe;
	String tipo;
	
	public static  double SALDO_MAX = 0.0;
	public static  double SALDO_MIN = 0.0;
	
	public Cuenta() {
				
	}
	
	public Cuenta(double saldoDisponible, String cliente, String numeroCuenta, String clabe, String tipo) {
		super();
		this.saldoDisponible = saldoDisponible;
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.clabe = clabe;
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

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
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
		return "Cuenta [saldoDisponible=" + saldoDisponible + ", cliente=" + cliente + ", numeroCuenta=" + numeroCuenta
				+ ", clabe=" + clabe + ", tipo=" + tipo + "]";
	}
		
	
	
}