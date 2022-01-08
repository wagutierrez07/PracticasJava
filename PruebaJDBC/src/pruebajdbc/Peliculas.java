/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajdbc;

/**
 *
 * @author Indatech
 */
public class Peliculas {
    private int idpelicula;
    private String titulo;
    private String sinopsis;
    private int fecha;

 

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    /**
     * @return the idpelicula
     */
    public int getIdpelicula() {
        return idpelicula;
    }

    /**
     * @param idpelicula the idpelicula to set
     */
    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "idpelicula=" + idpelicula + ", titulo=" + titulo + ", fecha=" + fecha + '}';
    }
    
    
}
