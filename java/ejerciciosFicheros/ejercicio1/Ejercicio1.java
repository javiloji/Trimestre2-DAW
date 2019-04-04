package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author d18lojij
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		try {

			BufferedWriter escribir = new BufferedWriter(new FileWriter("primos.dat"));

			for (int i = 0; i <= 500; i++) {
				if (esPrimo(i)) {
					escribir.write(i+"\n");
				}
			}

			escribir.close();

		} catch (IOException e) {

			System.err.println("No se ha podido crear el archivo");

		}

	}

	public static boolean esPrimo(int num) {

		boolean primo = true;

		if (num <= 1) {
			primo = false;
			return primo;
		} else if (num == 2) {
			primo = true;
		} else {
			for (int i = 2; i < num; i++) {
				if ((num % i) == 0) {
					primo = false;
					return primo;
				}

			}
		}

		return primo;
	}

}
