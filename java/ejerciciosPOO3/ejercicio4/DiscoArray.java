package ejercicio4;

import java.util.ArrayList;


public class DiscoArray {

	//atributos
	private String codigo = "";
	private String autor = "";
	private String titulo = "";
	private String genero = "";
	private int duracion = 0;
	
	/**
	 * @return the duración
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	
	
	
	public DiscoArray(String autor, String titulo, String genero, int duracion) {
		setAutor(autor);
		setTitulo(titulo);
		setGenero(genero);
		setDuracion(duracion);
		
		
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Autor: " + getAutor()+
					 "\nTítulo: " + getTitulo()+
					 "\nGénero: " + getGenero()+
					 "\nDuración: " + getDuracion()+
					 "\n------------------------------------------"
					 ;
	}
	
	
  }
