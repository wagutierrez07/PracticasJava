/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class EJercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Excercise 318A
        Scanner sc = new Scanner(System.in);
        long n,k;
        n=sc.nextLong();
        k=sc.nextLong();
        System.out.println(2*k-1<=n?2*k-1:2*k-n-n%2);
    }
    
}
