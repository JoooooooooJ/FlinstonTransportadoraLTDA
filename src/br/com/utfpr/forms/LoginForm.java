package br.com.utfpr.forms;

import FlinstonTrans.src.Classes.Login;
import br.com.utfpr.dao.impl.LoginDao;
import br.com.utfpr.util.InitializeCatalog;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        sidePanel.setBackground(new Color(2,48,74,200));   
        setLocationRelativeTo(null);
        List<Login> login =  new LoginDao().getList();
        if(login.isEmpty())
            new InitializeCatalog().createAdmin();
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
        password = new javax.swing.JPasswordField();
        EMAILADDRESS = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        loginIcon = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
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

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/login_icon.png"))); // NOI18N
        mainPanel.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Faça seu login");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 40));

        passPanel.setBackground(new java.awt.Color(255, 255, 255));
        passPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        passPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/password_icon.png"))); // NOI18N
        passPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        password.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        password.setBorder(null);
        passPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

        mainPanel.add(passPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 193, 28));

        EMAILADDRESS.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        EMAILADDRESS.setText("LOGIN");
        mainPanel.add(EMAILADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 197, 240), 1, true));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/icons8_contacts_filled_15px.png"))); // NOI18N
        userPanel.add(loginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 20, 20));

        user.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        user.setToolTipText("");
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        userPanel.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 10));

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

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/exit_icon.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        sidePanel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/backGroundLogin_image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 990, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        boolean validUser = false;
        try{
             validUser = new LoginDao().isValid(user.getText().trim(), password.getText().trim());
             if(validUser){
            new br.com.utfpr.forms.MainForm().show();
            dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Usuario não existe");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
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
    private javax.swing.JLabel loginIcon;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField user;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
