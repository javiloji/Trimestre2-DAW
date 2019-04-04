package coleccionesYDiccionarios;

import java.util.ArrayList;

/**
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		
		/**
		 * Creamos e inicializamos el arraylist a, que sera un arraylist de enteros.
		 */
		
		ArrayList <Integer> a = new ArrayList <Integer>();
		
		/**
		 * Creamos e inicializamos la variable tam, que sera el numero de enteros que contendrá
		 * el arraylist, a continuación creamos un bucle for para rellenar el arraylist.
		 */
		
		int tam = (int)(Math.random()*10 + 11);
		
		for (int i=0;i<tam;i++) {

			int n=(int) (Math.random()*100);
			
			a.add(n);
			
		}
		
		/**
		 * Mostramos el arraylist.
		 */
		
		System.out.print("Mi ArrayList: ");
		
		System.out.println(a);
		
		
	}
	
	
}
