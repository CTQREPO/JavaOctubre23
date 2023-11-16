package com;

public class Series {
	
	String titulo,genero,idioma;
	float duracion;
	
	public Series() {
		
	}
	
	public Series(String titulo,String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}
	public Series(String titulo, String genero, String idioma, float duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.idioma = idioma;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Series [titulo=" + titulo + ", genero=" + genero + ", idioma=" + idioma + ", duracion=" + duracion
				+ "]";
	}
	
	
	
	

}
