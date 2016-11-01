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
public class Restaurante {
    private int pulpo;
   private int patatas;
   
   public int calcularclientes(){
       int clientes= 0;
       
       for(int i = pulpo; i > 1; i -= 2){
           patatas-=1;
           if(patatas >=0)
            clientes+=1;
           else
            break;
       }
       return clientes;
   }
   
   public void añadirPulpo(int x ){
       pulpo += x;
   }
   public void añadirPatatas ( int x){
       patatas +=x;
   }         
   public void enseñarPulpo( ){
       System.out.println(pulpo);
   }
   
   public void enseñarPatatas ( ){
       System.out.println(patatas);       
   }
}
