/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

import java.util.*;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Escriba un numero: ");
        n=sc.nextInt();
        
        while(n < 0){
            System.out.println("Error: El numero debe ser positivo");
            System.out.println("Escriba un numero: ");
            n=sc.nextInt(); 
        }
        int factorial = 1;
        for(int i = 1; i <= n; i++){
        factorial *=1;
        }
         System.out.println("Factorial de "+n+": "+factorial);
    }
    
}
