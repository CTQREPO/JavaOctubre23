package ejercicio;

public class animal {
	
	String nombre, tipo_de_animal, clasificacion, tamaño, color;
	
	public animal() {
		
	}
	
	public animal(String nombre, String tipo_de_animal, String clasificacion, String tamaño) {
		this.nombre = nombre;
		this.tipo_de_animal = tipo_de_animal;
		this.clasificacion = clasificacion;
		this.tamaño = tamaño;
	}

	public animal(String nombre, String tipo_de_animal, String clasificacion, String tamaño, String color) {
		super();
		this.nombre = nombre;
		this.tipo_de_animal = tipo_de_animal;
		this.clasificacion = clasificacion;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
				+ ", tamaño=" + tamaño + ", color=" + color + "]";
	}
	
	public String consultarAnimal() {
		
		return "El animal es: " +getNombre()+","+getTipo_de_animal();
		
	}
	
	

}
