package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class MunicipioDAO {

    public static void insertarMunicipio(String id, String municipio) {
        if (municipio.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearMunicipio(?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, id);
            cs.setString(2, municipio);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static void actualizarMunicipio(String id_municipio, String txt_municipio) {
        if (txt_municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL ActualizarMunicipio(?, ?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, id_municipio);
            cs.setString(2, txt_municipio);

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

    public static Municipio buscarMunicipio(String id_municipio) {
        if (id_municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        Municipio municipio = null;

        String consulta = "CALL ObtenerMunicipioPorID(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, id_municipio);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un NivelEducativo, crea un objeto NivelEducativo
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                String id = rs.getString("id_municipio");
                String nivel = rs.getString("municipio");
                municipio = new Municipio(id, nivel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return municipio;
    }

    public static void eliminarMunicipio(String id_municipio) {
        if (id_municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL EliminarMunicipio(?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, id_municipio);

            int filasAfectadas = cs.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún municipio con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static List<Municipio> obtenerTodosMunicipios() {
        List<Municipio> municipios = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "CALL ObtenerTodosMunicipios();";

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                String id_municipio = rs.getString("id_municipio");
                String nombreMunicipio = rs.getString("municipio");
                Municipio municipio = new Municipio(id_municipio, nombreMunicipio);
                municipios.add(municipio);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return municipios;
    }

    public static Map<String, String> obtenerMapaNombresYIdsMunicipios() {
    Map<String, String> mapaNombresYIds = new HashMap<>();

    Conexion objetoConexion = Conexion.obtenerInstancia();
    String consulta = "CALL ObtenerTodosMunicipios();";

    try {
        Statement statement = objetoConexion.estableceConexion().createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        while (rs.next()) {
            String idMunicipio = rs.getString("id_municipio");
            String nombreMunicipio = rs.getString("municipio");
            mapaNombresYIds.put(nombreMunicipio, idMunicipio);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        objetoConexion.closeConnection();
    }

    return mapaNombresYIds;
}

}
