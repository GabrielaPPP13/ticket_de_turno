package Modelo;

import Modelo.Conexion;
import Modelo.Ticket;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TicketDAO {

    public static String generarIdTicket(String municipio) {
        Conexion objetoConexion = Conexion.obtenerInstancia(); // Obtiene la instancia Singleton
        String idTicket = "";

        try {
            // Preparar la consulta SQL con un parámetro para el municipio
            String query = "SELECT COUNT(*) AS total FROM Ticket WHERE municipio = ?";
            PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(query);
            ps.setString(1, municipio);

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int totalTickets = rs.getInt("total") + 1;
                // Formatear el número de ticket para que tenga 4 dígitos
                String numeroTicket = String.format("%04d", totalTickets);
                // Concatenar el número de ticket formateado con el clave del municipio
                idTicket = municipio + numeroTicket;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el ID del ticket", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            objetoConexion.closeConnection();
        }

        return idTicket;
    }

    public static void insertarTicket(Ticket ticket) {
    Conexion objetoConexion = Conexion.obtenerInstancia();

    try {
        // Obtener el ID del ticket con el formato adecuado
        String idTicket = generarIdTicket(ticket.getMunicipio());

        // Preparar la llamada al procedimiento almacenado
        String spInsertarTicket = "{CALL InsertarTicket(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(spInsertarTicket);

        // Establecer los valores de los parámetros
        cs.setString(1, idTicket);
        cs.setString(2, ticket.getCurp());
        cs.setInt(3, ticket.getResponsable());
        cs.setString(4, ticket.getNombre());
        cs.setString(5, ticket.getApellido_paterno());
        cs.setString(6, ticket.getApellido_materno());
        cs.setString(7, ticket.getCorreo());
        cs.setString(8, ticket.getTelefono1());
        cs.setString(9, ticket.getTelefono2());
        cs.setInt(10, ticket.getTramite());
        cs.setInt(11, ticket.getNivel_educativo());
        cs.setString(12, ticket.getMunicipio());
        cs.setInt(13, ticket.getEstatus());
        cs.setString(14, ticket.getFecha_creacion());
        cs.setString(15, ticket.getFecha_modifiacion());
        cs.setString(16, ticket.getFecha_asignacion());

        // Ejecutar el procedimiento almacenado
        int filasAfectadas = cs.executeUpdate();

        // Verificar si se insertó el ticket correctamente
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Inserción exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar el ticket", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al insertar el ticket", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        objetoConexion.closeConnection();
    }
}

}

