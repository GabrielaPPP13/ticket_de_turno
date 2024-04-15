package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ResponsableDAO {

    public static void insertarResponsable(String responsable) {
        if (responsable.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL CrearResponsable (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, responsable);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

public static void actualizarResponsable(int id_responsable, String responsable) {
    // Verificar que el ID sea válido y que el nombre del responsable no esté vacío
    if (id_responsable <= 0 || responsable.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos y seleccione un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Conexion objetoConexion = Conexion.obtenerInstancia();

    // Consulta SQL para actualizar el responsable con el ID proporcionado
    String consulta = "CALL ActualizarResponsable (?, ?);";

    try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

        // Establecer los parámetros de la consulta
        cs.setInt(1, id_responsable);
        cs.setString(2, responsable);

        // Ejecutar la consulta y obtener el número de filas afectadas
        int filasAfectadas = cs.executeUpdate();

        // Verificar si se actualizó algún registro
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mostrar un mensaje si no se encontró ningún responsable con el ID proporcionado
            JOptionPane.showMessageDialog(null, "No se encontró ningún responsable con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        // Mostrar un mensaje de error si ocurre una excepción durante la actualización
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar la conexión a la base de datos
        objetoConexion.closeConnection();
    }
}



    public static Responsable buscarResponsable(int id_responsable) {
        if (id_responsable <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia();
        Responsable responsable = null;

        String consulta = "CALL ObtenerResponsablePorID (?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, id_responsable);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra un trámite, crea un objeto Tramite
            // con los datos obtenidos del ResultSet
            if (rs.next()) {
                int id = rs.getInt("id_responsable");
                String nombreResponsable = rs.getString("responsable");
                responsable = new Responsable(id, nombreResponsable);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return responsable;
    }

public static void eliminarResponsable(int id_responsable) {
    // Verificar que el ID sea válido
    if (id_responsable <= 0) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Conexion objetoConexion = Conexion.obtenerInstancia();

    String consulta = "CALL EliminarResponsable(?);";

    try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

        cs.setInt(1, id_responsable);

        int filasAfectadas = cs.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Eliminación exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún responsable con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al eliminar de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        objetoConexion.closeConnection();
    }
}


    public static List<Responsable> obtenerTodosResponsables() {
        List<Responsable> responsables = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "CALL ObtenerTodosResponsables();";

        try {
            Statement statement = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = statement.executeQuery(consulta);

            while (rs.next()) {
                int id_responsable = rs.getInt("id_responsable");
                String nombreResponsable = rs.getString("responsable");
                Responsable responsable = new Responsable(id_responsable, nombreResponsable);
                responsables.add(responsable);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return responsables;
    }

}
