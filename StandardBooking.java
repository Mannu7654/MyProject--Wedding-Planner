/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.weddingplanner;

/**
 *
 * @author mannu
 */
public class StandardBooking extends javax.swing.JFrame {

    /**
     * Creates new form StandardBooking
     */
    public StandardBooking() {
        initComponents();
        setTitle("User - Standard booking");
        setResizable(true);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBride = new javax.swing.JTextField();
        txtGroom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        marriageDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVenue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mealBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnVGno = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnDecoYes = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnDecoNo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        musicBox = new javax.swing.JComboBox<>();
        btnVGYes = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtGuestNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnReceptionYes = new javax.swing.JRadioButton();
        btnReceptionNo = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Standard Booking");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 0, 211, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\backPageLogo.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 57));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Bride's Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 14, 135, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Groom's Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 135, -1));

        txtBride.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtBride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrideActionPerformed(evt);
            }
        });
        jPanel1.add(txtBride, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 211, 30));

        txtGroom.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtGroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroomActionPerformed(evt);
            }
        });
        jPanel1.add(txtGroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 211, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Marriage Date : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 135, -1));
        jPanel1.add(marriageDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 211, 31));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 102));
        jLabel5.setText("--------Choose Option--------");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Marriage Location :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtVenue.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(txtVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 211, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Catering :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 245, 117, -1));

        mealBox.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mealBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the meal type", "Vegetarian", "Non-Vegetarian", "Both" }));
        jPanel1.add(mealBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 242, 211, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("VideoGraphy :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 276, 132, -1));

        btnVGno.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVGno.setForeground(new java.awt.Color(204, 0, 102));
        btnVGno.setText("No");
        jPanel1.add(btnVGno, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 274, 55, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Decoration :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 305, 118, -1));

        btnDecoYes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDecoYes.setForeground(new java.awt.Color(204, 0, 102));
        btnDecoYes.setText("Yes");
        jPanel1.add(btnDecoYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 306, 74, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Music :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 337, 118, -1));

        btnDecoNo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDecoNo.setForeground(new java.awt.Color(204, 0, 102));
        btnDecoNo.setText("No");
        jPanel1.add(btnDecoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 306, 55, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Booking Charge :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        musicBox.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        musicBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "DJ", "Band", "Both" }));
        jPanel1.add(musicBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 332, 211, 30));

        btnVGYes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVGYes.setForeground(new java.awt.Color(204, 0, 102));
        btnVGYes.setText("Yes");
        jPanel1.add(btnVGYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 274, 62, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("No. of Guest :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 210, 132, -1));

        txtGuestNo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jPanel1.add(txtGuestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 210, 211, 28));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Reception :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 370, 118, -1));

        btnReceptionYes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnReceptionYes.setForeground(new java.awt.Color(204, 0, 102));
        btnReceptionYes.setText("Yes");
        jPanel1.add(btnReceptionYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 368, 57, -1));

        btnReceptionNo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnReceptionNo.setForeground(new java.awt.Color(204, 0, 102));
        btnReceptionNo.setText("No");
        jPanel1.add(btnReceptionNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 368, 54, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 102));
        jButton2.setText("Submit");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 102));
        jButton3.setText("View Details");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 102));
        jButton4.setText("Clear");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Rs. 1,25,000");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 120, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\standardBook.jpg")); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 38, 462, 460));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\w1.jpg")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\w1.jpg")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 630, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserRequirements user= new UserRequirements();
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtGroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGroomActionPerformed

    private void txtBrideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrideActionPerformed

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
            java.util.logging.Logger.getLogger(StandardBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandardBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnDecoNo;
    private javax.swing.JRadioButton btnDecoYes;
    private javax.swing.JRadioButton btnReceptionNo;
    private javax.swing.JRadioButton btnReceptionYes;
    private javax.swing.JRadioButton btnVGYes;
    private javax.swing.JRadioButton btnVGno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser marriageDate;
    private javax.swing.JComboBox<String> mealBox;
    private javax.swing.JComboBox<String> musicBox;
    private javax.swing.JTextField txtBride;
    private javax.swing.JTextField txtGroom;
    private javax.swing.JTextField txtGuestNo;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
