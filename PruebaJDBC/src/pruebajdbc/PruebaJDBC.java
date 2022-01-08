/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebajdbc;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
public class PruebaJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try {
            //Conectar DB
            Class.forName("com.mysql.cj.jdbc.Driver");
           //Data de conexion
            String login = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/mydb";
            
            // Conectar
            Connection conexion = DriverManager.getConnection(url, login, password);

            // Recuperar el contenido de la tabla Pelicula
            String query = "select * from Pelicula";
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);

            // Lista de películas
            List<Peliculas> lista = new LinkedList<Peliculas>();

            // Crear objetos y guardarlos en la lista
            while (resultado.next()) {

                Peliculas p = new Peliculas();

                p.setIdpelicula(resultado.getInt("idpelicula"));
                p.setTitulo(resultado.getString("titulo"));
                p.setSinopsis(resultado.getString("sinopsis"));
                p.setFecha(resultado.getInt("fecha"));

                lista.add(p);
            }

            // Volcar la lista para ver el contenido
            for (Peliculas p : lista) {
                System.out.println(p);
            }

            // Desconectar
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PruebaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
