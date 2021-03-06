/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package GUI;

public class ServiceProviderSignUp extends javax.swing.JFrame {
    
    /**
     * Creates new form ContactEditor
     */
    public ServiceProviderSignUp() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSPBusinessNameLabel = new javax.swing.JLabel();
        jSPUsernameLabel = new javax.swing.JLabel();
        jSPUsernameField = new javax.swing.JTextField();
        jSPPasswordLabel = new javax.swing.JLabel();
        jSPPasswordField = new javax.swing.JTextField();
        jSPPhoneField = new javax.swing.JTextField();
        jSPPhoneLabel = new javax.swing.JLabel();
        jSPEmailLabel = new javax.swing.JLabel();
        jSPAddressLabel = new javax.swing.JLabel();
        jSPAddressField = new javax.swing.JTextField();
        jSPBusinessNameField = new javax.swing.JTextField();
        jSPEmailField = new javax.swing.JTextField();
        jSPOkButton = new javax.swing.JButton();
        jSPCancelButton = new javax.swing.JButton();
        jSPServiceTypeLabel = new javax.swing.JLabel();
        jSPServiceTypeComboBox = new javax.swing.JComboBox<>();
        jSPSignUpPrompt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service Provider Sign-up");

        jSPBusinessNameLabel.setText("Business name:");

        jSPUsernameLabel.setText("Username:");

        jSPUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPUsernameFieldActionPerformed(evt);
            }
        });

        jSPPasswordLabel.setText("Password:");

        jSPPhoneLabel.setText("Phone:");

        jSPEmailLabel.setText("Email:");

        jSPAddressLabel.setText("Address:");

        jSPOkButton.setText("OK");
        jSPOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPOkButtonActionPerformed(evt);
            }
        });

        jSPCancelButton.setText("Cancel");
        jSPCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPCancelButtonActionPerformed(evt);
            }
        });

        jSPServiceTypeLabel.setText("Service type:");

        jSPServiceTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driving", "Coding", "Dancing", "Martial Arts", "Haircut" }));
        jSPServiceTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPServiceTypeComboBoxActionPerformed(evt);
            }
        });

        jSPSignUpPrompt.setText("Please provide your information below to sign up:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(jSPOkButton)
                        .add(18, 18, 18)
                        .add(jSPCancelButton))
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jSPServiceTypeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jSPServiceTypeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 341, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jSPEmailLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 67, Short.MAX_VALUE)
                                .add(jSPEmailField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(27, 27, 27)
                                .add(jSPPhoneLabel)
                                .add(28, 28, 28)
                                .add(jSPPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jSPUsernameLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jSPUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(29, 29, 29)
                                .add(jSPPasswordLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jSPPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jSPBusinessNameLabel)
                                .add(18, 18, 18)
                                .add(jSPBusinessNameField))
                            .add(layout.createSequentialGroup()
                                .add(jSPAddressLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jSPAddressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 341, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jSPSignUpPrompt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .add(jSPSignUpPrompt)
                .add(3, 3, 3)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPUsernameLabel)
                    .add(jSPUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSPPasswordLabel)
                    .add(jSPPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPBusinessNameLabel)
                    .add(jSPBusinessNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPEmailLabel)
                    .add(jSPPhoneLabel)
                    .add(jSPPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSPEmailField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPAddressLabel)
                    .add(jSPAddressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPServiceTypeLabel)
                    .add(jSPServiceTypeComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSPOkButton)
                    .add(jSPCancelButton))
                .add(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSPOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPOkButtonActionPerformed
        String businessName = jSPBusinessNameField.getText();
        String username = jSPUsernameField.getText();
        String password = jSPPasswordField.getText();
        String address = jSPAddressField.getText();
        String email = jSPEmailField.getText();
        String phone = jSPPhoneField.getText();
        String serviceType = (String) jSPServiceTypeComboBox.getSelectedItem();
        System.out.println(businessName + " " + " " + username + " " + password + " " + address
            + " " + email + " " + phone + " " + serviceType);
        jSPSignUpPrompt.setText("Information registered. You can now log in.");

    }//GEN-LAST:event_jSPOkButtonActionPerformed

    private void jSPUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPUsernameFieldActionPerformed
    }//GEN-LAST:event_jSPUsernameFieldActionPerformed

    private void jSPCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPCancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jSPCancelButtonActionPerformed

    private void jSPServiceTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPServiceTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSPServiceTypeComboBoxActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServiceProviderSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceProviderSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceProviderSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceProviderSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceProviderSignUp().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jSPAddressField;
    private javax.swing.JLabel jSPAddressLabel;
    private javax.swing.JTextField jSPBusinessNameField;
    private javax.swing.JLabel jSPBusinessNameLabel;
    private javax.swing.JButton jSPCancelButton;
    private javax.swing.JTextField jSPEmailField;
    private javax.swing.JLabel jSPEmailLabel;
    private javax.swing.JButton jSPOkButton;
    private javax.swing.JTextField jSPPasswordField;
    private javax.swing.JLabel jSPPasswordLabel;
    private javax.swing.JTextField jSPPhoneField;
    private javax.swing.JLabel jSPPhoneLabel;
    private javax.swing.JComboBox<String> jSPServiceTypeComboBox;
    private javax.swing.JLabel jSPServiceTypeLabel;
    private javax.swing.JLabel jSPSignUpPrompt;
    private javax.swing.JTextField jSPUsernameField;
    private javax.swing.JLabel jSPUsernameLabel;
    // End of variables declaration//GEN-END:variables
    
}
