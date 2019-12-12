package br.com.utfpr.forms;

import br.com.utfpr.beans.Destination;
import br.com.utfpr.beans.Origin;

public class PricesForm extends javax.swing.JFrame {

    double toPrice = 0.0;
    double fromPrice = 0.0;
    double total = 0.0;

    public PricesForm() {
        initComponents();
        new Destination().getList().forEach((destination) -> {
            destinations.addItem(destination.toString());
        });
        new Origin().getList().forEach((origin) -> {
            origins.addItem(origin.toString());
        });
        setLocationRelativeTo(null);
    }
    
    private void sum() {
        total = fromPrice + toPrice;
        price.setText(Double.toString(total));
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
        origins = new javax.swing.JComboBox<>();
        destinations = new javax.swing.JComboBox<>();
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

        origins.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        origins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originsActionPerformed(evt);
            }
        });
        jPanel1.add(origins, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 32, 320, -1));

        destinations.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        destinations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationsActionPerformed(evt);
            }
        });
        jPanel1.add(destinations, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 78, 320, -1));

        price.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 121, 320, -1));

        consult.setText("Consultar");
        consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultActionPerformed(evt);
            }
        });
        jPanel1.add(consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 530, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultActionPerformed
        sum();
    }//GEN-LAST:event_consultActionPerformed

    private void originsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originsActionPerformed
        fromPrice = new Origin().read(origins.getSelectedItem().toString()).getPrice();
    }//GEN-LAST:event_originsActionPerformed

    private void destinationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationsActionPerformed
        toPrice = new Destination().read(destinations.getSelectedItem().toString()).getPrice();
    }//GEN-LAST:event_destinationsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MainForm().show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton back;
    private javax.swing.JButton consult;
    private javax.swing.JComboBox<String> destinations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> origins;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables

}
