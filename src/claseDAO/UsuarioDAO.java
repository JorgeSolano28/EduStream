/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseDAO;
import java.sql.*;
import claseConexion.Conexion;
import clasePOJOS.Rol;

/**
 *
 * @author Luis
 */
public class UsuarioDAO {
    
    //Insertar usuario
    public void insertarUsuario(String nombre, String email, String password, Rol rol) {
        String query = "INSERT INTO usuarios(nombre,email,password,rol) VALUES (?,?,?,?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, rol.name()); // "ESTUDIANTE" o "PROFESOR"*************

            ps.executeUpdate();
            System.out.println("Dato insertado correctamente");

        } catch (SQLException e) {
            System.out.println("ERROR al insertar dato");
            e.printStackTrace();
        }
    }
    
    //Leer usuario
    public void leerUsuario() {
        String query = "SELECT * FROM usuarios";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String rol = rs.getString("rol");

                System.out.println("Id de Usuario: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Email: " + email);
                System.out.println("Rol: " + rol);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("ERROR al leer datos");
            e.printStackTrace();
        }
    }
    
    //Actualizar usuario
    public void actualizarUsuario(int id, String nombre, String email, String password, String rol) {
        String query = "UPDATE usuarios SET nombre=?, email=?, password=?, rol=? WHERE id_usuario=?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, rol);
            ps.setInt(5, id);

            ps.executeUpdate();
            System.out.println("Dato actualizado correctamente");

        } catch (SQLException e) {
            System.out.println("ERROR al actualizar dato");
            e.printStackTrace();
        }
    }
    
    //Eliminar usuario
    public void eliminarUsuario(int id) {
        String query = "DELETE FROM usuarios WHERE id_usuario=?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Dato eliminado correctamente");

        } catch (SQLException e) {
            System.out.println("ERROR al eliminar dato");
            e.printStackTrace();
        }
    }
    
}