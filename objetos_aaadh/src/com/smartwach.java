package com;

public class smartwach extends Reloj {

	String sistemaoperativo;
	String sensores;

	pantalla Pantalla;
//	procesador 
	public smartwach() {

	}

	public smartwach(String sistemaoperativo, String sensores) {
		super();
		this.sistemaoperativo = sistemaoperativo;
		this.sensores = sensores;
	}

	// Esto es el segundo constructor 

	public smartwach(String tipo, String color, String forma, String material, String mecanismo, String tamaño,
			double precio, String sistemaoperativo, String sensores, pantalla pantalla) {
		super(tipo, color, forma, material, mecanismo, tamaño, precio);
		this.sistemaoperativo = sistemaoperativo;
		this.sensores = sensores;
		Pantalla = pantalla;

	}

	public String getSistemaoperativo() {
		return sistemaoperativo;
	}

	public void setSistemaoperativo(String sistemaoperativo) {
		this.sistemaoperativo = sistemaoperativo;
	}

	public String getSensores() {
		return sensores;
	}

	public void setSensores(String sensores) {
		this.sensores = sensores;
	}


	@Override
	public String toString() {
		return "smartwach [sistemaoperativo=" + sistemaoperativo + ", sensores=" + sensores + ", Pantalla=" + Pantalla
				+ ", tipo=" + tipo + ", color=" + color + ", forma=" + forma + ", material=" + material + ", mecanismo="
				+ mecanismo + ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}

	//Comportamiento
	//1- Metodos nativos
	
	public void cronometro (int min, int seg) {
		for (int i=0;i<min; i++) {
			for (int j=0;j<seg; j++) {	
				System.out.println("["+i+":"+j+"]");
			
			}
		}
		
	}
	public void medirOxigeno() {
		System.out.println("95%....");
	}
	public void contestarLLamadas() {
		System.out.println("Contestar");
	}
}
