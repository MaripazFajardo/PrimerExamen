package examen1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marip
 */
public class Vehiculo {
    //Control de las rentas
    // Costos y puntos de lealtad que acumulan los clientes
    // El sistema solicita el nombrre del cliente
    
    //atributos
    private String placa;
    private String marca;
    private double precioDia;
    private double diasAlquiler;
    private boolean alquilerSeguro;
    private boolean dispositivos;
    private double MontoBase;
    private double descuento;
   
    public Vehiculo(String placa, String marca, double precioDia, double diasAlquiler, boolean alquilerSeguro, boolean dispositivos) {

        this.placa = placa;
        this.marca = marca;
        this.precioDia = precioDia;
        this.diasAlquiler = diasAlquiler;
        this.alquilerSeguro = alquilerSeguro;
        this.dispositivos = dispositivos;
    }
        
        public double calcularMontoBase() {
        return diasAlquiler * 10;
        

      double MontoBase, descuento;
       
        if (this.diasAlquiler > 7) {
            descuento = MontoBase * 0.15;
        }

        double recargoSeguro = 0;
        if (this.alquilerSeguro) {
            recargoSeguro = 5000 * this.diasAlquiler; 
        }

        double recargoGps = 0;
        if (this.dispositivos) {
            recargoGps = 2000 * this.diasAlquiler; 
        }

        return (MontoBase - descuento) + recargoSeguro + recargoGps;
    }

   public int puntos() {
        int puntosGanados = 0;
        if (this.diasAlquiler > 7) {
            puntosGanados += 5;
        }
        if (this.alquilerSeguro) {
            puntosGanados += 2;
        }
        return puntosGanados;
        }
        
        public void setplaca (String placa) {
        this.placa = placa;
    }
        public void setdiasalquiler (double diasalquiler) {
        this.diasAlquiler = diasalquiler;
        
        }
        public void setalquilerSeguro (boolean alquilerSeguro) {
        this.alquilerSeguro = alquilerSeguro;
        }
         public void setdispositivos (boolean dispositivos) {
        this.dispositivos = dispositivos;
        }
        @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", diasalquiler=" + diasAlquiler + ", aluilerSeguro=" + alquilerSeguro + ", dispositivos=" + dispositivos + '}';
    
    }
        }

    


    
    
}
