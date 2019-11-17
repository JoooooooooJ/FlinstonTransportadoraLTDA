package br.com.utfpr.forms;

public class PricesView extends javax.swing.JFrame {

    public PricesView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origin = new javax.swing.JComboBox<>();
        destination = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        consult = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Title.setText("FlinstonTransportadora LTDA");
        HeaderPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -20, 460, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/FlinstonHeader.jpg"))); // NOI18N
        HeaderPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 130));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 529, 130));

        jPanel1.setBackground(new java.awt.Color(1, 156, 175));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Origem:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Destino:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 81, 74, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Valor*:");
        jLabel4.setToolTipText("Não considerando o peso da carga");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 124, -1, -1));

        origin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 32, 320, -1));

        destination.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 78, 320, -1));

        price.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 121, 320, -1));

        consult.setText("Consultar");
        jPanel1.add(consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        back.setText("Voltar");
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 530, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PricesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PricesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PricesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PricesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton back;
    private javax.swing.JButton consult;
    private javax.swing.JComboBox<String> destination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> origin;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
