/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlstructures;

/**
 *
 * @author administrador04
 */
public class Structures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        i=30;
        System.out.println("Muestra de la estructura If, If-else, Else if");
        //Estructura If, If-else, Else if
        
        //Sentencia if-else/else if
        if(i>25){
        System.out.println("Es mayor");
       }
        else if(i==25){
        System.out.println("Es igual al numero");
        }
        else{
        System.out.println("no es mayor");
        }
        
        //Ciclo While
        //int a = 1;
        int a = 65;
        //while(a<=1)
        System.out.println("Muestra de la instruccion While");
        while(a>=1){
        System.out.println("El resultado es " + a);
        //a++;
        a--;
        }
        
        
        //Ciclo Do-While
        
        int x = 10;
         System.out.println("Muestra del bucle Do-While:");
        do{
    
            System.out.println("El resultado es " + x);
            //x++;
            x+=10;
        }while(x<=100);
        
        //Bucle For
        System.out.println("Muestra del bucle For:");
        for(int y=1; y<=15; y++){
        System.out.println("El resultado es " + y);
        
        }
        
        
    }
    
}
