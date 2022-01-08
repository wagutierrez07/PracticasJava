/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

/**
 *
 * @author Desarrollo04
 */
public class Ejercicio5 {

  static boolean esPrimo(int n){
        boolean esprimo = true;
        int i = 2;
        
        while( i<n )
        {
            if( n%i == 0 )
                esprimo = false;
                
            i++;
        }
        
        return esprimo;
  }
    public static void main(String[] args) {
         for (int i = 1; i <= 1000; i++) {
            if( esPrimo(i) )
                System.out.println(i);
        }
    }
    
}
