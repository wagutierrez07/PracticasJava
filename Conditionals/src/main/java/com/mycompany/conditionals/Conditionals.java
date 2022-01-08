/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conditionals;

/**
 *
 * @author administrador04
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 4;
       int b = 4;
       //Condicional if-else
       
       if(a<b)
        System.out.println(true);
       else
       System.out.println(false);
       
       if(a!=b)
       System.out.println(true);
       else
       System.out.println(false);
       
       
       //Sentencia Switch
       int dia  =  5;
       String dayString;
       
       switch(dia){
       
          case 1:
               dayString = "Hoy es Lunes";
           break;
           
          case 2:
               dayString = "Hoy es Martes";
           break;
           
          case 3:
               dayString = "Hoy es Miercoles";
           break;
           
          case 4:
               dayString = "Hoy es Jueves";
           break;
           
          case 5:
               dayString = "Hoy es Viernes";
           break;
           
          case 6:
               dayString = "Hoy es Sabado";
           break;
           
          case 7:
               dayString = "Hoy es Domingo";
           break;           
           
          default:
               dayString = "INvalido";
           break;           
           
       }
       System.out.println(dayString);
    }
    
}
