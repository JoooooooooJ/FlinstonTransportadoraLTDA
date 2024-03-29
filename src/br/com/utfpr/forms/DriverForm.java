package br.com.utfpr.forms;

import br.com.utfpr.beans.Address;
import br.com.utfpr.beans.Driver;
import br.com.utfpr.dao.impl.DriverDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class DriverForm extends javax.swing.JFrame {

    public DriverForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        byid = new javax.swing.JTextField();
        Home = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        newDriverAdd = new javax.swing.JLabel();
        DriverData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        stats = new javax.swing.JComboBox<>();
        cnhNum = new javax.swing.JTextField();
        cnhType = new javax.swing.JTextField();
        expiration = new javax.swing.JTextField();
        AddressPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        uf = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Pesquisar/Deletar por id:");
        menuPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));
        menuPanel.add(byid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 400, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/home_icon.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        menuPanel.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 30, 30));

        Add.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/add_icon.png"))); // NOI18N
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
        Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/delete_icon.png"))); // NOI18N
        Remove.setToolTipText("remover Motorista cadastrado");
        Remove.setBorder(null);
        Remove.setBorderPainted(false);
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        menuPanel.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 110));

        Find.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/search_icon.png"))); // NOI18N
        Find.setToolTipText("buscar Motorista");
        Find.setBorder(null);
        Find.setBorderPainted(false);
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });
        menuPanel.add(Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 110));

        Update.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/utfpr/images/edit_icon.png"))); // NOI18N
        Update.setToolTipText("atualizar cadastro de Motorista");
        Update.setBorder(null);
        Update.setBorderPainted(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        menuPanel.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 110));

        newDriverAdd.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        newDriverAdd.setText("+");
        newDriverAdd.setToolTipText("Realziar um novo cadastro");
        newDriverAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newDriverAddMouseClicked(evt);
            }
        });
        menuPanel.add(newDriverAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        DriverData.setBackground(new java.awt.Color(255, 255, 255));
        DriverData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("CPF *apenas numeros:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("RG *apenas numeros:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Telefone:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("E-mail:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Situação:");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel15.setText("N° CNH:");
        jLabel15.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel16.setText("Data Vencimento:");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel18.setText("Catageoria:");
        jLabel18.setToolTipText("");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        name.setToolTipText("");

        rg.setToolTipText("");

        stats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "Ativo", "Inativo" }));

        cnhNum.setToolTipText("");

        AddressPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddressPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Rua:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Cidade:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Numero:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setText("CEP* somente numeros:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel14.setText("UF:");

        city.setToolTipText("");

        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        javax.swing.GroupLayout AddressPanelLayout = new javax.swing.GroupLayout(AddressPanel);
        AddressPanel.setLayout(AddressPanelLayout);
        AddressPanelLayout.setHorizontalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(number, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddressPanelLayout.createSequentialGroup()
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddressPanelLayout.setVerticalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DriverDataLayout = new javax.swing.GroupLayout(DriverData);
        DriverData.setLayout(DriverDataLayout);
        DriverDataLayout.setHorizontalGroup(
            DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverDataLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DriverDataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 689, Short.MAX_VALUE))
                    .addGroup(DriverDataLayout.createSequentialGroup()
                        .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DriverDataLayout.createSequentialGroup()
                                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2))
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(phone)))
                            .addGroup(DriverDataLayout.createSequentialGroup()
                                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel18)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel16))
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(cnhNum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cnhType, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(expiration, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addGroup(DriverDataLayout.createSequentialGroup()
                                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87)
                                        .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(134, 134, 134))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DriverDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DriverDataLayout.setVerticalGroup(
            DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverDataLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6)))
                .addGap(3, 3, 3)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnhNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnhType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(DriverDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DriverData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DriverData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        
        new br.com.utfpr.forms.MainForm().show();
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
         
        if(!isEmpty()){                       
            try {
                new DriverDao().add(newDriver()); 
                JOptionPane.showMessageDialog(rootPane,"Motorista inserido com sucesso");
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao Inserir no Banco!\n" + e);
            }
            clearScreen();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor preencha os campos obrigatórios");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
              
         if(!isEmpty()){
            try{
                new DriverDao().remove(newDriver());
                JOptionPane.showMessageDialog(rootPane,"Motorista excluido com sucesso");
            }catch(RuntimeException e){

                JOptionPane.showMessageDialog(rootPane,"Erro o excluir dados do banco\n" + e);
            }
            clearScreen();
         }else{
             JOptionPane.showMessageDialog(rootPane,"Para excluir dados é preciso primeiro carregá-los\n"
                                                    + "Utilize a barra de pesquisa a sua direita" );
         }
    }//GEN-LAST:event_RemoveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
   
        if(!isEmpty()){          
            try {
                new DriverDao().update(newDriver());   
                JOptionPane.showMessageDialog(rootPane,"Dados atualizados com sucesso");
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(rootPane,"Erro ao Inserir no Banco!\n" + e);
            }        
            clearScreen();
        }else{
            JOptionPane.showMessageDialog(rootPane,"Para alterar dados é preciso primeiro carregá-los\n"
                                                    + "Utilize a barra de pesquisa a sua direita" );
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        
        if(!byid.getText().trim().equals("")){
            Driver driver;     
            SimpleDateFormat fmtdate = new SimpleDateFormat("dd/MM/yyyy");        

            try{
                driver = (Driver) new DriverDao().read(Long.parseLong(byid.getText()));
                id.setText(Long.toString(driver.getId()));
                name.setText(driver.getName());
                phone.setText(driver.getPhone());
                rg.setText(Long.toString(driver.getRG()));
                cpf.setText(Long.toString(driver.getCPF()));
                email.setText(driver.getEmail());
                cnhNum.setText(Long.toString(driver.getCNHnum()));
                cnhType.setText(driver.getCNHtype());
                expiration.setText(fmtdate.format(driver.getExpiration().getTime()));
                if(driver.isStatus()){
                    stats.setSelectedIndex(1);
                }
                else
                    stats.setSelectedIndex(2);
                street.setText(driver.getAddress().getStreet());
                number.setText(Integer.toString
                (driver.getAddress().getNumber()));
                city.setText(driver.getAddress().getCity());
                cep.setText(driver.getAddress().getCEP());
                uf.setSelectedItem(driver.getAddress().getUF());

            }catch(RuntimeException e){
                JOptionPane.showMessageDialog(rootPane,"Erro ao Consultar dados no Banco!\n" + e);
                clearScreen();
            }     
        }else{
            JOptionPane.showMessageDialog(rootPane,"Digite algo na barra de pesquisa");
        }
        byid.setText("");
    }//GEN-LAST:event_FindActionPerformed

    private void newDriverAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newDriverAddMouseClicked
        clearScreen();
    }//GEN-LAST:event_newDriverAddMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private Driver newDriver(){
        Address address = new Address();
            address.setId(Long.parseLong(id.getText()));
            address.setStreet(street.getText());
            address.setNumber(Integer.parseInt(number.getText()));
            address.setCity(city.getText());
            address.setCEP(cep.getText());
            address.setUF(uf.getSelectedItem().toString()); 
            //
            Driver driver = new Driver();        
            driver.setId(Long.parseLong(id.getText()));
            driver.setName(name.getText());
            driver.setPhone(phone.getText());
            driver.setRG(Long.parseLong(rg.getText()));
            driver.setCPF(Long.parseLong(cpf.getText()));
            driver.setEmail(email.getText());
            driver.setCNHnum(Long.parseLong(cnhNum.getText()));
            driver.setCNHtype(cnhType.getText());
            Calendar expiration = null ;
            Date date;
            try {

                date = new SimpleDateFormat("dd/MM/yyyy").parse(this.expiration.getText().trim());
                expiration = Calendar.getInstance();
                expiration.setTime(date);         

            }catch (ParseException e){
                JOptionPane.showMessageDialog(rootPane,"Erro ao converter data!\n" + e);
            } 
            driver.setExpiration(expiration);
            if(stats.getSelectedIndex()==1)
                driver.setStatus(true);
            else
                driver.setStatus(false);
            driver.setAddress(address);            
        return driver;
    }
    
    private void clearScreen(){
        
        id.setText("");
        name.setText("");
        phone.setText("");
        rg.setText("");
        cpf.setText("");
        email.setText("");
        cnhNum.setText("");
        cnhType.setText("");
        expiration.setText("");
        stats.setSelectedIndex(0);
        street.setText("");
        number.setText("");
        city.setText("");
        cep.setText("");
        uf.setSelectedIndex(0);
    }
    
    private boolean isEmpty(){
        return  id.getText().trim().equals("")&&
                name.getText().trim().equals("")&&               
                rg.getText().trim().equals("")&&
                cpf.getText().trim().equals("")&&
                cnhNum.getText().trim().equals("")&&
                cnhType.getText().trim().equals("")&&
                expiration.getText().trim().equals("")&&
                street.getText().trim().equals("")&&
                number.getText().trim().equals("")&&
                city.getText().trim().equals("")&&
                cep.getText().trim().equals("");
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
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JPanel DriverData;
    private javax.swing.JButton Find;
    private javax.swing.JLabel Home;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Update;
    private javax.swing.JTextField byid;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cnhNum;
    private javax.swing.JTextField cnhType;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField expiration;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField name;
    private javax.swing.JLabel newDriverAdd;
    private javax.swing.JTextField number;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField rg;
    private javax.swing.JComboBox<String> stats;
    private javax.swing.JTextField street;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables
}
