package br.com.utfpr.forms;

import br.com.utfpr.beans.Destination;
import br.com.utfpr.beans.Driver;
import br.com.utfpr.beans.Freight;
import br.com.utfpr.beans.Origin;
import br.com.utfpr.beans.Product;
import br.com.utfpr.beans.Trailer;
import br.com.utfpr.beans.Truck;
import br.com.utfpr.dao.impl.DriverDao;
import br.com.utfpr.dao.impl.FreightDao;
import br.com.utfpr.dao.impl.TrailerDao;
import br.com.utfpr.dao.impl.TruckDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class FreightForm extends javax.swing.JFrame {

    public FreightForm() {
        initComponents();
        setLocationRelativeTo(null);
        startAllCheckbox();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        service = new javax.swing.JComboBox<>();
        trucks = new javax.swing.JComboBox<>();
        origins = new javax.swing.JComboBox<>();
        destinations = new javax.swing.JComboBox<>();
        products = new javax.swing.JComboBox<>();
        drivers = new javax.swing.JComboBox<>();
        exitDate = new javax.swing.JTextField();
        trailers = new javax.swing.JComboBox<>();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderPanel.setBackground(new java.awt.Color(2, 48, 74));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("FlinstonTransportadora LTDA");
        HeaderPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 220, 30));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Serviço:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Veículo:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Origem:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Destino:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Carga:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Motorista:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Data de saída:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Carreta:");

        service.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transporte Granel" }));

        trucks.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        origins.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        origins.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                originsItemStateChanged(evt);
            }
        });

        destinations.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        destinations.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationsItemStateChanged(evt);
            }
        });

        products.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        products.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productsItemStateChanged(evt);
            }
        });

        drivers.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        exitDate.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        trailers.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        confirm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        confirm.setText("CONFIRMAR");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cancel.setText("CANCELAR");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        price.setEditable(false);
        price.setText("0.00");

        jLabel2.setText("Valor:");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(drivers, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel)
                            .addComponent(exitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(price))
                .addGap(66, 66, 66))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(origins, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(trucks, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trailers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(trucks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(trailers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(origins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destinations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(drivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(exitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Double total = 0.00;
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
        new MainForm().show();
    }//GEN-LAST:event_cancelActionPerformed

    
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try{
            new FreightDao().add(newFreight());
            JOptionPane.showMessageDialog(rootPane,"Frete Confirmado!");
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(rootPane,"Erro ao salvar dados no Banco!\n" + e);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void originsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_originsItemStateChanged
        total += new Origin().read(origins.getSelectedItem().toString()).getPrice();
        price.setText(Double.toString(total));
    }//GEN-LAST:event_originsItemStateChanged

    private void destinationsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinationsItemStateChanged
       total += new Destination().read(destinations.getSelectedItem().toString()).getPrice();
       price.setText(Double.toString(total));
    }//GEN-LAST:event_destinationsItemStateChanged

    private void productsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productsItemStateChanged
        Trailer trailer = (Trailer) new TrailerDao().read(trailers.getSelectedIndex()+1);
        total += new Product().read(products.getSelectedItem().toString()).getPrice() * (trailer.getCapKG()/1000);
        price.setText(Double.toString(total));
    }//GEN-LAST:event_productsItemStateChanged
  
    private Freight newFreight(){        
        Freight freight = new Freight();
        freight.setService(service.getSelectedItem().toString());
        freight.setTruck((Truck)new TruckDao()
                .read(Long.parseLong(trucks.getSelectedItem().toString().substring(0,trucks.getSelectedItem().toString().indexOf("-")))));
        freight.setTrailer((Trailer) new TrailerDao()
                .read(Long.parseLong(trailers.getSelectedItem().toString().substring(0,trailers.getSelectedItem().toString().indexOf("-")))));
        freight.setOrigin(new Origin().read(origins.getSelectedItem().toString()));
        freight.setDestination(new Destination().read(destinations.getSelectedItem().toString()));
        freight.setCargo(new Product().read(products.getSelectedItem().toString()));
        freight.setDriver((Driver) new DriverDao()
                .read(Long.parseLong(drivers.getSelectedItem().toString().substring(0,drivers.getSelectedItem().toString().indexOf("-")))));
        Calendar exitDate = null ;
        Date date;
        try {

            date = new SimpleDateFormat("dd/MM/yyyy").parse(this.exitDate.getText().trim());
            exitDate = Calendar.getInstance();
            exitDate.setTime(date);         

        }catch(ParseException e){
            JOptionPane.showMessageDialog(rootPane,"Erro ao converter data!\n" + e);
        } 
        freight.setExitDate(exitDate);
        freight.setPrice(Double.parseDouble(price.getText()));
        
        return freight;
    } 
    
    private void startAllCheckbox(){
        new DriverDao().getList()
                .stream()
                .filter((driver) -> (driver.isStatus()))
                .forEachOrdered((driver) -> {
            drivers.addItem(driver.toString());
        });
        new TruckDao().getList().forEach((truck) -> {
            trucks.addItem(truck.toString());
        });
        new TrailerDao().getList().forEach((trailer) -> {
            trailers.addItem(trailer.toString());
        });
        new Destination().getList().forEach((destination) -> {
            destinations.addItem(destination.toString());
        });
        new Origin().getList().forEach((origin) -> {
            origins.addItem(origin.toString());
        });
        new Product().getList().forEach((product) -> {
            products.addItem(product.toString());
        });
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
            java.util.logging.Logger.getLogger(FreightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FreightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FreightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FreightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FreightForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JComboBox<String> destinations;
    private javax.swing.JComboBox<String> drivers;
    private javax.swing.JTextField exitDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> origins;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> products;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JComboBox<String> trailers;
    private javax.swing.JComboBox<String> trucks;
    // End of variables declaration//GEN-END:variables
}
