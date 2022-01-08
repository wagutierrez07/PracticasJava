/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vectoresss;

/**
 *
 * @author administrador04
 */
import java.util.*;

public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];


        for(i=0; i<array.length; i++){

            System.out.println("Ingrese sus numeros");
            array[i] = sc.nextInt();   
        
        }

        for(i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

 }
    
}
