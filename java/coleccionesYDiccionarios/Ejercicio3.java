package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author d18lojij
 *
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Introduce el numero " + i);
			
			int n = Teclado.nextInt();
			
			a.add(n);
			
		}
		
		a.sort(null);
		
		System.out.println(a);
		
	}
}
