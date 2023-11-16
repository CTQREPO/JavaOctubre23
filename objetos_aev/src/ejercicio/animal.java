package ejercicio;

public class animal {
	
	String nombre, tipo_de_animal, clasificacion, tama�o, color;
	
	public animal() {
		
	}
	
	public animal(String nombre, String tipo_de_animal, String clasificacion, String tama�o) {
		this.nombre = nombre;
		this.tipo_de_animal = tipo_de_animal;
		this.clasificacion = clasificacion;
		this.tama�o = tama�o;
	}

	public animal(String nombre, String tipo_de_animal, String clasificacion, String tama�o, String color) {
		super();
		this.nombre = nombre;
		this.tipo_de_animal = tipo_de_animal;
		this.clasificacion = clasificacion;
		this.tama�o = tama�o;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_de_animal() {
		return tipo_de_animal;
	}

	public void setTipo_de_animal(String tipo_de_animal) {
		this.tipo_de_animal = tipo_de_animal;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "animal [nombre=" + nombre + ", tipo_de_animal=" + tipo_de_animal + ", clasificacion=" + clasificacion
				+ ", tama�o=" + tama�o + ", color=" + color + "]";
	}
	
	public String consultarAnimal() {
		
		return "El animal es: " +getNombre()+","+getTipo_de_animal();
		
	}
	
	

}
