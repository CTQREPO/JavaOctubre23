package com;

public class EjercicioObjetos {

	//detalles interiores de sala en una vivienda
	
	String suelo, paredes, colorparedes, ventanas;
	double ventanaalto, ventanalargo, recubrimiento, costoreestructura;
		
	public EjercicioObjetos() {
		
	}
	
	public EjercicioObjetos(String suelo, String paredes, String colorparedes, String ventanas, double ventanaalto,
			double ventanalargo, double recubrimiento, double costoreestructura) {
		super();
		this.suelo = suelo;
		this.paredes = paredes;
		this.colorparedes = colorparedes;
		this.ventanas = ventanas;
		this.ventanaalto = ventanaalto;
		this.ventanalargo = ventanalargo;
		this.recubrimiento = recubrimiento;
		this.costoreestructura = costoreestructura;
	}

	public String getSuelo() {
		return suelo;
	}

	public void setSuelo(String suelo) {
		this.suelo = suelo;
	}

	public String getParedes() {
		return paredes;
	}

	public void setParedes(String paredes) {
		this.paredes = paredes;
	}

	public String getColorparedes() {
		return colorparedes;
	}

	public void setColorparedes(String colorparedes) {
		this.colorparedes = colorparedes;
	}

	public String getVentanas() {
		return ventanas;
	}

	public void setVentanas(String ventanas) {
		this.ventanas = ventanas;
	}

	public double getVentanaalto() {
		return ventanaalto;
	}

	public void setVentanaalto(double ventanaalto) {
		this.ventanaalto = ventanaalto;
	}

	public double getVentanalargo() {
		return ventanalargo;
	}

	public void setVentanalargo(double ventanalargo) {
		this.ventanalargo = ventanalargo;
	}

	public double getRecubrimiento() {
		return recubrimiento;
	}

	public void setRecubrimiento(double recubrimiento) {
		this.recubrimiento = recubrimiento;
	}

	public double getCostoreestructura() {
		return costoreestructura;
	}

	public void setCostoreestructura(double costoreestructura) {
		this.costoreestructura = costoreestructura;
	}

	@Override
	public String toString() {
		return "ejercicio_objetos [suelo=" + suelo + ", paredes=" + paredes + ", colorparedes=" + colorparedes
				+ ", ventanas=" + ventanas + ", ventanaalto=" + ventanaalto + ", ventanalargo=" + ventanalargo
				+ ", recubrimiento=" + recubrimiento + ", costoreestructura=" + costoreestructura + "]";
	}
	 	
	
	
}
