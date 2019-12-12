package br.com.utfpr.forms;

import br.com.utfpr.beans.Trailer;
import br.com.utfpr.dao.impl.TrailerDao;
import javax.swing.JOptionPane;

public class TrailerForm extends javax.swing.JFrame {
    private Object porId;

    public TrailerForm() {
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
        jLabel22 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        plate = new javax.swing.JTextField();
        chassi = new javax.swing.JTextField();
        capKG = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        menuPanel = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        find = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        byId = new javax.swing.JTextField();

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
        TrailerData.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("Placa:");
        TrailerData.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 12, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel17.setText("Ano:");
        TrailerData.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 12, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Cap.  KG:");
        TrailerData.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, -1, -1));

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
        TrailerData.add(chassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 81, -1));
        TrailerData.add(capKG, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, 63, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Dupla", "Tripla" }));
        TrailerData.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, 140, -1));

        getContentPane().add(TrailerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 550, 198));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/home_icon.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 30, 30));

        add.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/add_icon.png"))); // NOI18N
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
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/delete_icon.png"))); // NOI18N
        remove.setToolTipText("remover Motorista cadastrado");
        remove.setBorder(null);
        remove.setBorderPainted(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        menuPanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 110));

        find.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/search_icon.png"))); // NOI18N
        find.setToolTipText("buscar Motorista");
        find.setBorder(null);
        find.setBorderPainted(false);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        menuPanel.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 110));

        update.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/edit_icon.png"))); // NOI18N
        update.setToolTipText("atualizar cadastro de Motorista");
        update.setBorder(null);
        update.setBorderPainted(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        menuPanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 110));

        jLabel21.setText("Pesquisar/Deletar por id:");
        menuPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));
        menuPanel.add(byId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, -1));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        new br.com.utfpr.forms.MainForm().show();
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(!isEmpty()){
                   
            try {
                new TrailerDao().add(newTrailer()); 
                JOptionPane.showMessageDialog(rootPane,"Carreta inserida com sucesso");
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao Inserir no Banco!\n" + e);
            }
            clearScreen();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor preencha os campos obrigatórios");
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if(!isEmpty()){
            try{
                new TrailerDao().remove(newTrailer());
                JOptionPane.showMessageDialog(rootPane,"Carreta excluida com sucesso");
            }catch(RuntimeException e){

                JOptionPane.showMessageDialog(rootPane,"Erro o excluir dados do banco\n" + e);
            }
            clearScreen();
         }else{
             JOptionPane.showMessageDialog(rootPane,"Para excluir dados é preciso primeiro carregá-los\n"
                                                    + "Utilize a barra de pesquisa a sua direita" );
        }
    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       if(!isEmpty()){          
                   
            try {
                new TrailerDao().update(newTrailer()); 
                JOptionPane.showMessageDialog(rootPane,"Carreta inserida com sucesso");
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao Inserir no Banco!\n" + e);
            }
            clearScreen();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor preencha os campos obrigatórios");
        } 
    }//GEN-LAST:event_updateActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        if(!byId.getText().trim().equals("")){    

            try{
                Trailer trailer = (Trailer)new TrailerDao().read(Long.parseLong(byId.getText()));
                id.setText(Long.toString(trailer.getId()));
                brand.setText(trailer.getBrand());
                model.setText(trailer.getModel());
                year.setText(Integer.toString(trailer.getYear()));
                plate.setText(trailer.getPlate());
                capKG.setText(Long.toString(trailer.getCapKG()));
                chassi.setText(Long.toString(trailer.getChassi()));
                type.setSelectedItem(trailer.getType());
            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(rootPane,"Erro ao Consultar dados no Banco!\n" + e);
                clearScreen();
            }     
        }else{
            JOptionPane.showMessageDialog(rootPane,"Digite algo na barra de pesquisa");
        }
        byId.setText("");
    }//GEN-LAST:event_findActionPerformed

    private boolean isEmpty() {
        return id.getText().trim().equals("") &&
                brand.getText().trim().equals("")&&
                model.getText().trim().equals("")&&
                year.getText().trim().equals("")&&
                plate.getText().trim().equals("")&&
                capKG.getText().trim().equals("")&&
                chassi.getText().trim().equals("")&&
                type.getSelectedItem().toString().trim().equals("");
    }

    private void clearScreen() {
        
        id.setText("");
        brand.setText("");
        model.setText("");
        year.setText("");
        plate.setText("");
        capKG.setText("");
        chassi.setText("");
        type.setSelectedIndex(1);
        
    }
    
    private Trailer newTrailer(){
        Trailer trailer = new Trailer();
            trailer.setId(Long.parseLong(id.getText()));
            trailer.setBrand(brand.getText());
            trailer.setModel(model.getText());
            trailer.setYear(Integer.parseInt(year.getText()));
            trailer.setPlate(plate.getText());
            trailer.setCapKG(Long.parseLong(capKG.getText()));
            trailer.setChassi(Long.parseLong(chassi.getText()));
            trailer.setType(type.getSelectedItem().toString());
        return trailer;
    }    
    
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
            java.util.logging.Logger.getLogger(TrailerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrailerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrailerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrailerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrailerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Image;
    private javax.swing.JPanel TrailerData;
    private javax.swing.JButton add;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField byId;
    private javax.swing.JTextField capKG;
    private javax.swing.JTextField chassi;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
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
