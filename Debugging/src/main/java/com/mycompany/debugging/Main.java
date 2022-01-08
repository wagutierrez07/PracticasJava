/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.debugging;

/**
 *
 * @author Indatech
 */
public class Main {

static int calcular ( int n ){
    return n*n;
}
    public static void main(String[] args) {
        int a;
        int b = 2;
        a = b+7;
        
        b=calcular(4);
        System.out.println(a);
        System.out.println(b);
    }
    
}
