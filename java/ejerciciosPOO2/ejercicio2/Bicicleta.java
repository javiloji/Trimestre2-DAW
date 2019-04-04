package ejercicio2;

public class Bicicleta extends Vehiculo {

		
	float kilometrosTotalesBici;
		
	/**
	 * 
	 * Constructor de la clase Bicicleta.
	 * 
	 */
	
	public void Bicicleta(){
			
		this.kilometrosTotalesBici=0;
		
	}
		
	/**
	 * 
	 * Metodo andar, el cual pregunta cuanto has andado con la bici y lo suma a la variable kilometrosTotalesBici.
	 * 
	 */
	
  public float getKilometrosTotalesBici() {
	    return this.kilometrosTotalesBici;
  }  
	
	public float andar() {
			
		System.out.println("Introduce cuantos kilometros has andado con la bici.");
		float kilometrosRecorridos=Teclado.nextFloat();
		kilometrosTotalesBici+=kilometrosRecorridos;
		return kilometrosTotalesBici;
			
	}
	
	public String hazCaballito() {
		
		return "Voy haciendo el caballito.";
		
	}
		
}
	

