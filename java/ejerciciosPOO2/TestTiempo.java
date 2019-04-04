package ejerciciosPOO2;

public class TestTiempo {

	public static void main(String[] args) {

		Tiempo t1 = new Tiempo(2,34,56);
		
		Tiempo t2 = new Tiempo(12,4,26);
		
		Tiempo t3 = new Tiempo(0,54,51);
		
		System.out.println(t1);
		
		t1.sumar(t2);
		
		System.out.println(t1);
		
		t2.restar(t3);
		
		System.out.println(t2);
		
		
	}

}
