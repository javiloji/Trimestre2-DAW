
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
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TestEjercicio1 {

  private JFrame frame;

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
  
  String rutaFichero1="";
  private JTextField textField;
  
  /**
   * Initialize the contents of the frame.
   */
  
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 350, 500);
    frame.setTitle("Ejercicio 1 Examen");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    // Creamos y añadimos el panel
    
    JPanel panel = new JPanel();
    panel.setBounds(10, 11, 322, 451);
    frame.getContentPane().add(panel);
    panel.setLayout(null);
    
    // Creamos y añadimos el label y el boton
    
    JLabel lblNewLabel = new JLabel("Fichero");
    lblNewLabel.setBounds(77, 24, 138, 14);
    panel.add(lblNewLabel);
    
    JButton btnNewButton = new JButton("Seleccionar Fichero");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
       //Creamos el selector de ficheros, le obligamos a elegir entre ficheros que sean txt.
        
       JFileChooser fichero1 = new JFileChooser();
       fichero1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
       FileNameExtensionFilter filtro = new FileNameExtensionFilter(null, "txt");
       fichero1.setFileFilter(filtro);
       
       //Abrimos la ventana, guardamos la opcion seleccionaa por el usuario
       
       int seleccion = fichero1.showOpenDialog(panel);
        
       //Si el usuario pincha en aceptar
       
       if(seleccion == JFileChooser.APPROVE_OPTION) {
         rutaFichero1 = fichero1.getSelectedFile().getAbsolutePath();
       }
       
      }
    });
    
    btnNewButton.setBounds(77, 64, 138, 23);
    panel.add(btnNewButton);
    
    JLabel lblNewLabel_1 = new JLabel("Nuevo fichero");
    lblNewLabel_1.setBounds(77, 119, 129, 14);
    panel.add(lblNewLabel_1);
    
    JButton btnNewButton_1 = new JButton("Crear Fichero");
    
    JTextArea textArea = new JTextArea();
    textArea.setBounds(24, 249, 266, 166);
    panel.add(textArea);
    
    /**
     *  En el siguiente ActionEvent creamos un lector que lee el fichero origen y un
     *  escritor que nos escribe el nuevo fichero con todas las letras ya transformadas,
     *  para ello usamos el metodo readLine para leer la linea y el replaceAll para sustituir
     *  las letras, por último escribimos las lineas con write en el nuevo fichero. 
     */
    
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        try {
          
          BufferedReader lector = new BufferedReader(new FileReader(rutaFichero1));
          BufferedWriter escritor = new BufferedWriter(new FileWriter(textField.getText() + ".txt"));
          
          
          String linea = ""; 
          
          while(linea != null) {
            
            linea = lector.readLine();
            
            if(linea != null) {
              linea=linea.replaceAll("A","4");
              linea=linea.replaceAll("a","4");
              linea=linea.replaceAll("B","8");
              linea=linea.replaceAll("b","8");
              linea=linea.replaceAll("E","3");
              linea=linea.replaceAll("e","3");
              linea=linea.replaceAll("I","1");
              linea=linea.replaceAll("i","1");
              linea=linea.replaceAll("O","0");
              linea=linea.replaceAll("o","0");
              linea=linea.replaceAll("S","5");
              linea=linea.replaceAll("s","5");
              linea=linea.replaceAll("T","7");
              linea=linea.replaceAll("t","7");
              escritor.write(linea + "\n");
              textArea.append(linea + "\n");
            }
          }
          escritor.close();
          lector.close();
          
        } catch (FileNotFoundException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        } catch (IOException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        
      }
    });
    
    btnNewButton_1.setBounds(77, 197, 138, 23);
    panel.add(btnNewButton_1);
    
    textField = new JTextField();
    textField.setBounds(77, 154, 138, 20);
    panel.add(textField);
    textField.setColumns(10);
  }
}
