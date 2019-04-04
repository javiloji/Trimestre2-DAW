package ejercicio8;

/**
 * 
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla.
 * 
 * Contenido del main
 * Terminal t1 = new Terminal("678 11 22 33");
 * Terminal t2 = new Terminal("644 74 44 69");
 * Terminal t3 = new Terminal("622 32 89 09");
 * Terminal t4 = new Terminal("664 73 98 18");
 * System.out.println(t1);
 * System.out.println(t2);
 * t1.llama(t2, 320);
 * t1.llama(t3, 200);
 * System.out.println(t1);
 * System.out.println(t2);
 * System.out.println(t3);
 * System.out.println(t4);
 * 
 * 
 * Salida
 * Nº 678 11 22 33 - 0s de conversación
 * Nº 644 74 44 69 - 0s de conversación
 * Nº 678 11 22 33 - 520s de conversación
 * Nº 644 74 44 69 - 320s de conversación
 * Nº 622 32 89 09 - 200s de conversación
 * Nº 664 73 98 18 - 0s de conversación
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Terminal {
	
	private String numero="";
	private int tiempo=0;
	
	/**
	 * 
	 * Constructor de la clase Terminal
	 * 
	 * @param numero
	 */
	
	public Terminal(String numero) {
		
		this.numero=numero;
		
	}
	
	/**
	 * 
	 * Metodo llamar que sirve para contabilizar el tiempo de conversacion de ambos terminales, tanto el que llama como
	 * el que es llamado.
	 * 
	 * @param t
	 * @param tiempo
	 */
	
	public void llamar(Terminal t, int tiempo) {
		
		this.tiempo+=tiempo;
		t.tiempo+=tiempo;

	}
	
	@Override
	public String toString() {
		
		return "Nº " + numero +  " - " + tiempo + "s de conversación";
	}
	
	
	
	
}
