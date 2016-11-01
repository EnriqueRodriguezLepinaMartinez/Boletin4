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
public class Circulo {
    private double radio;
    private static double PI = 3.14;
    
    public Circulo(){
        
    }
    public Circulo(double r){
        radio = r;
    }    
    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
    public double calcularArea(){
        return PI * Math.pow(radio, 2);
    }
    public double calculaLonxitude(){
        return radio * 2;
    }
}
