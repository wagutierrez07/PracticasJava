/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     int arreglo[] = new int[n];
     int aux = 0;
     
         for (int i = 0; i < arreglo.length; i++) {
              arreglo[i] = sc.nextInt();
        }
         
      
       for (int i = 0; i < arreglo.length - 1; i++) {
              for (int j = i; j < arreglo.length; j++) {
                  if (arreglo[i]>arreglo[j]) {
                      aux = arreglo[i];
                      arreglo[i] = arreglo[j];
                      arreglo[j]= aux;
                  }
              }
        }
       
       for (int i = 0; i < arreglo.length; i++) {
              System.out.print(arreglo[i] + " ");
        }
    }
    
}
