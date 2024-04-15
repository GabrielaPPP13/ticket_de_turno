package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AdministradorDAO {

    public static void insertarAdministrador(String user_name, String contraseña) {
        if (user_name.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearAdministrador(?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, user_name);
            cs.setString(2, contraseña);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static void actualizarAdministrador(int id_administrador, String user_name, String contraseña) {
        if (id_administrador <= 0 || user_name.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL ActualizarAdministrador(?, ?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_administrador);
            cs.setString(2, user_name);
            cs.setString(3, contraseña);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún administrador con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static Administrador buscarAdministrador(int id_administrador) {
        if (id_administrador <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        Administrador administrador = null;

        String consulta = "CALL ObtenerAdministradorPorID(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id_administrador);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un administrador, crea un objeto Administrador
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                String usuario = rs.getString("user_name");
                String contraseña = rs.getString("contraseña");
                administrador = new Administrador(id_administrador, usuario, contraseña);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return administrador;
    }

    public static void eliminarAdministrador(int id_administrador) {
        if (id_administrador <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL EliminarAdministrador(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_administrador);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún administrador con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static List<Administrador> obtenerTodosAdministradores() {
        List<Administrador> administradores = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "SELECT id_administrador, user_name, contraseña FROM Administrador;";

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                int id = rs.getInt("id_administrador");
                String usuario = rs.getString("user_name");
                String contraseña = rs.getString("contraseña");
                Administrador administrador = new Administrador(id, usuario, contraseña);
                administradores.add(administrador);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return administradores;
    }

}
