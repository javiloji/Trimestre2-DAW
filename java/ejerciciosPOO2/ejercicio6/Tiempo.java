package ejercicio6;

/**
 * 
 * Crea la clase Tiempo con los m�todos suma y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se 
 * crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los par�metros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el m�todo toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado deber�a ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * 
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Tiempo {

	int horas;
	int minutos;
	int segundos;
	
	/**
	 * 
	 * Constructor de la clase Tiempo.
	 * 
	 * @param horas
	 * @param minutos
	 * @param segundos
	 */

	public Tiempo(int horas,int minutos,int segundos) {
		
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;		
		
	}
	
	/**
	 * 
	 * Getters de la clase tiempo.
	 * 
	 * @return
	 */
	
	public int getHoras() {
		return horas;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	/**
	 * 
	 * Metodo sumar, suma dos objetos tiempo.
	 * 
	 * @param t
	 */
	
	public void sumar(Tiempo t) {
		
		horas=horas+t.horas;
		minutos=minutos+t.minutos;
		segundos=segundos+t.segundos;
			
		if(segundos>=60) {
			minutos+=1;
			segundos-=60;
		}
		
		if(minutos>=60) {
			horas+=1;
			minutos-=60;
		}
		
	}
	
	/**
	 * 
	 * M�todo restar , resta dos objetos tiempo.
	 * 
	 * @param t
	 */
	
	public void restar(Tiempo t) {
			
			horas=horas-t.horas;
			minutos=minutos-t.minutos;
			segundos=segundos-t.segundos;
				
			if(segundos<=0) {
				minutos-=1;
				segundos+=60;
			}
			
			if(minutos<=0) {
				horas-=1;
				minutos+=60;
			}
			
		}
	
	@Override
	public String toString() {
		
		String cadena= getHoras() + "h " + getMinutos() + "m " + getSegundos() + "s";
		
		return cadena;
		
	}
	
}
