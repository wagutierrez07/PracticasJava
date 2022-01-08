/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.encapsulacion;

/**
 *
 * @author Desarrollo04
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Auto au = new Auto();
       au.encender();
       
       //Este atributo marcara error siempre y cuando el modificador este en privado
       au.estado = false;
    }
    
}
