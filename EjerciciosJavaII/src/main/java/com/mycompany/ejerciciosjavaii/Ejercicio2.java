/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

import java.util.*;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int nota;
        System.out.println("Ingrese una nota: ");
        nota = sc.nextInt();
        
        if( nota >= 0 && nota <= 10){
            switch(nota){
              case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                    System.out.println("Mejor");
                    break;
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                    System.out.println("Sobresaliente");
                    break;
                case 10:
                    System.out.println("¡¡Perfecto!!");
                    break;
                default:
                    System.out.println("Suspendido");
                    break;  
            }
            
            }
        else
            System.out.println("ERROR: El valor es incorrecto!");
        }
    }
