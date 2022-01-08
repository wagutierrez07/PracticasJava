/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciolibroinfantil;

/**
 *
 * @author Indatech
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroInfantil l = new LibroInfantil();
        
        l.setEdadRecomendada(35);
        
        if (l.esRecomendable(19))
            System.out.println("es recomendable");
        else
            System.out.println("NO es recomendable");
    }
    
}
