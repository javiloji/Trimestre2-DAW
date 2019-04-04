package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author d18lojij
 *
 */

public class Ejercicio_2 {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader lector = new BufferedReader(new FileReader("primos.dat"));
			
			
			String linea="";
			
			while(linea!=null) {
				System.out.println(linea);
				linea=lector.readLine();
			}
			lector.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}