/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.functions;

/**
 *
 * @author administrador04
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Funcion que suma
        int a = 15;
        int b = 20;
        sumaNumeros(a,b);
        restaNumeros(b,a);

    }
    public static int sumaNumeros (int num1, int num2){
        int res = num1 + num2;
        System.out.println(res);
        return res;
    }
    public static int restaNumeros (int num1, int num2){
        int res = num1 - num2;
        System.out.println(res);
        return res;
    }
}
