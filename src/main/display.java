/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author shrey
 */
public class display extends javax.swing.JPanel {

    /**
     * Creates new form display
     */
    public display() {
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

        lImage = new javax.swing.JLabel();
        bEdit = new javax.swing.JButton();
        lCompany = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1200, 75));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 75));

        bEdit.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        bEdit.setText("EDIT");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 0, 75, 75));

        lCompany.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        add(lCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 200, 75));

        lName.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 0, 275, 75));

        lEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        add(lEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 75));

        lPhone.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        add(lPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 220, 75));
    }// </editor-fold>//GEN-END:initComponents

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
new editGUI(lPhone.getText()).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    public javax.swing.JLabel lCompany;
    public javax.swing.JLabel lEmail;
    public javax.swing.JLabel lImage;
    public javax.swing.JLabel lName;
    public javax.swing.JLabel lPhone;
    // End of variables declaration//GEN-END:variables
}
