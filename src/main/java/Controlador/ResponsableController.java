package Controlador;

import Modelo.Responsable;
import Modelo.ResponsableDAO;
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

public class ResponsableController {

    private VistaAdminResponsable vista;

    public ResponsableController(VistaAdminResponsable vista) {
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
                agregarResponsable();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarResponsable();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarResponsable();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarResponsable();
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

    private void agregarResponsable() {
        String nivel_educativo = vista.txt_responsable.getText();
        ResponsableDAO.insertarResponsable(nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_responsable.setText("");
    }

    private void actualizarResponsable() {
        int id_responsable  = Integer.parseInt(vista.txt_id.getText());
        String responsable = vista.txt_responsable.getText();
        ResponsableDAO.actualizarResponsable(id_responsable , responsable);
        vista.txt_id.setText("");
        vista.txt_responsable.setText("");
    }

    private void buscarResponsable() {
        int id_responsable  = Integer.parseInt(vista.txt_id.getText());
        Responsable responsable = ResponsableDAO.buscarResponsable(id_responsable );
        if (responsable != null) {
            vista.txt_responsable.setText(responsable.getResponsable());
        }
    }

    private void eliminarResponsable() {
        int id_responsable  = Integer.parseInt(vista.txt_id.getText());
        ResponsableDAO.eliminarResponsable(id_responsable );
        vista.txt_id.setText("");
        vista.txt_responsable.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_responsable.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<Responsable> administradores = ResponsableDAO.obtenerTodosResponsables();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (Responsable nivelEducativo : administradores) {
            Object[] rowData = {nivelEducativo.getId_responsable(), nivelEducativo.getResponsable()};
            model.addRow(rowData);
        }
    }

}
