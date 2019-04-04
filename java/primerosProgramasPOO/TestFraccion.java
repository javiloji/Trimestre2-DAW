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

public class TestFraccion {

	public static void main(String[] args) {
		
		Fraccion f = new Fraccion(2.5,3);
		
		System.out.println("La fraccion inicial es: " + f + "\n");
		System.out.println("Resultado de la fraccion: " + f.resultadoFraccion()+ "\n");
		f.modificarFraccion(2, 5);
		System.out.println("Modificamos la fraccion: " + f+ "\n");
		System.out.println("Obtenemos el numerador: " + f.getNumerador()+ "\n");
		System.out.println("Obtenemos el denominador: " + f.getDenominador()+ "\n");
		System.out.println("Resultado de la nueva fraccion: " + f.resultadoFraccion()+ "\n");
		System.out.println("Multiplicamos la fraccion por 8: " + f.multiplicar(8)+ "\n");
		System.out.println(f);
		
		Fraccion c= new Fraccion(3,4);
		Fraccion producto = f.multiplicarPorFraccion(c);
		System.out.println("La fraccion producto de multiplicar las fracciones es: " + producto+ "\n");
		System.out.println("Fraccion simplificada: " + f.simplifica());
		
		System.out.println(c.mcm(10, 6));
		System.out.println(f);
		System.out.println(c);
		Fraccion suma=f.sumar(c);
		System.out.println("La fraccion resultante de la suma es: " + suma);
		Fraccion resta=f.restar(c);
		System.out.println("La fraccion resultante de la suma es: " + resta);
	}

}
