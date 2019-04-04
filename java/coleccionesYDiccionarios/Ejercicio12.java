package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
 * 4; el resto de cartas no vale nada.
 * Ejemplo:
 * as de oros
 * cinco de bastos
 * caballo de espadas
 * sota de copas
 * tres de oros
 * Tienes 26 puntos
 * 
 * @author d18lojij
 *
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> d = new HashMap<String,Integer>();
		
		ArrayList<String> baraja = new ArrayList<String>();
		
		ArrayList<String> partida = new ArrayList<String>();
		
		int puntuacion = 0;
		
		d.put("as de oros", 11 );
		d.put("dos de oros", 0 );
		d.put("tres de oros", 10);
		d.put("cuatro de oros", 0);
		d.put("cinco de oros", 0);
		d.put("seis de oros", 0);
		d.put("siete de oros", 0);
		d.put("sota de oros", 2);
		d.put("caballo de oros", 3);
		d.put("rey de oros", 4);
		d.put("as de copas", 11 );
		d.put("dos de copas", 0 );
		d.put("tres de copas", 10);
		d.put("cuatro de copas", 0);
		d.put("cinco de copas", 0);
		d.put("seis de copas", 0);
		d.put("siete de copas", 0);
		d.put("sota de copas", 2);
		d.put("caballo de copas", 3);
		d.put("rey de copas", 4);
		d.put("as de bastos", 11 );
		d.put("dos de bastos", 0 );
		d.put("tres de bastos", 10);
		d.put("cuatro de bastos", 0);
		d.put("cinco de bastos", 0);
		d.put("seis de bastos", 0);
		d.put("siete de bastos", 0);
		d.put("sota de bastos", 2);
		d.put("caballo de bastos", 3);
		d.put("rey de bastos", 4);
		d.put("as de espadas", 11 );
		d.put("dos de espadas", 0 );
		d.put("tres de espadas", 10);
		d.put("cuatro de espadas", 0);
		d.put("cinco de espadas", 0);
		d.put("seis de espadas", 0);
		d.put("siete de espadas", 0);
		d.put("sota de espadas", 2);
		d.put("caballo de espadas", 3);
		d.put("rey de espadas", 4);
		
		baraja.addAll(d.keySet());
		
		Collections.shuffle(baraja);

		System.out.println("\nBienvenido a la brisca, empecemos:\n");
		System.out.println("\nTe han salido las siguientes cartas: ");
		
		for(int i=0 ; i<5;i++) { 
			

			System.out.println(baraja.get(0));
			
			puntuacion+= d.get(baraja.get(0));
			
			
			partida.add(baraja.remove(0));
				
		}
		
		System.out.println("\nPuntuacion total: "+puntuacion);
		
		if(puntuacion==0) {
			System.out.println("\nEres un paquete, has sacado 0 puntos...");
		}
		else if(puntuacion>0 && puntuacion <=20) {
			System.out.println("\nAl menos has sacado algun punto, los hay peores.");
		}
		else{
			System.out.println("\n¡Buena puntuacion!");
		}
		
	}

}
