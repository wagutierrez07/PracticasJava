/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosjavaii;

/**
 *
 * @author Desarrollo04
 */
public class Ejercicios4 {
//Forma de aplicar la serie Fibbonacci
 static int fib( int n){
 
        if( n < 2 )
            return n;
        else
            return fib(n-1)+fib(n-2);
 }
    public static void main(String[] args) {
                for (int i = 0; i < 30; i++) {
            System.out.println("El fib("+i+") es: "+fib(i));
    }
    }
}
