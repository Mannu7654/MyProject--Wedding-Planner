/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.weddingplanner;

import javax.swing.JOptionPane;


public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
        setTitle("Admin - home");
        setResizable(true);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddUser.setBackground(new java.awt.Color(204, 204, 204));
        btnAddUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\Add User.png")); // NOI18N
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 103, 96));

        btnUpdateUser.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdateUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\Update User.png")); // NOI18N
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 96));

        btnDeleteUser.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\Delete User.png")); // NOI18N
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 103, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Add User");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 83, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Update User");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 97, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Delete User");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 94, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("View User");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 106, 29));

        btnLogout.setBackground(new java.awt.Color(51, 51, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\AdminLogOut.png")); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 80, 50));

        btnViewUser.setBackground(new java.awt.Color(204, 204, 204));
        btnViewUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\viewUser.png")); // NOI18N
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\adminHomeBackground.jpg")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\Admin.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 44, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mannu\\Documents\\NetBeansProjects\\weddingPlanner\\adminHomeBackground.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        AddUser user1= new AddUser();         //add user page open
        user1.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Are you sure, you want to logout!!");
        home user=new home();         //  Exit and layout code
        user.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed
        // TODO add your handling code here:
        Viewuser user=new Viewuser();
        user.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
        UpdateUser user= new UpdateUser();
        user.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        DeleteUser user = new DeleteUser();
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDeleteUserActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
