package Controlador;

import Modelo.NivelEducativo;
import Modelo.NivelEducativoDAO;
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

public class NivelEducativoController {

    private VistaAdminNivelEducativo vista;

    public NivelEducativoController(VistaAdminNivelEducativo vista) {
        this.vista = vista;

        this.vista.btn_inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminIndex adminIndex = new VistaAdminIndex();
                adminIndex.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_rol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin adminRol = new VistaAdmin();
                adminRol.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_tramite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminTramite adminTramite = new VistaAdminTramite();
                adminTramite.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_nivel_educativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminNivelEducativo adminNivelEducativo = new VistaAdminNivelEducativo();
                adminNivelEducativo.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_municipio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminMunicipio adminAdminMunicipio = new VistaAdminMunicipio();
                adminAdminMunicipio.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_responsable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminResponsable adminResponsable = new VistaAdminResponsable();
                adminResponsable.setVisible(true);
                vista.setVisible(false);
            }
        });

        this.vista.btn_estatus.addActionListener(new ActionListener() {
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
                agregarNivelEducativo();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarNivelEducativo();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarNivelEducativo();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarNivelEducativo();
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

    private void agregarNivelEducativo() {
        String nivel_educativo = vista.txt_nivel_educativo.getText();
        NivelEducativoDAO.insertarNivelEducativo(nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_nivel_educativo.setText("");
    }

    private void actualizarNivelEducativo() {
        int id_nivel_educativo = Integer.parseInt(vista.txt_id.getText());
        String nivel_educativo = vista.txt_nivel_educativo.getText();
        NivelEducativoDAO.actualizarNivelEducativo(id_nivel_educativo, nivel_educativo);
        vista.txt_id.setText("");
        vista.txt_nivel_educativo.setText("");
    }

    private void buscarNivelEducativo() {
        int id_nivel_educativo = Integer.parseInt(vista.txt_id.getText());
        NivelEducativo administrador = NivelEducativoDAO.buscarNivelEducativo(id_nivel_educativo);
        if (administrador != null) {
            vista.txt_nivel_educativo.setText(administrador.getNivel_educativo());
        }
    }

    private void eliminarNivelEducativo() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        NivelEducativoDAO.eliminarNivelEducativo(id_administrador);
        vista.txt_id.setText("");
        vista.txt_nivel_educativo.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_nivel_educativo.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<NivelEducativo> administradores = NivelEducativoDAO.obtenerTodosNivelEducativo();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (NivelEducativo nivelEducativo : administradores) {
            Object[] rowData = {nivelEducativo.getId_nivel_educativo(), nivelEducativo.getNivel_educativo()};
            model.addRow(rowData);
        }
    }

}
