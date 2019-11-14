package Trailer.view;

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
        id = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        plate = new javax.swing.JTextField();
        chassi = new javax.swing.JTextField();
        KGcapacity = new javax.swing.JTextField();
        M3capacity = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        AddImage = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Home = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        find = new javax.swing.JButton();
        update = new javax.swing.JButton();
        findby = new javax.swing.JComboBox<>();

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
        TrailerData.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 63, -1));

        brand.setToolTipText("");
        TrailerData.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 31, 64, -1));

        model.setToolTipText("");
        TrailerData.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 31, 72, -1));
        TrailerData.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 31, 70, -1));
        TrailerData.add(plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 90, -1));
        TrailerData.add(chassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 81, -1));
        TrailerData.add(KGcapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, 63, -1));
        TrailerData.add(M3capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 79, 63, -1));

        TrailerData.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, 140, -1));

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

        add.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon.png"))); // NOI18N
        add.setToolTipText("adicionar novo Motorista");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        menuPanel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        remove.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        remove.setToolTipText("remover Motorista cadastrado");
        remove.setBorder(null);
        remove.setBorderPainted(false);
        menuPanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 110));

        find.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon.png"))); // NOI18N
        find.setToolTipText("buscar Motorista");
        find.setBorder(null);
        find.setBorderPainted(false);
        menuPanel.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 110));

        update.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon.png"))); // NOI18N
        update.setToolTipText("atualizar cadastro de Motorista");
        update.setBorder(null);
        update.setBorderPainted(false);
        menuPanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 110));

        menuPanel.add(findby, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, -1));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        new Main.view.MainView().show();
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

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
    private javax.swing.JButton AddImage;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField KGcapacity;
    private javax.swing.JTextField M3capacity;
    private javax.swing.JTextField Search;
    private javax.swing.JPanel TrailerData;
    private javax.swing.JButton add;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField chassi;
    private javax.swing.JButton find;
    private javax.swing.JComboBox<String> findby;
    private javax.swing.JTextField id;
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
    private javax.swing.JTextField model;
    private javax.swing.JTextField plate;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
