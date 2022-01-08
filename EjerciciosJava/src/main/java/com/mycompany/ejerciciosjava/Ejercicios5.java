/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Excercise 977A
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
    for(int i=0; i<k; i++){

        if(n%10==0)
        n=n/10;
        else
        n--;
        }
        System.out.println(n);
    }
    
}
