package Controlador;

import Modelo.Estatus;
import Modelo.EstatusDAO;
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

public class EstatusController {

    private VistaAdminEstatus vista;

    public EstatusController(VistaAdminEstatus vista) {
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
                agregarEstatus();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarEstatus();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarEstatus();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarEstatus();
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

    private void agregarEstatus() {
        String nivel_educativo = vista.txt_estatus.getText();
        EstatusDAO.insertarEstatus(nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_estatus.setText("");
    }

    private void actualizarEstatus() {
        int id_nivel_educativo = Integer.parseInt(vista.txt_id.getText());
        String nivel_educativo = vista.txt_estatus.getText();
        EstatusDAO.actualizarEstatus(id_nivel_educativo, nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_estatus.setText("");
    }

    private void buscarEstatus() {
        int id_tramite = Integer.parseInt(vista.txt_id.getText());
        Estatus tramite = EstatusDAO.buscarEstatus(id_tramite);
        if (tramite != null) {
            vista.txt_estatus.setText(tramite.getEstatus());
        }
    }

    private void eliminarEstatus() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        EstatusDAO.eliminarEstatus(id_administrador);
        vista.txt_id.setText("");
        vista.txt_estatus.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_estatus.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<Estatus> administradores = EstatusDAO.obtenerTodosEstatus();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (Estatus nivelEducativo : administradores) {
            Object[] rowData = {nivelEducativo.getId_estatus(), nivelEducativo.getEstatus()};
            model.addRow(rowData);
        }
    }

}
