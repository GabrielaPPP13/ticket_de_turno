package Controlador;

import Modelo.MunicipioDAO;
import Modelo.NivelEducativoDAO;
import Modelo.ResponsableDAO;
import Modelo.TramiteDAO;
import Modelo.TicketDAO;
import Vista.VistaConsultaTicket;
import Modelo.Ticket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JOptionPane;

public class TicketConsultaController {

    private VistaConsultaTicket vista;
    private Map<String, String> mapaNombresYIdsMunicipios;
    private Map<Integer, String> mapaNombresYIdsResponsables;

    private Map<Integer, String> mapaNombresYIdsTramites;
    private Map<String, Integer> mapaNombresYIdsNiveles;
   private Map<String, Integer> getNivelEducativo;

    


    public TicketConsultaController(VistaConsultaTicket vista) {
        this.vista = vista;

        cargarMunicipios();
        cargarNiveles();
        cargarResponsables();
        cargarTramites();

        this.vista.btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vista.btn_registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTicket();
            }
        });

        this.vista.btn_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTicketPorTurno();
            }
        });

        this.vista.btn_consultar_turno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarTicketPorTurno();
               // consultarTicketPorTurno2();
            }
        });

    }

    private void cargarMunicipios() {
        mapaNombresYIdsMunicipios = MunicipioDAO.obtenerMapaNombresYIdsMunicipios();

        vista.cbxMunicipio.removeAllItems();

        for (String nombreMunicipio : mapaNombresYIdsMunicipios.keySet()) {
            vista.cbxMunicipio.addItem(nombreMunicipio);
        }
    }

    private void cargarNiveles() {
        Map<String, Integer> mapaNombresYIdsNiveles = NivelEducativoDAO.obtenerMapaNombresYIdsNiveles();

        vista.cbxNivel.removeAllItems();

        for (String nombreNivel : mapaNombresYIdsNiveles.keySet()) {
            vista.cbxNivel.addItem(nombreNivel);
        }
    }

    private void cargarResponsables() {
        mapaNombresYIdsResponsables = ResponsableDAO.obtenerMapaNombresYIdsResponsables();

        vista.cbxTitular.removeAllItems();

        for (Integer idResponsable : mapaNombresYIdsResponsables.keySet()) {
            String nombreResponsable = mapaNombresYIdsResponsables.get(idResponsable);
            vista.cbxTitular.addItem(nombreResponsable);
        }
    }

    private void cargarTramites() {
        Map<Integer, String> mapaNombresYIdsTramites = TramiteDAO.obtenerMapaNombresYIdsTramites();

        vista.cbxAsunto.removeAllItems();

        for (Integer idTramite : mapaNombresYIdsTramites.keySet()) {
            String nombreResponsable = mapaNombresYIdsTramites.get(idTramite);
            vista.cbxAsunto.addItem(nombreResponsable);
        }
    }

    private void actualizarTicket() {
        // Obtener la CURP del campo de texto en la vista
        String curp = vista.txtCurp2.getText();

        // Validar el formato de la CURP
        if (!validarCURP(curp)) {
            JOptionPane.showMessageDialog(null, "La CURP ingresada no tiene un formato válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Si la CURP es válida, continuar con el proceso de actualización del ticket
        String nombre = vista.txtNombre.getText();
        String apellidoPaterno = vista.txtApellidoP.getText();
        String apellidoMaterno = vista.txtApellidoM.getText();
        String correo = vista.txtCorreo.getText();
        String telefono1 = vista.txtTelefono1.getText();
        String telefono2 = vista.txtTelefono2.getText();
        String municipio = obtenerIdMunicipio((String) vista.cbxMunicipio.getSelectedItem());
        int tramite = obtenerIdTramite((String) vista.cbxAsunto.getSelectedItem());
        int nivelEducativo = obtenerIdNivel((String) vista.cbxNivel.getSelectedItem());
        int responsable = obtenerIdResponsable((String) vista.cbxTitular.getSelectedItem());

        // Actualizar el ticket en la base de datos
        TicketDAO.actualizarTicket(curp, responsable, nombre, apellidoPaterno, apellidoMaterno, correo, telefono1, telefono2, tramite, nivelEducativo, municipio);

        // Limpiar los campos del formulario después de la actualización
        limpiar();
    }

    // Método para validar el formato de la CURP usando una expresión regular
    private boolean validarCURP(String curp) {
        // Expresión regular para validar el formato de la CURP
        String regex = "[A-Z]{4}[0-9]{6}[HM]{1}[A-Z]{5}[0-9]{2}";

        // Verificar si la CURP coincide con la expresión regular
        return curp.matches(regex);
    }

    private void limpiar() {
        vista.txtApellidoM.setText("");
        vista.txtApellidoP.setText("");
        vista.txtCorreo.setText("");
        vista.txtCurp2.setText("");
        vista.txtNombre.setText("");
        vista.txtTelefono1.setText("");
        vista.txtTelefono2.setText("");
    }

    private int obtenerIdNivel(String nombreNivel) {
        Map<String, Integer> mapaNombresYIdsNiveles = NivelEducativoDAO.obtenerMapaNombresYIdsNiveles();

        for (String nombre : mapaNombresYIdsNiveles.keySet()) {
            if (nombre.equals(nombreNivel)) {
                return mapaNombresYIdsNiveles.get(nombre);
            }
        }

        return -1;
    }

    private int obtenerIdResponsable(String nombreResponsable) {
        for (Integer idResponsable : mapaNombresYIdsResponsables.keySet()) {
            if (mapaNombresYIdsResponsables.get(idResponsable).equals(nombreResponsable)) {
                return idResponsable;
            }
        }
        return -1;
    }

    private int obtenerIdTramite(String nombreTramite) {
        Map<Integer, String> mapaNombresYIdsTramites = TramiteDAO.obtenerMapaNombresYIdsTramites();

        for (Integer idTramite : mapaNombresYIdsTramites.keySet()) {
            if (mapaNombresYIdsTramites.get(idTramite).equals(nombreTramite)) {
                return idTramite;
            }
        }

        return -1;
    }

    private int obtenerIdEstatus() {
        // Implementa la lógica para obtener el ID de estatus
        return 1;
    }

    public static String obtenerIdMunicipio(String nombreMunicipio) {
        Map<String, String> mapaNombresYIds = MunicipioDAO.obtenerMapaNombresYIdsMunicipios();

        for (String nombre : mapaNombresYIds.keySet()) {
            if (nombre.equals(nombreMunicipio)) {
                return mapaNombresYIds.get(nombre);
            }
        }

        return null; // Si no se encuentra el nombre del municipio, retorna null
    }

private void consultarTicketPorTurno() {
        // Obtener el turno ingresado por el usuario
        String turnoTicket = vista.txt_turno.getText();

        // Validar que se haya ingresado un turno
        if (turnoTicket.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de turno", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Realizar la consulta del ticket por turno en la base de datos
        Ticket ticket = TicketDAO.consultarTicketPorTurno(turnoTicket);

        // Verificar si se encontró un ticket con el turno especificado
        if (ticket != null) {
            // Si se encontró el ticket, llenar los campos de la vista con la información
            llenarCampos(ticket);
        } else {
            // Si no se encontró el ticket, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "No se encontró ningún ticket con el turno especificado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarCampos(Ticket ticket) {
        vista.txtCurp2.setText(ticket.getCurp());
        vista.txtNombre.setText(ticket.getNombre());
        vista.txtApellidoP.setText(ticket.getApellido_paterno());
        vista.txtApellidoM.setText(ticket.getApellido_materno());
        vista.txtCorreo.setText(ticket.getCorreo());
        vista.txtTelefono1.setText(ticket.getTelefono1());
        vista.txtTelefono2.setText(ticket.getTelefono2());
        vista.txt_info.setText(ticket.getFecha_asignacion());

        // Seleccionar el municipio en el ComboBox
        for (String nombreMunicipio : mapaNombresYIdsMunicipios.keySet()) {
            if (mapaNombresYIdsMunicipios.get(nombreMunicipio).equals(ticket.getMunicipio())) {
                vista.cbxMunicipio.setSelectedItem(nombreMunicipio);
                break;
            }
        }

        // Seleccionar el tramite en el ComboBox
        for (Integer idTramite : mapaNombresYIdsTramites.keySet()) {
            if (idTramite == ticket.getTramite()) {
                vista.cbxAsunto.setSelectedItem(mapaNombresYIdsTramites.get(idTramite));
                break;
            }
        }

        // Seleccionar el nivel educativo en el ComboBox
        for (String nombreNivel : mapaNombresYIdsNiveles.keySet()) {
            if (mapaNombresYIdsNiveles.get(nombreNivel) == ticket.getNivel_educativo()) {
                vista.cbxNivel.setSelectedItem(nombreNivel);
                break;
            }
        }

        // Seleccionar el responsable en el ComboBox
        for (Integer idResponsable : mapaNombresYIdsResponsables.keySet()) {
            if (idResponsable == ticket.getResponsable()) {
                vista.cbxTitular.setSelectedItem(mapaNombresYIdsResponsables.get(idResponsable));
                break;
            }
        }
    }
    
private void consultarTicketPorTurno2(Ticket ticket) {
    String turnoTicket = vista.txt_turno.getText();
    
    if (turnoTicket.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de turno", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
   TicketDAO ticketDAO = new TicketDAO();
String fechaAsignacion = ticketDAO.consultarFechaAsignacion(turnoTicket);

    
    if (fechaAsignacion != null) {
        JOptionPane.showMessageDialog(null, "Fecha de Asignación: " + fechaAsignacion, "Fecha de Asignación", JOptionPane.INFORMATION_MESSAGE);
        vista.txt_info.setText("Fecha de Asignación: " + ticket.getFecha_asignacion());
    } else {
        JOptionPane.showMessageDialog(null, "Turno no asignado", "Error", JOptionPane.ERROR_MESSAGE);
        vista.txt_info.setText("Fecha de Asignación: No asignado");
    }
}

private void eliminarTicketPorTurno() {
        // Obtener el turno ingresado por el usuario desde el campo de texto
        String turnoTicket = vista.txt_turno.getText();

        // Validar que se haya ingresado un turno
        if (turnoTicket.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de turno", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Llama al método en el DAO para eliminar el ticket por su turno
        TicketDAO.eliminarTicketPorTurno(turnoTicket);
        limpiar();
    }


}