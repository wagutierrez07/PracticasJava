/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
	int w = s.nextInt();
	if(w<3) System.out.println("no");
        else System.out.println((w%2 == 0)?"yes" : "no");
    }
    
}
