package com;

public class Smartwatch extends Relog {

	String so, sensores;

	Pantalla p1;

	public Smartwatch() {

	}

	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}

	public Smartwatch(String tipo, String color, String forma, String mecanismo, String tamaño, double precio,
			String so, String sensores, Pantalla p1) {
		super(tipo, color, forma, mecanismo, tamaño, precio);
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

	/*
	 * Metodos nativos
	 */

	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", p1=" + p1 + ", tipo=" + tipo + ", color=" + color
				+ ", forma=" + forma + ", mecanismo=" + mecanismo + ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}

	public void cronometro(int min, int seg) {

		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++) {
				System.out.println("[" + i + ":" + j + "]");
			}
		}

	}

	public void medirOxigeno() {

		System.out.println("95%...");

	}
}
