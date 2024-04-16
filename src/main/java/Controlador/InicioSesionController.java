package Controlador;

import Modelo.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.AdministradorDAO;
import Vista.Index;
import Vista.VistaAdminIndex;
import Vista.VistaInicioSesionAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InicioSesionController {

    private VistaInicioSesionAdmin vista;

    public InicioSesionController(VistaInicioSesionAdmin vista) {
        this.vista = vista;

        this.vista.btn_inicio_sesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });
        
        this.vista.btn_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Index index = new Index();
            index.setVisible(true);
            }
        });
    }

    private void iniciarSesion() {
    // Obtener los datos ingresados por el usuario
    String userName = vista.txtUsuario.getText();
    String contraseña = vista.txtPassword.getText();

    // Verificar que ningún campo esté vacío
    if (userName.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Buscar el administrador en la base de datos
    Administrador administrador = AdministradorDAO.validarAdministrador(userName, contraseña);

    // Si se encuentra el administrador, abrir la pantalla de administrador
    if (administrador != null) {
        VistaAdminIndex vistaAdmin = new VistaAdminIndex();
        vistaAdmin.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }
}




}
