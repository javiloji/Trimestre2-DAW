package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import utiles.Teclado;

/**
 * 
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author d18lojij
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String fichero = null;
		
		ArrayList<String> a = new ArrayList<>();
		
		System.out.println("Introduce el nombre del fichero");
		
		try {
			fichero= Teclado.leerCadena();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		System.out.println("Que palabra quieres buscar.");
		
		String palabra = null;
		try {
			palabra = Teclado.leerCadena();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int contador = 0;
		
		String finalfichero="";
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(fichero+".txt"));
			
			String linea="";
			while(linea!=null) {
				finalfichero=linea;
				linea=lector.readLine();
				if(finalfichero.equals(palabra)) {
					contador++;
				}
			}
			lector.close();
			/*
			for(String i:a) {
				if(a.equals(i)) {
					contador++;
				}	
			}
			*/
			System.out.println("La palabra "+palabra+" tiene "+contador +" ocurrencias.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
