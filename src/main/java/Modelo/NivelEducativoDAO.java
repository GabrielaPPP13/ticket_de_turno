package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NivelEducativoDAO {

    public static void insertarNivelEducativo(String nivel_educativo) {
        if (nivel_educativo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearNivelEducativo(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, nivel_educativo);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static void actualizarNivelEducativo(int id_nivel_educativo, String nivel_educativo) {
        if (id_nivel_educativo <= 0 || nivel_educativo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL ActualizarNivelEducativo(?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_nivel_educativo);
            cs.setString(2, nivel_educativo);

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

    public static NivelEducativo buscarNivelEducativo(int id_nivel_educativo) {
        if (id_nivel_educativo <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        NivelEducativo nivelEducativo = null;

        String consulta = "CALL ObtenerNivelEducativoPorID(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id_nivel_educativo);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un NivelEducativo, crea un objeto NivelEducativo
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                int id = rs.getInt("id_nivel_educativo");
                String nivel = rs.getString("nivel_educativo");
                nivelEducativo = new NivelEducativo(id, nivel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return nivelEducativo;
    }

    public static void eliminarNivelEducativo(int id_nivel_educativo) {
        if (id_nivel_educativo <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL EliminarNivelEducativo(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, id_nivel_educativo);

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

    public static List<NivelEducativo> obtenerTodosNivelEducativo() {
        List<NivelEducativo> nivelesEducativos = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "CALL ObtenerTodosNivelesEducativos();";

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                int id_nivel_educativo = rs.getInt("id_nivel_educativo");
                String nivel_educativo = rs.getString("nivel_educativo"); // Corregido aquí
                NivelEducativo nivelEducativo = new NivelEducativo(id_nivel_educativo, nivel_educativo);
                nivelesEducativos.add(nivelEducativo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return nivelesEducativos;
    }

}
