/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package com.mycompany.keyboardimput;

import java.util.*;


public class KeyboardInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        System.out.println(a);*/

        //ejercicio mostrar suma y string
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        int result = a + b;
        System.out.println(result);
        System.out.println(s);*/

        //operacion combinada con tres enteros
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result = (x+(z*2)+y-(x*2));
        System.out.println(result);
    }
    
}
