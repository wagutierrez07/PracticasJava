/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();    
    s=s.toLowerCase();
    s=s.replaceAll("[aeiouy]","");
    System.out.println(s.replaceAll("(.)",".$1"));
    
    }
    
}
