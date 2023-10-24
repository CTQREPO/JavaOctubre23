package com;

public class Smartwatch extends Reloj {
	
	String so;
	String sensores;
	
	
	Pantalla p1;
	//Procesador
	
	public Smartwatch() {
		
	}


	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}
	
	public Smartwatch(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio, String so, String sensores, Pantalla p1) {
		super(tipo, color, forma, material, mecanismo, tamaño, precio);
		this.so = so;
		this.sensores = sensores;
		this.p1 = p1;
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
	
	//Comportamiento
	// 1 - Metodos nativos
	
	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", p1=" + p1 + ", tipo=" + tipo + ", color=" + color
				+ ", material=" + material + ", forma=" + forma + ", mecanismo=" + mecanismo + ", tamaño=" + tamaño
				+ ", precio=" + precio + "]";
	}


	public void cronometro(int min, int seg) {
		
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++){
				System.out.println("[ "+i+":"+j+"]");
			}
		}
	}
	
	public void medirOxigeno() {
		System.out.println("95%...");
	}
	
	public void contestarLlamada() {
		System.out.println("");
	}
	
	
	
}
