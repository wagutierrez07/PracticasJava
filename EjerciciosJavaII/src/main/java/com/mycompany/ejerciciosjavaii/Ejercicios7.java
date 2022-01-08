/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

import java.util.*;
public class Ejercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String respuesta;
        int numero;
        System.out.println("¿Quieres sumar números? (s|n): ");
        respuesta = sc.nextLine();
        int total = 0;
        while (respuesta.equals("s")){
            
         System.out.print("Introduce un número: ");
         numero = sc.nextInt();
         total = total + numero;
         
         System.out.print("¿Quieres seguir sumando números? (s|n): ");
         respuesta = sc.nextLine();
         
         
        }
        System.out.println("Resultado: "+total);
    }
    
}
