package coleccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Crea un mini-d espa�ol-ingl�s que contenga, al menos, 20 palabras
 * (con su correspondiente traducci�n). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedir� una palabra en espa�ol
 * y dar� la correspondiente traducci�n en ingl�s.
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Ejercicio10 {
	public static void main(String[] args) throws RespuestaNoExisteException {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> d = new HashMap<String, String>();

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
		d.put("rat�n", "mouse");
		d.put("tel�fono", "phone");
		d.put("piso", "flat");
		d.put("naranja", "oranje");
		d.put("lim�n", "lemon");
		d.put("cerdo", "porc");
		d.put("gallina", "chiken");
		d.put("chocolate", "chocolate");
		d.put("miel", "honey");
		
		
		System.out.println("Introduzca la palabra que desea traducir.");
		
		String respuesta = sc.nextLine();
		
		try {
			
			traducir(d, respuesta);
		}
		catch(RespuestaNoExisteException e){
			System.err.println(e.getMessage());
		}
			
	}

	private static void traducir(HashMap<String, String> d, String respuesta) throws RespuestaNoExisteException {
		if(d.containsKey(respuesta)) {
			System.out.println("La traduccion es: " + d.get(respuesta));
		}
		else {
			throw new RespuestaNoExisteException("Esta palabra no existe en el diccionario.");
		}
	}

}
