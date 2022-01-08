/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios4 {

    public static void main(String[] args) {
        // Exercise 479A
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result [] = {a+b+c, (a+b)*c, a*(b+c), a*b*c};
        Arrays.sort(result);
        System.out.println(result[3]);
    }
    
}
