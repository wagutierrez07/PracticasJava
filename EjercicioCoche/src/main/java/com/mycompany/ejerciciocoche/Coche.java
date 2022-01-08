/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocoche;

import java.util.*;

/**
 *
 * @author Indatech
 */
public class Coche {
    private List<Rueda> ruedas = null;
    private List<Motor> motores = null;
    private List<Puerta> puertas = null;
            
    public Coche(){
        ruedas = new ArrayList();
        
        for (int i = 0; i < 4; i++){
            ruedas.add(new Rueda());
        }
        motores = new LinkedList();
        puertas = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            motores.add(new Motor());
        }
        for (int i = 0; i < 5; i++) {
            puertas.add(new Puerta());
        }
    }
}
