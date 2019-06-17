package exJunio2019JavierLoperaJimenez;

/**
 * 
 * Programa en Java usando su interfaz gráfica capaz de quitar los comentarios de 
 * un programa de Java.Se puede utilizar con parámetros o sin parámetros.Con 
 * parámetros:quita_comentarios <PROGRAMA_ORIGINAL> <PROGRAMA_LIMPIO>Por ejemplo:quita_comentarios  
 * hola.java  holav2.javacrearía un fichero con nombre holav2.java que contiene el código de hola.java 
 * pero sin los comentarios.
 * 
 * En caso de no existir el fichero origen saltaria un error y se cerraría el programa.
 * 
 * @author Javier Lopera Jimenez
 * 
 */

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quita_Comentarios {

  private JFrame frame;
  protected JTextField rutaFicheroOrigen;
  protected JTextField rutaFicheroDestino;
  private JLabel lblFicheroOriginal;
  private JLabel lblFicheroDestino;
  private JButton btnSeleccionarFichero;
  private JButton btnSeleccionarFichero_1;
  private JButton btnQuitarComentariosSinParametros;
  private JButton btnQuitarComentariosUnParametro;
  protected File ficheroOrigen;
  protected File ficheroDestino;
  protected File ficheroOrigenComprobarExistencia;
  private JTextArea textAreaOrigen;
  private JTextArea textAreaResultado;
  private JScrollPane scrollPane;
  private JScrollPane scrollPane_1;
  private ArrayList<String> arrayInicial = new ArrayList<>();
  private ArrayList<String> arrayFinal = new ArrayList<>();
  private String argumentoConUnParametro;
  
  /**
   * Main del programa.
   * 
   * Cuando se ejecuta el programa con un parametro, con dos o con ninguno se abren
   * interfaces graficas diferentes.
   * 
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Quita_Comentarios window = new Quita_Comentarios();
          if(args.length == 1) {
            window.ficheroOrigenComprobarExistencia = new File(args[0]);
            if(window.ficheroOrigenComprobarExistencia.exists()) {
              
              window.argumentoConUnParametro = args[0];
              window.rutaFicheroOrigen.setVisible(false);
              window.btnSeleccionarFichero.setVisible(false);
              window.lblFicheroOriginal.setVisible(false);
              window.btnQuitarComentariosSinParametros.setVisible(false);
              window.frame.setVisible(true);
            
            }
            else {
              JOptionPane.showMessageDialog(null, "El fichero origen seleccionado no existe.");
              System.exit(0);
            }
          }
          else if(args.length == 2){
            window.ficheroOrigenComprobarExistencia = new File(args[0]);
            if(window.ficheroOrigenComprobarExistencia.exists()) {
              
              window.rutaFicheroOrigen.setVisible(false);
              window.rutaFicheroDestino.setVisible(false);
              window.btnSeleccionarFichero.setVisible(false);
              window.btnSeleccionarFichero_1.setVisible(false);
              window.lblFicheroDestino.setVisible(false);
              window.lblFicheroOriginal.setVisible(false);
              window.btnQuitarComentariosSinParametros.setVisible(false);
              window.btnQuitarComentariosUnParametro.setVisible(false);
              window.frame.setVisible(true);
              window.quitarComentarios(args[0], args[1]);
            }
            else {
              JOptionPane.showMessageDialog(null, "El fichero origen seleccionado no existe.");
              System.exit(0);
            }
          }
         
          else if(args.length == 0){
              window.btnQuitarComentariosUnParametro.setVisible(false);
              window.frame.setVisible(true);
          }
          else {
            JOptionPane.showMessageDialog(null, "El programa no puee tener mas e dos argumentos.");
            System.exit(0);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Método initialize(), utilizado para inicializar la interfaz grafica.
   */
  public Quita_Comentarios() {
    initialize();
  }

  /**
   * Inicializa el contenido del frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 539, 423);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    File ficheroTitulo = new File("autor.txt");
    
    try {
      BufferedReader lectorTitulo = new BufferedReader(new FileReader(ficheroTitulo.getAbsolutePath()));
    
    
      String titulo = lectorTitulo.readLine();
      lectorTitulo.close();
      frame.setTitle(titulo);
    
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      JOptionPane.showMessageDialog(null, "El fichero autor.txt debe existir para ejecutar este programa.");
      System.exit(0);
    }
    
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0, 0, 442, 1);
    frame.getContentPane().add(layeredPane);
    
    JLabel lblProgramaOriginal = new JLabel("Programa Original");
    lblProgramaOriginal.setBounds(95, 311, 149, 14);
    frame.getContentPane().add(lblProgramaOriginal);
    
    JLabel lblProgramaSinComentarios = new JLabel("Programa Sin Comentarios");
    lblProgramaSinComentarios.setBounds(323, 311, 171, 14);
    frame.getContentPane().add(lblProgramaSinComentarios);
    
    JButton btnFin = new JButton("Terminar");
    btnFin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        frame.dispose();
        
      }
    });
    btnFin.setBounds(176, 350, 166, 19);
    frame.getContentPane().add(btnFin);
    
    rutaFicheroOrigen = new JTextField();
    rutaFicheroOrigen.setEditable(false);
    rutaFicheroOrigen.setBounds(43, 69, 180, 20);
    frame.getContentPane().add(rutaFicheroOrigen);
    rutaFicheroOrigen.setColumns(10);
    
    lblFicheroOriginal = new JLabel("Fichero Original");
    lblFicheroOriginal.setBounds(26, 26, 91, 14);
    frame.getContentPane().add(lblFicheroOriginal);
    
    lblFicheroDestino = new JLabel("Fichero Destino");
    lblFicheroDestino.setBounds(276, 26, 91, 14);
    frame.getContentPane().add(lblFicheroDestino);
    
    rutaFicheroDestino = new JTextField();
    rutaFicheroDestino.setEditable(false);
    rutaFicheroDestino.setBounds(300, 69, 171, 20);
    frame.getContentPane().add(rutaFicheroDestino);
    rutaFicheroDestino.setColumns(10);
    
    btnSeleccionarFichero = new JButton("Seleccionar Fichero");
    btnSeleccionarFichero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          ficheroOrigen = fileChooser.getSelectedFile();
          rutaFicheroOrigen.setText(ficheroOrigen.getAbsolutePath());
          }
        }
      });
    btnSeleccionarFichero.setBounds(127, 22, 139, 23);
    frame.getContentPane().add(btnSeleccionarFichero);
    
    btnSeleccionarFichero_1 = new JButton("Seleccionar Fichero");
    btnSeleccionarFichero_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(frame);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

          ficheroDestino = fileChooser.getSelectedFile();
          // ponemos la ruta en el textfield destino
          rutaFicheroDestino.setText(ficheroDestino.getAbsolutePath());
        }
      }
    });
    btnSeleccionarFichero_1.setBounds(368, 22, 153, 23);
    frame.getContentPane().add(btnSeleccionarFichero_1);
    
    btnQuitarComentariosUnParametro = new JButton("Quitar Comentarios");
    btnQuitarComentariosUnParametro.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        quitarComentarios(argumentoConUnParametro, rutaFicheroDestino.getText());
        
      }
    });
    btnQuitarComentariosUnParametro.setBounds(70, 69, 174, 23);
    frame.getContentPane().add(btnQuitarComentariosUnParametro);
        
    
    btnQuitarComentariosSinParametros = new JButton("Quitar Comentarios");
    btnQuitarComentariosSinParametros.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        if(ficheroOrigen.exists()) {
        quitarComentarios(rutaFicheroOrigen.getText(), rutaFicheroDestino.getText()); 
        }
        else {
          JOptionPane.showMessageDialog(null, "El fichero origen seleccionado no existe.");
        }
      }
    });
    btnQuitarComentariosSinParametros.setBounds(176, 105, 166, 23);
    frame.getContentPane().add(btnQuitarComentariosSinParametros);
    
    scrollPane = new JScrollPane();
    scrollPane.setBounds(26, 139, 207, 161);
    frame.getContentPane().add(scrollPane);
    
    textAreaOrigen = new JTextArea();
    textAreaOrigen.setEditable(false);
    scrollPane.setViewportView(textAreaOrigen);
    
    scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(276, 139, 218, 161);
    frame.getContentPane().add(scrollPane_1);
    
    textAreaResultado = new JTextArea();
    textAreaResultado.setEditable(false);
    textAreaResultado.setBounds(276, 139, 218, 161);
    scrollPane_1.setViewportView(textAreaResultado);
  }
  
  /**
   * 
   * Metodo quitarComentarios, utilizado para quitar los comentarios de un fichero
   * origen pasado por parametros y volcar el contenido sin comentarios en un fichero 
   * destino también pasado por parámetros.
   * 
   * @param ficheroOrigen
   * @param ficheroDestino
   */
  
  public void quitarComentarios(String ficheroOrigen, String ficheroDestino) {
    try {
      
      BufferedReader lector = new BufferedReader(new FileReader(ficheroOrigen));
      BufferedWriter escritura = new BufferedWriter(new FileWriter(ficheroDestino));      
      
      String linea = "";
      String textoInicial = "";
      String textoDestino = "";
      
      arrayInicial.clear();
      arrayFinal.clear();
      
      boolean comentarioBloqueJavadoc=false;
      
      while (linea != null) {
        arrayInicial.add(linea);
        linea = lector.readLine();
      }
      lector.close();
      
      for(String i : arrayInicial ) {
        textoInicial += i + "\n";
        if(i.contains("//")) {
          String comentario = i.substring(i.indexOf("/"), i.length());
          String noComentario = i.substring(0, i.indexOf("/"));
          arrayFinal.remove(comentario);
          arrayFinal.add(noComentario);
          escritura.write(noComentario);
          escritura.newLine();
          textoDestino += noComentario + "\n";
          }
        else if(i.contains("/*") || i.contains("/**")) {
          
          comentarioBloqueJavadoc = true;
            
        }
        else if(i.contains("*/")) {
          
          comentarioBloqueJavadoc = false;
          
        }
        else if(comentarioBloqueJavadoc) {
          arrayFinal.remove(i);
        }
        else {
          arrayFinal.add(i);
          textoDestino += i + "\n";
          escritura.write(i);
          escritura.newLine();
        }
        
      }
      textAreaOrigen.setText(textoInicial);
      textAreaResultado.setText(textoDestino);
      escritura.close();
      } catch (IOException ie) {
      JOptionPane.showMessageDialog(null, "No se encontro el archivo o no se ha especificado una ruta.");

    }
  }
}
