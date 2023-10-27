package com;

import java.util.Date;

public class Ticket {

	Date fecha;
	double montoDisponible;
	String tipoOperacion;
	int folioOperacion;
	double montoTransferido;

	public Ticket() {

	}

	public Ticket(Date fecha, double montoDisponible, String tipoOperacion, int folioOperacion) {
		this.fecha = fecha;
		this.montoDisponible = montoDisponible;
		this.tipoOperacion = tipoOperacion;
		this.folioOperacion = folioOperacion;
	}

	public Ticket(Date fecha, String tipoOperacion, int folioOperacion) {
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
		this.folioOperacion = folioOperacion;
	}

	public Ticket(Date fecha, String tipoOperacion, int folioOperacion, double montoTransferido) {
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
		this.folioOperacion = folioOperacion;
		this.montoTransferido = montoTransferido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMontoDisponible() {
		return montoDisponible;
	}

	public void setMontoDisponible(double montoDisponible) {
		this.montoDisponible = montoDisponible;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", montoDisponible=" + montoDisponible + ", tipoOperacion=" + tipoOperacion
				+ ", folioOperacion=" + folioOperacion + ", montoTransferido=" + montoTransferido + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
