package coleccionesYDiccionarios;

public class Carta implements Comparable{

	private Palo palo;
	
	private Figura figura;
	
	public Carta(Figura figura,Palo palo) {
		
		setPalo(palo);
		setFigura(figura);		
		
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}
	
	@Override
	public String toString() {
		return figura + " de "+ palo;
	}

	@Override
	public int compareTo(Object arg0) {

		
		
		return 0;
	}
	
	
}
