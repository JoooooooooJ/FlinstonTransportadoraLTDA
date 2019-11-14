package Transportadora;

import java.awt.Color;


public class MainView extends javax.swing.JFrame {
    
    public MainView() {
        initComponents();
        mainBackgroundPanel.setBackground(new Color(2,48,74,200));   
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBackgroundPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        tblServices = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnRegistry = new javax.swing.JMenu();
        btnTruck = new javax.swing.JMenuItem();
        btnTruckload = new javax.swing.JMenuItem();
        btnDriver = new javax.swing.JMenuItem();
        btnMainSystem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flinston Transportadora LTDA ");
        setName(""); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainBackgroundPanel.setBackground(new java.awt.Color(2, 48, 74));
        mainBackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(1, 156, 175));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainBackgroundPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 530));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblServices.setViewportView(jTable1);

        mainBackgroundPanel.add(tblServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 520, 320));

        getContentPane().add(mainBackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backGroundLogin_image.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 550));

        btnRegistry.setText("Cadastros");

        btnTruck.setText("Caminhão");
        btnTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruckActionPerformed(evt);
            }
        });
        btnRegistry.add(btnTruck);

        btnTruckload.setText("Carreta");
        btnTruckload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruckloadActionPerformed(evt);
            }
        });
        btnRegistry.add(btnTruckload);

        btnDriver.setText("Motorista");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });
        btnRegistry.add(btnDriver);

        jMenuBar1.add(btnRegistry);

        btnMainSystem.setText("Transportadora");
        btnMainSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainSystemMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnMainSystem);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruckActionPerformed
        new Truck.view.TruckView().show();
        dispose();
    }//GEN-LAST:event_btnTruckActionPerformed

    private void btnTruckloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruckloadActionPerformed
        // TODO add your handling code here:
        new Trailer.view.TrailerView().show();
        dispose();
    }//GEN-LAST:event_btnTruckloadActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        new Driver.view.DriverView().show();
        dispose();
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnMainSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainSystemMouseClicked
        // TODO add your handling code here:
        new Service.view.AffreightmentView().show();
        dispose();        
    }//GEN-LAST:event_btnMainSystemMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JMenuItem btnDriver;
    private javax.swing.JMenu btnMainSystem;
    private javax.swing.JMenu btnRegistry;
    private javax.swing.JMenuItem btnTruck;
    private javax.swing.JMenuItem btnTruckload;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainBackgroundPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JScrollPane tblServices;
    // End of variables declaration//GEN-END:variables
}
