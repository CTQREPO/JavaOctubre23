package com;

public class Pantalla {
	String resolucion;
	String tipoPanel;
	double tamaño;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(String resolucion, String tipoPanel, double tamaño, int ppi) {
		super();
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
		this.tamaño = tamaño;
		this.ppi = ppi;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTipoPanel() {
		return tipoPanel;
	}

	public void setTipoPanel(String tipoPanel) {
		this.tipoPanel = tipoPanel;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tipoPanel=" + tipoPanel + ", tamaño=" + tamaño + ", ppi=" + ppi
				+ "]";
	}
	
	
}
