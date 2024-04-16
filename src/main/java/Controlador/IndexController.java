package Controlador;

import Modelo.TicketDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.AdministradorDAO;
import Modelo.Ticket;
import Vista.Index;
import Vista.VistaAdminIndex;
import Vista.VistaConsultaUsuario;
import Vista.VistaInicioSesionAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IndexController {

   private Index vista;
    private String turnoTicket; 

    public IndexController(Index vista) {
        this.vista = vista;

        this.vista.btn_consulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarTramite();
            }
        });

        this.vista.btn_consulta_tramites.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarTodosLosTramites();
            }
        });

        this.vista.btn_admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaInicioSesionAdmin index = new VistaInicioSesionAdmin();
                index.setVisible(true);
            }
        });
    }

    private void consultarTodosLosTramites() {
        String curp = vista.txt_curp_consulta.getText(); 

        // Verificar que el campo CURP no esté vacío
        if (curp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un CURP válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Object[]> listaTramites = TicketDAO.obtenerTramitesPorCURP(curp);

        if (listaTramites.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron trámites asociados a este CURP", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) vista.tabla_tramites.getModel();
            model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

            for (Object[] fila : listaTramites) {
                model.addRow(fila);
            }
        }

    }

    private void consultarTramite() {
        String curp = vista.txt_curp.getText(); // Obtener el CURP del campo de texto
        turnoTicket = vista.txt_turno.getText(); // Guardar el turno_ticket en la variable de instancia

        // Verificar que los campos no estén vacíos
        if (curp.isEmpty() || turnoTicket.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un CURP y un turno válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Realizar la consulta de trámite en la base de datos
        Ticket ticket = TicketDAO.validarTramite(curp, turnoTicket);

        if (ticket != null) {
           VistaConsultaUsuario adminRol = new VistaConsultaUsuario();
                adminRol.setVisible(true);
                vista.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un trámite con el CURP y el turno especificados", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Getter para obtener el turno_ticket
    public String getTurnoTicket() {
        return turnoTicket;
    }
}