package Driver;

public class DriverView extends javax.swing.JFrame {

    public DriverView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Home = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        FindBy = new javax.swing.JComboBox<>();
        DriverData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        RG = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        CNH = new javax.swing.JTextField();
        CNHtype = new javax.swing.JTextField();
        CNHexpiration = new javax.swing.JTextField();
        addImage = new javax.swing.JButton();
        AddressPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Street = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Number = new javax.swing.JTextField();
        ZIPcode = new javax.swing.JTextField();
        UF = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Pesquisar por:");
        menuPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 11, -1, -1));
        menuPanel.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 270, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        Add.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon.png"))); // NOI18N
        Add.setToolTipText("adicionar novo Motorista");
        Add.setBorder(null);
        Add.setBorderPainted(false);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        menuPanel.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        Remove.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        Remove.setToolTipText("remover Motorista cadastrado");
        Remove.setBorder(null);
        Remove.setBorderPainted(false);
        menuPanel.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 110));

        Find.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon.png"))); // NOI18N
        Find.setToolTipText("buscar Motorista");
        Find.setBorder(null);
        Find.setBorderPainted(false);
        menuPanel.add(Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 110));

        Update.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon.png"))); // NOI18N
        Update.setToolTipText("atualizar cadastro de Motorista");
        Update.setBorder(null);
        Update.setBorderPainted(false);
        menuPanel.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 110));

        menuPanel.add(FindBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, -1));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        DriverData.setBackground(new java.awt.Color(255, 255, 255));
        DriverData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        DriverData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        DriverData.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");
        DriverData.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("CPF:");
        DriverData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("RG:");
        DriverData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 12, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Telefone:");
        jLabel6.setToolTipText("");
        DriverData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 12, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("E-mail:");
        DriverData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Situação:");
        DriverData.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 59, -1, -1));
        DriverData.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 116, 120, 90));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("N° CNH:");
        jLabel15.setToolTipText("");
        DriverData.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 59, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("Data Vencimento:");
        DriverData.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 59, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Catageoria:");
        jLabel18.setToolTipText("");
        DriverData.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 59, -1, -1));
        DriverData.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 63, -1));

        Name.setToolTipText("");
        DriverData.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 31, 160, -1));
        DriverData.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 31, 70, -1));
        DriverData.add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 110, -1));
        DriverData.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 31, 130, -1));
        DriverData.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 74, 63, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", " " }));
        DriverData.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 78, 80, -1));

        CNH.setToolTipText("");
        DriverData.add(CNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 78, 160, -1));
        DriverData.add(CNHtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 78, 70, -1));
        DriverData.add(CNHexpiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 78, 110, -1));

        addImage.setText("Adicionar Imagem");
        DriverData.add(addImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 212, 120, 40));

        AddressPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddressPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Rua:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Cidade:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Numero:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("CEP:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("UF:");

        City.setToolTipText("");

        javax.swing.GroupLayout AddressPanelLayout = new javax.swing.GroupLayout(AddressPanel);
        AddressPanel.setLayout(AddressPanelLayout);
        AddressPanelLayout.setHorizontalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Street, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ZIPcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(AddressPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UF, javax.swing.GroupLayout.Alignment.LEADING, 0, 59, Short.MAX_VALUE)
                            .addComponent(Number, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(City)))
                .addContainerGap())
        );
        AddressPanelLayout.setVerticalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZIPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DriverData.add(AddressPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 116, -1, 136));

        getContentPane().add(DriverData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 610, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        new Main.MainView().show();
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DriverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JTextField CNH;
    private javax.swing.JTextField CNHexpiration;
    private javax.swing.JTextField CNHtype;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField City;
    private javax.swing.JPanel DriverData;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Find;
    private javax.swing.JComboBox<String> FindBy;
    private javax.swing.JLabel Home;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField RG;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField Street;
    private javax.swing.JComboBox<String> UF;
    private javax.swing.JButton Update;
    private javax.swing.JTextField ZIPcode;
    private javax.swing.JButton addImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
