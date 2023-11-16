package COM;

public class Motos {
	String color, tipo, marca, modelo, estado;
	int cilindrada;
	Double precio;
	
	
	public Motos() {
		
	}
	
	public Motos(String marca, Double precio) {
		this.marca = marca;
		this.precio = precio;
		
	}

	public Motos(String color, String tipo, String marca, String modelo, String estado, int cilindrada, Double precio) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Motos [color=" + color + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", estado="
				+ estado + ", cilindrada=" + cilindrada + ", precio=" + precio + "]";
	}
	
	public String seguro(){
		
		return"Todas tienen seguro, seguro te partes tu madre";
	}


	
}
