package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import ejercicio3.Teclado;

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
		
		String fichero;
		
		ArrayList<String> a = new ArrayList<>();
		
		System.out.println("Introduce el nombre del fichero");
		
		fichero= Teclado.nextLine();
		
		System.out.println("Que palabra quieres buscar.");
		
		String palabra = Teclado.nextLine();
		
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
