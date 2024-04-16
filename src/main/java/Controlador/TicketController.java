package Controlador;

import Modelo.MunicipioDAO;
import Modelo.NivelEducativoDAO;
import Modelo.ResponsableDAO;
import Modelo.TramiteDAO;
import Modelo.TicketDAO;
import Vista.VistaRegistroTicket;
import Modelo.Ticket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TicketController {

    private VistaRegistroTicket vista;
    private Map<String, String> mapaNombresYIdsMunicipios;
    private Map<Integer, String> mapaNombresYIdsResponsables; // Modificación aquí

    public TicketController(VistaRegistroTicket vista) {
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
                agregarTicket();
            }
        });

        this.vista.btn_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

    }

    private void cargarMunicipios() {
        mapaNombresYIdsMunicipios = MunicipioDAO.obtenerMapaNombresYIdsMunicipios();

        // Limpiar el combo box
        vista.cbxMunicipio.removeAllItems();

        // Agregar los nombres de municipios al combo box
        for (String nombreMunicipio : mapaNombresYIdsMunicipios.keySet()) {
            vista.cbxMunicipio.addItem(nombreMunicipio);
        }
    }

    private void cargarNiveles() {
        Map<String, Integer> mapaNombresYIdsNiveles = NivelEducativoDAO.obtenerMapaNombresYIdsNiveles();

        // Limpiar el combo box
        vista.cbxNivel.removeAllItems();

        // Agregar los nombres de niveles educativos al combo box
        for (String nombreNivel : mapaNombresYIdsNiveles.keySet()) {
            vista.cbxNivel.addItem(nombreNivel);
        }
    }

    private void cargarResponsables() {
        mapaNombresYIdsResponsables = ResponsableDAO.obtenerMapaNombresYIdsResponsables(); // Modificación aquí

        // Limpiar el combo box
        vista.cbxTitular.removeAllItems();

        // Agregar los nombres de los responsables al combo box
        for (Integer idResponsable : mapaNombresYIdsResponsables.keySet()) {
            String nombreResponsable = mapaNombresYIdsResponsables.get(idResponsable);
            vista.cbxTitular.addItem(nombreResponsable);
        }
    }
    
    private void cargarTramites() {
        Map<Integer, String> mapaNombresYIdsTramites = TramiteDAO.obtenerMapaNombresYIdsTramites();

        // Limpiar el combo box
        vista.cbxAsunto.removeAllItems();

        // Agregar los nombres de los responsables al combo box
        for (Integer idTramite : mapaNombresYIdsTramites.keySet()) {
            String nombreResponsable = mapaNombresYIdsTramites.get(idTramite);
            vista.cbxAsunto.addItem(nombreResponsable);
        }
    }

    private void agregarTicket() {
        // Aquí puedes crear un objeto Ticket con los datos de la vista y luego llamar al método insertarTicket de TicketDAO
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

}
