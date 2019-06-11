
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
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TestEjercicio2 {

  private JFrame frame;
  private JTextField textField;
  private JTextField textField_1;

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
    frame.setBounds(100, 100, 326, 421);
    frame.setTitle("Ejercicio 2 Examen");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    panel.setLayout(null);
    
    textField = new JTextField();
    textField.setBounds(67, 44, 173, 20);
    panel.add(textField);
    textField.setColumns(10);
    
    JButton btnNewButton = new JButton("Validar Fecha");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        if(!validarFecha(textField.getText())) {
          JOptionPane.showMessageDialog(btnNewButton, "Fecha Incorrecta", null, 0);
        }
        else {
        JOptionPane.showMessageDialog(btnNewButton, "Fecha Correcta", null, 3);
        textField_1.setText(textField.getText());
        }
        
      }
    });
    btnNewButton.setBounds(67, 91, 173, 23);
    panel.add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("Dia Posterior");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        textField_1.setText(suma1DiaFecha(textField_1.getText()));
        
      }
    });
    btnNewButton_1.setBounds(67, 140, 173, 23);
    panel.add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("Dia Anterior");
    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        textField_1.setText(resta1DiaFecha(textField_1.getText()));
        
      }
    });
    btnNewButton_2.setBounds(67, 195, 173, 23);
    panel.add(btnNewButton_2);
    
    /**
     * 
     * Con el siguiente boton calculo los dias que hay desde la fecha
     * introducida hasta la fecha actual, para ello uso la clase
     * Date y dateFormat.
     * 
     */
    
    JButton btnNewButton_3 = new JButton("Dias Hasta Hoy");
    btnNewButton_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
          
          Calendar fecha = new GregorianCalendar();
          
          int d = fecha.get(Calendar.DAY_OF_MONTH);
          int m = fecha.get(Calendar.MONTH) + 1;
          int a = fecha.get(Calendar.YEAR);
          
          String fechaActual;
          
          if(d < 10 && m >=10) {
            fechaActual = "0" + Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
          }
          else if(m < 10 && d >=10) {
            fechaActual = Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);
          }
          else if(d < 10 && m < 10) {
            fechaActual = "0" + Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);

          }
          else
            fechaActual = Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
          
          Date fechaInicial;
          Date fechaFinal ;
          fechaInicial = dateFormat.parse(textField_1.getText());
          fechaFinal = dateFormat.parse(fechaActual);
        
     
          int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
     
          JOptionPane.showMessageDialog(textField_1, "Hay "+dias+" dias de diferencia");
        } catch (ParseException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      }
    });
    btnNewButton_3.setBounds(67, 249, 173, 23);
    panel.add(btnNewButton_3);
    
    textField_1 = new JTextField();
    textField_1.setBounds(67, 301, 173, 20);
    panel.add(textField_1);
    textField_1.setColumns(10);
    textField_1.setEditable(false);
    
    JLabel lblIntroduceLaFecha = new JLabel("Introduce la fecha");
    lblIntroduceLaFecha.setBounds(67, 19, 173, 14);
    panel.add(lblIntroduceLaFecha);
    
    JButton btnNewButton_4 = new JButton("Terminar");
    btnNewButton_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  
        frame.dispose();
        
      }
    });
    btnNewButton_4.setBounds(67, 346, 173, 23);
    panel.add(btnNewButton_4);
    
    
  }
  
  final static int [] DIAS_MES = {31,28,31,30,31,30,31,31,30,31,30,31}; // constante, sin bisiestos
  
  /**
   * 
   * Método que valida una fecha, controlando si es año bisiesto o no, 
   * indica si la fecha introducida corresponde a una fecha viable.
   * 
   * @param fechaIntroducida
   * @return
   */
  
  public boolean validarFecha(String fechaIntroducida) {
    
    if (fechaIntroducida.length()!=10  || !Character.isDigit(fechaIntroducida.charAt(0)) 
        || !Character.isDigit(fechaIntroducida.charAt(1)) || !Character.isDigit(fechaIntroducida.charAt(3))
        || !Character.isDigit(fechaIntroducida.charAt(4)) || !Character.isDigit(fechaIntroducida.charAt(6)) 
        || !Character.isDigit(fechaIntroducida.charAt(7)) || !Character.isDigit(fechaIntroducida.charAt(8)) 
        || !Character.isDigit(fechaIntroducida.charAt(9))
        || fechaIntroducida.charAt(2)!='/' || fechaIntroducida.charAt(5)!='/') {
        return false;
    }
    int mes = Integer.parseInt(fechaIntroducida.substring(3,5));
    if (mes<1 || mes>12) {
      return false;
    }
    int dia = Integer.parseInt(fechaIntroducida.substring(0, 2));
    int anyo = Integer.parseInt(fechaIntroducida.substring(6));
    int diasmes = DIAS_MES[mes-1];  // restamos 1 al mes para que esté entre 0 y 11
    // ¿febrero y año bisisesto?
    if (mes==2 && anyo%4==0 && (anyo%100!=0 || anyo%400==0)) {
      diasmes++;
    }
    return (dia>0 && dia<=diasmes);
  }
  
  /**
   * Suma un día a la fecha
   * @param f
   * @return fecha del día siguiente
   */
  
  public static String suma1DiaFecha(String fechaIntroducida) {
    int d = Integer.parseInt(fechaIntroducida.substring(0, 2));
    int m = Integer.parseInt(fechaIntroducida.substring(3, 5));
    int a = Integer.parseInt(fechaIntroducida.substring(6));
    
    int diasmes = DIAS_MES[m-1];
    // ¿febrero y año bisisesto?
    if (m==02 && a%04==0 && (a%100!=0 || a%400==0)) {
      diasmes++;
    }
    d++;
    if (d>diasmes) {
      d = 1;
      m++;
      if (m==13) {
        m = 1;
        a++;
      }
    }
    if(d < 10 && m >=10) {
      fechaIntroducida = "0" + Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
    }
    else if(m < 10 && d >=10) {
      fechaIntroducida = Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);
    }
    else if(d < 10 && m < 10) {
      fechaIntroducida = "0" + Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);

    }
    else
    fechaIntroducida = Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
    return fechaIntroducida;
  }
  
  /**
   * Resta un día a la fecha
   * @param f
   * @return fecha del día siguiente
   */
  public static String resta1DiaFecha(String fechaIntroducida) {
    int d = Integer.parseInt(fechaIntroducida.substring(0, 2));
    int m = Integer.parseInt(fechaIntroducida.substring(3, 5));
    int a = Integer.parseInt(fechaIntroducida.substring(6));
    
    d--;
    if (d==0) { // mes anterior
      m--;
      if (m==0) { // año anterior
        m=12;
        a--;
      } 
      d = DIAS_MES[m-1];
      // ¿febrero y año bisisesto?
      if (m==2 && a%4==0 && (a%100!=0 || a%400==0)) {
        d++;
      }
    }
    if(d < 10 && m >=10) {
      fechaIntroducida = "0" + Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
    }
    else if(m < 10 && d >=10) {
      fechaIntroducida = Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);
    }
    else if(d < 10 && m < 10) {
      fechaIntroducida = "0" + Integer.toString(d) + "/" + "0" + Integer.toString(m) + "/" + Integer.toString(a);

    }
    else
      fechaIntroducida = Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
    
    return fechaIntroducida;
  }
  
 }
  
