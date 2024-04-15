package Controlador;

import Modelo.Tramite;
import Modelo.TramiteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaAdmin;
import Vista.VistaAdminEstatus;
import Vista.VistaAdminIndex;
import Vista.VistaAdminMunicipio;
import Vista.VistaAdminNivelEducativo;
import Vista.VistaAdminResponsable;
import Vista.VistaAdminTramite;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TramiteController {

    private VistaAdminTramite vista;

    public TramiteController(VistaAdminTramite vista) {
        this.vista = vista;

        this.vista.btn_inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminIndex adminIndex = new VistaAdminIndex();
                adminIndex.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnRol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin adminRol = new VistaAdmin();
                adminRol.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnTramites.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminTramite adminTramite = new VistaAdminTramite();
                adminTramite.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnNivel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminNivelEducativo adminNivelEducativo = new VistaAdminNivelEducativo();
                adminNivelEducativo.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnMunicipio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminMunicipio adminAdminMunicipio = new VistaAdminMunicipio();
                adminAdminMunicipio.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnResponsable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminResponsable adminResponsable = new VistaAdminResponsable();
                adminResponsable.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btnEstatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminEstatus adminAdminEstatus = new VistaAdminEstatus();
                adminAdminEstatus.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTramite();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTramite();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarTramite();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTramite();
            }
        });
        this.vista.btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        this.vista.btn_mostar_todos_los_datos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodosLosDatos();
            }
        });

    }

    private void agregarTramite() {
        String nivel_educativo = vista.txt_tramite.getText();
        TramiteDAO.insertarTramite(nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_tramite.setText("");
    }

    private void actualizarTramite() {
        int id_nivel_educativo = Integer.parseInt(vista.txt_id.getText());
        String nivel_educativo = vista.txt_tramite.getText();
        TramiteDAO.actualizarTramite(id_nivel_educativo, nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_tramite.setText("");
    }

    private void buscarTramite() {
        int id_tramite = Integer.parseInt(vista.txt_id.getText());
        Tramite tramite = TramiteDAO.buscarTramite(id_tramite);
        if (tramite != null) {
            vista.txt_tramite.setText(tramite.getTramite());
        }
    }

    private void eliminarTramite() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        TramiteDAO.eliminarTramite(id_administrador);
        vista.txt_id.setText("");
        vista.txt_tramite.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_tramite.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<Tramite> administradores = TramiteDAO.obtenerTodosTramites();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (Tramite nivelEducativo : administradores) {
            Object[] rowData = {nivelEducativo.getId_tramite(), nivelEducativo.getTramite()};
            model.addRow(rowData);
        }
    }

}
