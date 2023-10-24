package com;

public class smartwatch  extends Reloj{
	
	super();
	public smartwatch(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio, String so, String sensores, Pantalla pantalla) {
		super(tipo, color, forma, material, mecanismo, tamaño, precio);
		this.so = so;
		this.sensores = sensores;
		this.pantalla = pantalla;
	}
	String so;
	String sensores;
	
	Pantalla pantalla;
	
	
	
		
		



	public smartwatch(String color, String mecanismo, String so, String sensores, Pantalla pantalla) {
		super(color, mecanismo);
		this.so = so;
		this.sensores = sensores;
		this.pantalla = pantalla;
	}
	public smartwatch(String color, String mecanismo, String so, String sensores) {
		super(color, mecanismo);
		this.so = so;
		this.sensores = sensores;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public String getSensores() {
		return sensores;
	}
	public void setSensores(String sensores) {
		this.sensores = sensores;
	}
	@Override
	public String toString() {
		return "smartwatch [so=" + so + ", sensores=" + sensores + "]";
	}
	