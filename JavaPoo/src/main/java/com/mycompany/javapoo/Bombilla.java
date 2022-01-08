/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapoo;

/**
 *
 * @author Desarrollo04
 */
public class Bombilla {
    private boolean estado = false;
    
    public void encender(){
     estado = true;
    }
    
    public void apagar(){
    estado = false;
    }
    public void consultarEstado(){
    if (estado == true)
       System.out.println("bombilla encendida");
    else
       System.out.println("bombilla apagada");
    }
}
