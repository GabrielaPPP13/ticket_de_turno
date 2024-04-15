package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TramiteDAO {

    public static void insertarTramite(String tramite) {
        if (tramite.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearTramite (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, tramite);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static void actualizarTramite(int id_tramite, String tramite) {
        if (id_tramite <= 0 || tramite.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL ActualizarTramite (?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_tramite);
            cs.setString(2, tramite);

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

    public static Tramite buscarTramite(int id_tramite) {
        if (id_tramite <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        Tramite tramite = null;

        String consulta = "CALL ObtenerTramitePorID(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id_tramite);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un trámite, crea un objeto Tramite
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                int id = rs.getInt("id_tramite");
                String nombreTramite = rs.getString("tramite");
                tramite = new Tramite(id, nombreTramite);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return tramite;
    }

    public static void eliminarTramite(int id_tramite) {
        if (id_tramite <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL EliminarTramite (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_tramite);

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

    public static List<Tramite> obtenerTodosTramites() {
        List<Tramite> tramites = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "CALL ObtenerTodosTramites();"; // Corregido aquí

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                int id_tramite = rs.getInt("id_tramite");
                String nombreTramite = rs.getString("tramite");
                Tramite tramite = new Tramite(id_tramite, nombreTramite); // Corregido aquí
                tramites.add(tramite); // Corregido aquí
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return tramites;
    }

}
