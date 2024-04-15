package Controlador;

import Modelo.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.AdministradorDAO;
import Vista.VistaAdmin;
import Vista.VistaAdminEstatus;
import Vista.VistaAdminIndex;
import Vista.VistaAdminMunicipio;
import Vista.VistaAdminNivelEducativo;
import Vista.VistaAdminResponsable;
import Vista.VistaAdminTramite;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AdminController {

    private VistaAdmin vista;

    public AdminController(VistaAdmin vista) {
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
                agregarAdministrador();
            }
        });
        this.vista.btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarAdministrador();
            }
        });
        this.vista.btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAdministrador();
            }
        });
        this.vista.btn_eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarAdministrador();
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

    private void agregarAdministrador() {
        String user_name = vista.txt_usuario.getText();
        String contraseña = vista.txt_password.getText();
        AdministradorDAO.insertarAdministrador(user_name, contraseña);
        vista.txt_usuario.setText("");
        vista.txt_password.setText("");
    }

    private void actualizarAdministrador() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        String user_name = vista.txt_usuario.getText();
        String contraseña = vista.txt_password.getText();
        AdministradorDAO.actualizarAdministrador(id_administrador, user_name, contraseña);
        vista.txt_id.setText("");
        vista.txt_usuario.setText("");
        vista.txt_password.setText("");
    }

    private void buscarAdministrador() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        Administrador administrador = AdministradorDAO.buscarAdministrador(id_administrador);
        if (administrador != null) {
            vista.txt_usuario.setText(administrador.getUser_name());
            vista.txt_password.setText(administrador.getContraseña());
        }
    }

    private void eliminarAdministrador() {
        int id_administrador = Integer.parseInt(vista.txt_id.getText());
        AdministradorDAO.eliminarAdministrador(id_administrador);
        vista.txt_id.setText("");
        vista.txt_usuario.setText("");
        vista.txt_password.setText("");

    }

    private void limpiar() {
        vista.txt_id.setText("");
        vista.txt_usuario.setText("");
        vista.txt_password.setText("");

    }

    private void mostrarTodosLosDatos() {
        List<Administrador> administradores = AdministradorDAO.obtenerTodosAdministradores();
        DefaultTableModel model = (DefaultTableModel) vista.table_datos.getModel();
        model.setRowCount(0);

        for (Administrador administrador : administradores) {
            Object[] rowData = {administrador.getId_administrador(), administrador.getUser_name(), administrador.getContraseña()};
            model.addRow(rowData);
        }
    }

}
