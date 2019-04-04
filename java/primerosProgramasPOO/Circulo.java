package primerosProgramasPOO;

import javax.swing.JOptionPane;

/**
 * 
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * 
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar. Decrementa su radio.
 * Un círculo me devuelve su área si se la pido.
 * Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. 
 * Ocupo un área de 0.7853981633974483 metros cuadrados” (método toString())
 * 
 *  @author Javi
 * 
 */

public class Circulo {
	
	private double radio;
	
	// Constructor del circulo 
	
	Circulo(double radio){
		
		this.radio=radio;
		
	}
	
	//getter:
	
	public double getRadio() {
		
		return this.radio;
		
	}
	
	//setter:
	
	public double setRadio(double radio) {
		if(radio<0) {
			this.radio=1;
			System.out.println("El radio debe ser mayor que 0");
		}
		
		if(radio==0) {
			JOptionPane.showInputDialog("Soy un mísero punto sin área.");
		}
		
		return this.radio=radio;
	}
	
	
	
	public double crecer() {
		
		radio+=1;
		
		return radio;
		
	}
	
	public double menguar() {
		
		if(radio>1) {
			
		radio-=1;
		
		}
		
		return radio;
		
	}
	
	public double calcularArea() {
		
		double area;
		
		area= 2*Math.PI*radio;
		
		return area;
		
	}
	
	public String mostrar() {
		
		return "Soy un círculo de " + getRadio() + " metros de radio.Ocupo un área de " + calcularArea() + " metros cuadrados";
		
	}
}


