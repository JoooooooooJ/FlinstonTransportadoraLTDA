package Truck.view;

public class TruckView extends javax.swing.JFrame {

    public TruckView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        byid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TruckDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        Modell = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        Plate = new javax.swing.JTextField();
        Chassis = new javax.swing.JTextField();
        FuelTank = new javax.swing.JTextField();
        KMperL = new javax.swing.JTextField();
        DriverPicker = new javax.swing.JComboBox<>();
        DriverId = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        AddImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

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
        menuPanel.add(byid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 180, -1));

        jLabel21.setText("Pesquisar/Deletar por id:");
        menuPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        TruckDataPanel.setBackground(new java.awt.Color(255, 255, 255));
        TruckDataPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        TruckDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        TruckDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Marca");
        TruckDataPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 12, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Modelo");
        TruckDataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("N° Chassi:");
        TruckDataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 12, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Placa:");
        TruckDataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 12, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Ano:");
        TruckDataPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 12, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Cap.Tanque:");
        TruckDataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Média KM/L:");
        TruckDataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 57, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Motorista:");
        TruckDataPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 57, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Código:");
        TruckDataPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 57, -1, -1));

        jLabel11.setText("Tipo veículo:");
        TruckDataPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 105, -1, -1));
        TruckDataPanel.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, 70));
        TruckDataPanel.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, 63, -1));

        Brand.setToolTipText("");
        TruckDataPanel.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 31, 64, -1));

        Modell.setToolTipText("");
        TruckDataPanel.add(Modell, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 31, 72, -1));
        TruckDataPanel.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 31, 70, -1));
        TruckDataPanel.add(Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, 90, -1));
        TruckDataPanel.add(Chassis, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 31, 81, -1));
        TruckDataPanel.add(FuelTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, 63, -1));
        TruckDataPanel.add(KMperL, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 79, 63, -1));

        TruckDataPanel.add(DriverPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 79, 176, -1));
        TruckDataPanel.add(DriverId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 59, -1));

        TruckDataPanel.add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 126, 140, -1));

        AddImage.setText("Adicionar Imagem");
        TruckDataPanel.add(AddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 120, 40));

        getContentPane().add(TruckDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 520, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        new Transportadora.MainView().show();
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

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
            java.util.logging.Logger.getLogger(TruckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TruckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TruckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TruckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TruckView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddImage;
    private javax.swing.JTextField Brand;
    private javax.swing.JTextField Chassis;
    private javax.swing.JTextField DriverId;
    private javax.swing.JComboBox<String> DriverPicker;
    private javax.swing.JButton Find;
    private javax.swing.JTextField FuelTank;
    private javax.swing.JLabel Home;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField KMperL;
    private javax.swing.JTextField Modell;
    private javax.swing.JTextField Plate;
    private javax.swing.JButton Remove;
    private javax.swing.JPanel TruckDataPanel;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton Update;
    private javax.swing.JTextField Year;
    private javax.swing.JTextField byid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
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
