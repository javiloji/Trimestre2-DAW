package ejerciciosPOO2;

public class Coche extends Vehiculo {

	float kilometrosTotalesCoche;
	
	public void Bicicleta(){
		
		this.kilometrosTotalesCoche=0;
		
	}
	
	public float getKilometrosTotalesCoche() {
    return this.kilometrosTotalesCoche;
	}  

	public float andar() {
			
		System.out.println("Introduce cuantos kilometros has andado con el coche.");
		float kilometrosRecorridos=Teclado.nextFloat();
		kilometrosTotalesCoche+=kilometrosRecorridos;
		return kilometrosTotalesCoche;
			
	}
	
	public String quemarRueda() {
		
		return "Voy quemando rueda.";
		
	}
}
