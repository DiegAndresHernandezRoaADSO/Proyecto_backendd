package conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Conexion {
    
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_proyecto", "root", "");
            return cn;
        } catch (Exception e) {
            System.out.println("Error en la conexión local: " + e.getMessage());
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection cn = conectar();
        if (cn != null) {
            System.out.println("Conexión exitosa.");
        } else {
            System.out.println("Fallo en la conexión.");
        }
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}