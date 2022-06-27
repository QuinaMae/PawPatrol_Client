/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;




/**
 *
 * @author Vanz
 */
public class Booking extends javax.swing.JFrame {
    private String gender;
    private String specie;
    private String serv;
    Connection con;
    int total=0;
    
    
    public Booking() {
        this.buttonGroup1 = new ButtonGroup();
        initComponents();
        String dataConn = "jdbc:mysql://localhost/teamhatdog";
        String username= "root";
        String password= "";
        try{
            con= DriverManager.getConnection(dataConn,username,password);
        }catch(Exception e){
        }
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pawPatLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        schedNservicesLabel = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        appointmentsLabel = new javax.swing.JLabel();
        schedPanel = new javax.swing.JPanel();
        appLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        servLabel = new javax.swing.JLabel();
        dateCbBox = new javax.swing.JComboBox<>();
        submitBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timeCbBox = new javax.swing.JComboBox<>();
        petNameTf = new javax.swing.JTextField();
        petAgeTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        billLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalTf = new javax.swing.JTextField();
        maleRb = new javax.swing.JRadioButton();
        femaleRb = new javax.swing.JRadioButton();
        catRb = new javax.swing.JRadioButton();
        dogRb = new javax.swing.JRadioButton();
        jRadioButtonsit = new javax.swing.JRadioButton();
        jRadioButtonwalk = new javax.swing.JRadioButton();
        jRadioButtongroom = new javax.swing.JRadioButton();
        jRadioButtontrain = new javax.swing.JRadioButton();
        jRadioButton1hotel = new javax.swing.JRadioButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pawPatLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        pawPatLabel.setText("PawPatrol");

        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        schedNservicesLabel.setFont(new java.awt.Font("HK Grotesk", 1, 14)); // NOI18N
        schedNservicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedNservicesLabel.setText("Schedule and Services");
        schedNservicesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedNservicesLabelMouseClicked(evt);
            }
        });

        bookingLabel.setFont(new java.awt.Font("HK Grotesk", 1, 14)); // NOI18N
        bookingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingLabel.setText("Book Appointment");
        bookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingLabelMouseClicked(evt);
            }
        });

        appointmentsLabel.setFont(new java.awt.Font("HK Grotesk", 1, 14)); // NOI18N
        appointmentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentsLabel.setText("My Appointments");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schedNservicesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bookingLabel)
                .addGap(18, 18, 18)
                .addComponent(schedNservicesLabel)
                .addGap(18, 18, 18)
                .addComponent(appointmentsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        schedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        appLabel.setText("Book your Appointment");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setText("Select a Date");

        servLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        servLabel.setText("Select  Service");

        dateCbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateCbBoxActionPerformed(evt);
            }
        });

        submitBTN.setText("SUBMIT");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select a Time");

        timeCbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCbBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MY PET");

        billLabel.setText("Bill");

        jLabel5.setText("Gender");

        jLabel6.setText("Species");

        totalTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTfActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRb);
        maleRb.setText("male");
        maleRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRbActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRb);
        femaleRb.setText("female");
        femaleRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRbActionPerformed(evt);
            }
        });

        buttonGroup2.add(catRb);
        catRb.setText("cat");
        catRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catRbActionPerformed(evt);
            }
        });

        buttonGroup2.add(dogRb);
        dogRb.setText("dog");
        dogRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogRbActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtonsit);
        jRadioButtonsit.setText("Pet Sitting 1000 ");
        jRadioButtonsit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonsitActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtonwalk);
        jRadioButtonwalk.setText("Pet Walking 500");
        jRadioButtonwalk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonwalkActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtongroom);
        jRadioButtongroom.setText("Pet Groom 700");
        jRadioButtongroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtongroomActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtontrain);
        jRadioButtontrain.setText("Pet Training 2500");
        jRadioButtontrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtontrainActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton1hotel);
        jRadioButton1hotel.setText("Pet Hotel 2000");
        jRadioButton1hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1hotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout schedPanelLayout = new javax.swing.GroupLayout(schedPanel);
        schedPanel.setLayout(schedPanelLayout);
        schedPanelLayout.setHorizontalGroup(
            schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonsit))
                        .addGap(207, 207, 207)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billLabel)
                            .addComponent(totalTf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schedPanelLayout.createSequentialGroup()
                                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateCbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(timeCbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(schedPanelLayout.createSequentialGroup()
                                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(petNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(petAgeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addGroup(schedPanelLayout.createSequentialGroup()
                                        .addComponent(catRb)
                                        .addGap(18, 18, 18)
                                        .addComponent(dogRb))))
                            .addComponent(jLabel5))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schedPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appLabel)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, schedPanelLayout.createSequentialGroup()
                        .addComponent(jRadioButton1hotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtontrain)
                            .addComponent(jRadioButtongroom)
                            .addComponent(jRadioButtonwalk)
                            .addGroup(schedPanelLayout.createSequentialGroup()
                                .addComponent(maleRb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleRb)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        schedPanelLayout.setVerticalGroup(
            schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedPanelLayout.createSequentialGroup()
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(schedPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(petNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petAgeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRb)
                            .addComponent(femaleRb)
                            .addComponent(catRb)
                            .addComponent(dogRb))
                        .addGap(20, 20, 20)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateCbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeCbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(appLabel))
                .addGap(18, 18, 18)
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billLabel)
                    .addComponent(servLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonsit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonwalk)
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtongroom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtontrain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1hotel)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(schedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pawPatLabel)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pawPatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void schedNservicesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedNservicesLabelMouseClicked
        
    
    }//GEN-LAST:event_schedNservicesLabelMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked

        String action = "SELECT * FROM `shop_schedule` WHERE `shop_schedule`.`status` = \"available\"";
        try{
             PreparedStatement pst = con.prepareStatement(action);
             ResultSet rs =pst.executeQuery();
             while(rs.next()){
                 String date = rs.getString("date");
                 dateCbBox.addItem(date);
                
             }
        }catch(Exception e){
        }
        String action1 = "SELECT * FROM `shop_schedule` WHERE `shop_schedule`.`status` = \"available\"";
        try{
             PreparedStatement pst = con.prepareStatement(action1);
             ResultSet rs =pst.executeQuery();
             while(rs.next()){
                 String date = rs.getString("time_in");
                 timeCbBox.addItem(date);
                
             }
        }catch(Exception e){
        }
        
    }//GEN-LAST:event_bookingLabelMouseClicked

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        String sub = "INSERT INTO `appointments` (`pet_name`, `pet_gender`, `pet_specie`, `pet_age`, `service`, "
                + "`amount`) VALUES ( ?, ?, ?, ?, ?, ?);";
        try{
        PreparedStatement pst = con.prepareStatement(sub);
             
       // String date = dateCbBox.getSelectedItem().toString();// gets item from dropdown
       // String time = timeCbBox.getSelectedItem().toString();
       
 
        pst.setString(1,petNameTf.getText()); // gets pet name
        pst.setString(2,gender);// gets pet gender
        pst.setString(3,specie); // gets specie
        pst.setString(4,petAgeTf.getText()); // gets pet age
        pst.setString(5, serv); // gets service
        pst.setString(6,totalTf.getText());// sana gumana to heehee
        //pst.setString(5,date);
        //pst.setString(6,time);
        
        ResultSet rs =pst.executeQuery();
        JOptionPane.showMessageDialog(this, "Successfully Added");
        }catch(Exception e){
        }
    }//GEN-LAST:event_submitBTNActionPerformed

    private void dateCbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateCbBoxActionPerformed
       
    }//GEN-LAST:event_dateCbBoxActionPerformed

    private void timeCbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeCbBoxActionPerformed

    private void femaleRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRbActionPerformed
        gender = "female";
    }//GEN-LAST:event_femaleRbActionPerformed

    private void catRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catRbActionPerformed
        specie = "cat";
    }//GEN-LAST:event_catRbActionPerformed

    private void maleRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRbActionPerformed
        gender = "male";
    }//GEN-LAST:event_maleRbActionPerformed

    private void dogRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogRbActionPerformed
        specie = "dog";
    }//GEN-LAST:event_dogRbActionPerformed

    private void jRadioButtonsitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonsitActionPerformed
        serv= "Pet Sitting";
        totalTf.setText("800");
    }//GEN-LAST:event_jRadioButtonsitActionPerformed

    private void jRadioButtonwalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonwalkActionPerformed
        serv = "Pet Walking";
        totalTf.setText("400");
    }//GEN-LAST:event_jRadioButtonwalkActionPerformed

    private void jRadioButtongroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtongroomActionPerformed
        serv = "Pet Groom";
        totalTf.setText("800");
    }//GEN-LAST:event_jRadioButtongroomActionPerformed

    private void jRadioButtontrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtontrainActionPerformed
        serv = "Pet Training";
        totalTf.setText("1500");
    }//GEN-LAST:event_jRadioButtontrainActionPerformed

    private void totalTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTfActionPerformed
        
    }//GEN-LAST:event_totalTfActionPerformed

    private void jRadioButton1hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1hotelActionPerformed
        serv = "Pet Hotel";
        totalTf.setText("2000");
    }//GEN-LAST:event_jRadioButton1hotelActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JLabel billLabel;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton catRb;
    private javax.swing.JComboBox<String> dateCbBox;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JRadioButton dogRb;
    private javax.swing.JRadioButton femaleRb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1hotel;
    private javax.swing.JRadioButton jRadioButtongroom;
    private javax.swing.JRadioButton jRadioButtonsit;
    private javax.swing.JRadioButton jRadioButtontrain;
    private javax.swing.JRadioButton jRadioButtonwalk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton maleRb;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pawPatLabel;
    private javax.swing.JTextField petAgeTf;
    private javax.swing.JTextField petNameTf;
    private javax.swing.JLabel schedNservicesLabel;
    private javax.swing.JPanel schedPanel;
    private javax.swing.JLabel servLabel;
    private javax.swing.JButton submitBTN;
    private javax.swing.JComboBox<String> timeCbBox;
    private javax.swing.JTextField totalTf;
    // End of variables declaration//GEN-END:variables
}
