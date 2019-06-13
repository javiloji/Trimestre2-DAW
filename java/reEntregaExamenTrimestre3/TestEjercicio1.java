
/**
 * 
 *  Escribe un programa que usando la interfaz gráfica de Java que escoje un fichero del 
 *  sistema de archivos y lo almacena en otro de manera que se sustituyen todas las 
 *  ocurrencias de los siguientes caracteres (mayúscula o minúscula) del fichero original 
 *  por sus correspondientes números:
 *  
 *  A -> 4
 *  B -> 8
 *  E -> 3
 *  I -> 1
 *  O -> 0
 *  S -> 5
 *  T -> 7
 * 
 * @author Javier Lopera Jimenez
 * 
 * */

package reEntregaExamenTrimestre3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestEjercicio1 {

  private JFrame frame;
  private JTextField rutaFicheroOrigen;
  private JTextField rutaFicheroDestino;
  protected File ficheroOrigen;// variable fichero origen
  protected File ficheroDestino;// variable fichero destino
  private JButton btn_1;
  private JScrollPane scrollPane;
  private JTextArea textArea;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          TestEjercicio1 window = new TestEjercicio1();
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
  public TestEjercicio1() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setResizable(false);
    frame.setBounds(100, 100, 247, 411);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    frame.setTitle("Ejercicio 1");

    JLabel lblFicheroOrigen = new JLabel("Fichero Origen");
    lblFicheroOrigen.setBounds(73, 21, 92, 14);
    frame.getContentPane().add(lblFicheroOrigen);

    /**
     * 
     * Con el siguiente boton seleccionamos el fichero origen, en el que estara
     * el texto inicial, para ello uso JFileChooser.
     * 
     */
    
    JButton btnFicheroOrigen = new JButton("Seleccionar Fichero");
    btnFicheroOrigen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        /* filechooser fichero origen */
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          ficheroOrigen = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield origen
          rutaFicheroOrigen.setText(ficheroOrigen.getAbsolutePath());
        }
      }
    });
    btnFicheroOrigen.setBounds(21, 46, 193, 18);
    frame.getContentPane().add(btnFicheroOrigen);

    rutaFicheroOrigen = new JTextField();
    rutaFicheroOrigen.setEditable(false);
    rutaFicheroOrigen.setBounds(21, 75, 193, 20);
    frame.getContentPane().add(rutaFicheroOrigen);
    rutaFicheroOrigen.setColumns(10);
    
    JLabel lbl = new JLabel("Fichero Destino");
    lbl.setBounds(73, 106, 112, 14);
    frame.getContentPane().add(lbl);

    JButton btn = new JButton("Seleccionar Fichero");
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        /* filechooser fichero destino */
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          ficheroDestino = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield destino
          rutaFicheroDestino.setText(ficheroDestino.getAbsolutePath());
        }
      }
    });
    btn.setBounds(21, 131, 193, 18);
    frame.getContentPane().add(btn);

    rutaFicheroDestino = new JTextField();
    rutaFicheroDestino.setEditable(false);
    rutaFicheroDestino.setBounds(21, 160, 193, 20);
    frame.getContentPane().add(rutaFicheroDestino);
    rutaFicheroDestino.setColumns(10);
    
    /**
     * 
     * En el siguiente boton le amos la funcionalidad de recibir el texto que le pasamos y 
     * devolvernos el texto con las especficaciones del programa
     * 
     */
    
    btn_1 = new JButton("Crear Fichero");
    btn_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        try {
          FileReader leer = new FileReader(ficheroOrigen.getAbsolutePath());
          FileWriter escribir = new FileWriter(ficheroDestino.getAbsolutePath());

          BufferedReader lector = new BufferedReader(leer);
          BufferedWriter escritura = new BufferedWriter(escribir);

          
          
          String linea = "";
          String resultado = "";
          
          
          
          while (linea != null) {
            linea = lector.readLine();

            if (linea != null) {
              linea = linea.replaceAll("a", "4");
              linea = linea.replaceAll("A", "4");
              linea = linea.replaceAll("b", "8");
              linea = linea.replaceAll("B", "8");
              linea = linea.replaceAll("e", "3");
              linea = linea.replaceAll("E", "3");
              linea = linea.replaceAll("i", "1");
              linea = linea.replaceAll("I", "1");
              linea = linea.replaceAll("o", "0");
              linea = linea.replaceAll("O", "0");
              linea = linea.replaceAll("s", "5");
              linea = linea.replaceAll("S", "5");
              linea = linea.replaceAll("t", "7");
              linea = linea.replaceAll("T", "7");

              escritura.write(linea);
              escritura.newLine();
              resultado += linea + "\n";

            }
          }

          textArea.setText(resultado);

          lector.close();
          escritura.close();

        } catch (IOException | NullPointerException ie) {
          JOptionPane.showMessageDialog(null, "No se encontro el archivo o no se ha especificado una ruta.");

        }

      }
    });
    btn_1.setBounds(21, 204, 193, 23);
    frame.getContentPane().add(btn_1);
    
    scrollPane = new JScrollPane();
    scrollPane.setBounds(21, 241, 197, 114);
    frame.getContentPane().add(scrollPane);

    textArea = new JTextArea();
    scrollPane.setViewportView(textArea);
    textArea.setEditable(false);
  }
}