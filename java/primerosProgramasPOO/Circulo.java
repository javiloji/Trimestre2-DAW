package primerosProgramasPOO;

import javax.swing.JOptionPane;

/**
 * 
 * Crea la clase �Circulo� en Java que responda al siguiente comportamiento:
 * 
 * Un c�rculo puede crecer. Aumenta su radio.
 * Un c�rculo puede menguar. Decrementa su radio.
 * Un c�rculo me devuelve su �rea si se la pido.
 * Un c�rculo me dice su estado, por ejemplo �Soy un c�rculo de radio 0.5 metros. 
 * Ocupo un �rea de 0.7853981633974483 metros cuadrados� (m�todo toString())
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
			JOptionPane.showInputDialog("Soy un m�sero punto sin �rea.");
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
		
		return "Soy un c�rculo de " + getRadio() + " metros de radio.Ocupo un �rea de " + calcularArea() + " metros cuadrados";
		
	}
}


