/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;
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
        String dataConn = "jdbc:mysql://localhost/truenadis";
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
        pawPatLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        schedNservicesLabel = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        appointmentsLabel = new javax.swing.JLabel();
        schedPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        schedTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        servTable = new javax.swing.JTable();
        schedLabel = new javax.swing.JLabel();
        servLabel = new javax.swing.JLabel();

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

        schedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedLabel.setText("Schedule");

        servLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        servLabel.setText("Services");

        javax.swing.GroupLayout schedPanelLayout = new javax.swing.GroupLayout(schedPanel);
        schedPanel.setLayout(schedPanelLayout);
        schedPanelLayout.setHorizontalGroup(
            schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(schedPanelLayout.createSequentialGroup()
                        .addGroup(schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schedLabel)
                            .addComponent(servLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        schedPanelLayout.setVerticalGroup(
            schedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(schedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(servLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void servTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servTableMouseClicked
         
    }//GEN-LAST:event_servTableMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked
        dispose();
        Booking b = new Booking();
        //s.usernameInput.setText(userID.getText());
        b.setVisible(true);
    }//GEN-LAST:event_bookingLabelMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel pawPatLabel;
    private javax.swing.JLabel schedLabel;
    private javax.swing.JLabel schedNservicesLabel;
    private javax.swing.JPanel schedPanel;
    private javax.swing.JTable schedTable;
    private javax.swing.JLabel servLabel;
    private javax.swing.JTable servTable;
    // End of variables declaration//GEN-END:variables
}
