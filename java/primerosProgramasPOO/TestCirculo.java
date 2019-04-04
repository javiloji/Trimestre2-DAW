package primerosProgramasPOO;

/**
 * 
 * Crea una clase TestCirculo que cree una instancia de “Circulo”, 
 * muestre su estado, lo haga crecer 27 veces, averigüe su área, 
 * lo haga decrecer 10 veces y muestre su estado final.
 * 
 * @author Javi
 *
 */

public class TestCirculo {

	public static void main(String[] args) {
		
		Circulo c= new Circulo(5);
		
		c.setRadio(2);
		
		System.out.println(c.mostrar());
		
		for(int i=0;i<27;i++) {
			c.crecer();
		}
		
		System.out.println("El area ahora es de : " + c.calcularArea() + " metros.");
		
		for(int i=0;i<10;i++) {
			c.menguar();
		}
		
		System.out.println(c.mostrar());		
		
	}

}
