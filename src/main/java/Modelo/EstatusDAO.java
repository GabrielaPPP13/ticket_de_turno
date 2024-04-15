package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstatusDAO {

    public static void insertarEstatus(String estatus) {
        if (estatus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearEstatus (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, estatus);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static void actualizarEstatus(int id_estatus, String estatus) {
        if (id_estatus <= 0 || estatus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL ActualizarEstatus (?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_estatus);
            cs.setString(2, estatus);

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

    public static Estatus buscarEstatus(int id_estatus) {
        if (id_estatus <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        Estatus estatus = null;

        String consulta = "CALL ObtenerEstatusPorID(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id_estatus);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un estatus, crea un objeto Estatus
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                int id = rs.getInt("id_estatus");
                String nombreEstatus = rs.getString("estatus");
                estatus = new Estatus(id, nombreEstatus);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return estatus;
    }

    public static void eliminarEstatus(int id_estatus) {
        if (id_estatus <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL EliminarEstatus (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_estatus);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún nivel educativo con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static List<Estatus> obtenerTodosEstatus() {
        List<Estatus> estatusList = new ArrayList<>(); // Cambiado el nombre de la lista para evitar confusión

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "CALL ObtenerTodosEstatus();"; // Corregido el nombre del procedimiento almacenado

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                int id_estatus = rs.getInt("id_estatus"); // Corregido el nombre de la columna
                String nombreEstatus = rs.getString("estatus");
                Estatus estatus = new Estatus(id_estatus, nombreEstatus);
                estatusList.add(estatus); // Agregado a la lista correctamente
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return estatusList; // Devolver la lista poblada correctamente
    }

}
