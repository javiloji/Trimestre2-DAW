package primerosProgramasPOO;

/**
 * 
 * 5. Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las siguientes operaciones:
 * - Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
 * - Obtener la fracción.
 * - Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * - Obtener resultado de la fracción (número real).
 * - Multiplicar la fracción por un número.
 * - Multiplicar, sumar y restar fracciones.
 * - Simplificar la fracción.
 * 
 * @author Javier Lopera Jimenez
 *
 */

import javax.swing.JOptionPane;

public class Fraccion {

	double numerador;
	double denominador;
	
	//Constructor de Fraccion (el denominador no puede valer 0)
	
	Fraccion(double numerador,double denominador){
		
		if(denominador==0) {
			
			denominador=Double.parseDouble(JOptionPane.showInputDialog("El denominador no puede ser 0, introduce un nuevo denominador:"));
			
		}
		
		
		this.numerador=numerador;
		this.denominador=denominador;
				
	}
	
	//Getter del numerador
	
	public double getNumerador() {
		
		return this.numerador;
		
	}
	
	//Getter del denominador
	
	public double getDenominador() {
		
		return this.denominador;
	
	}
	
	//Setter del numerador
	
	private double setNumerador(double numerador) {
		
		this.numerador=numerador;
		
		return numerador;
		
	}
	
	//Setter del denominador, ademas el denominador no puede valer 0
	
	private double setDenominador(double denominador) {
		
		if(denominador==0) {

			denominador=Double.parseDouble(JOptionPane.showInputDialog("El denominador no puede ser 0, introduce un nuevo denominador:"));
		
		}
		
		
		this.denominador=denominador;
		
		return denominador;
		
	}
	
	

	public String modificarFraccion(int nuevoNumerador, int nuevoDenominador) {
		
		this.setNumerador(nuevoNumerador);
		
		this.setDenominador(nuevoDenominador);
		
		return toString();
		
		
	}
	
	public double resultadoFraccion() {
		
		double total=getNumerador()/getDenominador();
		
		return total;
		
	}
	
	public String multiplicar(double numero) {
		
		this.numerador=numerador*numero;
		
		return toString();
		
	}
	
	public Fraccion multiplicarPorFraccion(Fraccion fraccion2) {
		
		return new Fraccion(numerador*fraccion2.getNumerador(),denominador*fraccion2.getDenominador());
		
	}
		
	public Fraccion dividirPorFraccion(Fraccion fraccion2) {
		
		return new Fraccion(numerador*fraccion2.getDenominador(),denominador*fraccion2.getNumerador());
		
	}
	
/*	
	public Fraccion sumar(Fraccion denominador2) {
		
		double denominadorComun = mcm(getDenominador(),denominador2.getDenominador());
		
		resultadoNumerador= ;
		
		return ;
	}
*/
	
	public Fraccion simplifica() {
  
    double n = this.numerador;
    double d = this.denominador;
      
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(n, d);
  }

	public double mcm(double a, double b) {
		
		double denominador;
		
		if(a>b)
			denominador=a;
		else
			denominador=b;
		
		while (denominador%a!=0 || denominador%b!=0)
			denominador++;
		
		return denominador;
		
	}
	
	public Fraccion sumar(Fraccion f) {
		
		double mcm = mcm(this.denominador, f.denominador);
		
		double nuevoNumerador1 =  (mcm/this.denominador)*this.numerador;
		double nuevoNumerador2 =  (mcm/f.denominador)*f.numerador;
		double numeradorFinal = nuevoNumerador1+nuevoNumerador2;

		return new Fraccion(numeradorFinal,mcm);
	}
	
	public Fraccion restar(Fraccion f) {

		double mcm = mcm(this.denominador, f.denominador);
		
		double nuevoNumerador1 =  (mcm/this.denominador)*this.numerador;
		double nuevoNumerador2 =  (mcm/f.denominador)*f.numerador;
		double numeradorFinal = nuevoNumerador1-nuevoNumerador2;
		
		return new Fraccion(numeradorFinal,mcm);
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
	
	
	
	
}
