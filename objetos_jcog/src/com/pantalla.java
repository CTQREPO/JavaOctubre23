package com;

public class pantalla {

	String resolucion;
	String panel;
	double tamaño;
	int ppi;
	
	public pantalla() {
		
	}

	public pantalla(String resolucion, String panel, double tamaño, int ppi) {
		super();
		this.resolucion = resolucion;
		this.panel = panel;
		this.tamaño = tamaño;
		this.ppi = ppi;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
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
		return "pantalla [resolucion=" + resolucion + ", panel=" + panel + ", tamaño=" + tamaño + ", ppi=" + ppi + "]";
	}
	
	
	
	
}
