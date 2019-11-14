package Login.view;

import java.awt.Color;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        sidePanel.setBackground(new Color(2,48,74,200));   
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        EMAILADDRESS = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        loginIcon = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnSignin = new javax.swing.JButton();
        PASSWORD = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(1, 156, 175));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel.setText("Digite suas credenciais abaixo.");
        mainPanel.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N
        mainPanel.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Faça seu login");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 40));

        passPanel.setBackground(new java.awt.Color(255, 255, 255));
        passPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        passPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_icon.png"))); // NOI18N
        passPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPasswordField1.setBorder(null);
        passPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

        mainPanel.add(passPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 193, 28));

        EMAILADDRESS.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        EMAILADDRESS.setText("LOGIN");
        mainPanel.add(EMAILADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_contacts_filled_15px.png"))); // NOI18N
        userPanel.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 20, 20));

        txtLogin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setToolTipText("");
        txtLogin.setBorder(null);
        userPanel.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

        mainPanel.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 193, 28));

        btnSignin.setBackground(new java.awt.Color(255, 255, 255));
        btnSignin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSignin.setText("ENTRAR");
        btnSignin.setAlignmentY(0.0F);
        btnSignin.setBorder(null);
        btnSignin.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnSignin.setDefaultCapable(false);
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        mainPanel.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 40));

        PASSWORD.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        PASSWORD.setText("SENHA");
        mainPanel.add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 300, 440));

        sidePanel.setBackground(new java.awt.Color(2, 48, 74));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_icon.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        sidePanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backGroundLogin_image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 990, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        new Transportadora.MainView().show();
        dispose();
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        dispose();
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMAILADDRESS;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnSignin;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
