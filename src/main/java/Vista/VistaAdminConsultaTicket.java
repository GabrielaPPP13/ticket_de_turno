
package Vista;
import Controlador.TicketAdmminConsultaController;

public class VistaAdminConsultaTicket extends javax.swing.JFrame {

private TicketAdmminConsultaController controller;

    public VistaAdminConsultaTicket() {
        initComponents();
        controller = new TicketAdmminConsultaController(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelTitularTramite = new javax.swing.JPanel();
        lblCurp = new javax.swing.JLabel();
        iconBackground = new javax.swing.JPanel();
        MaleUser = new javax.swing.JLabel();
        cbxTitular = new javax.swing.JComboBox<>();
        PanelNombre = new javax.swing.JPanel();
        lblCurp1 = new javax.swing.JLabel();
        iconBackground1 = new javax.swing.JPanel();
        MaleUser1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        PanelCurp = new javax.swing.JPanel();
        lblCurp2 = new javax.swing.JLabel();
        iconBackground2 = new javax.swing.JPanel();
        MaleUser2 = new javax.swing.JLabel();
        txtCurp2 = new javax.swing.JTextField();
        PanelApellidoP = new javax.swing.JPanel();
        lblCurp3 = new javax.swing.JLabel();
        iconBackground3 = new javax.swing.JPanel();
        MaleUser3 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        PanelApellidoM = new javax.swing.JPanel();
        lblCurp4 = new javax.swing.JLabel();
        iconBackground4 = new javax.swing.JPanel();
        MaleUser4 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        PanelTel1 = new javax.swing.JPanel();
        lblCurp5 = new javax.swing.JLabel();
        iconBackground5 = new javax.swing.JPanel();
        MaleUser5 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        PanelCorreo = new javax.swing.JPanel();
        lblCurp6 = new javax.swing.JLabel();
        iconBackground6 = new javax.swing.JPanel();
        MaleUser6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        PanelTel2 = new javax.swing.JPanel();
        lblCurp7 = new javax.swing.JLabel();
        iconBackground7 = new javax.swing.JPanel();
        MaleUser7 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        PanelNivel = new javax.swing.JPanel();
        lblCurp8 = new javax.swing.JLabel();
        iconBackground8 = new javax.swing.JPanel();
        MaleUser8 = new javax.swing.JLabel();
        cbxNivel = new javax.swing.JComboBox<>();
        PanelMunicipio = new javax.swing.JPanel();
        lblCurp9 = new javax.swing.JLabel();
        iconBackground9 = new javax.swing.JPanel();
        MaleUser9 = new javax.swing.JLabel();
        cbxMunicipio = new javax.swing.JComboBox<>();
        PanelAsunto = new javax.swing.JPanel();
        lblCurp10 = new javax.swing.JLabel();
        iconBackground10 = new javax.swing.JPanel();
        MaleUser10 = new javax.swing.JLabel();
        cbxAsunto = new javax.swing.JComboBox<>();
        btn_actualizar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_info = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PanelNivel1 = new javax.swing.JPanel();
        lblCurp11 = new javax.swing.JLabel();
        iconBackground11 = new javax.swing.JPanel();
        MaleUser11 = new javax.swing.JLabel();
        cbxEstatus = new javax.swing.JComboBox<>();
        btn_insertar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_turno = new javax.swing.JTextField();
        btn_consultar_turno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        PanelTitularTramite.setBackground(new java.awt.Color(255, 255, 255));
        PanelTitularTramite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp.setText("QUIÉN REALIZA EL TRAMITE:");

        iconBackground.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackgroundLayout = new javax.swing.GroupLayout(iconBackground);
        iconBackground.setLayout(iconBackgroundLayout);
        iconBackgroundLayout.setHorizontalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser)
                .addContainerGap())
        );
        iconBackgroundLayout.setVerticalGroup(
            iconBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxTitular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTitular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelTitularTramiteLayout = new javax.swing.GroupLayout(PanelTitularTramite);
        PanelTitularTramite.setLayout(PanelTitularTramiteLayout);
        PanelTitularTramiteLayout.setHorizontalGroup(
            PanelTitularTramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitularTramiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTitularTramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTitularTramiteLayout.createSequentialGroup()
                        .addComponent(lblCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 347, Short.MAX_VALUE))
                    .addComponent(cbxTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelTitularTramiteLayout.setVerticalGroup(
            PanelTitularTramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitularTramiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTitularTramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTitularTramiteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelNombre.setBackground(new java.awt.Color(255, 255, 255));
        PanelNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp1.setText("NOMBRE:");

        iconBackground1.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground1.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground1Layout = new javax.swing.GroupLayout(iconBackground1);
        iconBackground1.setLayout(iconBackground1Layout);
        iconBackground1Layout.setHorizontalGroup(
            iconBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser1)
                .addContainerGap())
        );
        iconBackground1Layout.setVerticalGroup(
            iconBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelNombreLayout = new javax.swing.GroupLayout(PanelNombre);
        PanelNombre.setLayout(PanelNombreLayout);
        PanelNombreLayout.setHorizontalGroup(
            PanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNombreLayout.createSequentialGroup()
                        .addComponent(lblCurp1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNombre))
                .addContainerGap())
        );
        PanelNombreLayout.setVerticalGroup(
            PanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelNombreLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelCurp.setBackground(new java.awt.Color(255, 255, 255));
        PanelCurp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp2.setText("CURP:");

        iconBackground2.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground2.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground2Layout = new javax.swing.GroupLayout(iconBackground2);
        iconBackground2.setLayout(iconBackground2Layout);
        iconBackground2Layout.setHorizontalGroup(
            iconBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser2)
                .addContainerGap())
        );
        iconBackground2Layout.setVerticalGroup(
            iconBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCurp2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCurp2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCurp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelCurpLayout = new javax.swing.GroupLayout(PanelCurp);
        PanelCurp.setLayout(PanelCurpLayout);
        PanelCurpLayout.setHorizontalGroup(
            PanelCurpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCurpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCurpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCurpLayout.createSequentialGroup()
                        .addComponent(lblCurp2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addComponent(txtCurp2))
                .addContainerGap())
        );
        PanelCurpLayout.setVerticalGroup(
            PanelCurpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCurpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCurpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelCurpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCurp2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelApellidoP.setBackground(new java.awt.Color(255, 255, 255));
        PanelApellidoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp3.setText("APELLIDO PATERNO:");

        iconBackground3.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground3.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground3Layout = new javax.swing.GroupLayout(iconBackground3);
        iconBackground3.setLayout(iconBackground3Layout);
        iconBackground3Layout.setHorizontalGroup(
            iconBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser3)
                .addContainerGap())
        );
        iconBackground3Layout.setVerticalGroup(
            iconBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtApellidoP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelApellidoPLayout = new javax.swing.GroupLayout(PanelApellidoP);
        PanelApellidoP.setLayout(PanelApellidoPLayout);
        PanelApellidoPLayout.setHorizontalGroup(
            PanelApellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApellidoPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelApellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurp3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelApellidoPLayout.setVerticalGroup(
            PanelApellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApellidoPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelApellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelApellidoPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        PanelApellidoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp4.setText("APELLIDO MATERNO:");

        iconBackground4.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground4.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground4Layout = new javax.swing.GroupLayout(iconBackground4);
        iconBackground4.setLayout(iconBackground4Layout);
        iconBackground4Layout.setHorizontalGroup(
            iconBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser4)
                .addContainerGap())
        );
        iconBackground4Layout.setVerticalGroup(
            iconBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtApellidoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelApellidoMLayout = new javax.swing.GroupLayout(PanelApellidoM);
        PanelApellidoM.setLayout(PanelApellidoMLayout);
        PanelApellidoMLayout.setHorizontalGroup(
            PanelApellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApellidoMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelApellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelApellidoMLayout.createSequentialGroup()
                        .addComponent(lblCurp4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(txtApellidoM))
                .addContainerGap())
        );
        PanelApellidoMLayout.setVerticalGroup(
            PanelApellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelApellidoMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelApellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelApellidoMLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelTel1.setBackground(new java.awt.Color(255, 255, 255));
        PanelTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp5.setText("TÉLEFONO 1:");

        iconBackground5.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground5.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Call.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground5Layout = new javax.swing.GroupLayout(iconBackground5);
        iconBackground5.setLayout(iconBackground5Layout);
        iconBackground5Layout.setHorizontalGroup(
            iconBackground5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        iconBackground5Layout.setVerticalGroup(
            iconBackground5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTelefono1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefono1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelTel1Layout = new javax.swing.GroupLayout(PanelTel1);
        PanelTel1.setLayout(PanelTel1Layout);
        PanelTel1Layout.setHorizontalGroup(
            PanelTel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTel1Layout.createSequentialGroup()
                        .addComponent(lblCurp5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTelefono1))
                .addContainerGap())
        );
        PanelTel1Layout.setVerticalGroup(
            PanelTel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelCorreo.setBackground(new java.awt.Color(255, 255, 255));
        PanelCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp6.setText("CORREO:");

        iconBackground6.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground6.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/At sign.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground6Layout = new javax.swing.GroupLayout(iconBackground6);
        iconBackground6.setLayout(iconBackground6Layout);
        iconBackground6Layout.setHorizontalGroup(
            iconBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser6)
                .addContainerGap())
        );
        iconBackground6Layout.setVerticalGroup(
            iconBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelCorreoLayout = new javax.swing.GroupLayout(PanelCorreo);
        PanelCorreo.setLayout(PanelCorreoLayout);
        PanelCorreoLayout.setHorizontalGroup(
            PanelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCorreoLayout.createSequentialGroup()
                        .addComponent(lblCurp6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCorreo))
                .addContainerGap())
        );
        PanelCorreoLayout.setVerticalGroup(
            PanelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelCorreoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelTel2.setBackground(new java.awt.Color(255, 255, 255));
        PanelTel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp7.setText("TÉLEFONO 2:");

        iconBackground7.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground7.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Call.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground7Layout = new javax.swing.GroupLayout(iconBackground7);
        iconBackground7.setLayout(iconBackground7Layout);
        iconBackground7Layout.setHorizontalGroup(
            iconBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser7)
                .addContainerGap())
        );
        iconBackground7Layout.setVerticalGroup(
            iconBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTelefono2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefono2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelTel2Layout = new javax.swing.GroupLayout(PanelTel2);
        PanelTel2.setLayout(PanelTel2Layout);
        PanelTel2Layout.setHorizontalGroup(
            PanelTel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTel2Layout.createSequentialGroup()
                        .addComponent(lblCurp7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTelefono2))
                .addContainerGap())
        );
        PanelTel2Layout.setVerticalGroup(
            PanelTel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelNivel.setBackground(new java.awt.Color(255, 255, 255));
        PanelNivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp8.setText("NIVEL QUE CURSA:");

        iconBackground8.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground8.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground8Layout = new javax.swing.GroupLayout(iconBackground8);
        iconBackground8.setLayout(iconBackground8Layout);
        iconBackground8Layout.setHorizontalGroup(
            iconBackground8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser8)
                .addContainerGap())
        );
        iconBackground8Layout.setVerticalGroup(
            iconBackground8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxNivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelNivelLayout = new javax.swing.GroupLayout(PanelNivel);
        PanelNivel.setLayout(PanelNivelLayout);
        PanelNivelLayout.setHorizontalGroup(
            PanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(iconBackground8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurp8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelNivelLayout.setVerticalGroup(
            PanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNivelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelMunicipio.setBackground(new java.awt.Color(255, 255, 255));
        PanelMunicipio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp9.setText("MUNICIPIO:");

        iconBackground9.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground9.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground9Layout = new javax.swing.GroupLayout(iconBackground9);
        iconBackground9.setLayout(iconBackground9Layout);
        iconBackground9Layout.setHorizontalGroup(
            iconBackground9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser9)
                .addContainerGap())
        );
        iconBackground9Layout.setVerticalGroup(
            iconBackground9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxMunicipio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMunicipio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelMunicipioLayout = new javax.swing.GroupLayout(PanelMunicipio);
        PanelMunicipio.setLayout(PanelMunicipioLayout);
        PanelMunicipioLayout.setHorizontalGroup(
            PanelMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMunicipioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMunicipioLayout.createSequentialGroup()
                        .addComponent(lblCurp9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(cbxMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMunicipioLayout.setVerticalGroup(
            PanelMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMunicipioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelMunicipioLayout.createSequentialGroup()
                        .addComponent(cbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelAsunto.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp10.setText("ASUNTO:");

        iconBackground10.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground10.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground10Layout = new javax.swing.GroupLayout(iconBackground10);
        iconBackground10.setLayout(iconBackground10Layout);
        iconBackground10Layout.setHorizontalGroup(
            iconBackground10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser10)
                .addContainerGap())
        );
        iconBackground10Layout.setVerticalGroup(
            iconBackground10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxAsunto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxAsunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxAsunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelAsuntoLayout = new javax.swing.GroupLayout(PanelAsunto);
        PanelAsunto.setLayout(PanelAsuntoLayout);
        PanelAsuntoLayout.setHorizontalGroup(
            PanelAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBackground10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAsuntoLayout.createSequentialGroup()
                        .addComponent(lblCurp10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addComponent(cbxAsunto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelAsuntoLayout.setVerticalGroup(
            PanelAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsuntoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAsuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelAsuntoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btn_actualizar.setBackground(new java.awt.Color(92, 182, 58));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ok.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);

        btn_cancelar.setBackground(new java.awt.Color(217, 83, 79));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btn_cancelar.setText("Eliminar");
        btn_cancelar.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registra Tu Trámite");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Fecha de Asignación:");

        PanelNivel1.setBackground(new java.awt.Color(255, 255, 255));
        PanelNivel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCurp11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurp11.setText("Estatus");

        iconBackground11.setBackground(new java.awt.Color(92, 184, 92));
        iconBackground11.setForeground(new java.awt.Color(51, 204, 0));

        MaleUser11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MaleUser.png"))); // NOI18N

        javax.swing.GroupLayout iconBackground11Layout = new javax.swing.GroupLayout(iconBackground11);
        iconBackground11.setLayout(iconBackground11Layout);
        iconBackground11Layout.setHorizontalGroup(
            iconBackground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconBackground11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleUser11)
                .addContainerGap())
        );
        iconBackground11Layout.setVerticalGroup(
            iconBackground11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconBackground11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleUser11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxEstatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelNivel1Layout = new javax.swing.GroupLayout(PanelNivel1);
        PanelNivel1.setLayout(PanelNivel1Layout);
        PanelNivel1Layout.setHorizontalGroup(
            PanelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconBackground11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurp11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelNivel1Layout.setVerticalGroup(
            PanelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNivel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurp11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBackground11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNivel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btn_insertar.setBackground(new java.awt.Color(92, 182, 58));
        btn_insertar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_insertar.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ok.png"))); // NOI18N
        btn_insertar.setText("REGISTRAR");
        btn_insertar.setBorder(null);
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(217, 83, 79));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btn_limpiar.setText("CANCELAR");
        btn_limpiar.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(515, 515, 515)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(PanelNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(PanelTel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(PanelNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PanelMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(PanelApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PanelApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PanelTitularTramite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_info, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PanelAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelTel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 624, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(PanelCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(678, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTitularTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PanelTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PanelTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_info, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(PanelCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );

        btn_salir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_salir.setText("Regresar");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_consultar_turno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_consultar_turno.setText("CONSULTAR TICKET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txt_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_consultar_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_turno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultar_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdminConsultaTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaleUser;
    private javax.swing.JLabel MaleUser1;
    private javax.swing.JLabel MaleUser10;
    private javax.swing.JLabel MaleUser11;
    private javax.swing.JLabel MaleUser2;
    private javax.swing.JLabel MaleUser3;
    private javax.swing.JLabel MaleUser4;
    private javax.swing.JLabel MaleUser5;
    private javax.swing.JLabel MaleUser6;
    private javax.swing.JLabel MaleUser7;
    private javax.swing.JLabel MaleUser8;
    private javax.swing.JLabel MaleUser9;
    private javax.swing.JPanel PanelApellidoM;
    private javax.swing.JPanel PanelApellidoP;
    private javax.swing.JPanel PanelAsunto;
    private javax.swing.JPanel PanelCorreo;
    private javax.swing.JPanel PanelCurp;
    private javax.swing.JPanel PanelMunicipio;
    private javax.swing.JPanel PanelNivel;
    private javax.swing.JPanel PanelNivel1;
    private javax.swing.JPanel PanelNombre;
    private javax.swing.JPanel PanelTel1;
    private javax.swing.JPanel PanelTel2;
    private javax.swing.JPanel PanelTitularTramite;
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_cancelar;
    public javax.swing.JButton btn_consultar_turno;
    public javax.swing.JButton btn_insertar;
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> cbxAsunto;
    public javax.swing.JComboBox<String> cbxEstatus;
    public javax.swing.JComboBox<String> cbxMunicipio;
    public javax.swing.JComboBox<String> cbxNivel;
    public javax.swing.JComboBox<String> cbxTitular;
    private javax.swing.JPanel iconBackground;
    private javax.swing.JPanel iconBackground1;
    private javax.swing.JPanel iconBackground10;
    private javax.swing.JPanel iconBackground11;
    private javax.swing.JPanel iconBackground2;
    private javax.swing.JPanel iconBackground3;
    private javax.swing.JPanel iconBackground4;
    private javax.swing.JPanel iconBackground5;
    private javax.swing.JPanel iconBackground6;
    private javax.swing.JPanel iconBackground7;
    private javax.swing.JPanel iconBackground8;
    private javax.swing.JPanel iconBackground9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblCurp1;
    private javax.swing.JLabel lblCurp10;
    private javax.swing.JLabel lblCurp11;
    private javax.swing.JLabel lblCurp2;
    private javax.swing.JLabel lblCurp3;
    private javax.swing.JLabel lblCurp4;
    private javax.swing.JLabel lblCurp5;
    private javax.swing.JLabel lblCurp6;
    private javax.swing.JLabel lblCurp7;
    private javax.swing.JLabel lblCurp8;
    private javax.swing.JLabel lblCurp9;
    public javax.swing.JTextField txtApellidoM;
    public javax.swing.JTextField txtApellidoP;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCurp2;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono1;
    public javax.swing.JTextField txtTelefono2;
    public javax.swing.JTextField txt_info;
    public javax.swing.JTextField txt_turno;
    // End of variables declaration//GEN-END:variables
}
