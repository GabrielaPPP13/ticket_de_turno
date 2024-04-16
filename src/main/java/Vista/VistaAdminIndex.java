package Vista;

import Controlador.AdminIndexController;
import Modelo.TicketDAO;
import java.awt.BorderLayout;
import java.util.Map;
import javax.swing.JFrame;

public class VistaAdminIndex extends javax.swing.JFrame {

    private AdminIndexController controller;

    public VistaAdminIndex() {
        initComponents();

        controller = new AdminIndexController(this);

        // Llamar al método para crear y mostrar el gráfico después de que la ventana se haya mostrado completamente
        mostrarGrafico();
    }

   /* private void mostrarGrafico() {
        // Obtener los datos de la base de datos
     //   Map<String, Integer> datos = TicketDAO.obtenerSolicitudesPorMunicipio();
        Map<String, Integer> datos = TicketDAO.obtenerSolicitudesPorMunicipio();

        // Agregar el panel de gráfico al jPanel3 de VistaAdminIndex
        jPanel3.setLayout(new BorderLayout()); // Establecer un diseño para el panel
        GraficoPanel panel = new GraficoPanel(datos);
        jPanel3.add(panel, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();
    }*/

    private void mostrarGrafico() {
        // Obtener los datos de la base de datos
        Map<String, Integer> datos = TicketDAO.obtenerSolicitudesPorEstatus();

        // Agregar el panel de gráfico al jPanel3 de VistaAdminIndex
        jPanel3.setLayout(new BorderLayout()); // Establecer un diseño para el panel
        GraficoPanel1 panel = new GraficoPanel1(datos);
        jPanel3.add(panel, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnRol = new javax.swing.JButton();
        btnNivel = new javax.swing.JButton();
        btnServicio = new javax.swing.JButton();
        btnTramites = new javax.swing.JButton();
        btnMunicipio = new javax.swing.JButton();
        btnEstatus = new javax.swing.JButton();
        btnResponsable = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));

        btnInicio.setBackground(new java.awt.Color(0, 102, 153));
        btnInicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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

        btnServicio.setBackground(new java.awt.Color(0, 102, 153));
        btnServicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnServicio.setText("SERVICIO");
        btnServicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });

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

        btnSalir.setBackground(new java.awt.Color(0, 102, 153));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTramites, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblTitulo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTramites, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        
    }//GEN-LAST:event_btnServicioActionPerformed

public static void main(String args[]) {
    // Ejecutar la interfaz de usuario principal
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new VistaAdminIndex().setVisible(true);
        }
    });
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEstatus;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMunicipio;
    public javax.swing.JButton btnNivel;
    public javax.swing.JButton btnResponsable;
    public javax.swing.JButton btnRol;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnServicio;
    public javax.swing.JButton btnTramites;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
