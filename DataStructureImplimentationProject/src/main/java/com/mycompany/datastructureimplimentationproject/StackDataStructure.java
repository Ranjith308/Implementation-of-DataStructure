/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.datastructureimplimentationproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Ranjith
 */
public class StackDataStructure extends javax.swing.JFrame {

    /**
     * Creates new form StackDataStructure
     */
        private int size;
        private int stack[];
        private int top = -1;
    public StackDataStructure() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        StackInsert = new javax.swing.JTextField();
        StackCreate = new javax.swing.JButton();
        TextElem = new javax.swing.JTextField();
        BInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        StackDelete = new javax.swing.JButton();
        StackTextDisp = new javax.swing.JTextField();
        DisplayStack = new javax.swing.JButton();
        BackB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Stack DataStructure");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 49));
        jLabel4.getAccessibleContext().setAccessibleName("");

        getContentPane().add(StackInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 81, 183, 31));

        StackCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StackCreate.setText("Create");
        StackCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StackCreateActionPerformed(evt);
            }
        });
        getContentPane().add(StackCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 85, -1, -1));

        TextElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextElemActionPerformed(evt);
            }
        });
        getContentPane().add(TextElem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 175, 147, -1));

        BInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BInsert.setText("Insert");
        BInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertActionPerformed(evt);
            }
        });
        getContentPane().add(BInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 175, -1, -1));

        jLabel1.setText("Element");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 178, 52, -1));

        StackDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StackDelete.setText("Delete");
        StackDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StackDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(StackDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 265, 318, -1));
        getContentPane().add(StackTextDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 338, 174, 54));

        DisplayStack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DisplayStack.setText("Display");
        DisplayStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayStackActionPerformed(evt);
            }
        });
        getContentPane().add(DisplayStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 354, -1, -1));

        BackB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });
        getContentPane().add(BackB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 425, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Data-hologram-on-a-dark-background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StackCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StackCreateActionPerformed
        // TODO add your handling code here:
         size = Integer.parseInt(StackInsert.getText());
         stack = new int[size];
        JOptionPane.showMessageDialog(StackInsert, "Stack Of Size " + size + " Is Created");
    }//GEN-LAST:event_StackCreateActionPerformed

    private void TextElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextElemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextElemActionPerformed

    private void BInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertActionPerformed
        // TODO add your handling code here:
        int element = Integer.parseInt(TextElem.getText());
        
        if(top == stack.length - 1) {
            JOptionPane.showMessageDialog(TextElem, "Stack IS Full Cannot Insert The Element", "Warning" , JOptionPane.WARNING_MESSAGE);
        }
        else {
        ++top;
            stack[top] =  element;
            JOptionPane.showMessageDialog(TextElem, "Inserted Element " + element + " At position " + top + " Into The Stack");
        }
        TextElem.setText("");
    }//GEN-LAST:event_BInsertActionPerformed

    private void StackDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StackDeleteActionPerformed
        // TODO add your handling code here:
        if(top < 0) {
            JOptionPane.showMessageDialog(TextElem, "Stack is Empty POP Not Possible", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(TextElem, "Element " + stack[top] + " Got Delete successfully");
            --top;
        }
    }//GEN-LAST:event_StackDeleteActionPerformed

    private void DisplayStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayStackActionPerformed
        // TODO add your handling code here:
        StackTextDisp.setText("");
        if(top < 0) {
            JOptionPane.showMessageDialog(StackTextDisp, "Display Not Possible Stack Is Empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        else {
            for(int i = top; i >= 0; i--) {
               
            StackTextDisp.setText(StackTextDisp.getText() + stack[i] + " ");

        }
            }
    }//GEN-LAST:event_DisplayStackActionPerformed

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        // TODO add your handling code here:
        HomeApp app = new HomeApp();
        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBActionPerformed

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
            java.util.logging.Logger.getLogger(StackDataStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StackDataStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StackDataStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StackDataStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StackDataStructure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInsert;
    private javax.swing.JButton BackB;
    private javax.swing.JButton DisplayStack;
    private javax.swing.JButton StackCreate;
    private javax.swing.JButton StackDelete;
    private javax.swing.JTextField StackInsert;
    private javax.swing.JTextField StackTextDisp;
    private javax.swing.JTextField TextElem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
