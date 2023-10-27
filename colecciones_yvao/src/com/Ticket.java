package com;

import java.util.Date;

public class Ticket {

	Date Fecha;
	double MontoDisponible;
	String TipoOperacion;
	int CajeroId;
	int FolioOperacion;
	double montoTransferido;
	
	public Ticket() {
		
	}

	public Ticket(Date fecha, double montoDisponible, String tipoOperacion, int cajeroId, int folioOperacion) {
		super();
		this.Fecha = fecha;
		this.MontoDisponible = montoDisponible;
		this.TipoOperacion = tipoOperacion;
		this.CajeroId = cajeroId;
		this.FolioOperacion = folioOperacion;
	}

	public Ticket(Date fecha, String tipoOperacion, int cajeroId, int folioOperacion, double montoTransferido) {
		super();
		this.Fecha = fecha;
		this.TipoOperacion = tipoOperacion;
		this.CajeroId = cajeroId;
		this.FolioOperacion = folioOperacion;
		this.montoTransferido=montoTransferido;
		
	}
	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public double getMontoDisponible() {
		return MontoDisponible;
	}

	public void setMontoDisponible(double montoDisponible) {
		MontoDisponible = montoDisponible;
	}

	public String getTipoOperacion() {
		return TipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		TipoOperacion = tipoOperacion;
	}

	public int getCajeroId() {
		return CajeroId;
	}

	public void setCajeroId(int cajeroId) {
		CajeroId = cajeroId;
	}

	public int getFolioOperacion() {
		return FolioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		FolioOperacion = folioOperacion;
	}

	@Override
	public String toString() {
		return "Ticket [Fecha=" + Fecha + ", MontoDisponible=" + MontoDisponible + ", TipoOperacion=" + TipoOperacion
				+ ", CajeroId=" + CajeroId + ", FolioOperacion=" + FolioOperacion + ", montoTransferido="
				+ montoTransferido + "]";
	}
	
	
}
