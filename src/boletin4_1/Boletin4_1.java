/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author Ricky
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coches aceler = new Coches();
        aceler.acelerar(12);
        aceler.frenar (2);
        System.out.println("Velocidad: " + aceler.getVelocidade());
        
        Satelite satelite1 = new Satelite(20.00, 30000.00, 21.0);
        satelite1.verPosicion();
        
        Circulo circulo1 =  new Circulo(20);
        System.out.println("La longitud es: " + circulo1.calculaLonxitude());
        System.out.println("El area es: " + circulo1.calcularArea());
        
        Restaurante restaurante1= new Restaurante();
        System.out.println("Hay "+ restaurante1.calcularclientes() + " clientes.");
    }
    
}
