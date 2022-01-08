/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Excercise 122A
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    if(n%4==0 || n%7==0 || n%47==0 || n%477==0)
            System.out.println("YES");
    else
            System.out.println("NO");
    }
    
}
