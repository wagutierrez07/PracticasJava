/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosjava;

import java.util.*;
public class Ejercicios10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ai[] = new int[n];
        int i;
        for (i=0; i<n; i++)
        {
            ai[i] = sc.nextInt();
        }
        for (i=0; i<n; i++)
        {
            if (ai[i] <= 0) 
            {
                break;
            }
            if (ai[i] < ai[k-1]) 
            {
                break;
            }
        }
        System.out.println(i);
    }
    
}
