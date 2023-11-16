package COM;

import java.util.Date;

public class Ticket {
	Date fecha;
	double MontoDis;
	String tipoOperacion;
	int cajeroId;
	int folioOperacion;
	double montoTransferido;
	
	
	public Ticket() {
		
	}



	public Ticket(Date fecha, double montoDis, String tipoOperacion, int cajeroId, int folioOperacion) {
		super();
		this.fecha = fecha;
		MontoDis = montoDis;
		this.tipoOperacion = tipoOperacion;
		this.cajeroId = cajeroId;
		this.folioOperacion = folioOperacion;
	}
	
	public Ticket(Date fecha, String tipoOperacion, int cajeroId, int folioOperacion, double montoTransferido) {
		super();
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
		this.cajeroId = cajeroId;
		this.folioOperacion = folioOperacion;
		this.montoTransferido = montoTransferido;
		
	}
	



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public double getMontoDis() {
		return MontoDis;
	}



	public void setMontoDis(double montoDis) {
		MontoDis = montoDis;
	}



	public String getTipoOperacion() {
		return tipoOperacion;
	}



	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}



	public int getCajeroId() {
		return cajeroId;
	}



	public void setCajeroId(int cajeroId) {
		this.cajeroId = cajeroId;
	}



	public int getFolioOperacion() {
		return folioOperacion;
	}



	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}



	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", MontoDis=" + MontoDis + ", tipoOperacion=" + tipoOperacion + ", cajeroId="
				+ cajeroId + ", folioOperacion=" + folioOperacion + ", montoTransferido=" + montoTransferido + "]";
	}
	
	public String imprime() {
		return "Ticket [fecha=" + fecha + ", tipoOperacion=" + tipoOperacion + ", cajeroId="
				+ cajeroId + ", folioOperacion=" + folioOperacion + ", montoTransferido=" + montoTransferido + "]";
	}



	
	
	
}
