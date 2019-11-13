package Trailer;

public class TrailerView extends javax.swing.JFrame {

    public TrailerView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrailerData = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        Model = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        Plate = new javax.swing.JTextField();
        Chassi = new javax.swing.JTextField();
        KGcapacity = new javax.swing.JTextField();
        M3capacity = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        AddImage = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Home = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        FindBy = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrailerData.setBackground(new java.awt.Color(255, 255, 255));
        TrailerData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        TrailerData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setText("Código:");
        TrailerData.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("Marca");
        TrailerData.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("Modelo");
        TrailerData.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 12, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("N° Chassi:");
        TrailerData.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("Placa:");
        TrailerData.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 12, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel17.setText("Ano:");
        TrailerData.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 12, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Cap.  KG:");
        TrailerData.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, -1, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel19.setText("Cap. M³:");
        TrailerData.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 57, -1, -1));

        jLabel22.setText("Tipo carreta:");
        TrailerData.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 105, -1, -1));
        TrailerData.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 100));
        TrailerData.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 63, -1));

        Brand.setToolTipText("");
        TrailerData.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 31, 64, -1));

        Model.setToolTipText("");
        TrailerData.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 31, 72, -1));
        TrailerData.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 31, 70, -1));
        TrailerData.add(Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 90, -1));
        TrailerData.add(Chassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 81, -1));
        TrailerData.add(KGcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, 63, -1));
        TrailerData.add(M3capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 79, 63, -1));

        TrailerData.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, 140, -1));

        AddImage.setText("Adicionar Imagem");
        TrailerData.add(AddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 40));

        getContentPane().add(TrailerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 550, 198));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Pesquisar por:");
        menuPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 11, -1, -1));
        menuPanel.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, 30));

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

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

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
            java.util.logging.Logger.getLogger(TrailerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrailerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrailerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrailerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrailerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddImage;
    private javax.swing.JTextField Brand;
    private javax.swing.JTextField Chassi;
    private javax.swing.JButton Find;
    private javax.swing.JComboBox<String> FindBy;
    private javax.swing.JLabel Home;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField KGcapacity;
    private javax.swing.JTextField M3capacity;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Plate;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField Search;
    private javax.swing.JPanel TrailerData;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton Update;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
