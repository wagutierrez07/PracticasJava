/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.matrices;

import java.util.*;
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i, j;
       int [][] matriz = new int[3][30];
       Scanner sc = new Scanner(System.in);

        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                System.out.println("Ingrese sus numeros: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(i=0; i<matriz.length; i++){
            for(j=0; j<matriz[i].length; j++){
                System.out.println("[" + i + "," + j + "] = " +matriz[i][j]);
               
            }
        }

    }

}
