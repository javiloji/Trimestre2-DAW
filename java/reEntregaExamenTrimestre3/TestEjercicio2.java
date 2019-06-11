
/**
 * 
 * 2.-  Escribe un programa que usando la interfaz gráfica de Java permite al usuario introducir una 
 * fecha en formato dd/mm/aaaa y que tiene los siguientes botones:
 * 
 * •Validar fecha: muestra un mensaje 
 * diciendo si la fecha es o no válida.
 * 
 * •Día posterior: Modifica la fecha sumándole un día. Debe validar 
 * la fecha antes de hacer la operación.
 * 
 * •Día anterior: Modifica la fecha restándole un día. Debe validar 
 * la fecha antes de hacer la operación.
 * 
 * •Días hasta hoy: Muestra el número de días que hay entre la 
 * fecha introducida y la fecha de hoy. Debe validar la fecha antes de hacer la operación.
 * 
 * •Terminar.
 * 
 * La fecha es manejada mediante un objeto de una clase que o bien construyáis 
 * con sus métodos correspondientes o de las que ya existen en la API de Java.
 * 
 */

package reEntregaExamenTrimestre3;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TestEjercicio2 {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          TestEjercicio2 window = new TestEjercicio2();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public TestEjercicio2() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
