package model;

public class Dicas {
	String titulo, subTitulo, autor, dica;
	
		
	
	public Dicas() {
		super();
	}
	
	public Dicas(String titulo, String subTitulo, String autor, String dica) {
		super();
		this.titulo = titulo;
		this.subTitulo = subTitulo;
		this.autor = autor;
		this.dica = dica;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubTitulo() {
		return subTitulo;
	}
	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}

	@Override
	public String toString() {
		return "Dicas [titulo=" + titulo + ", subTitulo=" + subTitulo + ", autor=" + autor + ", dica="
				+ dica + "]";
	}
	
	
}
