package com;

public class Cuenta {
	
	double saldoDisponible;
	String Cliente;
	String numeroCuenta;
	String Clave;
	String tipo;
	
	
	public static double SALDO_MAX = 0.0;
	public static double SALDO_MIN = 0.0;
	
	
	public Cuenta() {
		
	}

	public Cuenta(double saldoDisponible, String cliente, String numeroCuenta, String clave, String tipo) {
		this.saldoDisponible = saldoDisponible;
		this.Cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.Clave = clave;
		this.tipo = tipo;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	
	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static double getSaldoMax() {
		return SALDO_MAX;
	}

	public static double getSaldoMin() {
		return SALDO_MIN;
	}

	@Override
	public String toString() {
		return "Cuenta [saldoDisponible=" + saldoDisponible + ", Cliente=" + Cliente + ", numeroCuenta=" + numeroCuenta
				+ ", Clave=" + Clave + ", tipo=" + tipo + "]";
	}

		
}
