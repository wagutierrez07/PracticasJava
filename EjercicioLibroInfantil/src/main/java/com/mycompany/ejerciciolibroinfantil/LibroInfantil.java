/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciolibroinfantil;

/**
 *
 * @author Indatech
 */
public class LibroInfantil extends Libro{
    private int edadRecomendada = 18;

  public boolean esRecomendable (int edad){
      
      if (edad >= getEdadRecomendada())
          return true;
     else
          return false;
      
  }

    /**
     * @return the edadRecomendada
     */
    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    /**
     * @param edadRecomendada the edadRecomendada to set
     */
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
