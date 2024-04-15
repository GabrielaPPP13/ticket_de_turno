package Vista;

import Controlador.TramiteController;
import javax.swing.JButton;

public class VistaAdminTramite extends javax.swing.JFrame {

    private TramiteController controller;

    public VistaAdminTramite() {
        initComponents();
        controller = new TramiteController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_sidebar = new javax.swing.JPanel();
        btn_inicio = new javax.swing.JButton();
        btnRol = new javax.swing.JButton();
        btnNivel = new javax.swing.JButton();
        btnTramites = new javax.swing.JButton();
        btnMunicipio = new javax.swing.JButton();
        btnEstatus = new javax.swing.JButton();
        btnResponsable = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        txt_tramite = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_mostar_todos_los_datos = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_administradores = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel_sidebar.setBackground(new java.awt.Color(0, 102, 153));
        panel_sidebar.setForeground(new java.awt.Color(0, 102, 153));

        btn_inicio.setBackground(new java.awt.Color(0, 102, 153));
        btn_inicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setText("INICIO");
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnRol.setBackground(new java.awt.Color(0, 102, 153));
        btnRol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRol.setForeground(new java.awt.Color(255, 255, 255));
        btnRol.setText("ROLES");
        btnRol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNivel.setBackground(new java.awt.Color(0, 102, 153));
        btnNivel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNivel.setForeground(new java.awt.Color(255, 255, 255));
        btnNivel.setText("NIVEL");
        btnNivel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnTramites.setBackground(new java.awt.Color(0, 102, 153));
        btnTramites.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTramites.setForeground(new java.awt.Color(255, 255, 255));
        btnTramites.setText("TRÁMITES");
        btnTramites.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnMunicipio.setBackground(new java.awt.Color(0, 102, 153));
        btnMunicipio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        btnMunicipio.setText("MUNICIPIO");
        btnMunicipio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEstatus.setBackground(new java.awt.Color(0, 102, 153));
        btnEstatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEstatus.setForeground(new java.awt.Color(255, 255, 255));
        btnEstatus.setText("ESTATUS");
        btnEstatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnResponsable.setBackground(new java.awt.Color(0, 102, 153));
        btnResponsable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnResponsable.setForeground(new java.awt.Color(255, 255, 255));
        btnResponsable.setText("RESPONSABLE");
        btnResponsable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Panel Administrativo");

        javax.swing.GroupLayout panel_sidebarLayout = new javax.swing.GroupLayout(panel_sidebar);
        panel_sidebar.setLayout(panel_sidebarLayout);
        panel_sidebarLayout.setHorizontalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_sidebarLayout.createSequentialGroup()
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidebarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTramites, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_sidebarLayout.createSequentialGroup()
                        .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_sidebarLayout.createSequentialGroup()
                        .addComponent(btnMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel_sidebarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_sidebarLayout.setVerticalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidebarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTramites, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));

        txt_tramite.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_tramite.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_tramite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 102));
        btn_agregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus.png"))); // NOI18N
        btn_agregar.setText("Agregar");

        btn_buscar.setBackground(new java.awt.Color(255, 153, 51));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ok.png"))); // NOI18N
        btn_buscar.setText("Buscar");

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 255));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trash.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");

        btn_mostar_todos_los_datos.setBackground(new java.awt.Color(153, 153, 255));
        btn_mostar_todos_los_datos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_mostar_todos_los_datos.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostar_todos_los_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N
        btn_mostar_todos_los_datos.setText("Mostrar todos los datos");

        lbl_id.setText("ID");

        lbl_usuario.setText("TRAMITE");

        lbl_administradores.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_administradores.setText("TRAMITE");

        btn_limpiar.setBackground(new java.awt.Color(255, 204, 51));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");

        table_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Tramite"
            }
        ));
        jScrollPane1.setViewportView(table_datos);

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datosLayout.createSequentialGroup()
                                        .addComponent(txt_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(btn_agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_actualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eliminar))
                                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_mostar_todos_los_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_administradores, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_administradores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(lbl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostar_todos_los_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_sidebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new VistaAdminTramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEstatus;
    public javax.swing.JButton btnMunicipio;
    public javax.swing.JButton btnNivel;
    public javax.swing.JButton btnResponsable;
    public javax.swing.JButton btnRol;
    public javax.swing.JButton btnTramites;
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_inicio;
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_mostar_todos_los_datos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbl_administradores;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_sidebar;
    public javax.swing.JTable table_datos;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_tramite;
    // End of variables declaration//GEN-END:variables
}
