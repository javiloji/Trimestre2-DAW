package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author d18lojij
 *
 */

public class ejercicio3 {

	public static void main(String[] args) {

		String nombreArchivo="palabras";
		
		System.out.println("Introduce el nombre del fichero");
		
		nombreArchivo= Teclado.nextLine();
		
		
		ArrayList<String> a = new ArrayList<>();
		
		try {
			BufferedReader lector=new BufferedReader(new FileReader(nombreArchivo+".txt"));
			
			BufferedWriter escribir = new BufferedWriter(new FileWriter(nombreArchivo+"_sort.txt"));
			

			String linea="";
			while(linea!=null) {
				
				a.add(linea);
				
				linea=lector.readLine();
			
			}
			lector.close();
			
			Collections.sort(a);
			
			for(String i:a){
				
				escribir.write(i+"");
				escribir.newLine();
			}
			escribir.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("No se ha podido leer");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("No se ha podido escribir");
		}

	}

}
