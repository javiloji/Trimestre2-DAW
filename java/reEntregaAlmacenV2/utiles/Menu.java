package utiles;

import java.io.IOException;

/**
 * Clase Menu que permite crear objetos de tipo menu para varios programas
 * 
 * @author Javier Lopera Jimenez
 */

public class Menu {

	/**
	 * T�tulo del men�
	 */
	private String titulo;
	/**
	 * Opciones del men�
	 */
	private String[] opciones;
	/**
	 * El n�mero de opciones en total, incluyendo la opci�n Salir a�adida.
	 */
	private int numOpciones;
	/**
	 * La opci�n Salir a�adida.
	 */
	private int salir;

	public Menu(String titulo, String[] opciones) {
		setNumOpciones(opciones.length + 1);
		setTitulo(titulo);
		setOpciones(opciones);
		this.salir = getNumOpciones();
	}

	private int getNumOpciones() {
		return numOpciones;
	}

	private void setNumOpciones(int numOpciones) {
		this.numOpciones = numOpciones;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private void setOpciones(String[] opciones) {
		this.opciones = new String[numOpciones];

		for (int i = 0; i < numOpciones - 1; i++)
			this.opciones[i] = (i + 1) + ".- " + opciones[i];

		this.opciones[numOpciones - 1] = numOpciones + ".- Salir";
	}

	private void mostrar() {
		System.out.println("\n****************************************");
		System.out.println(titulo);
		System.out.println("****************************************");
		for (int i = 0; i < numOpciones; i++) {
			System.out.println(opciones[i]);
		}
	}

	private int recogerOpcion() throws NumberFormatException, IOException {
		int opcion;
		do {
			opcion = Teclado.leerEntero("Dame una opción válida: ");
		} while (!opcionValida(opcion));
		return opcion;
	}

	public int gestionar() throws NumberFormatException, IOException {
		mostrar();
		return recogerOpcion();
	}

	private boolean opcionValida(int opcion) {
		return (opcion > 0 && opcion <= numOpciones);// ?true:false;
	}

	public int getSalir() {//
		return salir;
	}

}