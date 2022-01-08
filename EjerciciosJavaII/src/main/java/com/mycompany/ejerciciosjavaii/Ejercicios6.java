/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

import java.util.*;
public class Ejercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int horas;
        int minutos;
          /*
            00:00 a 07:00 - Madrugada
            07:00 a 12:00 - Mañana
            12:00 a 21:00 - Tarde
            21:00 a 00:00 - Noche

            12:00 - Mediodía
            00:00 - Medianoche
        */
          
          System.out.println("Horas");
          horas = sc.nextInt();
          System.out.println("Minutos");
          minutos = sc.nextInt();
          
                  if( horas == 12 && minutos == 0 )
            System.out.println("Mediodía");
        else
            if( horas == 0 && minutos == 0 )
                System.out.println("Medianoche");
            else
                if( horas >= 0 && horas <= 7 )
                    System.out.println("Madrugada");
                else
                    if( horas > 7 && horas <= 12 )
                        System.out.println("Mañana");
                else
                    if( horas > 12 && horas <= 21 )
                        System.out.println("Tarde");
                else
                    if( horas > 21 && horas <= 23 )
                        System.out.println("Noche");
          
    }
    
}
