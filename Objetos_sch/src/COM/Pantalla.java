package COM;

public class Pantalla {
	String resolucion;
	String tipopanel;
	double tamaño;
	int ppi;
	
	
	public Pantalla(){
		
	}


	public Pantalla(String resolucion, String tipopanel, double tamaño, int ppi) {
		super();
		this.resolucion = resolucion;
		this.tipopanel = tipopanel;
		this.tamaño = tamaño;
		this.ppi = ppi;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public String getTipopanel() {
		return tipopanel;
	}


	public void setTipopanel(String tipopanel) {
		this.tipopanel = tipopanel;
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
		return "Pantalla [resolucion=" + resolucion + ", tipopanel=" + tipopanel + ", tamaño=" + tamaño + ", ppi=" + ppi
				+ "]";
	}
	
}
