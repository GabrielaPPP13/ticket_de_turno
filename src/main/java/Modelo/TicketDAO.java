package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TicketDAO {

    public static void insertarTicket(String curp, int responsable, String nombre, String apellido_paterno,
            String apellido_materno, String correo, String telefono1, String telefono2,
            int tramite, int nivel_educativo, String municipio) {
        // Verificar que ningún campo esté vacío
        if (curp.isEmpty() || nombre.isEmpty() || apellido_paterno.isEmpty() || apellido_materno.isEmpty()
                || correo.isEmpty() || telefono1.isEmpty() || telefono2.isEmpty() || municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "CALL InsertarTicket (?,?,?,?,?,?,?,?,?,?,?);";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, curp);
            cs.setInt(2, responsable);
            cs.setString(3, nombre);
            cs.setString(4, apellido_paterno);
            cs.setString(5, apellido_materno);
            cs.setString(6, correo);
            cs.setString(7, telefono1);
            cs.setString(8, telefono2);
            cs.setInt(9, tramite);
            cs.setInt(10, nivel_educativo);
            cs.setString(11, municipio);

            cs.execute();

            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Llamar al procedimiento almacenado para asignar turno_ticket
            asignarTurnoTicket(municipio);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    private static void asignarTurnoTicket(String municipio) {
        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "CALL AsignarTurnoTicket(?)";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, municipio);
            cs.execute();

            // Obtener el turno_ticket después de asignarlo
            ResultSet rs = cs.getResultSet();
            if (rs.next()) {
                String turnoTicket = rs.getString("turno_ticket");
                JOptionPane.showMessageDialog(null, "Turno asignado: " + turnoTicket, "Turno asignado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el turno asignado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al asignar el turno del ticket", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static List<Object[]> obtenerTramitesPorCURP(String curp) {
        List<Object[]> tramites = new ArrayList<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        String consulta = "SELECT turno_ticket, fecha_creacion FROM ticket WHERE curp = ?";
        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, curp);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                String turno_ticket = rs.getString("turno_ticket");
                String fecha_creacion = rs.getString("fecha_creacion");
                Object[] fila = {turno_ticket, fecha_creacion};
                tramites.add(fila);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener trámites de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return tramites;
    }

    public static Ticket validarTramite(String curp, String turnoTicket) {
        Conexion objetoConexion = Conexion.obtenerInstancia();
        Ticket ticket = null;

        String consulta = "SELECT id_ticket, curp, turno_ticket FROM Ticket WHERE curp = ? AND turno_ticket = ?;";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, curp);
            cs.setString(2, turnoTicket);
            ResultSet rs = cs.executeQuery();

            // Si se encuentra el ticket con la CURP y el turno correctos
            // crea un objeto Ticket con los datos obtenidos del ResultSet
            if (rs.next()) {
                String idTicket = rs.getString("id_ticket");
                String curpTicket = rs.getString("curp");
                // No es necesario declarar turnoTicket nuevamente aquí
                ticket = new Ticket(idTicket, turnoTicket, curpTicket, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return ticket;
    }

    public static void actualizarTicket(String curp, int responsable, String nombre, String apellido_paterno,
            String apellido_materno, String correo, String telefono1, String telefono2,
            int tramite, int nivel_educativo, String municipio) {
        // Verificar que ningún campo esté vacío
        if (curp.isEmpty() || nombre.isEmpty() || apellido_paterno.isEmpty() || apellido_materno.isEmpty()
                || correo.isEmpty() || telefono1.isEmpty() || telefono2.isEmpty() || municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "UPDATE Ticket SET responsable = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, "
                + "correo = ?, telefono1 = ?, telefono2 = ?, tramite = ?, nivel_educativo = ?, municipio = ? WHERE curp = ?";

        try {
            PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);

            ps.setInt(1, responsable);
            ps.setString(2, nombre);
            ps.setString(3, apellido_paterno);
            ps.setString(4, apellido_materno);
            ps.setString(5, correo);
            ps.setString(6, telefono1);
            ps.setString(7, telefono2);
            ps.setInt(8, tramite);
            ps.setInt(9, nivel_educativo);
            ps.setString(10, municipio);
            ps.setString(11, curp);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún ticket con la CURP proporcionada", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static Ticket consultarTicketPorTurno(String turnoTicket) {
        Conexion objetoConexion = Conexion.obtenerInstancia();
        Ticket ticket = null;

        String consulta = "SELECT id_ticket, curp, nombre, apellido_paterno, apellido_materno, correo, telefono1, telefono2, municipio, fecha_creacion, fecha_modificacion, fecha_asignacion, tramite, nivel_educativo, estatus, responsable FROM Ticket WHERE turno_ticket = ?";

        try {
            PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);
            ps.setString(1, turnoTicket);
            ResultSet rs = ps.executeQuery();

            // Si se encuentra el ticket con el turno correcto
            // crea un objeto Ticket con los datos obtenidos del ResultSet
            if (rs.next()) {
                String idTicket = rs.getString("id_ticket");
                String curp = rs.getString("curp");
                String nombre = rs.getString("nombre");
                String apellidoPaterno = rs.getString("apellido_paterno");
                String apellidoMaterno = rs.getString("apellido_materno");
                String correo = rs.getString("correo");
                String telefono1 = rs.getString("telefono1");
                String telefono2 = rs.getString("telefono2");
                String municipio = rs.getString("municipio");
                String fechaCreacion = rs.getString("fecha_creacion");
                String fechaModificacion = rs.getString("fecha_modificacion");
                String fechaAsignacion = rs.getString("fecha_asignacion");
                int tramite = rs.getInt("tramite");
                int nivelEducativo = rs.getInt("nivel_educativo");
                int estatus = rs.getInt("estatus");
                int responsable = rs.getInt("responsable");

                ticket = new Ticket(idTicket, turnoTicket, curp, nombre, apellidoPaterno, apellidoMaterno, correo, telefono1, telefono2, municipio, fechaCreacion, fechaModificacion, fechaAsignacion, tramite, nivelEducativo, estatus, responsable);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return ticket;
    }

    public static String[] consultarInformacionAdicional(String turnoTicket) {
        Conexion objetoConexion = Conexion.obtenerInstancia();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String[] informacion = new String[3];

        try {
            String query = "SELECT nombre_tramite, fecha_asignacion, estatus FROM ticket WHERE turno_ticket = ?";
            stmt = objetoConexion.estableceConexion().prepareStatement(query);
            stmt.setString(1, turnoTicket);
            rs = stmt.executeQuery();

            if (rs.next()) {
                informacion[0] = rs.getString("nombre_tramite");
                informacion[1] = rs.getString("fecha_asignacion");
                informacion[2] = rs.getString("estatus");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                // No necesitas cerrar la conexión aquí, ya que se cierra en el método estableceConexion()
            } catch (SQLException ex) {
                Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return informacion;
    }

    public static String consultarFechaAsignacion(String turnoTicket) {
        Conexion objetoConexion = Conexion.obtenerInstancia();
        String fechaAsignacion = null;

        String consulta = "SELECT fecha_asignacion FROM Ticket WHERE turno_ticket = ?";

        try (PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta)) {
            ps.setString(1, turnoTicket);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    fechaAsignacion = rs.getString("fecha_asignacion");
                    System.out.println("Fecha de Asignación: " + fechaAsignacion); // Imprimir en la consola
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return fechaAsignacion; // Devuelve la fecha de asignación
    }

    public static void eliminarTicketPorTurno(String turnoTicket) {
        Conexion objetoConexion = Conexion.obtenerInstancia();

        String consulta = "DELETE FROM Ticket WHERE turno_ticket = ?";

        try {
            PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);
            ps.setString(1, turnoTicket);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Ticket eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún ticket con el turno especificado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar el ticket de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    public static Map<String, Integer> obtenerSolicitudesPorMunicipio() {
        Map<String, Integer> solicitudesPorMunicipio = new HashMap<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer conexión utilizando el objetoConexion existente
            Connection connection = objetoConexion.estableceConexion();

            // Consulta SQL para obtener la cantidad de solicitudes por municipio
            String query = "SELECT municipio, COUNT(*) AS cantidad FROM Ticket GROUP BY municipio";

            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            // Iterar sobre los resultados y almacenar la cantidad de solicitudes por municipio en el mapa
            while (resultSet.next()) {
                String municipio = resultSet.getString("municipio");
                int cantidad = resultSet.getInt("cantidad");
                solicitudesPorMunicipio.put(municipio, cantidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return solicitudesPorMunicipio;
    }

    public static Map<String, Integer> obtenerSolicitudesPorEstatus() {
        Map<String, Integer> solicitudesPorEstatus = new HashMap<>();

        Conexion objetoConexion = Conexion.obtenerInstancia();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer conexión utilizando el objetoConexion existente
            Connection connection = objetoConexion.estableceConexion();

            // Consulta SQL para obtener la cantidad de solicitudes por estatus
            String query = "SELECT estatus, COUNT(*) AS cantidad FROM Ticket GROUP BY estatus";

            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            // Iterar sobre los resultados y almacenar la cantidad de solicitudes por estatus en el mapa
            while (resultSet.next()) {
                String estatus = resultSet.getString("estatus");
                int cantidad = resultSet.getInt("cantidad");
                solicitudesPorEstatus.put(estatus, cantidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return solicitudesPorEstatus;
    }

    public static void insertarTicket2(String curp, int responsable, String nombre, String apellido_paterno,
            String apellido_materno, String correo, String telefono1, String telefono2,
            int tramite, int nivel_educativo, String municipio, int estatus) {
        // Verificar que ningún campo esté vacío
        if (curp.isEmpty() || nombre.isEmpty() || apellido_paterno.isEmpty() || apellido_materno.isEmpty()
                || correo.isEmpty() || telefono1.isEmpty() || telefono2.isEmpty() || municipio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

        String consulta = "INSERT INTO Ticket (curp, responsable, nombre, apellido_paterno, apellido_materno, correo, telefono1, telefono2, tramite, nivel_educativo, municipio, estatus) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);

            ps.setString(1, curp);
            ps.setInt(2, responsable);
            ps.setString(3, nombre);
            ps.setString(4, apellido_paterno);
            ps.setString(5, apellido_materno);
            ps.setString(6, correo);
            ps.setString(7, telefono1);
            ps.setString(8, telefono2);
            ps.setInt(9, tramite);
            ps.setInt(10, nivel_educativo);
            ps.setString(11, municipio);
            ps.setInt(12, estatus);

            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Llamar al método para asignar turno_ticket
                asignarTurnoTicket(municipio);
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }
    }

    
    public static void actualizarTicket2(String curp, int responsable, String nombre, String apellido_paterno,
        String apellido_materno, String correo, String telefono1, String telefono2,
        int tramite, int nivel_educativo, String municipio, int estatus) {
    // Verificar que ningún campo esté vacío
    if (curp.isEmpty() || nombre.isEmpty() || apellido_paterno.isEmpty() || apellido_materno.isEmpty()
            || correo.isEmpty() || telefono1.isEmpty() || telefono2.isEmpty() || municipio.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton

    String consulta = "UPDATE Ticket SET responsable = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, "
            + "correo = ?, telefono1 = ?, telefono2 = ?, tramite = ?, nivel_educativo = ?, municipio = ?, estatus = ? WHERE curp = ?";

    try {
        PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);

        ps.setInt(1, responsable);
        ps.setString(2, nombre);
        ps.setString(3, apellido_paterno);
        ps.setString(4, apellido_materno);
        ps.setString(5, correo);
        ps.setString(6, telefono1);
        ps.setString(7, telefono2);
        ps.setInt(8, tramite);
        ps.setInt(9, nivel_educativo);
        ps.setString(10, municipio);
        ps.setInt(11, estatus);
        ps.setString(12, curp);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Actualización exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún ticket con la CURP proporcionada", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        objetoConexion.closeConnection();
    }
}

}
