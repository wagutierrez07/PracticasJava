/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expressionsandoperators;

/**
 *
 * @author administrador04
 */
public class ExpressionOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MOstrar numero
        int a;
        a=36;
        System.out.println("numero en cuestion" + a);
        
        //Introduciendo operadores principales
        int b;
        b=19;
        System.out.println(a + b);//Suma
        System.out.println(a - b);//Resta
        System.out.println(a * b);//Multiplicacion
        System.out.println(a / b);//Division
        System.out.println(a % b);//Modulo o residuos
        
        //incremento y decremento
        //Incremento
        int x;
        x=61;
        x++; //Postincremento que arrojara 62
        ++x; //Preincremento que arrojara
        System.out.println(x);
        
        //Decremento
        int y;
        y=45;
        y--; //Postdecremento que arrojara 44
        --y; //Predecremento que arrojara 44
        System.out.println(y);
        
        //operadores de comparacion
        int i;
        int j;
        i = 65;
        j = 56;
        /*i>j
        i<j
        */ 
        //aca aplicaremos algo de estructuras de control
        if(i==j){
        System.out.println("Este numero es igual");
        }
        else{
        System.out.println("Este numero no es igual");
        }
    }
    
}
