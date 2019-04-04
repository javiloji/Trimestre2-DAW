package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		
		ArrayList<Carta> baraja= new ArrayList<Carta>();
		
		ArrayList<Carta> montonDescarte= new ArrayList<Carta>();
		
		for(Figura figura: Figura.values()) {
			for(Palo palo: Palo.values()) {
				
				baraja.add(new Carta(figura,palo));
				
			}
		}
		
		Collections.shuffle(baraja);
		
		
		for(int i=0;i<10;i++) {
			
			montonDescarte.add(baraja.remove(0));
			
		}
		
		for(Carta carta:montonDescarte) {
			
			System.out.println(carta);
			
		}
		
	}
}
