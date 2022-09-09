/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicine;

import Menus.mainmenu;
import javax.swing.JFrame;
/**
 *
 * @author Bhasu
 */

public class MedicinesPanel extends javax.swing.JFrame {

    /**
     * Creates new form MedicinesPanel
     */
    public MedicinesPanel() {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UpdateMedBtn = new javax.swing.JButton();
        DeleteMedBtn = new javax.swing.JButton();
        ViewMedBtn = new javax.swing.JButton();
        InsertMedBtn = new javax.swing.JButton();
        Bbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 15));
        jPanel1.setForeground(new java.awt.Color(240, 238, 252));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Medicines Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(602, 79, 256, 44);

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));

        UpdateMedBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        UpdateMedBtn.setForeground(new java.awt.Color(102, 0, 102));
        UpdateMedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/pill-go-icon.png"))); // NOI18N
        UpdateMedBtn.setText("Update Medicines");
        UpdateMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMedBtnActionPerformed(evt);
            }
        });

        DeleteMedBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        DeleteMedBtn.setForeground(new java.awt.Color(153, 0, 0));
        DeleteMedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/pill-delete-icon.png"))); // NOI18N
        DeleteMedBtn.setText("Delete Medicines");
        DeleteMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMedBtnActionPerformed(evt);
            }
        });

        ViewMedBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        ViewMedBtn.setForeground(new java.awt.Color(102, 0, 102));
        ViewMedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/pill-go-icon.png"))); // NOI18N
        ViewMedBtn.setText("View Medicines");
        ViewMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMedBtnActionPerformed(evt);
            }
        });

        InsertMedBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        InsertMedBtn.setForeground(new java.awt.Color(51, 51, 0));
        InsertMedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/pill-add-icon.png"))); // NOI18N
        InsertMedBtn.setText("Add Medicines");
        InsertMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertMedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InsertMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(292, 157, 786, 396);

        Bbtn.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        Bbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/Go-back-icon.png"))); // NOI18N
        Bbtn.setText("Back");
        Bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Bbtn);
        Bbtn.setBounds(981, 559, 97, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medicine/13988.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 1340, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertMedBtnActionPerformed

  InsertMedicines im = new InsertMedicines();
 
       im.setVisible(true);
        setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_InsertMedBtnActionPerformed

    private void UpdateMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMedBtnActionPerformed
    
       UpdateMedicine um = new UpdateMedicine();
       um.setVisible(true);
       setVisible(false);
       

        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateMedBtnActionPerformed

    private void DeleteMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMedBtnActionPerformed
    
      DeleteMedicines dm= new DeleteMedicines();
      dm.setVisible(true);
      setVisible(false);
    
  

        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMedBtnActionPerformed

    private void BbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbtnActionPerformed
    mainmenu rt= new mainmenu();
    rt.setVisible(true);
    setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_BbtnActionPerformed

    private void ViewMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMedBtnActionPerformed
     ViewMedicines vm = new ViewMedicines();
     vm.setVisible(true);
     setVisible(false);
     
          // TODO add your handling code here:
    }//GEN-LAST:event_ViewMedBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MedicinesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinesPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinesPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbtn;
    private javax.swing.JButton DeleteMedBtn;
    private javax.swing.JButton InsertMedBtn;
    private javax.swing.JButton UpdateMedBtn;
    private javax.swing.JButton ViewMedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
