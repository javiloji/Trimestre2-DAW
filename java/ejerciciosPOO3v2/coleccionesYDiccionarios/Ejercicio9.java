package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author d18lojij
 *
 */

public class Ejercicio9 {

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
		int i = 0;
		for(Carta carta:montonDescarte) {
			for(Carta carta1:montonDescarte) {
			
				System.out.println(montonDescarte.get(i).getFigura());
			System.out.println(montonDescarte.get(i).getPalo());
			
			i++;
			}
		}
		for(Carta carta:montonDescarte) {
				
			System.out.println(carta);
				
		}
		
	
		
	}

}
