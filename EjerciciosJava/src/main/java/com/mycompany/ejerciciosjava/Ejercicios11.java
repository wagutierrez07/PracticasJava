/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      int k = s.nextInt();
      int n = s.nextInt();
      int w = s.nextInt();
      int z=k*w*(w+1)/2-n;
      if(z<0) z=0;
      System.out.println(z);
    }
    
}
