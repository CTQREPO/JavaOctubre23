package COM;

public class Smartwatch extends Reloj{
	
	String so;
	String sensores;
	
	
	
	Pantalla pantalla; 
	//procesador
	public Smartwatch(){
		
	}



	public Smartwatch(String so, String sensores) {
		super();
		this.so = so;
		this.sensores = sensores;
	}
	


	



	public Smartwatch(String tipo, String color, String forma, String material, String mecanismo, String tama�o,
			Double precio, String so, String sensores, Pantalla pantalla) {
		super(tipo, color, forma, material, mecanismo, tama�o, precio);
		this.so = so;
		this.sensores = sensores;
		this.pantalla = pantalla;
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
	//1- metodos nativos
	
	@Override
	public String toString() {
		return "Smartwatch [so=" + so + ", sensores=" + sensores + ", pantalla=" + pantalla + ", tipo=" + tipo
				+ ", color=" + color + ", forma=" + forma + ", material=" + material + ", mecanismo=" + mecanismo
				+ ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}



	public void cronometro(int min, int seg) {
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < seg; j++) {
				System.out.println("["+i+":"+j+"]");
				
			}
			
		}
		
	}
	
	public void medirOxigeno() {
		System.out.println("95%....");
	}
	
	public void contestarllamada() {
		System.out.println("Contestar");
	}



}
