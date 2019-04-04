package ejercicio8;

/**
 * 
 * Ejercicio 9
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 * que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 * 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 * cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 * llamada. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 * decimales, puedes utilizar DecimalFormat.
 * Contenido del main
 * Movil m1 = new Movil("678 11 22 33", "rata");
 * Movil m2 = new Movil("644 74 44 69", "mono");
 * Movil m3 = new Movil("622 32 89 09", "bisonte");
 * System.out.println(m1);
 * System.out.println(m2);
 * m1.llama(m2, 320);
 * m1.llama(m3, 200);
 * m2.llama(m3, 550);
 * System.out.println(m1);
 * System.out.println(m2);
 * System.out.println(m3);
 * Salida
 * Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
 * Nº 644 74 44 69 - 0s de conversación - tarificados 0,00 euros
 * Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
 * Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
 * Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros
 * 
 * @author Javier Lopera Jimenez
 *
 */


public class Movil extends Terminal {

	double precio;
	String tarifa="";
	int tiempo;
	
	public Movil(String numero,String tarifa) {
		
		super(numero);
		
		if(tarifa=="rata" || tarifa=="mono" || tarifa=="bisonte") {
			this.tarifa=tarifa;
		}
		else {
			System.out.println("Esta tarifa no existe");
		this.precio=0;
		}
		
	}
	
	public void llamar(Movil m, int tiempo) {
		
		this.tiempo+=tiempo;
		m.tiempo+=tiempo;

	
		if(this.tarifa=="rata") {
			
			precio+=(tiempo*0.06)/60;
		}
			
		if(this.tarifa=="mono") {
			precio+=(tiempo*0.12)/60;
		}
			
		if(this.tarifa=="bisonte") {
			precio+=(tiempo*0.30)/60;
		}
	}

	@Override
	public String toString() {

		return super.toString()+ " - tarificados " + precio + " euros";
		
	}
	
	
	
}
