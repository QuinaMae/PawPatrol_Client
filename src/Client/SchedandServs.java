/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Vanz
 */
public class SchedandServs extends javax.swing.JFrame {

    Connection con;

 
    public SchedandServs() {
        initComponents();
        String dataConn = "jdbc:mysql://localhost/teamhatdog";
        String username= "root";
        String password= "";
        try{
            con= DriverManager.getConnection(dataConn,username,password);
        }catch(Exception e){
        }
        String act= "SELECT * FROM shop_schedule";
        try{
            PreparedStatement pst = con.prepareStatement(act);
            ResultSet rs =pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)schedTable.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{
                    rs.getString(2),
                    rs.getString(3),rs.getString(4)} );
                
            }
        }catch(Exception e){
            
        }
        String action = "SELECT * FROM shop_services";
        try{
            PreparedStatement pst = con.prepareStatement(action);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table = (DefaultTableModel) servTable.getModel();
            table.setRowCount(0);
            while(rs.next()){
                table.addRow(new String[]{
                    rs.getString(2),
                    rs.getString(3),rs.getString(4)} );
        }
         
        }catch (Exception e){
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
        menuPanel = new javax.swing.JPanel();
        schedNservicesLabel = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        appointmentsLabel = new javax.swing.JLabel();
        pawPatLabel1 = new javax.swing.JLabel();
        logoutbt = new javax.swing.JLabel();
        schedPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        schedTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        servTable = new javax.swing.JTable();
        servLabel = new javax.swing.JLabel();
        schedLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();

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
        setTitle("Schedules and Services");

        menuPanel.setBackground(new java.awt.Color(9, 64, 103));

        schedNservicesLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        schedNservicesLabel.setForeground(new java.awt.Color(255, 255, 254));
        schedNservicesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedNservicesLabel.setText("Schedule and Services");
        schedNservicesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedNservicesLabelMouseClicked(evt);
            }
        });

        bookingLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        bookingLabel.setForeground(new java.awt.Color(255, 255, 254));
        bookingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingLabel.setText("Book Appointment");
        bookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingLabelMouseClicked(evt);
            }
        });

        appointmentsLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        appointmentsLabel.setForeground(new java.awt.Color(255, 255, 254));
        appointmentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointmentsLabel.setText("My Appointments");
        appointmentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsLabelMouseClicked(evt);
            }
        });

        pawPatLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        pawPatLabel1.setForeground(new java.awt.Color(255, 255, 254));
        pawPatLabel1.setText("PawPatrol");

        logoutbt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logoutbt.setForeground(new java.awt.Color(255, 255, 254));
        logoutbt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutbt.setText("Log Out");
        logoutbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(pawPatLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutbt)
                    .addComponent(appointmentsLabel)
                    .addComponent(bookingLabel)
                    .addComponent(schedNservicesLabel))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(pawPatLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookingLabel)
                .addGap(18, 18, 18)
                .addComponent(schedNservicesLabel)
                .addGap(18, 18, 18)
                .addComponent(appointmentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbt)
                .addContainerGap())
        );

        schedPanel.setBackground(new java.awt.Color(255, 255, 254));
        schedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        schedTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        schedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "date", "time", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(schedTable);

        schedPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 563, 180));

        servTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        servTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "title", "description", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        servTable.setToolTipText("");
        servTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(servTable);

        schedPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 563, 160));

        servLabel.setBackground(new java.awt.Color(95, 108, 123));
        servLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        servLabel.setText("Services");
        schedPanel.add(servLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        schedLabel.setBackground(new java.awt.Color(95, 108, 123));
        schedLabel.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        schedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedLabel.setText("Schedule");
        schedPanel.add(schedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 64, 103));
        jLabel8.setText("PawPatrol > Schedules and Services");
        schedPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Username");
        schedPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        usernameInput.setEditable(false);
        usernameInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });
        schedPanel.add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(schedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(schedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schedNservicesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedNservicesLabelMouseClicked
        JOptionPane.showMessageDialog(this, "You are already in this display");        
    
    }//GEN-LAST:event_schedNservicesLabelMouseClicked

    private void servTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servTableMouseClicked
         
    }//GEN-LAST:event_servTableMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked
        dispose();
        Booking b = new Booking();
        b.usernameInput.setText(usernameInput.getText());
        b.setVisible(true);
    }//GEN-LAST:event_bookingLabelMouseClicked

    private void logoutbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtMouseClicked
        JFrame frame = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Client", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logoutbtMouseClicked

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed

    }//GEN-LAST:event_usernameInputActionPerformed

    private void appointmentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsLabelMouseClicked
        // TODO add your handling code here:
        dispose();
        MyAppointments s = new MyAppointments();
        s.usernameInput.setText(usernameInput.getText());
        s.setVisible(true);
    }//GEN-LAST:event_appointmentsLabelMouseClicked

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
            java.util.logging.Logger.getLogger(SchedandServs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchedandServs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchedandServs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchedandServs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchedandServs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoutbt;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pawPatLabel1;
    private javax.swing.JLabel schedLabel;
    private javax.swing.JLabel schedNservicesLabel;
    private javax.swing.JPanel schedPanel;
    private javax.swing.JTable schedTable;
    private javax.swing.JLabel servLabel;
    private javax.swing.JTable servTable;
    public javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
