/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulacion;

/**
 *
 * @author Desarrollo04
 */
public class Auto {
    /*private*/ //Esta variable no es accesible puesto a que esta en una visibilidad publica
    public boolean estado = false;
    
    public void encender(){
    estado = true;
    }
    
    public void apagar(){
    estado = false;
    }
}
