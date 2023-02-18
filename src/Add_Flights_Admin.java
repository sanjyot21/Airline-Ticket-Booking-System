import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Add_Flights_Admin extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs; 
     public Add_Flights_Admin() {
        initComponents();
        Connect();
        autoID();
    }
    public void Connect(){
        try{
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","3308");
       stmt=con.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
   
     public void autoID()
    {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select MAX(flight_id) from flights");
            rs.next();
            rs.getString("MAX(flight_id)");
            if(rs.getString("MAX(flight_id)") == null)
            {
               jLabel10.setText("F-001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("MAX(flight_id)").substring(3,rs.getString("MAX(flight_id)").length()));
                id++;
                jLabel10.setText("F-" + String.format("%03d", id));
                
                
            }
              
        } 
        catch(Exception o){
            JOptionPane.showMessageDialog(null,o.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Flight Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 180, 160, 30);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("Flight Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 240, 160, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("Origin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 320, 120, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 380, 160, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1050, 200, 180, 30);

        jDateChooser1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(1160, 200, 240, 40);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setText("Departure Time");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(920, 270, 200, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel7.setText("Arrival Time");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(960, 350, 151, 29);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel8.setText("Charge");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1020, 440, 100, 30);

        jComboBox1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Switzerland", "USA", "London", "Canada", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(490, 320, 160, 40);

        jComboBox2.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "Switzerland", "USA", "London", "Canada" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(490, 390, 160, 40);

        jTextField1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 232, 160, 40);

        jTextField2.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1160, 270, 210, 40);

        jTextField3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1160, 350, 210, 40);

        jTextField4.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(1160, 430, 210, 40);

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setText("Add Flights");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 550, 200, 60);

        jButton2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton2.setText("Return to Admin Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 550, 300, 60);

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel9.setText("Available Seats");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 460, 180, 40);

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel12.setText("Enter The Details Of The Flights");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 60, 710, 60);

        jTextField6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(490, 460, 170, 40);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(490, 180, 160, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin entry.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -30, 1810, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = jLabel10.getText();
         String flightname = jTextField1.getText();
         
         String origin = jComboBox1.getSelectedItem().toString().trim();
         String depart = jComboBox2.getSelectedItem().toString().trim(); 
         
       DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(jDateChooser1.getDate());

      
         String departtime = jTextField2.getText();
         String arrtime = jTextField3.getText();
         int flightcharge = Integer.parseInt(jTextField4.getText());
         int seats=Integer.parseInt(jTextField6.getText());
         try{
             String query="insert into flights values('"+id+"','"+flightname+"','"+origin+"','"+depart+"','"+departtime+"','"+arrtime+"','"+date+"',"+flightcharge+","+seats+");";
             stmt.executeUpdate(query);
             JOptionPane.showMessageDialog(this,"Flight Added Succesfully");
         }
         catch(Exception o){
             JOptionPane.showMessageDialog(null,o.getMessage());
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BackEnd ob=new BackEnd();
        ob.setSize(1920,1080);
        ob.setVisible(true);
        this.dispose();
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Flights_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Flights_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Flights_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Flights_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Flights_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}