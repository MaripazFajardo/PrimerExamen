/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author marip
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Preguntarle la informacion basica al usuario
        //
        String nombre, cedula, categoria, lectura;
       
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        cedula = JOptionPane.showInputDialog("Ingrese su numero de Cédula:");
        categoria = JOptionPane.showInputDialog(" Indique su categoría si es VIP o Regular):");
        
        int mes;
        do {
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el número del mes (1-12):"));
        } while (mes < 1 || mes > 12);

        
        double Total = 0;
        int puntosTotales = 0;
        int contadorVehiculo = 0;
        String continuar;
        
        
    
      
                 
    }
    
}
