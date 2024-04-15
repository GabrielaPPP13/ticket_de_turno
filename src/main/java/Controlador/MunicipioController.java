package Controlador;

import Modelo.Municipio;
import Modelo.MunicipioDAO;
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

public class MunicipioController {

    private VistaAdminMunicipio vista;

    public MunicipioController(VistaAdminMunicipio vista) {
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
                agregarMunicipio();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarMunicipio();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarMunicipio();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarMunicipio();
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

    private void agregarMunicipio() {
        String id = vista.txt_id.getText();
        String municipio = vista.txt_municipio.getText();
        MunicipioDAO.insertarMunicipio(id , municipio);
        vista.txt_id.setText("");
        vista.txt_municipio.setText("");
    }

    private void actualizarMunicipio() {
        String id_municipio  = vista.txt_id.getText();
        String municipio = vista.txt_municipio.getText();
        MunicipioDAO.actualizarMunicipio(id_municipio , municipio);
        vista.txt_id.setText("");
        vista.txt_municipio.setText("");
    }

    private void buscarMunicipio() {
        String id_municipio = vista.txt_id.getText();
        Municipio municipio = MunicipioDAO.buscarMunicipio(id_municipio);
        if (municipio != null) {
            vista.txt_municipio.setText(municipio.getMunicipio());
        }
    }

    private void eliminarMunicipio() {
        String id_municipio = vista.txt_id.getText();
        MunicipioDAO.eliminarMunicipio(id_municipio);
        vista.txt_id.setText("");
        vista.txt_municipio.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_municipio.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<Municipio> municipios = MunicipioDAO.obtenerTodosMunicipios();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (Municipio municipio : municipios) {
            Object[] rowData = {municipio.getId_municipio(), municipio.getMunicipio()};
            model.addRow(rowData);
        }
    }

}
