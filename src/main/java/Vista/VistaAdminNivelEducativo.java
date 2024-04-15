package Vista;

import Modelo.AdministradorDAO;
import Controlador.NivelEducativoController;
import javax.swing.JButton;

public class VistaAdminNivelEducativo extends javax.swing.JFrame {

    private NivelEducativoController controller;

    public VistaAdminNivelEducativo() {
        initComponents();
        controller = new NivelEducativoController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_datos = new javax.swing.JPanel();
        txt_nivel_educativo = new javax.swing.JTextField();
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
        panel_sidebar1 = new javax.swing.JPanel();
        btn_inicio = new javax.swing.JButton();
        btn_rol = new javax.swing.JButton();
        btn_nivel_educativo = new javax.swing.JButton();
        btn_tramite = new javax.swing.JButton();
        btn_municipio = new javax.swing.JButton();
        btn_estatus = new javax.swing.JButton();
        btn_responsable = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));

        txt_nivel_educativo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_nivel_educativo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nivel_educativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        lbl_usuario.setText("Nivel Educativo");

        lbl_administradores.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_administradores.setText("NIVEL EDUCATIVO");

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
                "Id", "Nivel Educativo"
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
                                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_datosLayout.createSequentialGroup()
                                        .addComponent(txt_nivel_educativo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(btn_agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_actualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_eliminar))))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_mostar_todos_los_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_administradores, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
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
                        .addComponent(txt_nivel_educativo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostar_todos_los_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        panel_sidebar1.setBackground(new java.awt.Color(0, 102, 153));
        panel_sidebar1.setForeground(new java.awt.Color(0, 102, 153));

        btn_inicio.setBackground(new java.awt.Color(0, 102, 153));
        btn_inicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setText("INICIO");
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_rol.setBackground(new java.awt.Color(0, 102, 153));
        btn_rol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_rol.setForeground(new java.awt.Color(255, 255, 255));
        btn_rol.setText("ROLES");
        btn_rol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_nivel_educativo.setBackground(new java.awt.Color(0, 102, 153));
        btn_nivel_educativo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_nivel_educativo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nivel_educativo.setText("NIVEL EDUCATIVO");
        btn_nivel_educativo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_tramite.setBackground(new java.awt.Color(0, 102, 153));
        btn_tramite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_tramite.setForeground(new java.awt.Color(255, 255, 255));
        btn_tramite.setText("TRÁMITE");
        btn_tramite.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_municipio.setBackground(new java.awt.Color(0, 102, 153));
        btn_municipio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_municipio.setForeground(new java.awt.Color(255, 255, 255));
        btn_municipio.setText("MUNICIPIO");
        btn_municipio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_estatus.setBackground(new java.awt.Color(0, 102, 153));
        btn_estatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_estatus.setForeground(new java.awt.Color(255, 255, 255));
        btn_estatus.setText("ESTATUS");
        btn_estatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btn_responsable.setBackground(new java.awt.Color(0, 102, 153));
        btn_responsable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_responsable.setForeground(new java.awt.Color(255, 255, 255));
        btn_responsable.setText("RESPONSABLE");
        btn_responsable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblTitulo1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Panel Administrativo");

        javax.swing.GroupLayout panel_sidebar1Layout = new javax.swing.GroupLayout(panel_sidebar1);
        panel_sidebar1.setLayout(panel_sidebar1Layout);
        panel_sidebar1Layout.setHorizontalGroup(
            panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidebar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_sidebar1Layout.createSequentialGroup()
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btn_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidebar1Layout.createSequentialGroup()
                        .addComponent(btn_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nivel_educativo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_sidebar1Layout.createSequentialGroup()
                        .addGroup(panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_sidebar1Layout.createSequentialGroup()
                                .addComponent(btn_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel_sidebar1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_sidebar1Layout.setVerticalGroup(
            panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidebar1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nivel_educativo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_sidebar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_sidebar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

                new VistaAdminNivelEducativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_estatus;
    public javax.swing.JButton btn_inicio;
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_mostar_todos_los_datos;
    public javax.swing.JButton btn_municipio;
    public javax.swing.JButton btn_nivel_educativo;
    public javax.swing.JButton btn_responsable;
    public javax.swing.JButton btn_rol;
    public javax.swing.JButton btn_tramite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lbl_administradores;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_sidebar1;
    public javax.swing.JTable table_datos;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_nivel_educativo;
    // End of variables declaration//GEN-END:variables
}
