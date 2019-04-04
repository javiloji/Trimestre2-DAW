package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
 * del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 *
 * @author d18lojij
 *
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> d = new HashMap<String, String>();

		ArrayList <String> claves = new ArrayList<>();
		
		ArrayList <String> clavesAleatorias = new ArrayList<>();
		
		int aciertos = 0;
		
		int fallos = 0;
		
		d.put("casa", "house");
		d.put("coche", "car");
		d.put("llave", "key");
		d.put("rojo", "red");
		d.put("azul", "blue");
		d.put("negro", "black");
		d.put("amarillo", "yellow");
		d.put("ordenador", "computer");
		d.put("bicicleta", "bike");
		d.put("mesa", "table");
		d.put("ratón", "mouse");
		d.put("teléfono", "phone");
		d.put("piso", "flat");
		d.put("naranja", "oranje");
		d.put("limón", "lemon");
		d.put("cerdo", "porc");
		d.put("gallina", "chiken");
		d.put("chocolate", "chocolate");
		d.put("miel", "honey");

		claves.addAll(d.keySet());
		
		Collections.shuffle(claves);
		
		for(int i=0;i<5;i++) {
			clavesAleatorias.add(claves.remove(0));
		}
		
		for(String i : clavesAleatorias) {
			String respuesta = "";
			System.out.println("Introduzca la traduccion de "+ i );
			respuesta = Teclado.nextLine();
			
			if(respuesta.contains(d.get(i))) {
				aciertos++;
			}
			else {
				fallos++;
			}
		}
		
		System.out.println("Has acertado " + aciertos + " palabras.");
		
		System.out.println("Has fallado " + fallos + " palabras.");
		
	}

}
