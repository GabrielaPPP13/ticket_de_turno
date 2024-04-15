package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Conexion instancia;
    private Connection conectar;
    private final String usuario = "root";
    private final String password = "sistemas";
    private final String bd = "ticketDeTurno";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    // Constructor privado para evitar instanciación externa
    private Conexion() {
        // Inicializa la conexión aquí
    }

    public static synchronized Conexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection estableceConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, password);
            System.out.println("Exito");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return conectar;
    }
    
    public void closeConnection() {
        if (conectar != null) {
            try {
                conectar.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.toString());
            }
        }
    }
}
